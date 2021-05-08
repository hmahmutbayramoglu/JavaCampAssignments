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
				System.out.println(customer.getFirstName() +" "+"Bireysel M��teri Eklendi");
		}else {
			System.out.println("Kay�t Edilmeye �al���lan M��teri Ger�ek De�ildir!");
		}
				
	}

	@Override
	public void getAll() {
		System.out.println( "Bireysel M��teriler Getirildi");			
		
	}

	@Override
	public void get(int id) {
		System.out.println(id +" "+"Numaral� Bireysel M��teri Getirildi");			
	}

	@Override
	public void update(IndividualCustomer customer) {
		System.out.println(customer.getFirstName() +" "+"Bireysel M��teri G�ncellendi");			
		
	}

	@Override
	public void delete(IndividualCustomer customer) {
		System.out.println(customer.getFirstName() +" "+"Bireysel M��teri Silindi");			
		
	}

}
