package alexsheehan.vocabtrainer;

import alexsheehan.vocabtrainer.guis.VocabTrainer;

public class Training {

    /*
     @AlexSheehan Klausurersatzleistung
     => Die Klasse Training
     - Kontrolliert das Vokabel-Training in der VocabTrainer Klasse
     - speichert korrekte Wörter und wie viele Vokabeln schon getestet wurden
     - start() : Vokabeltraining beginnen
     - shownextWord() : Nächstes Wort des Trainings anzeigen
     - next() : //Nächstes Wort & ggf. Ende einleiten
     - compare(): Überprüft, ob Vokabel richtig eingegeben wurde
     - verify() : Ruft compare() auf & gibt Ergebnis zurück
     - initEnd(): Leitet Ende ein, deaktiviert Buttons und gibt Endnachricht zurück
     */
    /*
     Die lineare Liste wurdefür das
     Training verwendet, da man, im Gegensatz zu Schlange & Stack, durch den
     current Zeiger auf alle Objekte in der Liste zugreifen kann
     */
    private VocabTrainer trainer; //Vokabel-Trainer
    private int current = 0; //Position in der Liste
    private int correct = 0; //Korrekte Wörter bis jetzt
    private boolean forshown; //Bestimmt, ob das deutsche Wort angezeigt wird oder das in der Fremdsprache

    public Training(VocabTrainer v) { //Konstruktur, aktiviert Trainingsbuttons in Vocabtrainer
        this.trainer = v;
        trainer.toggleAccessability(true);

    }

    public int getCurrent() { //Position in der Liste
        return current;
    }

    public int getCorrect() { //Korrekte Wörter bis jetzt
        return correct;
    }

    //Startet das Training
    public void start() {
        trainer.setOutputText(0); //Anfangsnachricht ausgegeben
        trainer.updateTrainingInfos(); //Textfelder/Labels/ProgressBars des VocabTrainer GUIS anpassen für Training
        shownextWord(); //Nächstes (erstes) Wort zeigen
    }

    //Nächstes Wort in der Liste anzeigen
    public void shownextWord() {
        forshown = trainer.getToggleShown().isSelected(); //Aktualisiert forshown (greift auf Togglebtn in VocabTrainer zu)
        trainer.getGermanField().setEditable(true); //Beide Textfelder editierbar
        trainer.getForeignField().setEditable(true); //Beide Textfelder editierbar
        if (current == 0) { //Erstes Wort wird angezeigt
            trainer.getManager().getList().toFirst(); //Liste auf First setzen, damit Liste von vorne angearbeitet wird
            if (forshown) { //Fremdsprache angezeigt
                trainer.getGermanField().setText("");
                trainer.getForeignField().setText(((Vokabel) trainer.getManager().getList().getCurrent().getContent()).getForeign()); //Fremdes Wort aus Vokabeln holen und anzeigen
                trainer.getForeignField().setEditable(false);

            } else { //Deutsch Angezeigt
                trainer.getGermanField().setText(((Vokabel) trainer.getManager().getList().getCurrent().getContent()).getGerman()); //Deutsches aus Vokabeln holen und anzeigen
                trainer.getForeignField().setText("");
                trainer.getGermanField().setEditable(false);
            }
        } else { //Nicht das erste Wort
            trainer.getManager().getList().next(); //In der Liste weiter gehen
            if (forshown) {//Fremdsprache angezeigt
                trainer.getGermanField().setText("");
                trainer.getForeignField().setText(((Vokabel) trainer.getManager().getList().getCurrent().getContent()).getForeign());//Fremdes Wort aus Vokabeln holen und anzeigen
                trainer.getForeignField().setEditable(false);

            } else {//Deutsch Angezeigt
                trainer.getGermanField().setText(((Vokabel) trainer.getManager().getList().getCurrent().getContent()).getGerman());//Deutsches aus Vokabeln holen und anzeigen
                trainer.getForeignField().setText("");
                trainer.getGermanField().setEditable(false);

            }
        }

        trainer.updateTrainingInfos(); //Textfelder/Labels/ProgressBars anpassen in Vocabtrainer
    }

    //Nächstes Wort & ggf. Ende einleiten
    public void next() {

        if (current >= trainer.getManager().getList().getSize() - 1) { //Beim letzten Wort angekommen
            current++; //Current erhöhen
            initEnd(); //Ende einleiten
        } else {
            current++; //Current erhöhen
            shownextWord(); //Nächstes Wort 
        }
    }

    //Gibts zurück, ob das richtige Wort eingegeben wurde
    public boolean compare() {

        if (forshown) { //Fremdsprache schon angezeigt
            Vokabel q = (Vokabel) trainer.getManager().getList().getCurrent().getContent();
            return trainer.getGermanField().getText().equalsIgnoreCase(q.getGerman()); //true : richtig, false: falsch (Eingegeben = Deutsches Wort?)

        } else { //Fremdsprache schon angezeigt
            Vokabel q = (Vokabel) trainer.getManager().getList().getCurrent().getContent();
            return trainer.getForeignField().getText().equalsIgnoreCase(q.getForeign()); //true : richtig, false: falsch (Eingegeben = Fremdsprachenwort?)
        }

    }

    //Ruft compare auf und gibt passende Meldungen aus & wenn richtig nächstes Wort
    public void verify() {
        if (compare()) { //Richtiges Wort eingegeben
            trainer.setOutputText(1); //Meldung für richtiges Wort ausgeben (1)
            correct++;  //Correct erhöhen
            next();
        } else { //Falsches Wort eingegeben
            trainer.setOutputText(2); //Meldung für falsches Wort ausgeben (2)
        }
    }

    //Ende einleiten
    public void initEnd() {
        trainer.updateTrainingInfos(); //Textfelder/Labels/ProgressBars aktualisieren/anpassen
        trainer.toggleAccessability(false); //Buttons & TF deaktivieren
        trainer.setOutputText(3); //End-Nachricht ausgeben (3)
        trainer.activeTraining = false; //Kein aktives Training mehr
    }
}
