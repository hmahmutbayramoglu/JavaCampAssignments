package oopIntro;

public class ContactManager {

	
	public void Add(Contact contact){
		
		//M�kerrer kontrol� yap�l�r
		System.out.println(contact.firstName+" adl� Ki�inin bilgileri kayt�t edildi");
	}
	
	public void Update(Contact contact){
		System.out.println(contact.firstName+" adl� Ki�inin bilgileri G�ncellendi");
	}
	
	public void Delete(Contact contact){
		//asl�nda silinmez durummu false edilir
		System.out.println(contact.firstName+" adl� Ki�inin bilgileri Silindi");
	}
	public Contact Get(int id){
		//if control� yap�l�r do�ru id deki getirilir
		
		return  new Contact() ;
	}
	public Contact[] GetAll(){
		//if control� yap�l�r do�ru id deki getirilir
		Contact[] contacts = {
				//veri taban�ndan gelen veriler 
		};
	 
		return contacts ;
	}
}
