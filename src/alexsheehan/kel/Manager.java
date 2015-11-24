package alexsheehan.kel;

import alexsheehan.datenstrk.Liste;

public abstract class Manager {

    private Liste vkList;
    protected String text01;
    protected String text02;
    protected String text03;
    
    public Manager(){
        vkList = new Liste();
    }

    public String getText01() {
        return text01;
    }

    public String getText02() {
        return text02;
    }

    public String getText03() {
        return text03;
    }
    
    
    
    
}
