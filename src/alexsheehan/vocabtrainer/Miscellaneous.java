package alexsheehan.vocabtrainer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Miscellaneous { //Sonstige nützliche Funktionen, teilweise von mehreren Klassen benutzt

    //Gibt String mit x Sternen zurück
    public static String getStars(int x) {
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < x; y++) {
            sb.append("★");
        }
        return sb.toString();
    }

   
    

}
