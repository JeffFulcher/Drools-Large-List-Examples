package org.jbpm.samples.model;

public class Fee {
    private FeeType feeType;
    private double feeAmount;
    private double feePercent;
    //private Boolean eligiblityFlag;
    
	public FeeType getFeeType() {
		return feeType;
	}
	public void setFeeType(FeeType feeType) {
		this.feeType = feeType;
	}
	public double getFeeAmount() {
		return feeAmount;
	}
	public void setFeeAmount(double feeAmount) {
		this.feeAmount = feeAmount;
	}
	public double getFeePercent() {
		return feePercent;
	}
	public void setFeePercent(double feePercent) {
		this.feePercent = feePercent;
	}
}
