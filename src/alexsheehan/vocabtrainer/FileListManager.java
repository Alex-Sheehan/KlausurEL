package alexsheehan.vocabtrainer;

import alexsheehan.vocabtrainer.datast.Knoten;
import alexsheehan.vocabtrainer.datast.Liste;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileListManager {

    
    public void transcriptToFile(Manager m) throws IOException {

        String path = getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
        String decodedPath = URLDecoder.decode(path, "UTF-8");

        File x = new File(decodedPath  + m.getFileName());

            if (!x.exists()) {
                try {
                   
                    x.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(FileListManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        BufferedWriter bw = new BufferedWriter(new FileWriter(x));

        m.getList().toFirst();

        for (int j = 0; j < m.getList().getSize(); j++) {
            Vokabel v = (Vokabel) m.getList().getCurrent().getContent();
            bw.write(v.getGerman());
            bw.write("$");
            bw.write(v.getForeign());
            bw.write("$");
            bw.write("" + v.getDifficulty());
            if (j != m.getList().getSize() - 1) {
                bw.write("%");
            }
            m.getList().next();
        }

        bw.close();
        System.out.println("->END TRANSCRIPT<-");

    }

    
    public String readFile(Manager m) {

        try {

            String path = getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
            String decodedPath = URLDecoder.decode(path, "UTF-8");

            File x = new File(decodedPath  + m.getFileName());

            if (!x.exists()) {
                try {
                   
                    x.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(FileListManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            StringBuilder sb = new StringBuilder();
            try {
                BufferedReader br;

                br = new BufferedReader(new FileReader(x));

                String line;
                while ((line = br.readLine()) != null) {

                    sb.append(line);
                }
                br.close();
            } catch (Exception ex) {

                if (ex instanceof NullPointerException) {
                    return "NPE, no Filecontent";

                } else {
                    Logger.getLogger(FileListManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (sb.toString().length() != 0) {
                return sb.toString();
            } else {
                return "NPE, no Filecontent";
            }
        } catch (UnsupportedEncodingException ex) {

            Logger.getLogger(FileListManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "NPE, no Filecontent";
    }

    public List<String[]> seperate(String x) {
        if (!x.equals("NPE, no Filecontent")) {
            List<String[]> slist = new ArrayList<>();
            System.out.println("->SEPER4TION<-");
            String[] vcbls = x.split("%");

            for (String vcbl : vcbls) {

                String[] parts = vcbl.split("\\$");
                slist.add(parts);

            }
            System.out.println("->SEPER4TION END<-");
            return slist;
        } else {
            return null;
        }

    }

    public void transcriptFileToList(Manager x) {
        if (x == null) {
            return;
        }

        List<String[]> lisToPrint = seperate(readFile(x));

        if (lisToPrint != null && !(lisToPrint.isEmpty())) {

            Liste newl = new Liste();

            for (String[] part : lisToPrint) {

                try {
                    Vokabel vok = new Vokabel(part[0], part[1], Integer.parseInt(part[2]));
                    newl.append(new Knoten(vok));
                } catch (Exception ex) {
                    Logger.getLogger(FileListManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            x.vkList = newl;

        }

    }

}
