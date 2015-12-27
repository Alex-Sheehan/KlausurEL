package alexsheehan.vocabtrainer.guis;

import alexsheehan.vocabtrainer.datast.Knoten;
import alexsheehan.vocabtrainer.Manager;
import alexsheehan.vocabtrainer.Training;
import alexsheehan.vocabtrainer.VocabularyTrainerProgram;
import alexsheehan.vocabtrainer.Vokabel;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class VocabTrainer extends javax.swing.JFrame {

    private Manager manager;
    public boolean activeTraining;
    protected Training training;

    public VocabTrainer(Manager m) {
        manager = m;
        initComponents();

        changeGUILanguage(false);
        toggleAccessability(false);

        btnNewTraining.setEnabled(manager.getList().getSize() >= 1);
        btnSort.setEnabled(manager.getList().getSize() >= 1);
        btnRemvoc.setEnabled(manager.getList().getSize() >= 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbHeader = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnAddvoc = new javax.swing.JButton();
        btnRemvoc = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        lbAmountText = new javax.swing.JLabel();
        lbAmount = new javax.swing.JLabel();
        tfGerman = new javax.swing.JTextField();
        tfForeign = new javax.swing.JTextField();
        lbForTFGer = new javax.swing.JLabel();
        lbForTF = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        btnNewTraining = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnSort = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        tgbtnGuiLang = new javax.swing.JToggleButton();
        jSeparator6 = new javax.swing.JSeparator();
        lbTrainingInfoWords = new javax.swing.JLabel();
        lbTrainingInfoValue1 = new javax.swing.JLabel();
        lbTrainingInfoCorrect = new javax.swing.JLabel();
        lbTrainingInfoValue2 = new javax.swing.JLabel();
        progBar = new javax.swing.JProgressBar();
        tgbLang = new javax.swing.JToggleButton();
        lbOutput = new javax.swing.JLabel();
        barCorrectPer = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vokabel Trainer");

        lbHeader.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbHeader.setForeground(new java.awt.Color(51, 51, 51));
        lbHeader.setText("Vocabulary Trainer");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnAddvoc.setBackground(new java.awt.Color(204, 204, 0));
        btnAddvoc.setText("Add Word");
        btnAddvoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddvocActionPerformed(evt);
            }
        });

        btnRemvoc.setBackground(new java.awt.Color(153, 0, 0));
        btnRemvoc.setForeground(new java.awt.Color(255, 255, 255));
        btnRemvoc.setText("Remove Word");

        lbAmountText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAmountText.setText("Amount of Words:");

        lbAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAmount.setText("(0) Words");

        lbForTFGer.setText("German Word");

        lbForTF.setText("Foreign Word");

        btnCheck.setBackground(new java.awt.Color(102, 255, 102));
        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        btnNewTraining.setBackground(new java.awt.Color(255, 255, 255));
        btnNewTraining.setText("New Session");
        btnNewTraining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewTrainingActionPerformed(evt);
            }
        });

        btnNext.setText("Next Word");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnSort.setBackground(new java.awt.Color(0, 102, 102));
        btnSort.setForeground(new java.awt.Color(255, 255, 255));
        btnSort.setText("Sort Words");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(102, 102, 102));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<- Zurück zum Menü");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tgbtnGuiLang.setBackground(new java.awt.Color(255, 255, 255));
        tgbtnGuiLang.setText("GUI Language");
        tgbtnGuiLang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtnGuiLangActionPerformed(evt);
            }
        });

        lbTrainingInfoWords.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTrainingInfoWords.setText("Words:");

        lbTrainingInfoValue1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbTrainingInfoCorrect.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTrainingInfoCorrect.setText("Correct:");

        lbTrainingInfoValue2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tgbLang.setBackground(new java.awt.Color(255, 255, 255));
        tgbLang.setText("Shown");
        tgbLang.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tgbLangStateChanged(evt);
            }
        });
        tgbLang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbLangActionPerformed(evt);
            }
        });

        lbOutput.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lbOutput.setForeground(new java.awt.Color(0, 0, 102));
        lbOutput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        barCorrectPer.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(lbForTFGer, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(tfGerman))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbForTF, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                            .addComponent(tfForeign)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tgbLang, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbTrainingInfoCorrect, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                            .addComponent(lbTrainingInfoWords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbTrainingInfoValue1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                            .addComponent(lbTrainingInfoValue2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(progBar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                            .addComponent(barCorrectPer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRemvoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddvoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbAmountText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tgbtnGuiLang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNewTraining, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tgbtnGuiLang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNewTraining, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddvoc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRemvoc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbForTFGer)
                                    .addComponent(lbForTF))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfForeign, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfGerman, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tgbLang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lbOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTrainingInfoWords, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbTrainingInfoValue1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(progBar, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbTrainingInfoValue2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(lbTrainingInfoCorrect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(barCorrectPer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddvocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddvocActionPerformed

        if (activeTraining) {
            if (tgbtnGuiLang.isSelected()) {
                if (btnAddvoc.getText().equalsIgnoreCase(manager.getEndTraining())) {
                    training.initEnd();
                    this.setEnabled(false);
                    new AddGUI(this).setVisible(true);

                    btnAddvoc.setText(manager.getAddButtonText());

                } else {
                    btnAddvoc.setText(manager.getEndTraining());
                }

            } else {
                if (btnAddvoc.getText().equalsIgnoreCase("Training beenden?")) {
                    training.initEnd();
                    this.setEnabled(false);
                    new AddGUI(this).setVisible(true);

                    btnAddvoc.setText("Wort hinzufügen");

                } else {
                    btnAddvoc.setText("Training beenden?");
                }

            }

        } else {

            this.setEnabled(false);
            new AddGUI(this).setVisible(true);
            if (tgbtnGuiLang.isSelected()) {
                btnAddvoc.setText(manager.getAddButtonText());
            } else {
                btnAddvoc.setText("Wort hinzufügen");
            }
        }
    }//GEN-LAST:event_btnAddvocActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new WelcomeScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tgbtnGuiLangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnGuiLangActionPerformed
        if (tgbtnGuiLang.isSelected()) {
            tgbtnGuiLang.setText("GUI: " + manager.getLanguageName());
            changeGUILanguage(true);
        } else {
            tgbtnGuiLang.setText("GUI: Deutsch");
            changeGUILanguage(false);
        }
    }//GEN-LAST:event_tgbtnGuiLangActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed

        if (activeTraining) {
            if (tgbtnGuiLang.isSelected()) {
                if (btnSort.getText().equalsIgnoreCase(manager.getEndTraining())) {
                    training.initEnd();
                    this.setEnabled(false);
                    new SortGUI(this, tgbtnGuiLang.isSelected()).setVisible(true);

                    btnSort.setText(manager.getSortButtonText());

                } else {
                    btnSort.setText(manager.getEndTraining());
                }

            } else {
                if (btnSort.getText().equalsIgnoreCase("Training beenden?")) {
                    training.initEnd();
                    this.setEnabled(false);
                    new SortGUI(this, tgbtnGuiLang.isSelected()).setVisible(true);

                    btnSort.setText("Vokabeln Sortieren");

                } else {
                    btnSort.setText("Training beenden?");
                }
            }

        } else {

            this.setEnabled(false);
            new SortGUI(this, tgbtnGuiLang.isSelected()).setVisible(true);
            if (tgbtnGuiLang.isSelected()) {
                btnSort.setText(manager.getSortButtonText());
            } else {
                btnSort.setText("Vokabeln Sortieren");
            }
        }
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnNewTrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewTrainingActionPerformed

        activeTraining = true;
        training = new Training(this);
        training.start();
        barCorrectPer.setValue(0);
    }//GEN-LAST:event_btnNewTrainingActionPerformed

    private void tgbLangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbLangActionPerformed

    }//GEN-LAST:event_tgbLangActionPerformed

    private void tgbLangStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tgbLangStateChanged
        if (tgbLang.isSelected()) {

            if (tgbtnGuiLang.isSelected()) {
                tgbLang.setText(manager.getShown());
            } else {
                tgbLang.setText("Gezeigt: " + manager.getGermanLanguageName());
            }
        } else {

            if (tgbtnGuiLang.isSelected()) {
                tgbLang.setText(manager.getGerShown());
            } else {
                tgbLang.setText("Gezeigt: Deutsch");
            }

        }
    }//GEN-LAST:event_tgbLangStateChanged

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        training.next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        training.verify();
    }//GEN-LAST:event_btnCheckActionPerformed

    public void changeGUILanguage(boolean f) { //f = foreign: yes= english/french.. no=german

        if (f) {
            lbHeader.setText(manager.getGuiTitle());
            btnAddvoc.setText(manager.getAddButtonText());
            btnRemvoc.setText(manager.getRemoveButtonText());
            btnSort.setText(manager.getSortButtonText());
            lbAmount.setText(manager.getAmountWordsCaption());
            lbAmount.setText("" + manager.getList().getSize());
            lbForTF.setText(manager.getTfLabel());
            lbForTFGer.setText(manager.getTfLabelGerman());
            btnCheck.setText(manager.getCheckButtonText());
            btnNewTraining.setText(manager.getNewTrainingText());
            btnNext.setText(manager.getNextWordText());

            lbAmountText.setText(manager.getAmountWordsCaption());
            lbTrainingInfoWords.setText(manager.getWords() + ": ");
            lbTrainingInfoCorrect.setText(manager.getCorrect() + ": ");

            if (tgbLang.isSelected()) {
                tgbLang.setText(manager.getShown());
            } else {
                tgbLang.setText(manager.getGerShown());

            }

            switch (getOutputOption()) {
                case 0:
                    lbOutput.setText(manager.getTrainingStarted());
                    break;
                case 1:
                    lbOutput.setText(manager.getCorrectWord());
                    break;
                case 2:
                    lbOutput.setText(manager.getWrongWord());
                    break;
                case 3:
                    lbOutput.setText(manager.getFinished());
                    break;
                case -1:
                    break;
                default:
                    break;
            }

        } else {
            lbHeader.setText("Vokabeltrainer: " + manager.getGermanLanguageName());
            btnAddvoc.setText("Wort hinzufügen");
            btnRemvoc.setText("Wort entfernen");
            btnSort.setText("Vokabeln Sortieren");
            lbAmountText.setText("Größe der Liste");
            lbAmount.setText("" + manager.getList().getSize());
            lbForTFGer.setText("Deutsches Wort:");
            lbForTF.setText(manager.getTfLabelInGerman() + " Wort:");
            btnCheck.setText("Prüfen");
            btnNewTraining.setText("Neues Training");
            btnNext.setText("Nächste Vokabel");

            lbAmountText.setText("Größe der Liste");
            lbTrainingInfoWords.setText("Wörter: ");
            lbTrainingInfoCorrect.setText("Richtig: ");
            if (tgbLang.isSelected()) {
                tgbLang.setText("Gezeigt: " + manager.getGermanLanguageName());
            } else {
                tgbLang.setText("Gezeigt: Deutsch");
            }

            switch (getOutputOption()) {
                case 0:
                    lbOutput.setText("Neues Training begonnen");
                    break;
                case 1:
                    lbOutput.setText("Du hast das richtige Wort gefunden!");
                    break;
                case 2:
                    lbOutput.setText("Falsches Wort eingegeben. Versuche es nochmal!");
                    break;
                case 3:
                    lbOutput.setText("Training beendet!");
                    break;
                case -1:
                    break;
                default:
                    break;
            }

        }
    }

    public Manager getManager() {
        return manager;
    }

    public void updateWordCount() {
        lbAmount.setText("" + manager.getList().getSize());

        if (manager.getList().getSize() == 0) {
            btnNewTraining.setEnabled(false);
            btnSort.setEnabled(false);
            btnRemvoc.setEnabled(false);
        } else if (manager.getList().getSize() >= 1) {
            btnNewTraining.setEnabled(true);
            btnSort.setEnabled(true);
            btnRemvoc.setEnabled(true);
        }
    }

    public void addVokabel(Vokabel q) {
        manager.addVokabel(q);
        try {
            VocabularyTrainerProgram.FILE_LIST_MANAGER.transcriptToFile(manager);
        } catch (IOException ex) {
            Logger.getLogger(VocabTrainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        updateWordCount();

    }

    public void toggleAccessability(boolean n) {
        lbForTF.setEnabled(n);
        lbForTFGer.setEnabled(n);
        tfGerman.setEditable(n);
        tfForeign.setEditable(n);
        btnCheck.setEnabled(n);
        btnNext.setEnabled(n);

        lbTrainingInfoCorrect.setEnabled(n);
        lbTrainingInfoWords.setEnabled(n);
        lbTrainingInfoValue1.setEnabled(n);
        lbTrainingInfoValue2.setEnabled(n);
    }

    public void updateTrainingInfos() {
        lbTrainingInfoValue1.setText(training.getCurrent() + " / " + manager.getList().getSize());
        lbTrainingInfoValue2.setText(training.getCorrect() + " / " + training.getCurrent());
        progBar.setMaximum(manager.getList().getSize());
        progBar.setValue(training.getCurrent());

        int x = training.getCurrent();
        int y = training.getCorrect();

        if (x != 0) {

            float z = (float) y / x * 100;

            System.out.println("" + z);

            barCorrectPer.setForeground(Color.red);

            if (z >= 50) {
                barCorrectPer.setForeground(Color.yellow);
            }

            if (z >= 75) {
                barCorrectPer.setForeground(Color.green);
            }

            barCorrectPer.setMaximum(training.getCurrent());

            barCorrectPer.setValue(training.getCorrect());

        }

    }

    public JLabel getInfoValue(int x) {
        if (x == 1) {
            return lbTrainingInfoValue1;
        } else if (x == 2) {
            return lbTrainingInfoValue2;
        } else {
            return null;
        }

    }

    public JToggleButton getToggleShown() {
        return tgbLang;
    }

    public JTextField getGermanField() {
        return tfGerman;
    }

    public JTextField getForeignField() {
        return tfForeign;
    }

    public void setOutputText(int opt) {
        switch (opt) {
            case 0:
                lbOutput.setForeground(Color.MAGENTA);

                if (tgbtnGuiLang.isSelected()) {
                    lbOutput.setText(manager.getTrainingStarted());
                } else {
                    lbOutput.setText("Neues Training begonnen");
                }
                break;

            case 1:
                lbOutput.setForeground(Color.green);
                if (tgbtnGuiLang.isSelected()) {
                    lbOutput.setText(manager.getCorrectWord());
                } else {
                    lbOutput.setText("Du hast das richtige Wort gefunden!");
                }
                break;
            case 2:
                lbOutput.setForeground(Color.red);
                if (tgbtnGuiLang.isSelected()) {
                    lbOutput.setText(manager.getWrongWord());
                } else {
                    lbOutput.setText("Falsches Wort eingegeben. Versuche es nochmal!");
                }
                break;
            case 3:
                lbOutput.setForeground(Color.MAGENTA);
                if (tgbtnGuiLang.isSelected()) {
                    lbOutput.setText(manager.getFinished());
                } else {
                    lbOutput.setText("Training beendet!");
                }
                break;
            default:
                break;
        }
    }

    public int getOutputOption() {
        String y = lbOutput.getText();

        if (y.equalsIgnoreCase(manager.getTrainingStarted()) || y.equalsIgnoreCase("Neues Training begonnen")) {
            return 0;
        }

        if (y.equalsIgnoreCase(manager.getCorrectWord()) || y.equalsIgnoreCase("Du hast das richtige Wort gefunden!")) {
            return 1;
        }

        if (y.equalsIgnoreCase(manager.getWrongWord()) || y.equalsIgnoreCase("Falsches Wort eingegeben. Versuche es nochmal!")) {
            return 2;
        }

        if (y.equalsIgnoreCase(manager.getFinished()) || y.equalsIgnoreCase("Training beendet!")) {
            return 3;
        }
        return -1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barCorrectPer;
    private javax.swing.JButton btnAddvoc;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnNewTraining;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnRemvoc;
    private javax.swing.JButton btnSort;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lbAmount;
    private javax.swing.JLabel lbAmountText;
    private javax.swing.JLabel lbForTF;
    private javax.swing.JLabel lbForTFGer;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JLabel lbOutput;
    private javax.swing.JLabel lbTrainingInfoCorrect;
    private javax.swing.JLabel lbTrainingInfoValue1;
    private javax.swing.JLabel lbTrainingInfoValue2;
    private javax.swing.JLabel lbTrainingInfoWords;
    private javax.swing.JProgressBar progBar;
    private javax.swing.JTextField tfForeign;
    private javax.swing.JTextField tfGerman;
    private javax.swing.JToggleButton tgbLang;
    private javax.swing.JToggleButton tgbtnGuiLang;
    // End of variables declaration//GEN-END:variables
}
