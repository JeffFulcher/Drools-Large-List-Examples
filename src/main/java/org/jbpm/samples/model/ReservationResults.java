package org.jbpm.samples.model;

import lombok.Data;

import java.util.List;

@Data
public class ReservationResults {
    List<Fee> fees;
    private String holdStatus;
    private String reasonCode;
    private double percentSunday;
    private double percentMonday;
	private double percentTuesday;
    private double percentWednesday;
    private double percentThursday;
    private double percentFriday;
    private double percentSaturday;
    private double commissionPercent;
    private double commissionAmt;
    private List<String> messages;
    private String commPctType;

    public void attachFee(Fee fee) {
        if (fees != null)
        {
            fees.add(fee);
        }
    }
    
    public List<Fee> getFees() {
		return fees;
	}

	public void setFees(List<Fee> fees) {
		this.fees = fees;
	}

	public String getHoldStatus() {
		return holdStatus;
	}

	public void setHoldStatus(String holdStatus) {
		this.holdStatus = holdStatus;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public double getPercentSunday() {
		return percentSunday;
	}

	public void setPercentSunday(double percentSunday) {
		this.percentSunday = percentSunday;
	}

	public double getPercentMonday() {
		return percentMonday;
	}

	public void setPercentMonday(double percentMonday) {
		this.percentMonday = percentMonday;
	}

	public double getPercentTuesday() {
		return percentTuesday;
	}

	public void setPercentTuesday(double percentTuesday) {
		this.percentTuesday = percentTuesday;
	}

	public double getPercentWednesday() {
		return percentWednesday;
	}

	public void setPercentWednesday(double percentWednesday) {
		this.percentWednesday = percentWednesday;
	}

	public double getPercentThursday() {
		return percentThursday;
	}

	public void setPercentThursday(double percentThursday) {
		this.percentThursday = percentThursday;
	}

	public double getPercentFriday() {
		return percentFriday;
	}

	public void setPercentFriday(double percentFriday) {
		this.percentFriday = percentFriday;
	}

	public double getPercentSaturday() {
		return percentSaturday;
	}

	public void setPercentSaturday(double percentSaturday) {
		this.percentSaturday = percentSaturday;
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

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public String getCommPctType() {
		return commPctType;
	}

	public void setCommPctType(String commPctType) {
		this.commPctType = commPctType;
	}

}
