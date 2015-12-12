package alexsheehan.kel;

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
