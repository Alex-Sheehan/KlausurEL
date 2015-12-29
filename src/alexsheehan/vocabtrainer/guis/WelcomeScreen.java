package alexsheehan.vocabtrainer.guis;

import alexsheehan.vocabtrainer.EnglishManager;
import alexsheehan.vocabtrainer.FrenchManager;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WelcomeScreen extends javax.swing.JFrame { //GUI beim Start des Programmes

    //Konstruktor
    public WelcomeScreen() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgpanel = new javax.swing.JPanel();
        prjnamelabel = new javax.swing.JLabel();
        bottomseperator = new javax.swing.JSeparator();
        lbalexsheehan = new javax.swing.JLabel();
        btnFunktions = new javax.swing.JButton();
        btnUsage = new javax.swing.JButton();
        btnEnglish = new javax.swing.JButton();
        btnFrz = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vokabeltrainer - Menü");

        prjnamelabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        prjnamelabel.setForeground(new java.awt.Color(0, 102, 0));
        prjnamelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prjnamelabel.setText("Vokabeltrainer");

        lbalexsheehan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbalexsheehan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbalexsheehan.setText("Alex Sheehan");

        btnFunktions.setBackground(new java.awt.Color(0, 153, 153));
        btnFunktions.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnFunktions.setForeground(new java.awt.Color(255, 255, 255));
        btnFunktions.setText("Welche Funktionen hat das Programm?");
        btnFunktions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFunktionsActionPerformed(evt);
            }
        });

        btnUsage.setBackground(new java.awt.Color(0, 153, 153));
        btnUsage.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnUsage.setForeground(new java.awt.Color(255, 255, 255));
        btnUsage.setText("Wie bediene ich das Programm?");
        btnUsage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsageActionPerformed(evt);
            }
        });

        btnEnglish.setBackground(new java.awt.Color(102, 0, 0));
        btnEnglish.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnEnglish.setForeground(new java.awt.Color(255, 255, 255));
        btnEnglish.setText("Englische Vokabeln");
        btnEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnglishActionPerformed(evt);
            }
        });

        btnFrz.setBackground(new java.awt.Color(204, 102, 0));
        btnFrz.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnFrz.setForeground(new java.awt.Color(255, 255, 255));
        btnFrz.setText("Französische Vokabeln");
        btnFrz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrzActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgpanelLayout = new javax.swing.GroupLayout(bgpanel);
        bgpanel.setLayout(bgpanelLayout);
        bgpanelLayout.setHorizontalGroup(
            bgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(bottomseperator)
                    .addComponent(jSeparator2)
                    .addComponent(prjnamelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEnglish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFrz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFunktions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addComponent(lbalexsheehan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        bgpanelLayout.setVerticalGroup(
            bgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prjnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFrz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFunktions, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bottomseperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbalexsheehan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnglishActionPerformed
        new VocabTrainer(new EnglishManager()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEnglishActionPerformed

    private void btnFrzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrzActionPerformed
        new VocabTrainer(new FrenchManager()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFrzActionPerformed

    private void btnUsageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsageActionPerformed
        try {
            new Bedienung().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(WelcomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUsageActionPerformed

    private void btnFunktionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFunktionsActionPerformed
        try {
            new Funktionen().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(WelcomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFunktionsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgpanel;
    private javax.swing.JSeparator bottomseperator;
    private javax.swing.JButton btnEnglish;
    private javax.swing.JButton btnFrz;
    private javax.swing.JButton btnFunktions;
    private javax.swing.JButton btnUsage;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbalexsheehan;
    private javax.swing.JLabel prjnamelabel;
    // End of variables declaration//GEN-END:variables
}
