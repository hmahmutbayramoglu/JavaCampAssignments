package Concrete;

import Abstract.CustomerService;
import Abstract.UserCheckService;
import Entities.CorporateCustomer;

public class CorporateCustomerManager implements CustomerService<CorporateCustomer> {

	private UserCheckService userCheckService;

	public CorporateCustomerManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}
	
	@Override
	public void add(CorporateCustomer customer) {
		if (this.userCheckService.CheckIfRealPerson(customer)) {
			System.out.println(customer.getCompanyName() +" "+"Kurumsal Müþteri Eklendi");
		}else {
			System.out.println("Kayýt Edilmeye Çalýþýlan Müþteri Gerçek Deðildir!");
		}
	
	}

	@Override
	public void getAll() {
		System.out.println( "Kurumsal Müþteriler Getirildi");
	}

	@Override
	public void get(int id) {
		System.out.println(id+" "+"Numaralý Kurumsal Müþteri Getirildi");
	}

	@Override
	public void update(CorporateCustomer customer) {
		System.out.println(customer.getCompanyName() +" "+"Kurumsal Müþteri Güncellendi");		
	}

	@Override
	public void delete(CorporateCustomer customer) {
		System.out.println(customer.getCompanyName() +" "+"Kurumsal Müþteri Silindi");
	}

}
