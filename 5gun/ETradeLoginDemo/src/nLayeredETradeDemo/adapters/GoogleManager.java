package nLayeredETradeDemo.adapters;

import java.util.ArrayList;

import nLayeredETradeDemo.Services.Gmail.GmailEntity;
import nLayeredETradeDemo.Services.Gmail.GmailManager;
import nLayeredETradeDemo.core.abstracts.GoogleService;
import nLayeredETradeDemo.entities.concretes.User;

public class GoogleManager implements GoogleService{

	@Override
	public User registerWithGoogle() {
	       GmailManager gmailManager = new GmailManager();
	       
	       ArrayList<GmailEntity> emails = gmailManager.emailAndPassword();
	       
	       int rnd = (int)Math.floor(Math.random() * emails.size()-1);
	       
	       User user = new User(10,emails.get(rnd).getFirstName(),emails.get(rnd).getLastName(),emails.get(rnd).getEmail(),emails.get(rnd).getPassword());
	       

		   return user;
	}

}
