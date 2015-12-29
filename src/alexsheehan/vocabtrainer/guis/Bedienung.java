package alexsheehan.vocabtrainer.guis;

import java.io.IOException;
import javax.swing.text.html.HTMLEditorKit;

public class Bedienung extends javax.swing.JFrame { //Erläutert kurz die Bedienung des Programmes

    public Bedienung() throws IOException {
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
        jEditorPane1.setEditorKit(new HTMLEditorKit()); //Um HTML-Codes benutzen zu können
        StringBuilder s = new StringBuilder();

        s.append("<h2><u>Bedienung</u></h2>\n\n");
        s.append("<h3>Training starten:</h3> <ol> <li>Im Startscreen auf die passende Sprache klicken</li>"
                + "<li>Vokabeln hinzuf&uuml;gen (Hinzuf&uuml;gen Knopf) und ggf. in gew&uuml;nschte Reihenfolge bringen (Sortieren Knopf)</li>"
                + "<li>Im Vokabeltrainer das Training starten ('Neues Training')</li></ol>\n\n");
        s.append("<h3>Training durchf&uuml;hren:</h3> <ol> <li>Training starten & wählen, welche Sprache gezeigt wird</li>"
                + "<li>Komplement&auml;re Vokabel zu der Gezeigten eingeben</li>"
                + "<li>Auf 'pr&uuml;fen' klicken, wenn es richtig ist, wird das n&auml;chste angezeigt</li>"
                + "<li>Wenn es falsch ist, kannst du es erneut versuchen</li>"
                + "<li>Wenn dir das gesuchte Wort nicht einf&auml;llt, kannst du ein Wort &uuml;berspringen</li>"
                + "<li>An der Anzeige unter den Textfeldern kannst du dein Ergebnis sehen</li></ol>\n\n");
        s.append("<h3>W&ouml;rter hinzuf&uuml;gen:</h3> <ol><li>Im Vokabeltrainer auf 'Wort hinzuf&uuml;gen' klicken</li>"
                + "<li>Deutsches Wort,Wort in der Fremdsprache und Schwierigkeit (1-5) eingeben und auf 'Hinzuf&uuml;gen' klicken</li></ol>\n\n");
        s.append("<h3>W&ouml;rter sortieren:</h3> <ol><li>Im Vokabeltrainer auf 'Vokabeln Sortieren' klicken</li>"
                + "<li>Passende Methode ausw&auml;hlen<ul><li>Einfacher Tausch: Die Position von 2 Vokabeln tauschen</li>"
                + "<li>Zuf&auml;llig: Zuf&auml;llige Reihenfolge</li>"
                + "<li>ABC (Deutsch/Fremdsprache): Nach alphabetischer Reihenfolge der deutschen/fremden Vokabel sortieren (ABCDEF...)</li>"
                + "<li>CBA (Deutsch/Fremdsprache): Nach alphabetischer Reihenfolge der deutschen/fremden Vokabel sortieren (...FEDCBA)</li>"
                + "<li>Schwierigkeit (aufs./abst.): Nach Schwierigkeit der Vokabeln sortieren</li></ul></li>"
                + "<li>Auf 'Sortieren' dr&uuml;cken</li> "
                + "<li>Entweder speichern oder &Auml;nderung r&uuml;ckg&auml;ngig machen</li>"
                + "<li><b>!&Auml;nderungen werden nur nach dem Speichern aktiv!</b></li></ol>\n\n");
        s.append("<h3>Vokabeln l&ouml;schen:</h3> <ol><li>Im Vokabeltrainer auf 'Wort entfernen' klicken</li>"
                + "<li>Position der Vokabel in der Liste ablesen</li>"
                + "<li>Position im Dropdownmen&uuml; ausw&auml;hlen</li> "
                + "<li>Auf 'L&ouml;schen' dr&uuml;ckenEntweder</li><li>Speichern oder &Auml;nderung r&uuml;ckg&auml;ngig machen</li>"
                + "<li><b>!&Auml;nderungen werden nur nach dem Speichern aktiv!</b></li></ol>\n\n");

        jEditorPane1.setText(s.toString());
        jEditorPane1.setCaretPosition(0); //Nach oben scrollen

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
