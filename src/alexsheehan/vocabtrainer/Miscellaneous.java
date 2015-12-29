package alexsheehan.vocabtrainer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Miscellaneous {

    /*
     @AlexSheehan Klausurersatzleistung
     => Die Klasse Miscellaneous
     - Enthält sonstige nützliche Funktionen
     - Funktionen werden von mehreren Klassen benutzt
     */
    /*
     => getStarts(int)
     - Gibt String mit x Sternen zurück
     - z.B benutzt in AddGUI bei dem Slider mit der Schwierigkeit
     */
    public static String getStars(int x) {
        StringBuilder sb = new StringBuilder(); //Neuer Stringbuilder
        for (int y = 0; y < x; y++) {  //x Sterne werden dem String hinzugefügt
            sb.append("★");
        }
        return sb.toString(); //String zurückgeben
    }

    /*
     => cloneObjectArray(Object[])
     - Kopiert ein Array aus Objekten
     - benutzt in RemoveGUI & SortGUI 
     */
    public static Object[] cloneObjectArray(Object[] obj) {
        Object[] obj2 = new Object[obj.length]; //Neues Array mit selber Länge wie obj erstellt

        for (int i = 0; i < obj.length; i++) { //Objekte auf das neue Array kopiert
            obj2[i] = obj[i];
        }

        return obj2; //Neues Array zurückgegeben
    }

    /* 
     - FISCHER-YATES SHUFFLE
     @ Methode nicht selber implementiert - Quelle: http://stackoverflow.com/questions/1519736/random-shuffling-of-an-array (Methode leicht verändert)
     - Sortiert das Object[] zufällig
     */
    public static void shuffleArray(Object[] ar) {

        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            Object a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

    /*
     => insertionSortDif(Object[], boolean)
     - sortiert Array nach Schwierigkeit der Vokabeln (Insertion Sort)
     - boolean: aufsteigend oder absteigend
     > false: 1,2,3,4,5
     > true: 5,4,3,2,1
     */
    public static void insertionSortDif(Object[] array, boolean highFirst) {
        if (!highFirst) { //1,2,3,4,5......
            Object zwischen; //Zwischengespeichertes Objekt
            for (int i = 1; i < array.length; i++) { //Fängt beim zweiten Objekt des Arrays an, läuft bis zum Ende
                zwischen = array[i]; //Zwischenspeicher = Array an Stelle i
                int j = i; //Neuer int j = i
                while (j > 0 && ((Vokabel) array[j - 1]).getDifficulty() > ((Vokabel) zwischen).getDifficulty()) { //Passende Stelle für zwischen wird gesucht
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = zwischen; //Zwischengespeichertes Objekt eingesetzt
            }
        } else { //5,4,3,2,1....
            Object zwischen;//Zwischengespeichertes Objekt
            for (int i = 1; i < array.length; i++) {//Fängt beim zweiten Objekt des Arrays an, läuft bis zum Ende
                zwischen = array[i];
                int j = i;//Neuer int j = i
                while (j > 0 && ((Vokabel) array[j - 1]).getDifficulty() < ((Vokabel) zwischen).getDifficulty()) {//Passende Stelle für zwischen wird gesucht
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = zwischen;//Zwischengespeichertes Objekt eingesetzt
            }
        }

    }

    /*
     => insertionSortGerAlph(Object[], boolean)
     - sortiert Array nach alphabetischer Reihenfolge des deutschen Wortes
     - boolean: aufsteigend oder absteigend
     > false: A,B,C,D,E
     > true: E,D,C,B,A
     */
    public static void insertionSortGerAlph(Object[] array, boolean lowFirst) {
        if (!lowFirst) { //A,B,C,D,E.. => Selbe Funktionsweise wie insertionSortDif
            Object zwischen;
            for (int i = 1; i < array.length; i++) {
                zwischen = array[i];
                int j = i;

                while (j > 0 && ((Vokabel) array[j - 1]).getGerman().compareToIgnoreCase(((Vokabel) zwischen).getGerman()) >= 0) {//Deutsches Wort anstatt Schwierigkeit verglichen
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = zwischen;
            }
        } else { //E,D,C,B,A... => Selbe Funktionsweise wie insertionSortDif
            Object zwischen;
            for (int i = 1; i < array.length; i++) {
                zwischen = array[i];
                int j = i;
                while (j > 0 && ((Vokabel) array[j - 1]).getGerman().compareToIgnoreCase(((Vokabel) zwischen).getGerman()) <= 0) {//Deutsches Wort anstatt Schwierigkeit verglichen
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = zwischen;
            }
        }

    }

    /*
     => insertionSortForAlph(Object[], boolean)
     - sortiert Array nach alphabetischer Reihenfolge des Fremdsprachenwortes
     - boolean: aufsteigend oder absteigend
     > false: A,B,C,D,E
     > true: E,D,C,B,A
     */
    public static void insertionSortForAlph(Object[] array, boolean lowFirst) {
        if (!lowFirst) {//A,B,C,D,E.. => Selbe Funktionsweise wie insertionSortDif
            Object zwischen;
            for (int i = 1; i < array.length; i++) {
                zwischen = array[i];
                int j = i;
                while (j > 0 && ((Vokabel) array[j - 1]).getForeign().compareToIgnoreCase(((Vokabel) zwischen).getForeign()) >= 0) {//Fremdsprachenwort anstatt Schwierigkeit verglichen
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = zwischen;
            }
        } else {//E,D,C,B,A... => Selbe Funktionsweise wie insertionSortDif
            Object zwischen;
            for (int i = 1; i < array.length; i++) {
                zwischen = array[i];
                int j = i;
                while (j > 0 && ((Vokabel) array[j - 1]).getForeign().compareToIgnoreCase(((Vokabel) zwischen).getForeign()) <= 0) { //Fremdsprachenwort anstatt Schwierigkeit verglichen
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = zwischen;
            }
        }

    }

}
