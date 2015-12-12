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
        
        this.addButtonText = "Ajouter";
        
        //Sort GUI
        this.sortGUICaption = "Trier les mots";
        this.tableGermanRow = "Allemand";
        this.difficulty = "Difficulté";
        this.swapPos = "Échange les positions";
        
        //Training Info
        this.words = "Mots";
        this.correct = "Correcte";  
        this.shown = "Montré: Francais";
        this.gershown = "Montré: Allemand";
        
    }
    
}
