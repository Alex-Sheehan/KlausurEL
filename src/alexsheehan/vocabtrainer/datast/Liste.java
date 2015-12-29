package alexsheehan.vocabtrainer.datast;

public class Liste { //Lineare Liste (1. Datenstruktur)

    private Knoten first; //Erster Knoten
    private Knoten last; //Letzter Knoten
    private Knoten current; //Current Knoten
    private int size; //Größe der Liste

    public Liste() { //Konstrukor, Zeiger auf null / Größe auf 0

        first = null;
        last = null;
        current = null;
        size = 0;
    }

    public void append(Knoten newn) { //Neuer Knoten hinten anfügen

        if (size == 0) { //Wenn leer
            first = newn; //First auf neuen Knoten
            last = newn; //Last auf neuen Knoten
            current = newn; //Current auf neuen Knoten
            size = 1; //größe auf 1
        } else { //Wenn nicht leer
            last.setNext(newn); //Next von alten Tail auf den neuen Knoten setzen
            newn.setPrevious(last); //Prev vom neuen Knoten = alter Tail
            last = newn; //Last = neuer Knoten
            size++; //Größe +1
        }

    }
    
    public Object[] toArray(){ //Wandelt Liste in Array um (für sortieren etc)
        Object[] ar = new Object[size]; //Neues Array, genauso groß wie Liste
        for(int run = 0;run < size;run++){ //Für jedes Listenobjekt
            ar[run] = current.getContent(); //Listenobj in Array fügen
            next();
        }
        return ar; //Array zurückgeben
    }

    public void insert(Knoten kn) { //Knoten VOR current einsetzen
        if (current == first) { //Current = First
            
            kn.setNext(first); //Next des neuen Knotens  = altes First
            first.setPrevious(kn); //Vorherigen Knoten des alten First = neuer Knoten
            first = kn; //First = neuer Knoten
            size++; //Größe +1
            
        }else{ //Current != First
            
            current.getPrevious().setNext(kn); //Next von Current's Vorherigen = Neuer Knoten
            kn.setPrevious(current.getPrevious()); //Vorheriger Knoten des neuen Knotens = Vorheriger von current
            current.setPrevious(kn); //Currents vorheriger = neuer Knoten
            kn.setNext(current); //Nächster Knoten des neuen = current
            size++;//Größe +1
        }
    }

    public void remove() { //Current entfernen
        if (size == 1) { //Letzes Obj in Liste
            first = null; //Auf null setzen
            last = null; //Auf null setzen
            current = null; //Auf null setzen
            size = 0; //Liste ist leer
        } else { //Nicht das letze Obj in Liste
            if (hasAccess()) { //Wenn current != null ist

                if (current == last) { //Wenn Current das letzte Obj in Liste ist
                    last = current.getPrevious(); //Neuer letzer Knoten setzen
                    current.getPrevious().setNext(null); //Next des neuen Last = null
                    current = first; //Current auf ersten Knoten setzen
                    size--; //Größe-1
                } else if (current == first) { //Wenn Current das erste Obj in Liste ist
                    first = current.getNext(); //Neues First festlegen
                    current = current.getNext(); //Current eins nach vorne verschieben
                    current.setPrevious(null); //Previous des neuen Current = null
                    size--;//Größe-1
                } else { //Wenn keins von den beiden oberen
                    current.getPrevious().setNext(current.getNext()); // Previous von Current zeigt auf Current's next
                    current.getNext().setPrevious(current.getPrevious()); //Next von Current zeigt auf Current's previous
                    current = current.getNext(); //Current um eins nach vorne verschieben
                    size--;//Größe-1
                }

            }
        }
    }

    //Current um 1 nach vorner verschieve
    public void next() { 
        
        if(current == last){ //Wenn Current = letzer Knoten
            current = first; //Current auf ersten setzen
        }else{ //Sonst
            current = current.getNext(); //Current um 1 nach vorne verschiben
        }
    }

    public void toFirst() { //Current auf erstes Obj
        current = first;
    }

    public void toLast() { //Current auf letztes Obj
        current = last;
    }

    public boolean isEmpty() { //Liste leer?
        return size == 0;
    }

    public boolean hasAccess() { //Current null?
        return current != null;
    }

    public Knoten getFirst() { //Ersten Knoten zurückgeben
        return first;
    }

    public void setFirst(Knoten first) { //Ersten Knoten verändern
        this.first = first;
    }

    public Knoten getLast() { //Letzten Knoten zurückgeben
        return last;
    }

    public void setLast(Knoten last) { //Letzten Knoten verändern
        this.last = last;
    }

    public Knoten getCurrent() { //Current zurückgeben
        return current;
    }

    public void setCurrent(Knoten current) { //Current Knoten verändern
        this.current = current;
    }

    public int getSize() { //Größe zurückgeben
        return size;
    }

    public void setSize(int size) { //Größe verändern
        this.size = size;
    }

    /*
    fromArray(Object[]) : erstellt Liste aus Array
    */
    public static Liste fromArray(Object[] array){ //Gibt neu erstellte Liste zurück
        
        
        Liste l = new Liste(); //Neue Liste
          
        for(Object o : array){ //Für jedes Obj im Array
            Knoten k = new Knoten(o);
            l.append(k); //An Liste anfügen
        }
        
        return l; //Liste zurückgeben
        
    }
    
}
