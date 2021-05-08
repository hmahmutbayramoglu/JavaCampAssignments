package Abstract;


public interface CustomerService<T> {

    void add(T customer);
    void getAll();
    void get(int id);
	void update(T customer);
	void delete(T customer);
	
}
