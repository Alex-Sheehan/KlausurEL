package alexsheehan.datenstrk;

public class Knoten {

    private Object content; //Inhalt, auf den der Knoten verweist
    private Knoten next;    //Der darauffolgende Knoten  
    
    //Konstruktor
    public Knoten(Object x){ //x - content
        content = x;
    }

    //Content & Next Get-/Setter Methoden
    public Object getContent() {
        return content;
    }

    public void setContent(Object content) { //content - Inhalt, auf den der Knoten verweisen soll
        this.content = content;
    }

    public Knoten getNext() {
        return next;
    }

    public void setNext(Knoten n) { //n - Knoten, der auf diesen Folgen soll
        this.next = n;
    }
    
    
    
}
