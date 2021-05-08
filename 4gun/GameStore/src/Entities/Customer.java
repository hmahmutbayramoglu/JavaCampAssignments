package Entities;

import java.util.Date;

import Abstract.Entity;

public class Customer implements Entity{
	
	private int id;
	private String email;
	private String phoneNumber;
	//normalde cityId olmalý 
	private String city;
	private Date dateOfRegistration;
	
	
	
	public Customer() {
		
	}
	
	
	public Customer(int id, String email, String phoneNumber, String city, Date dateOfRegistration) {
		super();
		this.id = id;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.dateOfRegistration = dateOfRegistration;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	

	 
	
	

}
