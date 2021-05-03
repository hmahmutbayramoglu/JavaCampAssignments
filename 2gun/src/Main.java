package oopIntro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category();
		
		category1.id=1;
		category1.name="Laptop";
		
		Product product1 = new Product(); //Referans veya instance olusturma
		
		product1.setId(1);
		product1.setName("Laptop");
		product1.setCategoryId(1);
		product1.setDetails("detaylar");
		product1.setDiscount(10);
		product1.setUnitPrice(1200);
		
		
		
 
		
		ProductManager productManeger=new ProductManager();
		
		productManeger.Add(product1);
		
		
	}

}
