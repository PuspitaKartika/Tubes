/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rental_LazyPeople;

/**
 *
 * @author mamaf
 */
public class ObjekWisataPelanggan extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public ObjekWisataPelanggan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngotopesan = new javax.swing.JButton();
        btngotopeta = new javax.swing.JButton();
        btnhomepage = new javax.swing.JButton();
        btnpemesanan = new javax.swing.JButton();
        btnkeranjang = new javax.swing.JButton();
        btnobjekwisata = new javax.swing.JButton();
        btnpeta = new javax.swing.JButton();
        btnriwayat = new javax.swing.JButton();
        btntentang = new javax.swing.JButton();
        btnout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 370));
        getContentPane().setLayout(null);

        btngotopesan.setBorderPainted(false);
        btngotopesan.setContentAreaFilled(false);
        getContentPane().add(btngotopesan);
        btngotopesan.setBounds(610, 910, 390, 90);

        btngotopeta.setBorderPainted(false);
        btngotopeta.setContentAreaFilled(false);
        getContentPane().add(btngotopeta);
        btngotopeta.setBounds(220, 910, 390, 90);

        btnhomepage.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnhomepage.setBorderPainted(false);
        btnhomepage.setContentAreaFilled(false);
        getContentPane().add(btnhomepage);
        btnhomepage.setBounds(40, 180, 160, 40);

        btnpemesanan.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnpemesanan.setBorderPainted(false);
        btnpemesanan.setContentAreaFilled(false);
        getContentPane().add(btnpemesanan);
        btnpemesanan.setBounds(40, 240, 160, 40);

        btnkeranjang.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnkeranjang.setBorderPainted(false);
        btnkeranjang.setContentAreaFilled(false);
        btnkeranjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeranjangActionPerformed(evt);
            }
        });
        getContentPane().add(btnkeranjang);
        btnkeranjang.setBounds(40, 310, 160, 40);

        btnobjekwisata.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnobjekwisata.setBorderPainted(false);
        btnobjekwisata.setContentAreaFilled(false);
        getContentPane().add(btnobjekwisata);
        btnobjekwisata.setBounds(40, 370, 160, 40);

        btnpeta.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnpeta.setBorderPainted(false);
        btnpeta.setContentAreaFilled(false);
        getContentPane().add(btnpeta);
        btnpeta.setBounds(40, 430, 160, 50);

        btnriwayat.setBackground(new java.awt.Color(255, 255, 255));
        btnriwayat.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnriwayat.setBorderPainted(false);
        btnriwayat.setContentAreaFilled(false);
        btnriwayat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnriwayat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnriwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnriwayatActionPerformed(evt);
            }
        });
        getContentPane().add(btnriwayat);
        btnriwayat.setBounds(40, 490, 160, 60);

        btntentang.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btntentang.setBorderPainted(false);
        btntentang.setContentAreaFilled(false);
        getContentPane().add(btntentang);
        btntentang.setBounds(30, 870, 160, 40);

        btnout.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnout.setBorderPainted(false);
        btnout.setContentAreaFilled(false);
        getContentPane().add(btnout);
        btnout.setBounds(30, 920, 160, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/Tempat.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1000, 1000);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnkeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeranjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnkeranjangActionPerformed

    private void btnriwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnriwayatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnriwayatActionPerformed

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
            java.util.logging.Logger.getLogger(ObjekWisataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObjekWisataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObjekWisataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObjekWisataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ObjekWisataPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngotopesan;
    private javax.swing.JButton btngotopeta;
    private javax.swing.JButton btnhomepage;
    private javax.swing.JButton btnkeranjang;
    private javax.swing.JButton btnobjekwisata;
    private javax.swing.JButton btnout;
    private javax.swing.JButton btnpemesanan;
    private javax.swing.JButton btnpeta;
    private javax.swing.JButton btnriwayat;
    private javax.swing.JButton btntentang;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
