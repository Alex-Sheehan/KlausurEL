package alexsheehan.vocabtrainer;

import alexsheehan.vocabtrainer.datast.Knoten;
import alexsheehan.vocabtrainer.guis.WelcomeScreen;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Made by Alex Sheehan - 2015
 * Klausurersatzleistung Info LK
 */
public class VocabularyTrainerProgram { //TODO: Change Name to Vokabeltrainer

    public static FileListManager FILE_LIST_MANAGER;

    //Main-Methode
    public static void main(String[] args) {
        FILE_LIST_MANAGER = new FileListManager();
        new WelcomeScreen().setVisible(true); //Start-GUI erstellen
        

    }

}
