package Concrete;

import Abstract.BaseCustomerManager;
 
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

 

	@Override
	public void save(Customer customer) {
		System.out.println("Veri tabanına kayıt edildi 'NeroCustomerManager' : " + customer.getFirstName());
	}

 

}
