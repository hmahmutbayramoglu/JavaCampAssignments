package Entities;

import Abstract.Entity;

public class CorporateCustomer extends Customer implements Entity{
	
	private String companyName;
	private String companyNumber;
	
	
	public CorporateCustomer() {
		
	}
	
	public CorporateCustomer(String companyName, String companyNumber) {
		super();
		this.companyName = companyName;
		this.companyNumber = companyNumber;
	}
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyNumber() {
		return companyNumber;
	}
	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}
	

}
