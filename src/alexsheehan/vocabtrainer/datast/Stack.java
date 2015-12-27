package alexsheehan.vocabtrainer.datast;


public class Stack {

    private StackKnoten head; //Head des Stacks
    private int size; //Größe des Stacks

    //Konstruktor
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
    public int getSize(){
        return size;
    }

    //Push Methode
    public void push(StackKnoten x) { //x - Knoten, der hinzugefügt wird
        if( size > 0){
            x.setNext(head);     
        }
            head = x;           
            size++;             
            System.out.print("Added "+size);
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
    
    public void flush(){
        head = null;
        size = 0;
    }

}
