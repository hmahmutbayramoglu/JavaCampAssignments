package Abstract;

import Entities.Category;

public interface CategoryService {

    void add(Category category);
    void getAll();
    void get(int id);
	void update(Category category);
	void delete(Category category);
	
}
