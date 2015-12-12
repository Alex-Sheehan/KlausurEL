package alexsheehan.kel;

import alexsheehan.guis.VocabTrainer;

public class Training {

    private VocabTrainer trainer;
    private int current = 1;
    private int correct = 0;
    
    public Training(VocabTrainer v){
        this.trainer = v;
        trainer.toggleAccessability(true);
        
    }
    
    public int getCurrent(){
        return current;
    }
    
    public int getCorrect(){
        return correct;
    }
    
    public void start(){
        trainer.updateTrainingInfos();
        nextWord();
    }
    
    public void nextWord(){
        if(current == 1){
            trainer.getManager().getList().toFirst();
            if(trainer.getToggleShown().isSelected()){
                trainer.getGermanField().setText("");
                trainer.getForeignField().setText(((Vokabel)trainer.getManager().getList().getCurrent().getContent()).getForeign());
            }else{
                trainer.getGermanField().setText(((Vokabel)trainer.getManager().getList().getCurrent().getContent()).getGerman());
                trainer.getForeignField().setText("");
            }
        }
    }
}
