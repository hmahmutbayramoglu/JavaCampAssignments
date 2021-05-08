package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// Kendi Servisimiz
		// Projeyi geliþtirme aþamasýnda mernis sistemine baðýmlý olmadan kod yazabiliriz
		// Hata vermesi için false yaptým
		return false;
	}
 

}
