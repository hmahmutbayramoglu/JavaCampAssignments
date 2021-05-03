package oopIntro;

public class Education {

	
	public Education() {
		
	}
	
	public Education(int _id, int _instructorId, int _educationCategoryId,
			String _firstName, String _lastName, String _educationImgUrl,
			String _instructorImgUrl, String _progressValue
		 ) {
		this();
 
		
		this.id=_id;
		this.instructorId=_instructorId;
		this.educationCategoryId=_educationCategoryId;
		this.firstName=_firstName;
		this.lastName=_lastName;
		this.educationImgUrl=_educationImgUrl;
		this.instructorImgUrl=_instructorImgUrl;
		this.progressValue=_progressValue;
 
		
	}
	
	
	int id;
	int instructorId;
	int educationCategoryId;
	String firstName;
	String lastName;
	String educationImgUrl;
	String instructorImgUrl;
	String progressValue; // çaðýrýlýrken iþlem yapýlýrken int e convert edilir
	
}
