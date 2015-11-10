package alexsheehan.datenstrk;


public class Stack {

    private Knoten head; //Head des Stacks
    private int size; //Größe des Stacks

    //Konstruktor
    public Stack() {
        head = null;
        size = 0;
    }

    //Head Get-/Setter Methoden
    public Knoten getHead() {
        return head;
    }

    public void setHead(Knoten head) {
        this.head = head;
    }
    
    //Size Getter Methode
    public int getSize(){
        return size;
    }

    //Push Methode
    public void push(Knoten x) { //x - Knoten, der hinzugefügt wird
            x.setNext(head);     
            head = x;           
            size++;             
    }

    //Pop Methode
    public void pop() {
        if(head.getNext()== null){ 
            head = null;         
            size = 0;             
        }else{
            head = head.getNext();
            size--;
        }
    }

}
