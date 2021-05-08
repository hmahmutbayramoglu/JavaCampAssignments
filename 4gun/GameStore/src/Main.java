import java.util.Date;
import java.util.GregorianCalendar;

import Adapters.MernisServiceAdapter;
import Concrete.CampainManager;
import Concrete.CategoryManager;
import Concrete.CorporateCustomerManager;
import Concrete.IndividualCustomerManager;
import Concrete.SaleManager;
import Entities.Campain;
import Entities.Category;
import Entities.CorporateCustomer;
import Entities.IndividualCustomer;
import Entities.Product;
import Entities.Sale;

public class Main {

	public static void main(String[] args) {

		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(1);
		corporateCustomer.setCompanyName("Waps Software");
		corporateCustomer.setCompanyNumber("393742");
		corporateCustomer.setCity("Ýstanbul");
		corporateCustomer.setEmail("corpratename@gmail.com");
		corporateCustomer.setPhoneNumber("01234567890");
		Date date = new GregorianCalendar(2003,8,27).getTime();
		corporateCustomer.setDateOfRegistration(date);
		
		CorporateCustomerManager corporateCustomerManager =new CorporateCustomerManager(new MernisServiceAdapter());
		corporateCustomerManager.add(corporateCustomer);
		corporateCustomerManager.update(corporateCustomer);
		
		System.out.println("---------------");
 
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setFirstName("Mahmut Hüseyin");
		individualCustomer.setFirstName("Bayramoðlu");
		individualCustomer.setCity("Ýstanbul");
		individualCustomer.setEmail("Individualname@gmail.com");
		individualCustomer.setIdentificationNumber("12345672294");
		individualCustomer.setPhoneNumber("01234567890");
		Date dateOfBirth = new GregorianCalendar(2003,8,27).getTime();
		Date dateOfRegistration = new GregorianCalendar(2003,8,27).getTime();
		individualCustomer.setDateOfBirth(dateOfBirth);
		individualCustomer.setDateOfRegistration(dateOfRegistration);
		
		IndividualCustomerManager individualCustomerManager = new IndividualCustomerManager(new MernisServiceAdapter());
		individualCustomerManager.add(individualCustomer);
		individualCustomerManager.update(individualCustomer);
		
		
		System.out.println("----------------------------------------");
		 
		
		Category category = new Category(1,"Online Games");
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.add(category);
		
		Campain campain = new Campain();
		campain.setId(1);
		campain.setName("Süper Cuma");
		Date startDate = new GregorianCalendar(2021,4,18).getTime();
		campain.setStartDate(startDate);
		Date dueDate = new GregorianCalendar(2021,5,18).getTime();
		campain.setDueDate(dueDate);
		short campaignRate = 10;
		campain.setCampaignRate(campaignRate);
		
		CampainManager campainManager  =new CampainManager();
		campainManager.add(campain);
		
		Date date2 = new GregorianCalendar(2021,4,18).getTime();
		Sale sale = new Sale(1,1,1,1,12,1500,date2);
		SaleManager saleManager = new SaleManager();
		saleManager.add(sale);
		
		
		Product product  =new Product();
		product.setId(1);
		product.setCategoryId(category.getId());
		product.setName("Fortnite");
		product.setPiecePrice(10);
		product.setStockQuantity(20);
		
		saleManager.sale(product, individualCustomer);
		saleManager.saleWithCampain(individualCustomer, product, campain,2);
		
	}

}
