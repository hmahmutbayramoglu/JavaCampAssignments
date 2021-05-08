package Abstract;

import Entities.Customer;
import Entities.Product;
import Entities.Campain;
import Entities.Sale;

public interface SaleService {

    void add(Sale sales);
    
    void getAll();
    
    void get(int id);
	
    void update(Sale sales);

	void delete(Sale sales);

	public void sale(Product product, Customer customer);
	
	public void saleWithCampain(Customer customer ,Product product, Campain campain, int piece);
	
}
