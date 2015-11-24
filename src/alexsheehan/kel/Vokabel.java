package alexsheehan.kel;

public class Vokabel {

    private String ger;
    private String foreign;
    private int difficult; 
   
    public Vokabel(String g,String f,int d){
        ger = g;
        foreign = f;
        difficult = d;
    }

    public String getGerman() {
        return ger;
    }

    public String getForeign() {
        return foreign;
    }

    public int getDifficulty() {
        return difficult;
    }
    
    
    
}
