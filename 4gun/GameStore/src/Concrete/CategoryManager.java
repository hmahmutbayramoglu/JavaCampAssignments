package Concrete;

import Abstract.CategoryService;
import Entities.Category;

public class CategoryManager implements CategoryService{

	@Override
	public void add(Category category) {
		System.out.println(category.getName()+" "+"Ýsimli Kategori Eklendi");
		
	}

	@Override
	public void getAll() {
		System.out.println("Bütün Kategoriler Getirildi");
		
		
	}

	@Override
	public void get(int id) {
		System.out.println(id+" "+"Numaralý Kategori Getirildi");
			
	}

	@Override
	public void update(Category category) {
		System.out.println(category.getName()+" "+"Ýsimli Kategori Güncellendi");
		
		
	}

	@Override
	public void delete(Category category) {
		System.out.println(category.getName()+" "+"Ýsimli Kategori Silindi");
		
		
	}

}
