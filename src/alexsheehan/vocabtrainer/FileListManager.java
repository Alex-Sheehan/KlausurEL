package alexsheehan.vocabtrainer;

import alexsheehan.vocabtrainer.datast.Knoten;
import alexsheehan.vocabtrainer.datast.Liste;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileListManager {

    /*
     @AlexSheehan Klausurersatzleistung
     => Die Klasse FileListManager
     - Managed das Zusammenspiel zwischen Liste und Datei, übernimmt Dateinamen aus Manager Unterklassen
     - transcriptToFile: Liste des Managers auf Liste übertragen
     - readFile: String aus File auslesen
     - seperate: String auslesen und in List<String[]> mit unterschiedlichen Vokabelbausteinen übertragen
     - transcriptFileToList: Benutzt readFile & seperate um Liste aus Datei auszulesen
     */
    /*
     => transcriptToFile(Manager)
     - Sucht den Dateipfad aus Manager-Unterklasse raus
     - Erstellt die Datei falls nicht vorhanden
     - Geht die Liste durch und schreibt jedes Object als String nieder
     > Format: deutsch1$fremd1$schwierig1%deutsch2$fremd2$schwierig2....
     */
    public void transcriptToFile(Manager m) throws IOException {

        //Dateipfad
        String path = getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
        String decodedPath = URLDecoder.decode(path, "UTF-8");

        //File initialisieren
        File x = new File(decodedPath + m.getFileName());

        //Erstellt Datei falls nicht vorhanden
        if (!x.exists()) {
            try {

                x.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(FileListManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //Datei schreiben
        BufferedWriter bw = new BufferedWriter(new FileWriter(x));

        m.getList().toFirst();

        for (int j = 0; j < m.getList().getSize(); j++) { //Für jedes Objekt in der Liste einen String in festgelegtem Format aufschreiben
            Vokabel v = (Vokabel) m.getList().getCurrent().getContent();
            bw.write(v.getGerman());
            bw.write("$"); //Sonderzeichen 1 zur Unterscheidung der Bausteine der Vokabel
            bw.write(v.getForeign());
            bw.write("$"); //Sonderzeichen 2 zur Unterscheidung der Bausteine der Vokabel
            bw.write("" + v.getDifficulty());
            if (j != m.getList().getSize() - 1) {
                bw.write("%"); //Sonderzeichen 3 zur Unterscheidung des Vokabeln
            }
            m.getList().next();
        }

        //Datei fertig beschrieben
        bw.close();

    }

    /*
     => readFile(Manager): Liest den String aus der Datei aus
     - Sucht Dateipfad aus Manager aus
     - Erstellt Datei wenn nötig
     - String(Builder) "sb" erstellt
     - Fügt jede Zeile der Datei an "sb" an
     - Gibt im Falle von Fehlern den Fehlerstring "NPE, no Filecontent" zurück
     - Wenn keine Fehler auftreten wird "sb"(.toString()) zurückgegeben
     */
    public String readFile(Manager m) {

        try {
            //Dateipfad
            String path = getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
            String decodedPath = URLDecoder.decode(path, "UTF-8");

            //File initialisiert
            File x = new File(decodedPath + m.getFileName());

            //Datei wenn nötig erstellt
            if (!x.exists()) {
                try {

                    x.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(FileListManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            //Neuer String(Builder)
            StringBuilder sb = new StringBuilder();
            try {
                BufferedReader br;
                br = new BufferedReader(new FileReader(x)); //BufferedReader liest Datei aus

                String line;
                while ((line = br.readLine()) != null) { //Durch jede Zeile durch gehen

                    sb.append(line); //"sb" erweitern
                }
                br.close(); //Reader schliessen
            } catch (Exception ex) { //Fehler aufgetreten

                if (ex instanceof NullPointerException) {
                    return "NPE, no Filecontent"; //Bei Nullpointer Fehlerstring zurückgeben

                } else {
                    Logger.getLogger(FileListManager.class.getName()).log(Level.SEVERE, null, ex); //Sonst Fehler in Console ausgeben
                }
            }
            if (sb.toString().length() != 0) { //Wenn Länge des von sb nicht 0 ist, sb zurückgeben
                return sb.toString();
            } else {
                return "NPE, no Filecontent"; //Sonst Fehlerstring zurückgeben
            }
        } catch (UnsupportedEncodingException ex) {

            Logger.getLogger(FileListManager.class.getName()).log(Level.SEVERE, null, ex); //Fehler in Console ausgeben
        }
        return "NPE, no Filecontent"; //Wenn Stringerstellung nicht erfolgreich war, FehlerString zurückgeben
    }

    /*
     => Seperate: Teilt den String der Datei in eine Liste aus String[] ein
     - Ein String[] besteht aus deutschem Wort,Fremdsprachenwort und Schwierigkeit
     - List = java.util.List => NICHT die Datenstruktur lineare Liste (alexsheehan.vobabtrainer.datast.Liste)
     */
    public List<String[]> seperate(String x) {
        if (!x.equals("NPE, no Filecontent")) { //Wenn FehlerCode nicht auftritt
            List<String[]> slist = new ArrayList<>(); //Neue java.util.List/ArrayList

            String[] vcbls = x.split("%"); //langer String wird an Vokabelseperator % geteilt

            for (String vcbl : vcbls) { //Methode geht durch einzelnde Vokabeln (deutsch$fremdsprache$schwierig) durch

                String[] parts = vcbl.split("\\$"); //Bausteine werden getrennt und als String[] gespeichert
                slist.add(parts); //String[] der Liste hinzugefügt

            }

            return slist; //Liste zurückgegeben
        } else { //Sonst gebe null zurück
            return null;
        }

    }

    public void transcriptFileToList(Manager x) {
        if (x == null) { //Wenn Manager null ist (sollte NIE auftreten)
            return; //Methode beenden
        }

        List<String[]> lisToPrint = seperate(readFile(x)); //java.util.List aus seperate(readFile(Manager))

        if (lisToPrint != null && !(lisToPrint.isEmpty())) { //Wenn java.util.List NICHT leer oder null ist

            Liste newl = new Liste(); //neue lineare Liste (1. Datenstruktur) (alexsheehan.vocabtrainer.datast.Liste)

            for (String[] part : lisToPrint) { //Für jede Vokabel in der java.util.List

                try {
                    Vokabel vok = new Vokabel(part[0], part[1], Integer.parseInt(part[2])); //Neues Vokabel-Objekt
                    newl.append(new Knoten(vok)); //Vokabel der linearen Liste (alexsheehan.vocabtrainer.datast.Liste) hinzufügen
                } catch (Exception ex) {
                    Logger.getLogger(FileListManager.class.getName()).log(Level.SEVERE, null, ex); //Mögliche fehler in Konsole ausgeben
                }
            }

            x.vkList = newl; //Liste des Managers = neu erstellte lineare Liste "newl" (alexsheehan.vocabtrainer.datast.Liste)

        }

    }

}
