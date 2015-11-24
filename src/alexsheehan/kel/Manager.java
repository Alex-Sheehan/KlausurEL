package alexsheehan.kel;

import alexsheehan.datenstrk.Liste;
import java.awt.Color;

public abstract class Manager {

    private Liste vkList;
    protected String text01;
    protected String text02;
    protected String text03;
    protected String text04;
    protected String text05;
    protected String text06;

    public Manager() {
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

    public String getText04() {
        return text04;
    }
    
    public String getText05(){
        return text05;
    }
    
    public String getText06(){
        return text06;
    }

    public Liste getList() {
        return vkList;
    }

}
