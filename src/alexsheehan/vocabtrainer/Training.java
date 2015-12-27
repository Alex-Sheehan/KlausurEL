package alexsheehan.vocabtrainer;

import alexsheehan.vocabtrainer.guis.VocabTrainer;

public class Training {

    private VocabTrainer trainer;
    private int current = 0;
    private int correct = 0;
    private boolean forshown;
    
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
        trainer.setOutputText(0);
        trainer.updateTrainingInfos();
        shownextWord();
    }
    
    public void shownextWord(){
        forshown = trainer.getToggleShown().isSelected();
        trainer.getGermanField().setEditable(true);
        trainer.getForeignField().setEditable(true);
        if(current == 0){
            trainer.getManager().getList().toFirst();
            if(forshown){
                trainer.getGermanField().setText("");
                trainer.getForeignField().setText(((Vokabel)trainer.getManager().getList().getCurrent().getContent()).getForeign());
                trainer.getForeignField().setEditable(false);
                
            }else{
                trainer.getGermanField().setText(((Vokabel)trainer.getManager().getList().getCurrent().getContent()).getGerman());
                trainer.getForeignField().setText("");
                trainer.getGermanField().setEditable(false);
            }
        }else{ 
            trainer.getManager().getList().next();
            if(forshown){
                trainer.getGermanField().setText("");
                trainer.getForeignField().setText(((Vokabel)trainer.getManager().getList().getCurrent().getContent()).getForeign());
                trainer.getForeignField().setEditable(false);
                
            }else{
                trainer.getGermanField().setText(((Vokabel)trainer.getManager().getList().getCurrent().getContent()).getGerman());
                trainer.getForeignField().setText("");
                trainer.getGermanField().setEditable(false);
                
            }     
        }
        
        
               trainer.updateTrainingInfos();
    }
    
    public void next(){
 
        if(current >= trainer.getManager().getList().getSize()-1){
            current++;
            initEnd();
        }else{
            current++;
            shownextWord();
        }
    }
    
    public boolean compare(){
        
        if(forshown){
            Vokabel q = (Vokabel) trainer.getManager().getList().getCurrent().getContent();
            return trainer.getGermanField().getText().equalsIgnoreCase(q.getGerman());
            
        }else{
            Vokabel q = (Vokabel) trainer.getManager().getList().getCurrent().getContent();
            return trainer.getForeignField().getText().equalsIgnoreCase(q.getForeign());
        }
        
    }
    
    public void verify(){
        if(compare()){
            trainer.setOutputText(1);
            correct++;
            next();
        }else{
            trainer.setOutputText(2);
        }
    }
    
    public void initEnd(){
        trainer.updateTrainingInfos();
        trainer.toggleAccessability(false);
        trainer.setOutputText(3);
        trainer.activeTraining = false;
    }
}
