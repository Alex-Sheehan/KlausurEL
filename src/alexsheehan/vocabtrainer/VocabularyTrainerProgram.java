package alexsheehan.vocabtrainer;

import alexsheehan.vocabtrainer.guis.WelcomeScreen;


public class VocabularyTrainerProgram { 
    
    /*
    @AlexSheehan Klausurersatzleistung
    => Die Klasse VocabularyTrainerProgram
    - Main Klasse, initialisiert Dateimanager & startet Startscreen
    */

    public static FileListManager FILE_LIST_MANAGER; //Datei-Manager

    //Main-Methode
    public static void main(String[] args) {
        FILE_LIST_MANAGER = new FileListManager(); //DateiManager initialisieren
        new WelcomeScreen().setVisible(true); //Start-GUI erstellen
        

    }

}
