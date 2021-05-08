package Entities;

import java.util.Date;

import Abstract.Entity;

public class Sale implements Entity{
	
	private int id;
	private int customerId;
	private int productId;
	private int campainId;
	private int piece;
	private double totalPrice;
	private Date date;
	
	
	public Sale() {
		
	}
	

	public Sale(int id, int customerId, int productId, int campainId, int piece, double totalPrice, Date date) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.productId = productId;
		this.campainId = campainId;
		this.piece = piece;
		this.totalPrice = totalPrice;
		this.date = date;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public int getCampainId() {
		return campainId;
	}
	
	public void setCampainId(int campainId) {
		this.campainId = campainId;
	}
	
	public int getPiece() {
		return piece;
	}
	
	public void setPiece(int piece) {
		this.piece = piece;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	

}
