package nLayeredETradeDemo.core.concretes.Validators;


import java.util.regex.Pattern;

import nLayeredETradeDemo.core.abstracts.Validator;

public class EmailValidator implements Validator{
	
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	 
	public static boolean isEmailValid(String emailInput) {
	
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,
	    Pattern.CASE_INSENSITIVE);
     
		return pattern.matcher(emailInput).find();
	}

}
