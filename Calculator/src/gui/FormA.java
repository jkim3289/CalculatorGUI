/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import javax.swing.JTextField;

public class FormA extends javax.swing.JFrame {
    public FormA() {
        initComponents();
    }
    
    int n1, n2;
    
    boolean getUserInput() {
        String s1 = num1.getText();
        String s2 = num2.getText();
        
        try {
            n1 = Integer.parseInt(s1);
            n2 = Integer.parseInt(s2);
        } catch (NumberFormatException e) {
            resultLabel.setText("You have entered invalid input");
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        num1 = new javax.swing.JTextField();
        num2 = new javax.swing.JTextField();
        num1Label = new javax.swing.JLabel();
        num2Label = new javax.swing.JLabel();
        addBttn = new javax.swing.JButton();
        subBttn = new javax.swing.JButton();
        multBttn = new javax.swing.JButton();
        divBttn = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();
        butn1 = new javax.swing.JButton();
        butn4 = new javax.swing.JButton();
        butn7 = new javax.swing.JButton();
        butn2 = new javax.swing.JButton();
        butn5 = new javax.swing.JButton();
        butn8 = new javax.swing.JButton();
        butn0 = new javax.swing.JButton();
        butn6 = new javax.swing.JButton();
        butn3 = new javax.swing.JButton();
        butn9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num1Label.setText("Number 1");

        num2Label.setText("Number 2");

        addBttn.setText("+");
        addBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBttnActionPerformed(evt);
            }
        });

        subBttn.setText("-");
        subBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subBttnActionPerformed(evt);
            }
        });

        multBttn.setText("*");
        multBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multBttnActionPerformed(evt);
            }
        });

        divBttn.setText("/");
        divBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divBttnActionPerformed(evt);
            }
        });

        resultLabel.setText("Result");

        butn1.setText("1");
        butn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butn1ActionPerformed(evt);
            }
        });

        butn4.setText("4");
        butn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butn4ActionPerformed(evt);
            }
        });

        butn7.setText("7");
        butn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butn7ActionPerformed(evt);
            }
        });

        butn2.setText("2");
        butn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butn2ActionPerformed(evt);
            }
        });

        butn5.setText("5");
        butn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butn5ActionPerformed(evt);
            }
        });

        butn8.setText("8");
        butn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butn8ActionPerformed(evt);
            }
        });

        butn0.setText("0");
        butn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butn0ActionPerformed(evt);
            }
        });

        butn6.setText("6");
        butn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butn6ActionPerformed(evt);
            }
        });

        butn3.setText("3");
        butn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butn3ActionPerformed(evt);
            }
        });

        butn9.setText("9");
        butn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butn9ActionPerformed(evt);
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
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(num2Label)
                            .addComponent(num1Label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(num1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(num2)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(butn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(butn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(butn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(butn0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(butn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(butn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(butn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(butn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(butn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(butn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(resultLabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(addBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(subBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(multBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(divBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num1Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBttn)
                    .addComponent(subBttn)
                    .addComponent(multBttn)
                    .addComponent(divBttn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butn1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butn4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butn7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butn2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butn5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butn8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butn3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butn6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butn9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(butn0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBttnActionPerformed
        if (getUserInput()) resultLabel.setText(String.valueOf(n1 + n2));
    }//GEN-LAST:event_addBttnActionPerformed

    private void multBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multBttnActionPerformed
        if (getUserInput()) resultLabel.setText(String.valueOf(n1 * n2));
    }//GEN-LAST:event_multBttnActionPerformed

    private void subBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subBttnActionPerformed
        if (getUserInput()) resultLabel.setText(String.valueOf(n1 - n2));
    }//GEN-LAST:event_subBttnActionPerformed

    private void divBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divBttnActionPerformed
        if (getUserInput()) resultLabel.setText(String.valueOf((double)n1 / n2));
    }//GEN-LAST:event_divBttnActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num1ActionPerformed

    private void butn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butn1ActionPerformed

    private void butn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butn4ActionPerformed

    private void butn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butn7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butn7ActionPerformed

    private void butn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butn2ActionPerformed

    private void butn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butn5ActionPerformed

    private void butn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butn8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butn8ActionPerformed

    private void butn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butn0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butn0ActionPerformed

    private void butn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butn6ActionPerformed

    private void butn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butn3ActionPerformed

    private void butn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butn9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butn9ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormA().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBttn;
    private javax.swing.JButton butn0;
    private javax.swing.JButton butn1;
    private javax.swing.JButton butn2;
    private javax.swing.JButton butn3;
    private javax.swing.JButton butn4;
    private javax.swing.JButton butn5;
    private javax.swing.JButton butn6;
    private javax.swing.JButton butn7;
    private javax.swing.JButton butn8;
    private javax.swing.JButton butn9;
    private javax.swing.JButton divBttn;
    private javax.swing.JButton multBttn;
    private javax.swing.JTextField num1;
    private javax.swing.JLabel num1Label;
    private javax.swing.JTextField num2;
    private javax.swing.JLabel num2Label;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JButton subBttn;
    // End of variables declaration//GEN-END:variables
}