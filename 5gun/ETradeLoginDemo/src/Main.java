import nLayeredETradeDemo.business.abstracts.AuthenticationService;
import nLayeredETradeDemo.business.concretes.AuthenticationManager;
import nLayeredETradeDemo.business.concretes.UserManager;
import nLayeredETradeDemo.dataAccess.concretes.MemoryUserDao;
import nLayeredETradeDemo.entities.concretes.User;
 

public class Main {

	public static void main(String[] args) {
	
AuthenticationService au = new AuthenticationManager(new UserManager(new MemoryUserDao()));
		
		User user1 = new User(5,"Mahmut Hüseyin","Bayramoðlu","mahmut-b48@hotmail.com","012345");
		au.register(user1);
		
		User user2 = new User(6,"Erdem","Yamen","yamen@gmail.com","0123456");
		au.login(user2);
		
		
		au.loginWithGoogle();
		au.register(user2);
		System.out.println(user1.getVerificationCode());
		au.verify(user1, user1.getVerificationCode());
	}

}
