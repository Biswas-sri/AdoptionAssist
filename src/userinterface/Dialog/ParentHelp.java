/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Dialog;

import java.awt.Color;

/**
 *
 * @author ishanibose
 */
public class ParentHelp extends javax.swing.JFrame {

    /**
     * Creates new form SuccessDialog
     */
    public ParentHelp() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMessage1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMessage2 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/money.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 60, 70, 70);

        txtMessage.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtMessage.setText("This section is to transfer the funds provided to the Birth Mother.");
        getContentPane().add(txtMessage);
        txtMessage.setBounds(100, 80, 400, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/family-silhouette.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 150, 70, 70);

        txtMessage1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtMessage1.setText("Details of the selected mother.");
        getContentPane().add(txtMessage1);
        txtMessage1.setBounds(110, 170, 360, 16);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/baby-3.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 240, 70, 70);

        txtMessage2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtMessage2.setText("Details of your growing baby.");
        getContentPane().add(txtMessage2);
        txtMessage2.setBounds(110, 260, 360, 16);

        btnClose.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon-2.png"))); // NOI18N
        btnClose.setContentAreaFilled(false);
        btnClose.setFocusPainted(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose);
        btnClose.setBounds(490, 10, 50, 40);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-5, -4, 550, 380);

        setSize(new java.awt.Dimension(547, 375));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ParentHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParentHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParentHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParentHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParentHelp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel txtMessage;
    private javax.swing.JLabel txtMessage1;
    private javax.swing.JLabel txtMessage2;
    // End of variables declaration//GEN-END:variables
}
