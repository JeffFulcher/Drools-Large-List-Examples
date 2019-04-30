package org.jbpm.samples.model;

import lombok.Data;

@Data
public class TravelAgent {
    private String travelConsultName;
    private String travelConsultCategory;
    private String travelConsultCategoryEffDate;
    private String travelConsultPartEffectiveDate;
    private String travelConsultParticipationCode;
    private String travelConsultId;
    
	public String getTravelConsultName() {
		return travelConsultName;
	}
	public void setTravelConsultName(String travelConsultName) {
		this.travelConsultName = travelConsultName;
	}
	public String getTravelConsultCategory() {
		return travelConsultCategory;
	}
	public void setTravelConsultCategory(String travelConsultCategory) {
		this.travelConsultCategory = travelConsultCategory;
	}
	public String getTravelConsultCategoryEffDate() {
		return travelConsultCategoryEffDate;
	}
	public void setTravelConsultCategoryEffDate(String travelConsultCategoryEffDate) {
		this.travelConsultCategoryEffDate = travelConsultCategoryEffDate;
	}
	public String getTravelConsultPartEffectiveDate() {
		return travelConsultPartEffectiveDate;
	}
	public void setTravelConsultPartEffectiveDate(String travelConsultPartEffectiveDate) {
		this.travelConsultPartEffectiveDate = travelConsultPartEffectiveDate;
	}
	public String getTravelConsultParticipationCode() {
		return travelConsultParticipationCode;
	}
	public void setTravelConsultParticipationCode(String travelConsultParticipationCode) {
		this.travelConsultParticipationCode = travelConsultParticipationCode;
	}
	public String getTravelConsultId() {
		return travelConsultId;
	}
	public void setTravelConsultId(String travelConsultId) {
		this.travelConsultId = travelConsultId;
	}
}
