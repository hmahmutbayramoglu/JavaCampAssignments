package oopIntro;

public class EducationManager {

public void Add(Education education){
		
		//Mükerrer kontrolü yapýlýr
		System.out.println(education.firstName+" adlý eðitmenin bilgileri kaytýt edildi");
	}
	
	public void Update(Education education){
		System.out.println(education.firstName+" adlý eðitmenin bilgileri Güncellendi");
	}
	
	public void Delete(Education education){
		//aslýnda silinmez durummu false edilir
		System.out.println(education.firstName+" adlý eðitmenin bilgileri Silindi");
	}
	public Education Get(int id){
		//if controlü yapýlýr doðru id deki getirilir
		
		return  new Education() ;
	}
	
	public Education[] GetAll(){
		//if controlü yapýlýr doðru id deki getirilir
		Education[] educations = {
				//veri tabanýndan gelen veriler 
		};
	 
		return educations ;
	}
}
