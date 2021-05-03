package oopIntro;

public class Contact {

	public Contact() {
		
	}
	
	public Contact(int _id, int _userId, int _countryId, int _cityId, 
			String _firstName, String _lastName,
			String _address, String _phoneNumber1, String _phoneNumber2,boolean _status) {
		this();
		
		this.id=_id;
		this.userId=_userId;
		this.countryId=_countryId;
		this.cityId=_cityId;
		this.firstName=_firstName;
		this.lastName=_lastName;
		this.address=_address;
		this.phoneNumber1=_phoneNumber1;
		this.phoneNumber2=_phoneNumber2;
		this.status=_status;
		
	}
	
	int id;
	int userId;
	int countryId;
	int cityId;
	String firstName;
	String lastName;
	String address;
	String phoneNumber1;
	String phoneNumber2;
	boolean status=true;
	
}
