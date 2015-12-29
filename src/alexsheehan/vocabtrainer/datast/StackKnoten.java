package alexsheehan.vocabtrainer.datast;

public class StackKnoten { //Eigentlich genau wie der normale Knoten, hat nur kein Objekt als Inhalt sondern ein Objekt[] 

    private Object[] content; //Inhalt, auf den der Knoten verweist
    private StackKnoten next;    //Der darauffolgende Knoten  

    //Konstruktor
    public StackKnoten(Object[] x) {
        content = x; //Inhalt = x
    }

    public Object[] getContent() { //Inhalt zurückgeben
        return content;
    }

    public void setContent(Object[] content) { //Inhalt verändern
        this.content = content;
    }

    public StackKnoten getNext() { //Nächsten Knoten  zurückgeben
        return next;
    }

    public void setNext(StackKnoten n) { //Nächsten Knoten setzen
        this.next = n;
    }

}
