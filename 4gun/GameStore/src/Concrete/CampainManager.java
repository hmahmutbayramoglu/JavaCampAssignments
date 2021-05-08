package Concrete;

import Abstract.CampainService;
import Entities.Campain;

public class CampainManager implements CampainService{

	@Override
	public void add(Campain campain) {
	System.out.println(campain.getName()+" "+ "Kampanyası Eklendi");
		
	}

	@Override
	public void getAll() {
		System.out.println("Kampanyalar Getirildi");
		
	}

	@Override
	public void get(int id) {
		System.out.println(id+" "+ "Numaralı Kampanya Getirildi");
		
	}

	@Override
	public void update(Campain campain) {
		System.out.println(campain.getName()+" "+ "Kampanyası Güncellendi");
		
	}

	@Override
	public void delete(Campain campain) {
		System.out.println(campain.getName()+" "+ "Kampanyası Silindi");
		
		
	}

}
