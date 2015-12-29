package alexsheehan.vocabtrainer;

public class FrenchManager extends Manager {

    /*
     @AlexSheehan Klausurersatzleistung
     => Die Klasse FrenchManager
     - Unterklasse von Manager, enthält Dateiname zur Speicherung von französischen Vokabeln
     - Enthält alle Strings für französische GUI (durch Klick auf Button im franz. Vokabeltrainer einstellbar)
     - FrenchManager bei Erstellung der VocabTrainer.java in WelcomeScreen.java initialisiert
     */
    public FrenchManager() {
        super(); //Konstruktor von Manager übernehmen
        this.fileName = "lang_french_list.txt"; //Dateiname der Textdatei zur Speicherung des Vokabeln

        //Sonstiges
        this.languageName = "Francais"; //Name der Sprache in der Sprache (English / Francais)
        this.germanLanguageName = "Französisch"; //Name der Sprache auf Deutsch (Englisch / Französisch)

        //Überschriften
        this.guiTitle = "Entraîneur de Vocabulaire"; //Titel der VocabTrainer.java GUI
        this.amountWordsCaption = "Taille de la liste:"; //Menge der Wörter label in VocabTrainer
        this.tfLabelInGerman = "Französisches"; //Überschrift für franz. Textfeld auf Deutsch (VocabTrainer)
        this.tfLabel = "Mot francais:"; //Überschrift für franz. TF auf Franz. (VocabTrainer)
        this.tfLabelGer = "Mot allemand:"; //Überschrift für deutsches TF auf Franz. (Vocabtrainer)

        //Buttons
        this.sortButtonText = "Trier"; //Button zum Aufrufen des SortGUI (VocabTrainer)
        this.removeButtonText = "Enlever"; //Button zum Aufrufen des RemoveGUI (VocabTrainer)
        this.checkButton = "Vérifer"; //Button zum Überprüfen der Vokabel (Training in VocabTrainer)
        this.newTraining = "Nouveau entraînement";  //Neues Training starten (VocabTrainer)
        this.nextWord = "Prochaine mot"; //Wort überspringen (VocabTrainer)
        this.endTraining = "Termine entraînement?"; //Training beenden? (Bei Öffenen eines GUIs während Training) (VocabTrainer)
        this.addButtonText = "Ajouter";//Button zum Aufrufen des AddGUIs (VocabTrainer)

        //Sort GUI
        this.sortGUICaption = "Trier les mots"; //Überschrift des SortGUI
        this.tableGermanRow = "Allemand";//Deutsche Tabellenspalte (Sort GUI)
        this.difficulty = "Difficulté"; //Schwierigkeit Tabellenspalte (Sort GUI)
        this.swapPos = "Échange les positions"; //2 Vokabeln tauschen (Sort GUI)
        this.sort = "Trier"; //Nach ausgesuchter Methode sortieren (Sort GUI)
        this.nochangesrevertable = "aucun changement revertable";  //Fehlermeldung: Keine reversibelen Änderungen (Sort GUI)
        this.reverted = "Changement revenue"; //Meldung: Änderung rückgängig gemacht (Sort GUI)
        this.chsaved = "Changements enregister";  //Meldung: Änderungen gespeichert (Sort GUI)
        this.savech = "Enregister changements"; //Änderungen speichern (Sort GUI)
        this.revertch = "Revenir changement";  //Änderungen rückgängig machen Button (Sort GUI)

        //Remove GUI
        this.remGUICaption = "Enlever les mots"; //Überschrift des RemoveGUIS
        this.deletebtn = "Enlever";  //Löschen Button (RemoveGUIS)
        this.wordDeletedString = "Effacement avec succès";  //Meldung: Löschen erfolgreich (RemoveGUIS)

        //Training Info
        this.words = "Mots"; //Das Wort "Wörter" in Fremdsprache (VocabTrainer)
        this.correct = "Correcte";//Richtiges Wort (VocabTrainer)
        this.shown = "Montré: Francais"; //Fremdsprache gezeigt (Training in VocabTrainer)
        this.gershown = "Montré: Allemand"; //Deutsches Wort gezeigt (Training in VocabTrainer)

        //Output Messages
        this.trainingstarted = "Nouveau entraînement commencé"; //Neues Training gestartet (VocabTrainer)
        this.correctword = "Le mot est correct!";//Richtiges Wort eingegeben (VocabTrainer)
        this.wrongword = "Le mot n'est pas correct!";//Falsches Wort eingegeben (VocabTrainer)
        this.finished = "Tu as fini t'entraînement!";//Training beendet (VocabTrainer)

        VocabularyTrainerProgram.FILE_LIST_MANAGER.transcriptFileToList(this); //Beim Aufrufen Dateien aus Textdatei laden 

    }

}
