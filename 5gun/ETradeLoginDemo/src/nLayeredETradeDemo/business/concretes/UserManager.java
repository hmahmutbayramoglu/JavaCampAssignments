package nLayeredETradeDemo.business.concretes;

import java.util.ArrayList;

import nLayeredETradeDemo.business.abstracts.UserService;
import nLayeredETradeDemo.core.concretes.Validators.EmailValidator;
import nLayeredETradeDemo.dataAccess.abstracts.UserDao;
import nLayeredETradeDemo.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
 
	
	
	@Override
	public void add(User user) {
		if(!this.verification(user)) {
			System.out.println("Doðrulama Hatasý!");
			return;
			}
		
		 this.userDao.add(user);
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		if(!this.verification(user)) {
			System.out.println("Doðrulama Hatasý!");
			return;
			}
		
		this.userDao.update(user);
		
	}

	@Override
	public User getUser(int id) {
	 
 
		return this.userDao.getUser(id);
	}

	@Override
	public User getByEmail(String emailAddress) {
		
		return this.userDao.getByEmail(emailAddress);
	}

	@Override
	public ArrayList<User> getAll() {
	
		return this.userDao.getAll();
	}

	
	
	
	

	private boolean FirstNameValid(String name) {
		
		if(name.length()<2) {
			
			return false;
		}
		return true;

	}
	
	private boolean LastNameValid(String lastName) {
		
		if(lastName.length()<2) {
		
			return false;
		}
		return true;

	}
	
	private boolean PasswordValid(String password) {
		
		if(password.length()<6) {
			
			return false;
		}
		return true;

	}
	
	private boolean EmailValid(String email) {
		
		if(EmailValidator.isEmailValid(email)) {
			return true;
		}
		else {
		return false;
		}

		
	}
	
	  private boolean verification(User user) {
	    	
			if(!this.FirstNameValid(user.getFirstName())) {
				System.out.println("Ýsim alaný en az iki karakterden oluþmalýdýr.");
				return false;
			}
			if(!this.LastNameValid(user.getLastName())) {
				System.out.println("Soyisim alaný en az iki karakterden oluþmalýdýr.");
				return false;
			}
			if(!this.PasswordValid(user.getPassword())) {
				System.out.println("Parola en az 6 karakterden oluþmalýdýr. ");
				return false;
			}
			
			if(!this.EmailValid(user.getEmail())) {
				System.out.println("Invalid email.");
				return false;
			}
			
			return true;
	    }

	  
	  
	  
	  
	  
}
