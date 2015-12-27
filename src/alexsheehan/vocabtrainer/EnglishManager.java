package alexsheehan.vocabtrainer;

public class EnglishManager extends Manager {

    public EnglishManager() {
        super(); //Konstruktor von Manager übernehmen
        this.fileName = "lang_english_list.txt";
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
        this.endTraining = "End Training?";

        this.addButtonText = "Add";

        //Sort GUI
        this.sortGUICaption = "Sort Words";
        this.tableGermanRow = "German";
        this.difficulty = "Difficulty";
        this.swapPos = "Swap Positions";
        this.sort = "Sort";
        this.savech = "Save Changes";
        this.revertch = "Revert Changes";
        this.nochangesrevertable = "No revertable changes";
        this.reverted = "The last change has been reverted";
        this.chsaved = "Changes saved";

        //Training Info
        this.words = "Words";
        this.correct = "Correct";
        this.shown = "Shown: English";
        this.gershown = "Shown: German";

        //Output Messages
        this.trainingstarted = "New Training started";
        this.correctword = "You entered the correct word!";
        this.wrongword = "This is not correct. Try again!";
        this.finished = "You finished your training! Score:";

        VocabularyTrainerProgram.FILE_LIST_MANAGER.transcriptFileToList(this);

    }

}
