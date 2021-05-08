package Concrete;

import Abstract.ProductService;
import Entities.Product;

public class ProductManager implements ProductService{

	@Override
	public void add(Product product) {
		System.out.println(product.getName() +" "+"Ürünü Eklendi.");
	}

	@Override
	public void getAll() {
		System.out.println("Bütün Ürünler Getirildi.");		
	}

	@Override
	public void get(int id) {
		System.out.println(id+" "+"Numaralý Ürünü Getirildi.");
		
	}

	@Override
	public void update(Product product) {
		System.out.println(product.getName() +" "+"Ürünü Güncellendi.");
		
	}

	@Override
	public void delete(Product product) {
		System.out.println(product.getName() +" "+"Ürünü Silindi.");
		
	}

}
