package Entities;

import java.util.Date;

import Abstract.Entity;

public class IndividualCustomer extends Customer  implements Entity{
	
	private String firstName;
	private String lastName;
	private String identificationNumber;
	private Date   dateOfBirth;
	
	
	
	
	public IndividualCustomer() {
		
	}
	
	
	public IndividualCustomer(String firstName, String lastName, String identificationNumber, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.identificationNumber = identificationNumber;
		this.dateOfBirth = dateOfBirth;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
