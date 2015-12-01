package alexsheehan.kel;

import alexsheehan.kel.*;

public class FrenchManager extends Manager{

    public FrenchManager(){
        super(); //Konstruktor von Manager übernehmen
        this.lang = Language.FRENCH; //Sprach-Enum festlegen
        
        //Sonstiges
        this.languageName = "Francais";
        this.germanLanguageName = "Französisch";
        
        //Überschriften
        this.guiTitle = "Entraîneur de Vocabulaire";
        this.amountWordsCaption = "Taille de la liste:"; 
        this.tfLabelInGerman = "Französisches";
        this.tfLabel = "Mot francais:";
        this.tfLabelGer = "Mot allemand:";
        
        //Buttons
        this.sortButtonText = "Trier";
        this.removeButtonText = "Enlever";
        this.checkButton = "Vérifer";
        this.newTraining = "Nouveau entraînement";
        this.nextWord = "Prochaine mot";
        this.hintText = "Indication";
        this.addButtonText = "Ajouter";
    }
    
}
