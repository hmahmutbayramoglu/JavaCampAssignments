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
			System.out.println(customer.getCompanyName() +" "+"Kurumsal M��teri Eklendi");
		}else {
			System.out.println("Kay�t Edilmeye �al���lan M��teri Ger�ek De�ildir!");
		}
	
	}

	@Override
	public void getAll() {
		System.out.println( "Kurumsal M��teriler Getirildi");
	}

	@Override
	public void get(int id) {
		System.out.println(id+" "+"Numaral� Kurumsal M��teri Getirildi");
	}

	@Override
	public void update(CorporateCustomer customer) {
		System.out.println(customer.getCompanyName() +" "+"Kurumsal M��teri G�ncellendi");		
	}

	@Override
	public void delete(CorporateCustomer customer) {
		System.out.println(customer.getCompanyName() +" "+"Kurumsal M��teri Silindi");
	}

}
