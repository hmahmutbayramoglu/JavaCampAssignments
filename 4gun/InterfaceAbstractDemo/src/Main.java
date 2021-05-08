
import java.util.Date;
import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
 
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
 
	
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Mahmut Hüseyin");
		customer1.setLastName("Bayramoðlu");
		customer1.setNationalityId("12345678901");
		Date date = new GregorianCalendar(2003,8,27).getTime();
		customer1.setDateOfBirth(date);
  

 
		
		//customer1.setDateOfBirth();
		customerManager.save(customer1);
		
	}

}
