package com.wbqa.wd.pagedata;

public class MCHomePageData {

	private String loanType;
	private String loanAmount;
	private String zipCode;
	
	public MCHomePageData(String loanType, String loanAmount, String zipCode) {
		super();
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.zipCode = zipCode;
	}
	
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
	

	
	
}
