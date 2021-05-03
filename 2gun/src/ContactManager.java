package oopIntro;

public class ContactManager {

	
	public void Add(Contact contact){
		
		//Mükerrer kontrolü yapýlýr
		System.out.println(contact.firstName+" adlý Kiþinin bilgileri kaytýt edildi");
	}
	
	public void Update(Contact contact){
		System.out.println(contact.firstName+" adlý Kiþinin bilgileri Güncellendi");
	}
	
	public void Delete(Contact contact){
		//aslýnda silinmez durummu false edilir
		System.out.println(contact.firstName+" adlý Kiþinin bilgileri Silindi");
	}
	public Contact Get(int id){
		//if controlü yapýlýr doðru id deki getirilir
		
		return  new Contact() ;
	}
	public Contact[] GetAll(){
		//if controlü yapýlýr doðru id deki getirilir
		Contact[] contacts = {
				//veri tabanýndan gelen veriler 
		};
	 
		return contacts ;
	}
}
