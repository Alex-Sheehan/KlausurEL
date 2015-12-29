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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 @AlexSheehan Klausurersatzleistung
 => Die Klasse SortGUI
 - GUI zum sortieren von Vokabeln
 - Stellt Liste in Tabelle da
 - Comboboxen & Buttons zum Sortieren, Rückgängigmachen & speichern
 */
public class SortGUI extends javax.swing.JFrame {

    private VocabTrainer trainer;//Der Vokabel Trainer
    private boolean tg; //True: SortGUI in Fremdsprache, false: SortGUI auf Deutsch
    private Object[] array; //Object[] zum entfernen & in Liste anzeigen
    private Stack changes; //Stack um Änderungen rückgängig machen zu können

    /*
     Der Stack wurde für das Rückgängigmachen in der Lösch-/Sortierklasse benutzt,
     da neue Elemente immer nur oben eingefügt und entfernt werden und der Stack
     gut für dies geeignet ist
     */
    public SortGUI(VocabTrainer x, boolean tg) {//Konstruktor- VocabTrainer & Sprach-Boolean als Übergabeparameter
        this.tg = tg;
        trainer = x;
        initComponents();//Netbeans initialisiert GUI Komponenten
        this.setLocationRelativeTo(null);
        changes = new Stack(); //Neuer Stack 
        array = trainer.getManager().getList().toArray(); //Array wird aus der linearen Liste erstellt
        outputList(array); //Liste in Tabelle ausgegeben    
        updateSwapComboBoxes(); //Combobox zum Tauschen aktualisiert
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
        combo2 = new javax.swing.JComboBox();
        btnSwap = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        cbOptions = new javax.swing.JComboBox();
        lbMsg = new javax.swing.JLabel();
        btnSort = new javax.swing.JButton();
        btnRevert = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

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
                "", "", "", ""
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
        lbCaption.setText("Sort Words");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnSwap.setText("Swap Position");
        btnSwap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwapActionPerformed(evt);
            }
        });

        cbOptions.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ABC (Deutsch)", "ABC (Fremdsprache)", "CBA (Deutsch)", "CBA (Fremdsprache)", "Schwierigkeit (aufs.)", "Schwierigkeit (abst.)", "Zufällig" }));

        lbMsg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbMsg.setForeground(new java.awt.Color(153, 0, 0));

        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

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
                            .addComponent(btnSwap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3)
                            .addComponent(cbOptions, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRevert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSwap)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSort)
                        .addGap(36, 36, 36)
                        .addComponent(btnRevert, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSwapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwapActionPerformed

        /*
         Die Positionen zweier Vokabeln werden getauscht
         */
        //Positionen von Comboboxen abgelesen
        int x = Integer.parseInt(combo1.getSelectedItem().toString());
        int y = Integer.parseInt(combo2.getSelectedItem().toString());

        if (x == y) { //Versuch, die Vokabel mit sich selbst zu tauschen
            lbMsg.setText("Die Positionen der Vokabeln müssen unterschiedlich sein!");
            return;
        } else {
            //Neue Reversible Änderung
            changes.push(new StackKnoten(Miscellaneous.cloneObjectArray(array))); //Array muss geklont werden, damit das im Stack nicht immer mitverändert wird....

            Object zw = array[x - 1]; //Zwischenspeicher

            //Simpler Tausch
            array[x - 1] = array[y - 1];
            array[y - 1] = zw;
        }
        //Liste ausgegeben
        outputList(array);


    }//GEN-LAST:event_btnSwapActionPerformed

    private void onClose(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onClose

    }//GEN-LAST:event_onClose

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //Beim Schließen VocabTrainer wieder aktivieren
        trainer.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed

        /*
         Sortier Button geklickt, Combobox wird ausgelesen um Sortierart zu bestimmen
         */
        //Zufälliges Anordnen
        if (cbOptions.getSelectedItem().toString().equalsIgnoreCase("Zufällig")) {
            changes.push(new StackKnoten(Miscellaneous.cloneObjectArray(array))); //Reversible Änderung
            Miscellaneous.shuffleArray(array); //Shuffle Methode aus Misc.
            outputList(array); //Liste ausgeben
            return;
        }

        //Schwierigkeit aufsteigend
        if (cbOptions.getSelectedItem().toString().equalsIgnoreCase("Schwierigkeit (aufs.)")) {
            changes.push(new StackKnoten(Miscellaneous.cloneObjectArray(array))); //Reversible Änderung
            Miscellaneous.insertionSortDif(array, false); //Sortier Methode aus Misc.
            outputList(array); //Liste ausgeben
            return;
        }

        if (cbOptions.getSelectedItem().toString().equalsIgnoreCase("Schwierigkeit (abst.)")) {
            changes.push(new StackKnoten(Miscellaneous.cloneObjectArray(array)));//Reversible Änderung
            Miscellaneous.insertionSortDif(array, true);//Sortier Methode aus Misc.
            outputList(array);//Liste ausgeben
            return;
        }

        if (cbOptions.getSelectedItem().toString().equalsIgnoreCase("ABC (Deutsch)")) {
            changes.push(new StackKnoten(Miscellaneous.cloneObjectArray(array)));//Reversible Änderung
            Miscellaneous.insertionSortGerAlph(array, false);//Sortier Methode aus Misc.
            outputList(array);//Liste ausgeben
            return;
        }

        if (cbOptions.getSelectedItem().toString().equalsIgnoreCase("CBA (Deutsch)")) {
            changes.push(new StackKnoten(Miscellaneous.cloneObjectArray(array)));//Reversible Änderung
            Miscellaneous.insertionSortGerAlph(array, true);//Sortier Methode aus Misc.
            outputList(array);//Liste ausgeben
            return;
        }

        if (cbOptions.getSelectedItem().toString().equalsIgnoreCase("ABC (Fremdsprache)")) {
            changes.push(new StackKnoten(Miscellaneous.cloneObjectArray(array)));//Reversible Änderung
            Miscellaneous.insertionSortForAlph(array, false);//Sortier Methode aus Misc.
            outputList(array);//Liste ausgeben
            return;
        }

        if (cbOptions.getSelectedItem().toString().equalsIgnoreCase("CBA (Fremdsprache)")) {
            changes.push(new StackKnoten(Miscellaneous.cloneObjectArray(array)));//Reversible Änderung
            Miscellaneous.insertionSortForAlph(array, true);//Sortier Methode aus Misc.
            outputList(array);//Liste ausgeben
            return;
        }
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        /*
         Änderungen speichern
         */

        trainer.getManager().setList(Liste.fromArray(array)); //Liste des Managers neu setzen
        changes.flush(); //Stack der Reversiblen Änderungen leeren
        try {
            VocabularyTrainerProgram.FILE_LIST_MANAGER.transcriptToFile(trainer.getManager()); //Änderungen aus Datei schreiben
        } catch (IOException ex) {
            Logger.getLogger(RemoveGUI.class.getName()).log(Level.SEVERE, null, ex); //Fehlermeldung
        }
        if (tg) {
            lbMsg.setForeground(Color.green);
            lbMsg.setText(trainer.getManager().getChsaved()); //Änderungen gespeichert Nachricht
        } else {
            lbMsg.setForeground(Color.green);
            lbMsg.setText("Änderungen gespeichert");//Änderungen gespeichert Nachricht
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnRevertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevertActionPerformed
        /*
         Änderungen rückgängig machen
         */
        if (changes.getSize() == 0) { //Keine Änderungen verfügbar

            if (tg) {
                lbMsg.setForeground(Color.red);
                lbMsg.setText(trainer.getManager().getNochangesrevertable()); //Meldung ausgeben
            } else {
                lbMsg.setForeground(Color.red);
                lbMsg.setText("Keine umkehrbaren Änderungen!"); //Meldung ausgeben
            }
        } else {

            /*
             Änderungen rückgängig machen
             */
            Object[] r = (Object[]) changes.getHead().getContent();  //Head des Stacks holen

            this.array = r; //Array auf die alte Version zurücksetzen

            outputList(array); //Tabelle aktualisieren
            changes.pop(); //Head des Stacks entfernen

            if (tg) { //GUI in Fremdsprache
                lbMsg.setForeground(Color.GREEN);

                lbMsg.setText(trainer.getManager().getReverted());//Meldung ausgeben
            } else { //GUI auf Deutsch
                lbMsg.setForeground(Color.GREEN);

                lbMsg.setText("Änderung rückgängig gemacht"); //Meldung ausgeben
            }

        }
    }//GEN-LAST:event_btnRevertActionPerformed

    //Liste(als Array) in Tabelle ausgeben
    public void outputList(Object[] ar) { //Object[] als Übergabeparameter
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel(); //TableModel um Tabelle zu verändern
        dtm.setRowCount(ar.length);//Anzahl der Reihen verändern

        jTable1.setRowHeight((jScrollPane1.getHeight() - 5) / 12); //Größe der Reihen verändern damit es besser aussieht

        jTable1.setModel(dtm); //Model setzen

        for (int j = 0; j < ar.length; j++) { //Befüllt die Reihen mit dem Inhalt aus den Objekten
            if (ar[j] instanceof Vokabel) {
                Vokabel v = (Vokabel) ar[j];
                jTable1.setValueAt(j + 1, j, 0);  //Die Nmr: #
                jTable1.setValueAt(v.getGerman(), j, 1); //Deutsches Wort
                jTable1.setValueAt(v.getForeign(), j, 2); //Fremdsprachenwort
                String k = "" + v.getDifficulty() + " " + Miscellaneous.getStars(v.getDifficulty()); //Schwierigkeit + Sterne
                jTable1.setValueAt(k, j, 3);

            }
        }

    }

    //Auswahl-Comboboxen aktualisieren
    public void updateSwapComboBoxes() {
        combo1.removeAllItems();  //Leeren
        combo2.removeAllItems(); //Leeren

        for (int run = 0; run < trainer.getManager().getList().getSize(); run++) {//Für jedes Objekt in der Liste die passenden Nmr: # hinzufügen
            combo1.addItem(run + 1);
            combo2.addItem(run + 1);
        }

    }

    //Texte entweder in Fremdsprache oder in Deutsch setzen
    public void setLanguage(boolean f) {
        if (f) { //Fremdsprache
            Manager mng = trainer.getManager();
            /*
             Unterschiedliche Texte aus Manager holen und als Text der Komponenten setzen
             */
            lbCaption.setText(mng.getSortGUICaption());
            btnSwap.setText(mng.getSwapText());
            btnSort.setText(mng.getSortString());
            btnSave.setText(mng.getSavech());
            btnRevert.setText(mng.getRevertch());
        } else { //Deutsch
             /*
             Text der unterschiedlichen Komponenten setzen
             */
            lbCaption.setText("Vokabeln sortieren");
            btnSwap.setText("Positionen tauschen");
            btnSort.setText("Sortieren");
            btnRevert.setText("Änderung rückgängig machen");
            btnSave.setText("Änderungen speichern");
            btnRevert.setText("Änderung rückgängig machen");
        }
    }

    //Gibt die passenden Namen für die Tabellenspalten zurück
    private String getTableHeader(String l) { //l - Spalte, für die der Name gesucht Wird
        if (l.equalsIgnoreCase("german")) {
            if (tg) {
                return trainer.getManager().getTableGermanRow();  //Spaltenname in Fremdsprache
            }
            return "Deutsch";  //Spaltenname in Deutsch
        }
        if (l.equalsIgnoreCase("foreign")) {
            if (tg) {
                return trainer.getManager().getLanguageName();  //Spaltenname in Fremdsprache
            }
            return trainer.getManager().getGermanLanguageName();  //Spaltenname in Deutsch
        }
        if (l.equalsIgnoreCase("dif")) {
            if (tg) {
                return trainer.getManager().getDifficulty(); //Spaltenname in Fremdsprache
            }
            return "Schwierigkeit";  //Spaltenname in Deutsch
        }
        return "";  //Fehler - leere Rückgabe
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRevert;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSort;
    private javax.swing.JButton btnSwap;
    private javax.swing.JComboBox cbOptions;
    private javax.swing.JComboBox combo1;
    private javax.swing.JComboBox combo2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbCaption;
    private javax.swing.JLabel lbMsg;
    // End of variables declaration//GEN-END:variables
}
