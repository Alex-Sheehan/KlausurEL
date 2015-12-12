package alexsheehan.datenstrk;

public class Liste {

    private Knoten first;
    private Knoten last;
    private Knoten current;
    private int size;

    public Liste() {

        first = null;
        last = null;
        current = null;
        size = 0;
    }

    public void append(Knoten newn) {

        if (size == 0) {
            first = newn;
            last = newn;
            current = newn;
            size = 1;
        } else {
            last.setNext(newn);
            newn.setPrevious(last);
            last = newn;
            size++;
        }

    }
    
    public Object[] toArray(){
        Object[] ar = new Object[size];
        for(int run = 0;run < size;run++){
            ar[run] = current.getContent();
            next();
        }
        return ar;
    }

    public void insert(Knoten kn) {
        if (current == first) {
            
            kn.setNext(first);
            first.setPrevious(kn);
            first = kn;
            size++;
        }else{
            current.getPrevious().setNext(kn);
            current.setPrevious(kn);
            kn.setNext(current);
            size++;
        }
    }

    public void remove() {
        if (size == 1) {
            first = null;
            last = null;
            current = null;
            size = 0;
        } else {
            if (hasAccess()) {

                if (current == last) {
                    last = current.getPrevious();
                    current = first;
                    size--;
                } else if (current == first) {
                    first = current.getNext();
                    current = current.getNext();
                    current.setPrevious(null);
                    size--;
                } else {
                    current.getPrevious().setNext(current.getNext());
                    current.getNext().setPrevious(current.getPrevious());
                    current = current.getNext();
                    size--;
                }

            }
        }
    }

    public void next() {
        
        
        if(current == last){
            current = first;
        }else{
            current = current.getNext();
        }
    }

    public void toFirst() {
        current = first;
    }

    public void toLast() {
        current = last;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean hasAccess() {
        return current != null;
    }

    public Knoten getFirst() {
        return first;
    }

    public void setFirst(Knoten first) {
        this.first = first;
    }

    public Knoten getLast() {
        return last;
    }

    public void setLast(Knoten last) {
        this.last = last;
    }

    public Knoten getCurrent() {
        return current;
    }

    public void setCurrent(Knoten current) {
        this.current = current;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
