
public class Main {

	public static void main(String[] args) {

        CampManager campManager =new CampManager();
        Camp camp1 =new Camp(1,"C# KAMPI","ENG�N DEM�ROG");
        Camp camp2 =new Camp(2,"JAVA KAMPI","ENG�N DEM�ROG");
        Camp camp3 =new Camp(3,"TEMEL PROGRAMLAMA KAMPI","UDEMY/ ENG�N DEM�ROG");

        Camp[] camps ={camp1, camp2, camp3};

        campManager.campAdedi(); // KAMP ADED�

        campManager.campArray(camps); // KAMP B�LG�LER�

        campManager.teacherOfCamp(camp1); // G�R�LEN KAMPIN E��TMEN�

		
		
		
		
		
		

	}

}
