package alexsheehan.datenstrk;

public class Schlange {

    private Knoten tail; //Tail der Schlange
    private Knoten head; //Head der Schlange
    
    //Konstruktor
    public Schlange(){
        tail = null;
        head = null;    
    }

    //Tail&Head Get-/Setter Methoden
    public Knoten getTail() {
        return tail;
    }

    public void setTail(Knoten tail) {
        this.tail = tail;
    }

    public Knoten getHead() {
        return head;
    }

    public void setHead(Knoten head) {
        this.head = head;
    }
    
    //Neuen Knoten hinten an Schlange hinzufügen
    public void add(Knoten x){ //x - Knoten, der hinzugefügt werden soll
        if(head == null && tail == null){
            tail = x;
            head = x;
        }else{
            tail.setNext(x);
            tail = x;
        }      
    }
    
   //Erster Knoten der Schlange wird entfernt
   public void removeFirst(){
       if(head != null){
           if(head.getNext() != null){
               head = head.getNext();
           }else{
               head = null;
               tail = null;
           }
       }
   }
    
}
