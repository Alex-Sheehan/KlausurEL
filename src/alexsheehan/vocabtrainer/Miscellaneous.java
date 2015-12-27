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

public class Miscellaneous { //Sonstige nützliche Funktionen, teilweise von mehreren Klassen benutzt

    //Gibt String mit x Sternen zurück
    public static String getStars(int x) {
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < x; y++) {
            sb.append("★");
        }
        return sb.toString();
    }

    
    public static Object[] cloneObjectArray(Object[] obj){
        Object[] obj2 = new Object[obj.length];
        
        for(int i = 0;i<obj.length;i++){
            obj2[i] = obj[i];
        }
        
        return obj2;
    }
    
    /* 
    - FISCHER-YATES SHUFFLE
    @ Methode nicht selber implementiert - Quelle: http://stackoverflow.com/questions/1519736/random-shuffling-of-an-array
    */   
    public static void shuffleArray(Object[] ar) {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            Object a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
    
    
    
    public static void insertionSortDif(Object[] array, boolean lowFirst) {
        if(!lowFirst){
		Object zwischen;
		for (int i = 1; i < array.length; i++) {
			zwischen = array[i];
			int j = i;
			while (j > 0 && ((Vokabel) array[j - 1]).getDifficulty() > ((Vokabel) zwischen).getDifficulty()) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = zwischen;
		}
        }else{
            Object zwischen;
		for (int i = 1; i < array.length; i++) {
			zwischen = array[i];
			int j = i;
			while (j > 0 && ((Vokabel) array[j - 1]).getDifficulty() < ((Vokabel) zwischen).getDifficulty()) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = zwischen;
		}
        }
		
	}
    
    public static void insertionSortGerAlph(Object[] array, boolean lowFirst) {
        if(!lowFirst){
		Object zwischen;
		for (int i = 1; i < array.length; i++) {
			zwischen = array[i];
			int j = i;
                        
                        
                        
			while (j > 0 && ((Vokabel) array[j-1]).getGerman().compareToIgnoreCase(((Vokabel) zwischen).getGerman()) >= 0) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = zwischen;
		}
        }else{
            Object zwischen;
		for (int i = 1; i < array.length; i++) {
			zwischen = array[i];
			int j = i;
			while (j > 0 && ((Vokabel) array[j-1]).getGerman().compareToIgnoreCase(((Vokabel) zwischen).getGerman()) <= 0) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = zwischen;
		}
        }
		
	}
    
    public static void insertionSortForAlph(Object[] array, boolean lowFirst) {
        if(!lowFirst){
		Object zwischen;
		for (int i = 1; i < array.length; i++) {
			zwischen = array[i];
			int j = i;
			while (j > 0 && ((Vokabel) array[j-1]).getForeign().compareToIgnoreCase(((Vokabel) zwischen).getForeign()) >= 0) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = zwischen;
		}
        }else{
            Object zwischen;
		for (int i = 1; i < array.length; i++) {
			zwischen = array[i];
			int j = i;
			while (j > 0 && ((Vokabel) array[j-1]).getForeign().compareToIgnoreCase(((Vokabel) zwischen).getForeign()) <= 0) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = zwischen;
		}
        }
		
	}

}
