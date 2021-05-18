package nLayeredETradeDemo.business.abstracts;

import nLayeredETradeDemo.entities.concretes.User;

public interface AuthenticationService {
	
	void login(User user);
	
	void register(User user);	
	
	void loginWithGoogle();
	
	void verify(User user,String code);

}
