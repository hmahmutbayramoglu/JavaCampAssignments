package nLayeredETradeDemo.dataAccess.concretes;

import java.util.ArrayList;

import nLayeredETradeDemo.dataAccess.abstracts.UserDao;
import nLayeredETradeDemo.entities.concretes.User;

public class MemoryUserDao implements UserDao {

	
	ArrayList<User> users = new ArrayList<User>();
	 
	
 
	public MemoryUserDao() {
		
		User user1 = new User(1,"Mahmut Hüseyin","Bayramoðlu","mahmut-b48@hotmail.com","01230123");
		User user2= new User(2,"Erdem","Yamen","yamenerdem@gmail.com","0123401234");
		User user3 = new User(3,"Mert","Daðlý","daglýmert345@gmail.com","012345012345");
		
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
 
		
	}
	@Override
	public void add(User user) {
		  this.users.add(user);
		  
	System.out.println(user.getFirstName()+" "+"Eklendi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" "+"Güncellendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" "+"Silindi");
		
	}

	@Override
	public User getUser(int id) {
		//stream sorgularý == Linq sorgularý
	    User searchUser= this.users.stream().filter(user -> user.getId() == id).findFirst().get(); 
	   System.out.println(searchUser.getFirstName()+" "+ "Kullanýcý Getirildi");
	    return searchUser;
		
	}

	@Override
	public ArrayList<User> getAll() {
		
			System.out.println("Kullanýcýlar Getirildi");	
			return this.users;
		
	 
	}

	@Override
	public User getByEmail(String emailAddress) {
		
	     User searchUserMail= this.users.stream().filter(user-> user.getEmail().equals(emailAddress)).findFirst().orElse(null);
	  	 System.out.println(emailAddress+" "+"Getirildi");
	     return searchUserMail;
		
	
	}

}
