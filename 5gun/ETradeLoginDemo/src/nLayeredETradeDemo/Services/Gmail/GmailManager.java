package nLayeredETradeDemo.Services.Gmail;

import java.util.ArrayList;

public class GmailManager {

public ArrayList<GmailEntity>  emailAndPassword() {
		
		ArrayList<GmailEntity>  gmClass = new ArrayList<GmailEntity>();
		
	
		gmClass.add(new GmailEntity(1,"Mahmut H�seyin","Bayramo�lu","mahmut-b48@hotmail.com","0123"));
		gmClass.add(new GmailEntity(2,"Erdem","Yamen","yamen@gmail.com","01234"));
		gmClass.add(new GmailEntity(3,"Mert","Da�l�","dagli@gmail.com","012345"));
		gmClass.add(new GmailEntity(4,"Murat","Bayram","bayram@gmail.com","0123456"));
 

		
		return gmClass;
	
	}
	
	
}
