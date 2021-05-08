package Abstract;

import Entities.Campain;

public interface CampainService {
	
    void add(Campain campain);
    void getAll();
    void get(int id);
	void update(Campain campain);
	void delete(Campain campain);

}
