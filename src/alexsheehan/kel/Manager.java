package alexsheehan.kel;

import alexsheehan.kel.*;
import alexsheehan.datenstrk.Liste;

public abstract class Manager {

    //Vokabel Liste 
    private Liste vkList;

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
    protected String hintText; //Hinweis Button

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

    public String getbtnHintText() {
        return hintText;
    }

    public String getTfLabel() {
        return tfLabel;
    }

    public String getTfLabelGerman() {
        return tfLabelGer;
    }
}
