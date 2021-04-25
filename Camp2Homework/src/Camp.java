
public class Camp {
	
    int id;
    String name;
    String teacher;
  static   int numberOfCamp =0;
    public Camp(int id,String name,String teacher){
        this.id =id;
        this.name =name;
        this.teacher =teacher;
        numberOfCamp++;
    }

}
