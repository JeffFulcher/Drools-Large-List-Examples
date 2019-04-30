package org.jbpm.sample;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.jbpm.samples.model.Hotel;
import org.jbpm.samples.model.HotelCodeMap;
import org.jbpm.samples.model.Reservation;
import org.jbpm.samples.model.TCIDMap;
import org.jbpm.samples.model.TravelAgent;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class TestLargeList {
    private static final String LARGE_LIST_DATA = "tcid-list.txt";
    private static final String LARGE_LIST_DATA2 = "hotel-list.txt";

    @Test
    public void testLoadLargeList() throws Exception {
        
        System.out.println(getTCIDMapFromData(LARGE_LIST_DATA));
    }
    
    @Test
    public void testLocalDate() throws Exception {
        
    	//Data
    	Reservation r1 = new Reservation();
    	r1.setCheckoutDate(LocalDate.of(2018, Month.JUNE, 10));

    	//Ksession
    	KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        KieSession ks = kc.newKieSession();
        
        ks.insert(r1);
        ks.fireAllRules();
    }
    
    @Test
    public void testRule() throws Exception {
        TCIDMap map = getTCIDMapFromData(LARGE_LIST_DATA);
        
        Reservation res1 = createReservation("123", "00302024", "ACACC"); //PARHB - EXPEDIA
        res1.setCheckoutDate(LocalDate.of(2018, Month.JUNE, 10));
        Reservation res2 = createReservation("456", "00316665", "ACACC"); //LEEKS - EXPEDIA
        res2.setCheckoutDate(LocalDate.of(2018, Month.JUNE, 10));
        Reservation res3 = createReservation("789", "99633306", "ACACC"); //LONLP|MANOS - EXPEDIA
        res3.setCheckoutDate(LocalDate.of(2018, Month.JUNE, 10));
        Reservation res4 = createReservation("1011", "99636865", "ACACC"); //LONLP|MANOS - EXPEDIA
        res4.setCheckoutDate(LocalDate.of(2018, Month.JUNE, 10));
        Reservation res5 = createReservation("1213", "99633306", "ACACC"); //LONLP|MANOS - EXPEDIA
        res5.setCheckoutDate(LocalDate.of(2018, Month.JUNE, 10));
        
        List<String> tcIdList = new ArrayList<>();
        
        tcIdList.add(res1.getTravelAgent().getTravelConsultId());
        tcIdList.add(res2.getTravelAgent().getTravelConsultId());
        tcIdList.add(res3.getTravelAgent().getTravelConsultId());
        tcIdList.add(res4.getTravelAgent().getTravelConsultId());
        tcIdList.add(res5.getTravelAgent().getTravelConsultId());
        
        TCIDMap filteredMap = filterTCIDs(map, tcIdList);
        System.out.println("Map: " + map);
        System.out.println("TCID List: " + tcIdList);
        System.out.println("Filtered Map: " + filteredMap);
        
        HotelCodeMap hotelMap = getHotelCodeMapFromData(LARGE_LIST_DATA2);
        
        List<String> hotelList = new ArrayList<>();
        hotelList.add(res1.getHotel().getHotelCode());
        hotelList.add(res2.getHotel().getHotelCode());
        hotelList.add(res3.getHotel().getHotelCode());
        hotelList.add(res4.getHotel().getHotelCode());
        hotelList.add(res5.getHotel().getHotelCode());
        
        HotelCodeMap filteredhotelMap = filterHotels(hotelMap, hotelList);
        System.out.println("Map: " + hotelMap);
        System.out.println("Hotel List: " + hotelList);
        System.out.println("Filtered Map: " + filteredhotelMap);
        
        KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        KieSession ks = kc.newKieSession();
        
        ks.insert(res1);
        System.out.println("---> inserted " + res1);
        ks.insert(res2);
        System.out.println("---> inserted " + res2);
        ks.insert(res3);
        System.out.println("---> inserted " + res3);
        ks.insert(res4);
        System.out.println("---> inserted " + res4);
        ks.insert(res5);
        System.out.println("---> inserted " + res5);
        ks.insert(filteredMap);
        System.out.println("---> inserted " + filteredMap);
        ks.insert(filteredhotelMap);
        System.out.println("---> inserted " + filteredhotelMap);
        
        ks.fireAllRules();
        
        System.out.println("Res1: " + res1.getResults().getPercentSunday());
        System.out.println("Res2: " + res2.getResults().getPercentSunday());
        System.out.println("Res3: " + res3.getResults().getPercentSunday());
        System.out.println("Res4: " + res4.getResults().getPercentSunday());
        System.out.println("Res5: " + res5.getResults().getPercentSunday());
        
    }
    
    private Reservation createReservation (String resId, String tcId, String hotelCode) {
        Reservation res = new Reservation();
        res.setResId(resId);
        
        TravelAgent ta = new TravelAgent();
        ta.setTravelConsultId(tcId);
        res.setTravelAgent(ta);
        
        Hotel hotel = new Hotel();
        hotel.setHotelCode(hotelCode);
        res.setHotel(hotel);
        
        return res;
        
    }
    
    private TCIDMap filterTCIDs (TCIDMap wholeMap, List<String> tcIdList) {
        TCIDMap filteredMap = new TCIDMap();
        
        wholeMap.forEach((k, v) -> {
            if (tcIdList.contains(k)) {
                filteredMap.put(k, v);
            }
        });
        
        return filteredMap;
    }
    
    private HotelCodeMap filterHotels (HotelCodeMap wholeMap, List<String> hotelList) {
    	HotelCodeMap filteredMap = new HotelCodeMap();
        
        wholeMap.forEach((k, v) -> {
            if (hotelList.contains(k)) {
                filteredMap.put(k, v);
            }
        });
        
        return filteredMap;
    }

    private TCIDMap getTCIDMapFromData (String dataFile) throws Exception {
        final TCIDMap map = new TCIDMap();

        try (Stream<String> stream = 
                Files.lines(Paths.get(this.getClass().getClassLoader().getResource(LARGE_LIST_DATA).toURI()))) {
            stream.forEach(line -> {
                if (line != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 2) {
                        String[] groups = parts[1].split("\\|");
                        map.put(parts[0], Arrays.asList(groups));
                    }
                }
            });
        }
        
        return map;
    }
    
    private HotelCodeMap getHotelCodeMapFromData (String dataFile) throws Exception {
        final HotelCodeMap map = new HotelCodeMap();

        try (Stream<String> stream = 
                Files.lines(Paths.get(this.getClass().getClassLoader().getResource(LARGE_LIST_DATA2).toURI()))) {
            stream.forEach(line -> {
                if (line != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 2) {
                        String[] groups = parts[1].split("\\|");
                        map.put(parts[0], Arrays.asList(groups));
                    }
                }
            });
        }
        
        return map;
    }
}
