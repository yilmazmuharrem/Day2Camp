
public class CampManager {

	
    public void campAdedi(){
        System.out.println("KODLAMA.IO ADLI S�TEDE TOPLAMDA "+ Camp.numberOfCamp+" ADET KAMP VAR");
    }

    public void teacherOfCamp(Camp camp){
        System.out.println(camp.name+" Kamp�n�n E�itmen Ad� :"+ camp.teacher);
    }


    public void campArray(Camp[] camps){
    for (Camp camp : camps) {
        System.out.println("Kamp ad� : "+ camp.name+
                ", Kamp E��TMEN� : "+ camp.teacher+
                ", Kamp ID : "+ camp.id);
    }
}

}
