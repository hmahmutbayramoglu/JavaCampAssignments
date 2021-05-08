package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		 //Mernis kontrol iþlemi yapýlýr ona göre true yada false döner
			
		return true;
	}

}
