
public class InstructorManager extends UserManager {

	
	public void courseAdd(Instructor instructor) {
		System.out.println(instructor.getEducationCategoryId() +" "+"course has been added to this category");
	}
	
	public void addHomeWork() {
		System.out.println("added HomeWork");
	}
}
