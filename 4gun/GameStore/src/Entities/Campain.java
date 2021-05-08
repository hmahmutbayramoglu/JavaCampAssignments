package Entities;

import java.util.Date;

import Abstract.Entity;

public class Campain implements Entity{
	
	private int id;
 	private String name;
	private short campaignRate;
	private Date startDate;
	private Date dueDate;
	
	
	public Campain() {
		
	}
	
	
	
	public Campain(int id, String name, short campaignRate, Date startDate, Date dueDate) {
		super();
		this.id = id;
		this.name = name;
		this.campaignRate = campaignRate;
		this.startDate = startDate;
		this.dueDate = dueDate;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public short getCampaignRate() {
		return campaignRate;
	}
	public void setCampaignRate(short campaignRate) {
		this.campaignRate = campaignRate;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public Date getDueDate() {
		return dueDate;
	}



	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	

}
