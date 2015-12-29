package alexsheehan.vocabtrainer.guis;

import alexsheehan.vocabtrainer.datast.Liste;
import alexsheehan.vocabtrainer.Manager;
import alexsheehan.vocabtrainer.Miscellaneous;
import alexsheehan.vocabtrainer.VocabularyTrainerProgram;
import alexsheehan.vocabtrainer.Vokabel;
import alexsheehan.vocabtrainer.datast.Stack;
import alexsheehan.vocabtrainer.datast.StackKnoten;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 @AlexSheehan Klausurersatzleistung
 => Die Klasse RemoveGUI
 - GUI zum entfernen von Vokabeln
 - Stellt Liste in Tabelle da
 - Comboboxen & Buttons zum Löschen, Rückgängigmachen & speichern
 */

/*
 Der Stack wurde für das Rückgängigmachen in der Lösch-/Sortierklasse benutzt,
 da neue Elemente immer nur oben eingefügt und entfernt werden und der Stack
 gut für dies geeignet ist
 */
public class RemoveGUI extends javax.swing.JFrame {

    private VocabTrainer trainer; //Der Vokabel Trainer
    private boolean tg; //True: RemoveGUI in Fremdsprache, false: RemoveGUI auf Deutsch
    private Object[] array; //Object[] zum entfernen & in Liste anzeigen
    private Stack changes; //Stack um Änderungen rückgängig machen zu können

    public RemoveGUI(VocabTrainer x, boolean tg) { //Konstruktor- VocabTrainer & Sprach-Boolean als Übergabeparameter
        this.tg = tg;
        trainer = x;
        initComponents(); //Netbeans initialisiert GUI Komponenten
        this.setLocationRelativeTo(null);
        changes = new Stack(); //Neuer Stack 
        array = trainer.getManager().getList().toArray(); //Array wird aus der linearen Liste erstellt
        outputList(array); //Liste in Tabelle ausgegeben    
        updateComboBoxes(); //COmboboxen aktualisiert
        setLanguage(tg); //GUI-Texte werden in passender Sprache eingestellt
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbCaption = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        combo1 = new javax.swing.JComboBox();
        btnDelete = new javax.swing.JButton();
        lbMsg = new javax.swing.JLabel();
        btnRevert = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                onClose(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(20);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(20);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setHeaderValue(getTableHeader("german")
            );
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setHeaderValue(getTableHeader("foreign")
            );
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setHeaderValue(getTableHeader("dif")
            );
        }

        lbCaption.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbCaption.setForeground(new java.awt.Color(51, 51, 51));
        lbCaption.setText("Remove Words");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lbMsg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbMsg.setForeground(new java.awt.Color(153, 0, 0));

        btnRevert.setBackground(new java.awt.Color(102, 0, 0));
        btnRevert.setForeground(new java.awt.Color(255, 255, 255));
        btnRevert.setText("Revert Last Change");
        btnRevert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevertActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(51, 153, 0));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save Changes");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("#Nmr :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRevert, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(combo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCaption, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCaption, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(lbMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnRevert, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        /*
         Lösch-Button geklickt
         */
        if (combo1.getSelectedItem() == null || combo1.getSelectedItem().toString() == null || combo1.getSelectedItem().toString().isEmpty()) { //Keine Auswahlmöglichkeiten / Falsche Auswahlmöglichkeiten
            lbMsg.setForeground(Color.red);
            lbMsg.setText("Error!"); //Fehlermeldung ausgeben

        } else { //Warscheinlich legitime Auswahlmöglichkeit ausgewählt

            int x = Integer.parseInt(combo1.getSelectedItem().toString()); //String -> Integer

            if (x <= 0) { //0 und kleiner kann nicht stimmen
                lbMsg.setForeground(Color.red);
                lbMsg.setText("Error!"); //Fehlermeldung ausgeben
                return; //Funktion vorzeitig abbrechen
            }
            changes.push(new StackKnoten(Miscellaneous.cloneObjectArray(array))); //Neue reversible Änderung
            List<Object> objlist = new ArrayList<>(Arrays.asList(array)); //Neue ObjektListe (java.util.List) aus Array
            objlist.remove(x - 1); //Passendes Objekt aus Liste entfernen
            array = objlist.toArray(); //Array = Liste.toArray

            outputList(array); //Tabelle aktualisieren
            updateComboBoxes(); //Comboboxen aktualisieren

            if (tg) { //GUI in Fremdsprache
                lbMsg.setForeground(Color.green);
                lbMsg.setText(trainer.getManager().getWordDeletedString()); //Erfolgsmeldung ausgeben
            } else { //GUI auf Deutsch
                lbMsg.setForeground(Color.green);
                lbMsg.setText("Löschen erfolgreich!"); //Erfolgsmeldung ausgeben
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void onClose(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onClose

    }//GEN-LAST:event_onClose

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //GUI Wird geschlossen
        trainer.setEnabled(true); //Vocabtrainer aktivieren
    }//GEN-LAST:event_formWindowClosing

    private void btnRevertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevertActionPerformed
        if (changes.getSize() == 0) { //Keine reversiblen Änderungen

            if (tg) { //GUI in Fremdsprache
                lbMsg.setForeground(Color.red);
                lbMsg.setText(trainer.getManager().getNochangesrevertable()); //Fehlermeldung
            } else { //GUI auf Deutsch
                lbMsg.setForeground(Color.red);
                lbMsg.setText("Keine umkehrbaren Änderungen!"); //Fehlermeldung
            }
        } else {

            Object[] r = (Object[]) changes.getHead().getContent(); //Head des Stacks 

            this.array = r; //Array = Head des Stacks

            updateComboBoxes(); //Comboboxen aktualisieren
            outputList(array); //Tabelle aktualisieren
            changes.pop();

            if (tg) { //GUI in Fremdsprache
                lbMsg.setForeground(Color.GREEN);

                lbMsg.setText(trainer.getManager().getReverted()); //Erfolgsmeldung
            } else { //GUI auf Deutsch
                lbMsg.setForeground(Color.GREEN);

                lbMsg.setText("Änderung rückgängig gemacht"); //Erfolgsmeldung
            }

        }
    }//GEN-LAST:event_btnRevertActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //Änderungen speichern
        trainer.getManager().setList(Liste.fromArray(array)); //lineare Liste des Managers aktualisieren
        changes.flush(); //Stack leeren
        trainer.updateWordCount(); //Wörteranzahl des VocabTrainer aktualisieren

        try {
            VocabularyTrainerProgram.FILE_LIST_MANAGER.transcriptToFile(trainer.getManager()); //Textdatei aktualisieren
        } catch (IOException ex) {
            Logger.getLogger(RemoveGUI.class.getName()).log(Level.SEVERE, null, ex); //Fehlermeldung
        }

        if (tg) {//GUI in Fremdsprache
            lbMsg.setForeground(Color.green);
            lbMsg.setText(trainer.getManager().getChsaved()); //Erfolgsmeldung
        } else { //GUI auf Deutsch
            lbMsg.setForeground(Color.green);
            lbMsg.setText("Änderungen gespeichert");//Erfolgsmeldung
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    //Liste(als Array) in Tabelle ausgeben
    public void outputList(Object[] ar) { //Object[] als Übergabeparameter
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel(); //TableModel um Tabelle zu verändern
        dtm.setRowCount(ar.length); //Anzahl der Reihen verändern

        jTable1.setRowHeight((jScrollPane1.getHeight() - 5) / 12); //Größe der Reihen verändern damit es besser aussieht

        jTable1.setModel(dtm); //Model setzen

        for (int j = 0; j < ar.length; j++) { //Befüllt die Reihen mit dem Inhalt aus den Objekten
            if (ar[j] instanceof Vokabel) {
                Vokabel v = (Vokabel) ar[j];
                jTable1.setValueAt(j + 1, j, 0); //Die Nmr: #
                jTable1.setValueAt(v.getGerman(), j, 1); //Deutsches Wort
                jTable1.setValueAt(v.getForeign(), j, 2); //Fremdsprachenwort
                String k = "" + v.getDifficulty() + " " + Miscellaneous.getStars(v.getDifficulty()); //Schwierigkeit + Sterne
                jTable1.setValueAt(k, j, 3);

            }
        }

    }

    //Auswahl-Comboboxen aktualisieren
    public void updateComboBoxes() {
        combo1.removeAllItems(); //Leeren

        for (int run = 0; run < array.length; run++) { //Für jedes Objekt in der Liste die passende Nmr: # hinzufügen
            combo1.addItem(run + 1);

        }

    }

    //Texte entweder in Fremdsprache oder in Deutsch setzen
    public void setLanguage(boolean f) {
        if (f) { //Fremdsprache
            Manager mng = trainer.getManager();
            /*
             Unterschiedliche Texte aus Manager holen und als Text der Komponenten setzen
             */
            lbCaption.setText(mng.getRemGUICaption());
            btnDelete.setText(mng.getDeletebtn());

            btnSave.setText(mng.getSavech());
            btnRevert.setText(mng.getRevertch());
        } else { //Deutsch
            /*
             Text der unterschiedlichen Komponenten setzen
             */
            lbCaption.setText("Vokabeln löschen");
            btnDelete.setText("Löschen");
            btnRevert.setText("Änderung rückgängig machen");
            btnSave.setText("Änderungen speichern");
            btnRevert.setText("Änderung rückgängig machen");
        }
    }

    //Gibt die passenden Namen für die Tabellenspalten zurück
    private String getTableHeader(String l) { //l - Spalte, für die der Name gesucht Wird
        if (l.equalsIgnoreCase("german")) {
            if (tg) {
                return trainer.getManager().getTableGermanRow(); //Spaltenname in Fremdsprache
            }
            return "Deutsch"; //Spaltenname in Deutsch
        }
        if (l.equalsIgnoreCase("foreign")) {
            if (tg) {
                return trainer.getManager().getLanguageName(); //Spaltenname in Fremdsprache
            }
            return trainer.getManager().getGermanLanguageName(); //Spaltenname in Deutsch
        }
        if (l.equalsIgnoreCase("dif")) {
            if (tg) {
                return trainer.getManager().getDifficulty(); //Spaltenname in Fremdsprache
            }
            return "Schwierigkeit"; //Spaltenname in Deutsch
        }
        return ""; //Fehler - leere Rückgabe
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRevert;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox combo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbCaption;
    private javax.swing.JLabel lbMsg;
    // End of variables declaration//GEN-END:variables
}
