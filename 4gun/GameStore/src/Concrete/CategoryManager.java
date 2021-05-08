package Concrete;

import Abstract.CategoryService;
import Entities.Category;

public class CategoryManager implements CategoryService{

	@Override
	public void add(Category category) {
		System.out.println(category.getName()+" "+"�simli Kategori Eklendi");
		
	}

	@Override
	public void getAll() {
		System.out.println("B�t�n Kategoriler Getirildi");
		
		
	}

	@Override
	public void get(int id) {
		System.out.println(id+" "+"Numaral� Kategori Getirildi");
			
	}

	@Override
	public void update(Category category) {
		System.out.println(category.getName()+" "+"�simli Kategori G�ncellendi");
		
		
	}

	@Override
	public void delete(Category category) {
		System.out.println(category.getName()+" "+"�simli Kategori Silindi");
		
		
	}

}
