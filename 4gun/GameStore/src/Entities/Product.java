package Entities;

import Abstract.Entity;

public class Product implements Entity{
	
	private int id;
	private int categoryId;
	private String name;
	private int stockQuantity;
	private double piecePrice;
	
	
	public Product () {
		
	}
	
	public Product(int id, int categoryId, String name, int stockQuantity, double piecePrice) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.stockQuantity = stockQuantity;
		this.piecePrice = piecePrice;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public double getPiecePrice() {
		return piecePrice;
	}
	public void setPiecePrice(double piecePrice) {
		this.piecePrice = piecePrice;
	}

}
