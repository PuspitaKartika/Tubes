/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rental_LazyPeople;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author mamaf
 */
public class AdminLogin extends javax.swing.JFrame {
    private PreparedStatement stat;
    private ResultSet rs;
    Koneksi k = new Koneksi();
    
    public AdminLogin() {
        initComponents();
        k.connect();
    }
    class Pelanggan{
    String usn_pelanggan, pw_pelanggan;
        
    public Pelanggan(){
        this.usn_pelanggan = isiusername.getText();
        this.pw_pelanggan = isipassword.getText();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnloginadmin = new javax.swing.JButton();
        isiusername = new javax.swing.JTextField();
        isipassword = new javax.swing.JPasswordField();
        btnout = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnloginadmin.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnloginadmin.setBorderPainted(false);
        btnloginadmin.setContentAreaFilled(false);
        getContentPane().add(btnloginadmin);
        btnloginadmin.setBounds(300, 630, 370, 70);
        getContentPane().add(isiusername);
        isiusername.setBounds(390, 420, 390, 80);
        getContentPane().add(isipassword);
        isipassword.setBounds(390, 520, 390, 80);

        btnout.setText("<");
        btnout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnout);
        btnout.setBounds(0, 0, 80, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/Login Admin.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -20, 1000, 1030);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoutActionPerformed
        // TODO add your handling code here:
        new PilihPeran().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnoutActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnloginadmin;
    private javax.swing.JButton btnout;
    private javax.swing.JPasswordField isipassword;
    private javax.swing.JTextField isiusername;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
