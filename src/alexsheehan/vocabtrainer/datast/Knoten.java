package alexsheehan.vocabtrainer.datast;

public class Knoten {

    private Object content; //Inhalt, auf den der Knoten verweist
    private Knoten next;    //Der darauffolgende Knoten  
    private Knoten prev; //Vorheriger Knoten

    //Konstruktor
    public Knoten(Object x) { //x - content
        content = x;
    }

    public Object getContent() { //Content zurückgeben
        return content;
    }

    public void setContent(Object content) { //Content verändern
        this.content = content;
    }

    public Knoten getNext() { //Nächsten Knoten zurückgeben
        return next;
    }

    public void setNext(Knoten n) { //Nächsten Knoten setzen
        this.next = n;
    }

    public void setPrevious(Knoten k) { //Vorherigen Knoten setzen
        prev = k;
    }

    public Knoten getPrevious() { //Vorherigen Knoten zurückgeben
        return prev;
    }

}
