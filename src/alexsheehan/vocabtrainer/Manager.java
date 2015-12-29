package alexsheehan.vocabtrainer;

import alexsheehan.vocabtrainer.datast.Knoten;
import alexsheehan.vocabtrainer.datast.Liste;

public abstract class Manager {

    /*
     @AlexSheehan Klausurersatzleistung
     => Die Klasse Manager
     - Überklasse von EnglishManager und FrenchManager
     - Bestimmt die Strings, die die Unterklassen enthalten
     - Enthält Liste (1. Datenstruktur) mit Vokabeln
     - Methode zum leichteren hinzufügen zur Liste
     - Getter Methoden für Liste & Strings
     - Setter Methode für Liste
     */
    //Vokabel Liste 
    protected Liste vkList; //Liste mit Vokabeln
    protected String fileName; //Dateiname der Textdatei zur Speicherung des Vokabeln

    //Sonstiges
    protected String languageName; //Name der Sprache in der Sprache (English / Francais)
    protected String germanLanguageName; //Name der Sprache auf Deutsch (Englisch / Französisch)

    //Überschriften
    protected String guiTitle; //Titel der VocabTrainer.java GUI
    protected String amountWordsCaption; //Menge der Wörter label in VocabTrainer
    protected String tfLabelInGerman; //Überschrift für -Sprache- Textfeld auf Deutsch (VocabTrainer)
    protected String tfLabel; //Überschrift für -Sprache- TF auf -Sprache- (VocabTrainer)
    protected String tfLabelGer; //Überschrift für deutsches TF auf -Sprache- (Vocabtrainer)

    //Buttons
    protected String addButtonText;//Button zum Aufrufen des AddGUIs (VocabTrainer)
    protected String removeButtonText; //Button zum Aufrufen des RemoveGUI (VocabTrainer)
    protected String sortButtonText;   //Button zum Aufrufen des SortGUI (VocabTrainer)
    protected String checkButton; //Button zum Überprüfen der Vokabel (Training in VocabTrainer)
    protected String newTraining; //Neues Training starten (VocabTrainer)
    protected String nextWord; //Wort überspringen (VocabTrainer)
    protected String endTraining; //Training beenden? (Bei Öffenen eines GUIs während Training) (VocabTrainer)

    //Sort GUI
    protected String sortGUICaption;//Überschrift des SortGUI
    protected String tableGermanRow;//Deutsche Tabellenspalte (Sort GUI)
    protected String difficulty;//Schwierigkeit Tabellenspalte (Sort GUI)
    protected String swapPos;//2 Vokabeln tauschen (Sort GUI)
    protected String sort; //Nach ausgesuchter Methode sortieren (Sort GUI)
    protected String nochangesrevertable;//Fehlermeldung: Keine reversibelen Änderungen (Sort GUI)
    protected String reverted; //Meldung: Änderung rückgängig gemacht (Sort GUI)
    protected String chsaved; //Meldung: Änderungen gespeichert (Sort GUI)
    protected String savech; //Änderungen speichern (Sort GUI)
    protected String revertch;//Änderungen rückgängig machen Button (Sort GUI)

    //Remove GUI
    protected String remGUICaption;//Überschrift des RemoveGUIS
    protected String wordDeletedString; //Meldung: Löschen erfolgreich (RemoveGUIS)
    protected String deletebtn;//Löschen Button (RemoveGUIS)

    //Training info
    protected String words;//Das Wort "Wörter" in Fremdsprache (VocabTrainer)
    protected String correct;//Richtiges Wort (VocabTrainer)
    protected String shown;//Fremdsprache gezeigt (Training in VocabTrainer)
    protected String gershown;//Deutsches Wort gezeigt (Training in VocabTrainer)

    //Output Messages
    protected String trainingstarted;//Neues Training gestartet (VocabTrainer)
    protected String correctword; //Richtiges Wort eingegeben (VocabTrainer)
    protected String wrongword; //Falsches Wort eingegeben (VocabTrainer)
    protected String finished; //Training beendet (VocabTrainer)

    /* 
     => Constructor
     */
    public Manager() {

        vkList = new Liste(); //Neue Liste erstellen, wird durch Unterklassen befüllt

    }

    //Setter Methode für Liste
    public void setList(Liste vkl) {
        vkList = vkl;
    }

    //Vokabel zur Liste hinzufügen (append)
    public void addVokabel(Vokabel q) {
        getList().append(new Knoten(q));

    }

    /*
     => Getter Methoden, sehr viele Getter Methoden
     - Liste
     - oben-genannte Strings
     */
    public Liste getList() { //Die Liste
        return vkList;
    }

    public String getGuiTitle() {
        return guiTitle;
    }

    public String getAddButtonText() {
        return addButtonText;
    }

    public String getRemoveButtonText() {
        return removeButtonText;
    }

    public String getAmountWordsCaption() {
        return amountWordsCaption;
    }

    public String getCheckButtonText() {
        return checkButton;
    }

    public String getNewTrainingText() {
        return newTraining;
    }

    public String getNextWordText() {
        return nextWord;
    }

    public String getLanguageName() {
        return languageName;
    }

    public String getGermanLanguageName() {
        return germanLanguageName;
    }

    public String getTfLabelInGerman() {
        return tfLabelInGerman;
    }

    public String getSortButtonText() {
        return sortButtonText;
    }

    public String getTfLabel() {
        return tfLabel;
    }

    public String getTfLabelGerman() {
        return tfLabelGer;
    }

    public String getSortGUICaption() {
        return sortGUICaption;
    }

    public String getTableGermanRow() {
        return tableGermanRow;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getSwapText() {
        return swapPos;
    }

    public String getWords() {
        return words;
    }

    public String getCorrect() {
        return correct;
    }

    public String getShown() {
        return shown;
    }

    public String getGerShown() {
        return gershown;
    }

    public String getTrainingStarted() {
        return trainingstarted;
    }

    public String getCorrectWord() {
        return correctword;
    }

    public String getWrongWord() {
        return wrongword;
    }

    public String getFinished() {
        return finished;
    }

    public String getFileName() {
        return fileName;
    }

    public String getSortString() {
        return sort;
    }

    public String getEndTraining() {
        return endTraining;
    }

    public String getNochangesrevertable() {
        return nochangesrevertable;
    }

    public String getReverted() {
        return reverted;
    }

    public String getChsaved() {
        return chsaved;
    }

    public String getSavech() {
        return savech;
    }

    public String getRevertch() {
        return revertch;
    }

    public String getRemGUICaption() {
        return remGUICaption;
    }

    public String getWordDeletedString() {
        return wordDeletedString;
    }

    public String getDeletebtn() {
        return deletebtn;
    }
}
