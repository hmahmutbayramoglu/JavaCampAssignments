package Concrete;

import Abstract.CustomerService;
import Abstract.UserCheckService;
import Entities.IndividualCustomer;

public class IndividualCustomerManager implements CustomerService<IndividualCustomer>{

	
	private UserCheckService userCheckService;

	public IndividualCustomerManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}
	
	
	@Override
	public void add(IndividualCustomer customer) {
		
		if(this.userCheckService.CheckIfRealPerson(customer)) {
				System.out.println(customer.getFirstName() +" "+"Bireysel Müþteri Eklendi");
		}else {
			System.out.println("Kayýt Edilmeye Çalýþýlan Müþteri Gerçek Deðildir!");
		}
				
	}

	@Override
	public void getAll() {
		System.out.println( "Bireysel Müþteriler Getirildi");			
		
	}

	@Override
	public void get(int id) {
		System.out.println(id +" "+"Numaralý Bireysel Müþteri Getirildi");			
	}

	@Override
	public void update(IndividualCustomer customer) {
		System.out.println(customer.getFirstName() +" "+"Bireysel Müþteri Güncellendi");			
		
	}

	@Override
	public void delete(IndividualCustomer customer) {
		System.out.println(customer.getFirstName() +" "+"Bireysel Müþteri Silindi");			
		
	}

}
