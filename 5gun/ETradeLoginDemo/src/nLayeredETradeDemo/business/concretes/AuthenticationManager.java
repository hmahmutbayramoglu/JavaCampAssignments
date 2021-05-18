package nLayeredETradeDemo.business.concretes;

import nLayeredETradeDemo.business.abstracts.AuthenticationService;
import nLayeredETradeDemo.business.abstracts.UserService;
import nLayeredETradeDemo.entities.concretes.User;

public class AuthenticationManager implements AuthenticationService {
	
	
	private UserService userService;
	
	public AuthenticationManager(UserService userService) {
		this.userService = userService;
	}

	
	@Override
	public void login(User user) {

		if (!userLoginControl(user)) {
			System.out.println("L�tfen bo� alan b�rakmay�n!");
			return;
		}
		
		
		User userToLogin = this.userService.getByEmail(user.getEmail());
		
	 
			if(userToLogin!=null && user.getPassword() == userToLogin.getPassword()) {
				System.out.println("Login");	
			}
			else {
				System.out.println("Email adresi veya �ifre hatal� tekrar deneyiniz!");
			}
			
	 
	
	
	}

	@Override
	public void register(User user) {
		
		if(this.userService.getByEmail(user.getEmail())!=null) {
			System.out.println("Bu email adresi zaten kullan�l�yor");
			return;
		}
		
		
		//Do�rulama kodu random say� olarak olu�turuluyor
	    int rnd = (int)Math.floor(Math.random()*99999);
	    String verify = user.getFirstName().substring(0,1) + user.getId() + user.getLastName().substring(0,1) + rnd;
	    user.setVerificationCode(verify);
	    
	 	this.userService.add(user);
	    System.out.println(user.getFirstName() +" "+ "Kay�t Ba�ar�l�");
		
	}

	@Override
	public void loginWithGoogle() {

		
	}

	@Override
	public void verify(User user, String code) {
		
		
	}
	
	
	
	 private boolean userLoginControl(User user) {      
	    	
	    	if(user.getEmail().length()>0 && user.getPassword().length()>0) {
	    		
	    		return true;
	    	}
	    	else {
	    	
	    		return false;
	    	}
	    }

}
