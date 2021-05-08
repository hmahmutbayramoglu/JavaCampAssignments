package Concrete;

import Abstract.ProductService;
import Entities.Product;

public class ProductManager implements ProductService{

	@Override
	public void add(Product product) {
		System.out.println(product.getName() +" "+"�r�n� Eklendi.");
	}

	@Override
	public void getAll() {
		System.out.println("B�t�n �r�nler Getirildi.");		
	}

	@Override
	public void get(int id) {
		System.out.println(id+" "+"Numaral� �r�n� Getirildi.");
		
	}

	@Override
	public void update(Product product) {
		System.out.println(product.getName() +" "+"�r�n� G�ncellendi.");
		
	}

	@Override
	public void delete(Product product) {
		System.out.println(product.getName() +" "+"�r�n� Silindi.");
		
	}

}
