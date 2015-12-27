package alexsheehan.vocabtrainer.datast;

public class StackKnoten {

    private Object[] content; //Inhalt, auf den der Knoten verweist
    private StackKnoten next;    //Der darauffolgende Knoten  
    
    
    //Konstruktor
    public StackKnoten(Object[] x){ //x - content
        content = x;
    }

    //Content & Next Get-/Setter Methoden
    public Object[] getContent() {
        return content;
    }

    public void setContent(Object[] content) { //content - Inhalt, auf den der Knoten verweisen soll
        this.content = content;
    }

    public StackKnoten getNext() {
        return next;
    }

    public void setNext(StackKnoten n) { //n - Knoten, der auf diesen Folgen soll
        this.next = n;
    }

    
     
    
}

