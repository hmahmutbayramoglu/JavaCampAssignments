package Abstract;

import Entities.Customer;

public  abstract class BaseCustomerManager implements CustomerService{

 
	public void save(Customer customer) {
		System.out.println("Baseden Veri taban�na kay�t edildi : "+customer.getFirstName());
	}
 

	
 
}
