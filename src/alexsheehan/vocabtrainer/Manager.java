package alexsheehan.vocabtrainer;

import alexsheehan.vocabtrainer.datast.Knoten;
import alexsheehan.vocabtrainer.datast.Liste;

public abstract class Manager {

    //Vokabel Liste 
    protected Liste vkList;
    protected String fileName;

    //Sonstiges
    protected Language lang; //Language Enum
    protected String languageName; //Name der Sprache :z.B Francais
    protected String germanLanguageName; //Name der Sprache (auf Deutsch) :z.B Französisch

    //GUI Überschirft
    protected String guiTitle;

    //Überschriften
    protected String amountWordsCaption; //Listengröße Überschrift
    protected String tfLabelInGerman; //Textfield Überschrift (auf Deutsch): z.B Französisches...
    protected String tfLabel; //Textfield Überschrift: z.B English Word:
    protected String tfLabelGer; //Überschrift für deutsches Textfield : z.B German Word:

    //Buttons
    protected String addButtonText; //Wort hinzufügen
    protected String removeButtonText; //Wört entfernen
    protected String sortButtonText; //Wörter sortieren
    protected String checkButton; //Überprüfen
    protected String newTraining; //Neues Training
    protected String nextWord; //Nächstes Wort

    //Sort GUI
    protected String sortGUICaption;
    protected String tableGermanRow;
    protected String difficulty;
    protected String swapPos;
    protected String sort;

    //Training info
    protected String words;
    protected String correct;
    protected String shown;
    protected String gershown;
    
    //Output Messages
    protected String trainingstarted;
    protected String correctword;
    protected String wrongword;
    protected String finished;
    
    

    /* 
     => Constructor
     */
    public Manager() {
        vkList = new Liste();
        
    }

    /*
     => Getter Methoden, sehr viele Getter Methoden
     */
    public Liste getList() { //Die Liste
        return vkList;
    }

    public Language getLanguage() {
        return lang;
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

    public void addVokabel(Vokabel q) {
        getList().append(new Knoten(q));

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
    
    public String getGerShown(){
        return gershown;
    }
    
    public String getTrainingStarted(){
        return trainingstarted;
    }
    
    public String getCorrectWord(){
        return correctword;
    }
    
    public String getWrongWord(){
        return wrongword;
    }
    
    public String getFinished(){
        return finished;
    }
    
    public String getFileName(){
        return fileName;
    }
    
    public String getSortString(){
        return sort;
    }
}
