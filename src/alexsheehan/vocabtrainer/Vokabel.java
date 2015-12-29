package alexsheehan.vocabtrainer;

public class Vokabel {

    /*
     @AlexSheehan Klausurersatzleistung
     => Die Klasse Vocabel
     - Speichert Deutsches Wort, Fremdsprachenwort, Schwierigkeit
     - Wird später in Knoten gespeichert
     */
    private String ger; //Deutsch
    private String foreign; //Fremdsprache
    private int difficult; //Schwierigkeit

    public Vokabel(String g, String f, int d) { //Konstruktor
        ger = g; //Deutsch
        foreign = f; //Fremdsprache
        difficult = d; //Schwierigkeit
    }

    public String getGerman() { //Deutsches Wort zurückgeben
        return ger;
    }

    public String getForeign() { //Fremdsprachenwort zurückgeben
        return foreign;
    }

    public int getDifficulty() { //Schwierigkeit zurückgeben
        return difficult;
    }

}
