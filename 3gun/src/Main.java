
public class Main {

	public static void main(String[] args) {
	 
		
		UserManager userManager = new UserManager();
		
		User user = new User();
		user.setId(1);
		user.setFirstName("Mahmut Hüseyin");
		user.setLastName("Bayramoðlu");
		user.setMail("mahmut-b48@hotmail.com");
		user.setUserName("Reinmann");
		user.setPassword("*_shetTk*");
		
		userManager.add(user);
		userManager.update(user);
		userManager.delete(user);
		userManager.addComment();
		
		User user1 = new User();
		user.setId(2);
		user.setFirstName("Erdem");
		user.setLastName("Yamen");
		user.setMail("yamenerdem@gmail.com");
		user.setUserName("yamenerdem");
		user.setPassword("*_sdrKs*");
		
		User[] users= {user,user1};
		userManager.addMultiple(users);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addHomeWork();
 
		
		StudentManager studentManager = new StudentManager();
		studentManager.courseTaken();
	}

}
