package alexsheehan.guis;

import alexsheehan.datenstrk.Liste;
import alexsheehan.kel.Manager;
import alexsheehan.kel.Miscellaneous;
import alexsheehan.kel.Vokabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex
 */
public class SortGUI extends javax.swing.JFrame {
    
    private VocabTrainer trainer;
    private boolean tg;
    private Object[] ar;
    
    public SortGUI(VocabTrainer x, boolean tg) {
        this.tg = tg;
        trainer = x;
        initComponents();
        ar = trainer.getManager().getList().toArray();
        outputList(x.getManager().getList());
        updateSwapComboBoxes();
        setLanguage(tg);
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

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        cbOptions.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ABC (Deutsch)", "ABC (Fremdsprache)", "CBA (Deutsch)", "CBA (Fremdsprache)", "Schwierigkeit ↑", "Schwierigkeit ↓", "Zufällig" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCaption, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSwap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(cbOptions, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCaption, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
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
                        .addComponent(cbOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSwapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwapActionPerformed
        
        
        
    }//GEN-LAST:event_btnSwapActionPerformed

    public void outputList(Liste x) {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(x.getSize());
        
        jTable1.setRowHeight((jScrollPane1.getHeight() - 5) / 12);
        
        jTable1.setModel(dtm);
        
        
        
        for (int j = 0; j < ar.length; j++) {
            if (ar[j] instanceof Vokabel) {
                Vokabel v = (Vokabel) ar[j];
                jTable1.setValueAt(j + 1, j, 0);
                jTable1.setValueAt(v.getGerman(), j, 1);
                jTable1.setValueAt(v.getForeign(), j, 2);
                String k = "" + v.getDifficulty() + " " + Miscellaneous.getStars(v.getDifficulty());
                jTable1.setValueAt(k, j, 3);
                
            }
        }
        
    }
    
    public void updateSwapComboBoxes() {
        combo1.removeAllItems();
        combo2.removeAllItems();
        
        for (int run = 0; run < trainer.getManager().getList().getSize(); run++) {
            combo1.addItem(run + 1);
            combo2.addItem(run + 1);
        }
        
    }
    
    public void setLanguage(boolean f) {
        if (f) {
            Manager mng = trainer.getManager();
            lbCaption.setText(mng.getSortGUICaption());
            btnSwap.setText(mng.getSwapText());
        } else {
            lbCaption.setText("Vokabeln sortieren");
            btnSwap.setText("Positionen tauschen");   
            
        }
    }
    
    private String getTableHeader(String l) {
        if (l.equalsIgnoreCase("german")) {
            if (tg) {
                return trainer.getManager().getTableGermanRow();
            }
            return "Deutsch";
        }
        if (l.equalsIgnoreCase("foreign")) {
            if (tg) {
                return trainer.getManager().getLanguageName();
            }
            return trainer.getManager().getGermanLanguageName();
        }
        if (l.equalsIgnoreCase("dif")) {
            if (tg) {
                return trainer.getManager().getDifficulty();
            }
            return "Schwierigkeit";
        }
        return "";
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
}
