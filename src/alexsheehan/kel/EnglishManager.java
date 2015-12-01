package alexsheehan.kel;

import alexsheehan.kel.*;
import java.awt.Color;

public class EnglishManager extends Manager{
    
    public EnglishManager(){
        super(); //Konstruktor von Manager übernehmen
        this.lang = Language.ENGLISH; //Sprach-Enum festlegen
        
        //Sonstiges
        this.languageName = "English";
        this.germanLanguageName = "Englisch";
        
        //Überschriften
        this.guiTitle = "Vocabulary Trainer";
        this.amountWordsCaption = "Amount of words:"; 
        this.tfLabelInGerman = "Englisches";
        this.tfLabel = "English Word:";
        this.tfLabelGer = "German Word:";
        
        //Buttons
        this.sortButtonText = "Sort Words";
        this.removeButtonText = "Remove Word";
        this.checkButton = "Check";
        this.newTraining = "New Training";
        this.nextWord = "Next Word";
        this.hintText = "Hint";
        this.addButtonText = "Add";
    }

}
