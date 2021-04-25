
public class Main {

	public static void main(String[] args) {

        CampManager campManager =new CampManager();
        Camp camp1 =new Camp(1,"C# KAMPI","ENGÝN DEMÝROG");
        Camp camp2 =new Camp(2,"JAVA KAMPI","ENGÝN DEMÝROG");
        Camp camp3 =new Camp(3,"TEMEL PROGRAMLAMA KAMPI","UDEMY/ ENGÝN DEMÝROG");

        Camp[] camps ={camp1, camp2, camp3};

        campManager.campAdedi(); // KAMP ADEDÝ

        campManager.campArray(camps); // KAMP BÝLGÝLERÝ

        campManager.teacherOfCamp(camp1); // GÝRÝLEN KAMPIN EÐÝTMENÝ

		
		
		
		
		
		

	}

}
