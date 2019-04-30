package org.jbpm.samples.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//import org.junit.jupiter.api.Test;

public class Reservation {
	private static final long serialVersionUID = 1L;
	// private String hotelChain ;
	private String hotelCode;
	private Hotel hotel;

	private String stayDate;
	private String stayDayOfWeek;
	private String checkinDate;
	private LocalDate checkoutDate;
	private String roomType;
	private String rateCategory;
	private String bookingCommissionStatus;
	private String commissionFlag;
	private double dailyRoomRate;
	private double commissionPercent;
	private double commissionAmt;
	private int numberOfRooms;
	private int numberOfNights;
	private String groupCode;
	private String resId;

	private String confirmationDate;
	private String confirmationNumber;
	private String travelConsultId;
	private TravelAgent travelAgent;
	private String bookingSegment;
	private int segmentSeqNumber;
	private String stayCode;
	private String currency;
	private Boolean commissionEligibility = false;

	private String origSellChannel;
	private String origSellSource;
	private String corpAcctNum;
	private ReservationResults results = new ReservationResults();

	private List<Fee> fees;
	private Boolean feeEligiblity;

	private double totalDailyRevenue;
	private Audit audit = new Audit();

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public String getStayDate() {
		return stayDate;
	}

	public void setStayDate(String stayDate) {
		this.stayDate = stayDate;
	}

	public String getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(String checkinDate) {
		this.checkinDate = checkinDate;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getRateCategory() {
		return rateCategory;
	}

	public void setRateCategory(String rateCategory) {
		this.rateCategory = rateCategory;
	}

	public String getBookingCommissionStatus() {
		return bookingCommissionStatus;
	}

	public void setBookingCommissionStatus(String bookingCommissionStatus) {
		this.bookingCommissionStatus = bookingCommissionStatus;
	}

	public String getCommissionFlag() {
		return commissionFlag;
	}

	public void setCommissionFlag(String commissionFlag) {
		this.commissionFlag = commissionFlag;
	}

	public double getDailyRoomRate() {
		return dailyRoomRate;
	}

	public void setDailyRoomRate(double dailyRoomRate) {
		this.dailyRoomRate = dailyRoomRate;
	}

	public double getCommissionPercent() {
		return commissionPercent;
	}

	public void setCommissionPercent(double commissionPercent) {
		this.commissionPercent = commissionPercent;
	}

	public double getCommissionAmt() {
		return commissionAmt;
	}

	public void setCommissionAmt(double commissionAmt) {
		this.commissionAmt = commissionAmt;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public int getNumberOfNights() {
		return numberOfNights;
	}

	public void setNumberOfNights(int numberOfNights) {
		this.numberOfNights = numberOfNights;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public String getConfirmationDate() {
		return confirmationDate;
	}

	public void setConfirmationDate(String confirmationDate) {
		this.confirmationDate = confirmationDate;
	}

	public String getConfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public String getTravelConsultId() {
		return travelConsultId;
	}

	public void setTravelConsultId(String travelConsultId) {
		this.travelConsultId = travelConsultId;
	}

	public TravelAgent getTravelAgent() {
		return travelAgent;
	}

	public void setTravelAgent(TravelAgent travelAgent) {
		this.travelAgent = travelAgent;
	}

	public String getBookingSegment() {
		return bookingSegment;
	}

	public void setBookingSegment(String bookingSegment) {
		this.bookingSegment = bookingSegment;
	}

	public int getSegmentSeqNumber() {
		return segmentSeqNumber;
	}

	public void setSegmentSeqNumber(int segmentSeqNumber) {
		this.segmentSeqNumber = segmentSeqNumber;
	}

	public String getStayCode() {
		return stayCode;
	}

	public void setStayCode(String stayCode) {
		this.stayCode = stayCode;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Boolean getCommissionEligibility() {
		return commissionEligibility;
	}

	public void setCommissionEligibility(Boolean commissionEligibility) {
		this.commissionEligibility = commissionEligibility;
	}

	public String getOrigSellChannel() {
		return origSellChannel;
	}

	public void setOrigSellChannel(String origSellChannel) {
		this.origSellChannel = origSellChannel;
	}

	public String getOrigSellSource() {
		return origSellSource;
	}

	public void setOrigSellSource(String origSellSource) {
		this.origSellSource = origSellSource;
	}

	public String getCorpAcctNum() {
		return corpAcctNum;
	}

	public void setCorpAcctNum(String corpAcctNum) {
		this.corpAcctNum = corpAcctNum;
	}

	public List<Fee> getFees() {
		return fees;
	}

	public void setFees(List<Fee> fees) {
		this.fees = fees;
	}

	public Boolean getFeeEligiblity() {
		return feeEligiblity;
	}

	public void setFeeEligiblity(Boolean feeEligiblity) {
		this.feeEligiblity = feeEligiblity;
	}

	public double getTotalDailyRevenue() {
		return totalDailyRevenue;
	}

	public void setTotalDailyRevenue(double totalDailyRevenue) {
		this.totalDailyRevenue = totalDailyRevenue;
	}

	public Audit getAudit() {
		return audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public void setStayDayOfWeek(String stayDayOfWeek) {
		this.stayDayOfWeek = stayDayOfWeek;
	}

	String getStayDayOfWeek() {
		// TODO: add function
		return "";
	}

	public ReservationResults getResults() {
		return results;
	}

	public void setResults(ReservationResults results) {
		this.results = results;
	}

	public String getResId() {
		return resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
	}

	public ArrayList<String> createMapping(String largeList, String groupID) {
		String parsedValue;
		ArrayList<String> parsedValueList = new ArrayList<String>();
		int beginIndex = 0;
		int endIndex = 8;
		int stringIndexLength = largeList.length() - 1;

		for (int i = 0; i < stringIndexLength; i += 9) {
//    		parsedValue = largeList.substring(i, i+8) + "," + groupID;
			parsedValue = largeList.substring(i, i + 8);
			parsedValueList.add(parsedValue);
		}

		parsedValue = largeList.substring(0, 8);
		System.out.println(parsedValueList);

		return parsedValueList;
	}

	public void compareLists(ArrayList<String> list1, ArrayList<String> list2) {
		for (int i = 0; i < list1.size(); i++) {
			// System.out.println("i = " + i);
			for (int j = list2.size() - 1; j >= 0; j--) {
				// System.out.println("i = " + i + ": j = " + j);
//    			if(list1.get(i).equals(list2.get(j))) {
//    				System.out.println(list2.get(j));
//    			}
				if (list1.get(i) != list2.get(j)) {
					System.out.println(list2.get(j));
				}
			}
		}
	}
}
