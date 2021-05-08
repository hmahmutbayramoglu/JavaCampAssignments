package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	
	private CustomerCheckService customerCheckService;
	

 
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}



	@Override
	public void save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Veri taban�na kay�t edildi 'StarbucksCustomerManager' : " + customer.getFirstName());
		}else {
			 System.out.println("Error! L�tfen ger�ek bir kullan�c� giriniz");
		}
 
	}
	
 
	

	
	
}
