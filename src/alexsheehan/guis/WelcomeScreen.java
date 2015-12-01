package alexsheehan.guis;

import alexsheehan.kel.AlexKEL;


public class WelcomeScreen extends javax.swing.JFrame { //GUI beim Start des Programmes

   //Konstruktor
    public WelcomeScreen() {
        initComponents(); 
        
        
        
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

        bgpanel.setBackground(new java.awt.Color(204, 204, 204));

        prjnamelabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        prjnamelabel.setForeground(new java.awt.Color(0, 102, 0));
        prjnamelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prjnamelabel.setText("Vokabeltrainer");

        lbalexsheehan.setText("Alex Sheehan");

        btnFunktions.setBackground(new java.awt.Color(0, 153, 153));
        btnFunktions.setForeground(new java.awt.Color(255, 255, 255));
        btnFunktions.setText("Welche Funktionen hat das Programm?");

        btnUsage.setBackground(new java.awt.Color(0, 153, 153));
        btnUsage.setForeground(new java.awt.Color(255, 255, 255));
        btnUsage.setText("Wie bediene ich das Programm?");

        btnEnglish.setBackground(new java.awt.Color(102, 0, 0));
        btnEnglish.setForeground(new java.awt.Color(255, 255, 255));
        btnEnglish.setText("Englische Vokabeln");
        btnEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnglishActionPerformed(evt);
            }
        });

        btnFrz.setBackground(new java.awt.Color(204, 102, 0));
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
                    .addComponent(btnFunktions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(btnUsage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prjnamelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bottomseperator)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgpanelLayout.createSequentialGroup()
                        .addGap(0, 630, Short.MAX_VALUE)
                        .addComponent(lbalexsheehan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgpanelLayout.createSequentialGroup()
                        .addComponent(btnEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFrz, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGroup(bgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFrz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnglishActionPerformed
        new VocabTrainer(AlexKEL.getEnglish()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEnglishActionPerformed

    private void btnFrzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrzActionPerformed
        new VocabTrainer(AlexKEL.getFrench()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFrzActionPerformed

    


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
