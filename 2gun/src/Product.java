package oopIntro;

public class Product {
	
	 
	
	private int id;
	private int categoryId;
	private String name;
	private double unitPrice;
	private String details;
	private double discount;
	private double unitPriceAfterDiscount;
	
	

	public Product() {
		
	}



	public Product(int id, int categoryId, String name, double unitPrice, String details, double discount,
			double unitPriceAfterDiscount) {
		super();
		setId(id);
		setCategoryId(categoryId);
		this.name = name;
		this.unitPrice = unitPrice;
		this.details = details;
		this.discount = discount;
		this.unitPriceAfterDiscount = unitPriceAfterDiscount;
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



	public double getUnitPrice() {
		return unitPrice;
	}



	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}



	public String getDetails() {
		return details;
	}



	public void setDetails(String details) {
		this.details = details;
	}



	public double getDiscount() {
		return discount;
	}



	public void setDiscount(double discount) {
		this.discount = discount;
	}



	public double getUnitPriceAfterDiscount() {
		
		if(this.unitPrice == 0) {
			return this.unitPrice;
		}
		
		return this.unitPrice -(this.unitPrice * this.discount /100 );
	}


 
	

}
