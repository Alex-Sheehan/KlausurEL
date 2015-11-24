package alexsheehan.datenstrk;

public class ListKnoten extends Knoten{ //Unterklasse der Knotenklasse

    private Knoten prev;
    
    public ListKnoten(Object x) {
        super(x);                       //Konstruktor der Superklasse Übernehmen   
    }

    public void setPrevious(Knoten k){
        prev = k;    
    }
    
    public Knoten getPrevious(){
        return prev;
    }

    
}
