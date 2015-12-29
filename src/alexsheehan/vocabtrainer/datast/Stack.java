package alexsheehan.vocabtrainer.datast;

public class Stack { //Der Stack (2. Datenstruktur)

    /*
     Der Stack wurde für das Rückgängigmachen in der Lösch-/Sortierklasse benutzt,
     da neue Elemente immer nur oben eingefügt und entfernt werden und der Stack
     gut für dies geeignet ist
     */
    private StackKnoten head; //Head des Stacks
    private int size; //Größe des Stacks

    //Konstruktor, head = null, Größe = 0
    public Stack() {
        head = null;
        size = 0;
    }

    //Head Get-/Setter Methoden
    public StackKnoten getHead() {
        return head;
    }

    public void setHead(StackKnoten head) {
        this.head = head;
    }

    //Size Getter Methode
    public int getSize() {
        return size;
    }

    //Push Methode - neues Knoten oben auf Stapel legen
    public void push(StackKnoten x) { //x - Knoten, der hinzugefügt wird
        if (size > 0) {
            x.setNext(head);
        }
        head = x;
        size++;

    }

    //Pop Methode - oberstes Objekt entfernen
    public void pop() {
        if (head.getNext() == null) {  //Wenn letzen Objekt auf Stapel 
            head = null;     //head = null    
            size = 0;     //Größe 0      
        } else { //Sonst
            head = head.getNext(); //Head = Head's nächstes
            size--; //Größe -1
        }
    }

    public void flush() { //Stack leeren
        head = null; //Head = null
        size = 0; //Größe 0
    }

}
