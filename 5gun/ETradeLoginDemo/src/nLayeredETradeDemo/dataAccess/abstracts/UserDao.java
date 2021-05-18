package nLayeredETradeDemo.dataAccess.abstracts;

import java.util.ArrayList;

import nLayeredETradeDemo.entities.concretes.User;

public interface UserDao {

	public void add(User user);
	public void update(User user);
	public void delete(User user);
	public User getUser(int id);
	public ArrayList<User> getAll();
	public User getByEmail(String emailAddress);
}
