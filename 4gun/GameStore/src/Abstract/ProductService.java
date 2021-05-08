package Abstract;

import Entities.Product;

public interface ProductService {

	
    void add(Product product);
    void getAll();
    void get(int id);
	void update(Product product);
	void delete(Product product);
	
}
