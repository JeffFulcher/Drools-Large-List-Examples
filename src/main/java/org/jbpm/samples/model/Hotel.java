package org.jbpm.samples.model;

import lombok.Data;

@Data
public class Hotel {
    private String hotelChain ;
    private String hotelCode;
	private String hotelName;
    private String hotelCountryCode;
    
    public String getHotelChain() {
		return hotelChain;
	}
	public void setHotelChain(String hotelChain) {
		this.hotelChain = hotelChain;
	}
	public String getHotelCode() {
		return hotelCode;
	}
	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelCountryCode() {
		return hotelCountryCode;
	}
	public void setHotelCountryCode(String hotelCountryCode) {
		this.hotelCountryCode = hotelCountryCode;
	}
}
