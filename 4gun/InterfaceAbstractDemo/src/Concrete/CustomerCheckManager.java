package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// Kendi Servisimiz
		// Projeyi geli�tirme a�amas�nda mernis sistemine ba��ml� olmadan kod yazabiliriz
		// Hata vermesi i�in false yapt�m
		return false;
	}
 

}
