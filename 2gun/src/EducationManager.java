package oopIntro;

public class EducationManager {

public void Add(Education education){
		
		//M�kerrer kontrol� yap�l�r
		System.out.println(education.firstName+" adl� e�itmenin bilgileri kayt�t edildi");
	}
	
	public void Update(Education education){
		System.out.println(education.firstName+" adl� e�itmenin bilgileri G�ncellendi");
	}
	
	public void Delete(Education education){
		//asl�nda silinmez durummu false edilir
		System.out.println(education.firstName+" adl� e�itmenin bilgileri Silindi");
	}
	public Education Get(int id){
		//if control� yap�l�r do�ru id deki getirilir
		
		return  new Education() ;
	}
	
	public Education[] GetAll(){
		//if control� yap�l�r do�ru id deki getirilir
		Education[] educations = {
				//veri taban�ndan gelen veriler 
		};
	 
		return educations ;
	}
}
