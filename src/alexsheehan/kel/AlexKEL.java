package alexsheehan.kel;

import alexsheehan.datenstrk.Knoten;
import alexsheehan.datenstrk.ListKnoten;
import alexsheehan.guis.WelcomeScreen;

/*
 * Made by Alex Sheehan - 2015
 * Klausurersatzleistung Info LK
 */

public class AlexKEL { //TODO: Change Name

   
    private static Manager eng;
    private static Manager frz;
   
    //Main-Methode
    public static void main(String[] args) {
        new WelcomeScreen().setVisible(true); //Start-GUI erstellen
        eng = new EnglishManager();
        
        
    }
    
    public static Manager getEnglish(){
        return eng;
    }
    
    public static Manager getFrench(){
        return frz;
    }
    
}
