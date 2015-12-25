package alexsheehan.vocabtrainer;


public enum Language {

    ENGLISH(0),
    FRENCH(1);
    
    int id;
    
    Language(int id){
        this.id = id;
    }
         
    public int getId(){
        return id;
    }
    
    public static Language getById(int id){
        for(Language lang : values()){
            if(id == lang.getId()){
                return lang;
            }
        }
        return ENGLISH;
    }
    
}
