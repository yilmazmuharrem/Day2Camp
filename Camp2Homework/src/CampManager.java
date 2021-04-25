
public class CampManager {

	
    public void campAdedi(){
        System.out.println("KODLAMA.IO ADLI SÝTEDE TOPLAMDA "+ Camp.numberOfCamp+" ADET KAMP VAR");
    }

    public void teacherOfCamp(Camp camp){
        System.out.println(camp.name+" Kampýnýn Eðitmen Adý :"+ camp.teacher);
    }


    public void campArray(Camp[] camps){
    for (Camp camp : camps) {
        System.out.println("Kamp adý : "+ camp.name+
                ", Kamp EÐÝTMENÝ : "+ camp.teacher+
                ", Kamp ID : "+ camp.id);
    }
}

}
