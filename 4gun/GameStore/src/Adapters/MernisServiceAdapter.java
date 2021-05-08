package Adapters;

import Abstract.UserCheckService;
import Entities.Customer;


public class MernisServiceAdapter implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		//E devlet mernis sistemi ile kontrol yapýlýr
		return true;
	}

}
