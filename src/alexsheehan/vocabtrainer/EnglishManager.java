package alexsheehan.vocabtrainer;

public class EnglishManager extends Manager {

    /*
    @AlexSheehan Klausurersatzleistung
    => Die Klasse EnglishManager
    - Unterklasse von Manager, enthält Dateiname zur Speicherung von englischen Vokabeln
    - Enthält alle Strings für englische GUI (durch Klick auf Button im englischen Vokabeltrainer einstellbar)
    - EnglishManager bei Erstellung der VocabTrainer.java in WelcomeScreen.java initialisiert
    */
    
    public EnglishManager() {
        super(); //Konstruktor von Manager übernehmen
        this.fileName = "lang_english_list.txt"; //Dateiname der Textdatei zur Speicherung des Vokabeln

        //Sonstiges
        this.languageName = "English"; //Name der Sprache in der Sprache (English / Francais)
        this.germanLanguageName = "Englisch"; //Name der Sprache auf Deutsch (Englisch / Französisch)

        //Überschriften
        this.guiTitle = "Vocabulary Trainer"; //Titel der VocabTrainer.java GUI
        this.amountWordsCaption = "Amount of words:"; //Menge der Wörter label in VocabTrainer
        this.tfLabelInGerman = "Englisches"; //Überschrift für englisches Textfeld auf Deutsch (VocabTrainer)
        this.tfLabel = "English Word:"; //Überschrift für englisches TF auf Englisch (VocabTrainer)
        this.tfLabelGer = "German Word:"; //Überschrift für deutsches TF auf Englisch (Vocabtrainer)

        //Buttons
        this.sortButtonText = "Sort Words"; //Button zum Aufrufen des SortGUI (VocabTrainer)
        this.removeButtonText = "Remove Word"; //Button zum Aufrufen des RemoveGUI (VocabTrainer)
        this.checkButton = "Check"; //Button zum Überprüfen der Vokabel (Training in VocabTrainer)
        this.newTraining = "New Training"; //Neues Training starten (VocabTrainer)
        this.nextWord = "Next Word"; //Wort überspringen (VocabTrainer)
        this.endTraining = "End Training?"; //Training beenden? (Bei Öffenen eines GUIs während Training) (VocabTrainer)
        this.addButtonText = "Add"; //Button zum Aufrufen des AddGUIs (VocabTrainer)

        //Sort GUI
        this.sortGUICaption = "Sort Words"; //Überschrift des SortGUI
        this.tableGermanRow = "German"; //Deutsche Tabellenspalte (Sort GUI)
        this.difficulty = "Difficulty"; //Schwierigkeit Tabellenspalte (Sort GUI)
        this.swapPos = "Swap Positions"; //2 Vokabeln tauschen (Sort GUI)
        this.sort = "Sort"; //Nach ausgesuchter Methode sortieren (Sort GUI)
        this.savech = "Save Changes"; //Änderungen speichern (Sort GUI)
        this.revertch = "Revert Changes"; //Änderungen rückgängig machen Button (Sort GUI)
        this.nochangesrevertable = "No revertable changes"; //Fehlermeldung: Keine reversibelen Änderungen (Sort GUI)
        this.reverted = "The last change has been reverted"; //Meldung: Änderung rückgängig gemacht (Sort GUI)
        this.chsaved = "Changes saved"; //Meldung: Änderungen gespeichert (Sort GUI)
        
        //Remove GUI
        this.remGUICaption = "Remove Words"; //Überschrift des RemoveGUIS
        this.deletebtn = "Delete"; //Löschen Button (RemoveGUIS)
        this.wordDeletedString = "Deletion successful"; //Meldung: Löschen erfolgreich (RemoveGUIS)

        //Training Info
        this.words = "Words"; //Das Wort "Wörter" in Fremdsprache (VocabTrainer)
        this.correct = "Correct"; //Richtiges Wort (VocabTrainer)
        this.shown = "Shown: English"; //Fremdsprache gezeigt (Training in VocabTrainer)
        this.gershown = "Shown: German"; //Deutsches Wort gezeigt (Training in VocabTrainer)

        //Output Messages
        this.trainingstarted = "New Training started"; //Neues Training gestartet (VocabTrainer)
        this.correctword = "You entered the correct word!"; //Richtiges Wort eingegeben (VocabTrainer)
        this.wrongword = "This is not correct. Try again!"; //Falsches Wort eingegeben (VocabTrainer)
        this.finished = "You finished your training! Score:"; //Training beendet (VocabTrainer)

        VocabularyTrainerProgram.FILE_LIST_MANAGER.transcriptFileToList(this); //Beim Aufrufen Dateien aus Textdatei laden 

    }

}
