package nLayeredETradeDemo.business.abstracts;

import java.util.ArrayList;

import nLayeredETradeDemo.entities.concretes.User;

public interface UserService {

	public void add(User user);
	
	public void delete(User user);
	
	public void update(User user);
	
 	public User getUser(int id);
	
	public User getByEmail(String emailAddress);
 
 	public ArrayList<User> getAll();
 



	
}
