
public class UserManager {

	
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Named user added.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Named user updated.");
	}
	
	public void delete(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Named user deleted");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			
			add(user);
			System.out.println("multiple added");
		}
		
	}
	
	
	public void addComment() {
		System.out.println(" Comment added ");
	}
	
	public void updateComment() {
		System.out.println(" Comment updated ");
	}
	
	public void deleteComment() {
		System.out.println(" Comment deleted ");
	}
	
}
