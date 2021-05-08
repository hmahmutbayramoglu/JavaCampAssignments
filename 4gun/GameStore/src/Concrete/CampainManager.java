package Concrete;

import Abstract.CampainService;
import Entities.Campain;

public class CampainManager implements CampainService{

	@Override
	public void add(Campain campain) {
	System.out.println(campain.getName()+" "+ "Kampanyas� Eklendi");
		
	}

	@Override
	public void getAll() {
		System.out.println("Kampanyalar Getirildi");
		
	}

	@Override
	public void get(int id) {
		System.out.println(id+" "+ "Numaral� Kampanya Getirildi");
		
	}

	@Override
	public void update(Campain campain) {
		System.out.println(campain.getName()+" "+ "Kampanyas� G�ncellendi");
		
	}

	@Override
	public void delete(Campain campain) {
		System.out.println(campain.getName()+" "+ "Kampanyas� Silindi");
		
		
	}

}
