package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		 //Mernis kontrol i�lemi yap�l�r ona g�re true yada false d�ner
			
		return true;
	}

}
