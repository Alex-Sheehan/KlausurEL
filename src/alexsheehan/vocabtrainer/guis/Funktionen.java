package alexsheehan.vocabtrainer.guis;

import java.io.IOException;
import javax.swing.text.html.HTMLEditorKit;

public class Funktionen extends javax.swing.JFrame { //Erläutert kurz die Funktionen des Programmes

    public Funktionen() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null); //Mitte des Bildschirmes
        writeText(); //Text des Editorpanes schreiben

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Text des Editor-Pane (Eine Art Textarea) setzen
    private void writeText() {
        jEditorPane1.setEditorKit(new HTMLEditorKit()); //Um HTML Tags benutzen zu können
        StringBuilder s = new StringBuilder();

        s.append("<h2><u>Funktionen</u></h2>\n\n");
        s.append("<div style='font-size:12px'");
        s.append("<ul><li><b>Mehrere Sprachen:</b> Mit diesem Programm kann man mehrere Sprachen gleichzeitig lernen!</li>"
                + "<li><b>Einfache Bedienung:</b> Durch wenige Klicks W&ouml;rter hinzuf&uuml;gen,sortieren & l&ouml;schen</li>"
                + "<li><b>Einfaches Training:</b> Vokabeltrainings k&ouml;nnen mit wenigen Klicks durchgef&uuml;hrt werden (siehe Bedienung)</li>"
                + "<li><b>Speicherung in Dateien:</b> Die Vokabeln bleiben auch nach Schluss des Programms gespeichert!</li>"
                + "<li><b>Multi-Language GUI:</b> GUI Sprache durch 1 Klick verstellbar(GUI Language Knopf)</li></ul>");
        s.append("Alle Funktionen: <ul><li>Mehrere Sprachen zum Lernen</li>"
                + "<li>Sprache der GUI verstellbar (GUI Language im Vokabel Trainer)</li>"
                + "<li>Vokabeltraining: Die Liste an Vokabeln durchgehen und die Vokabeln abfragen</li>"
                + "<li>Einstellen, welche Vokabel gezeigt und welche gefunden werden muss</li>"
                + "<li>Wörter &uuml;berspringen</li>"
                + "<li>Der Benutzer sieht live, wie viele er bereits hinter sich hat und wieviel er korrekt hat</li>"
                + "<li>W&ouml;rter zu der Liste hinzufügen</li>"
                + "<li>Tauschen der Position zweier Vokabeln</li>"
                + "<li>7 M&ouml;glichkeiten zum Sortieren</li>"
                + "<li>Alle &Auml;nderungen vor dem Speichern einzeln reversibel</li>"
                + "<li>Einfaches L&ouml;schen der Vokabeln</li>"
                + "<li>Speicherung in Dateien: Auch nach Neustart bleiben die Vokabeln erhalten</li><ul>");
        s.append("</div>");
        jEditorPane1.setText(s.toString());
        jEditorPane1.setCaretPosition(0); //Nach oben scrollen

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
