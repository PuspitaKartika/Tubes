/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rental_LazyPeople;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mamaf
 */
public class PesanPelanggan extends javax.swing.JFrame {

    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    Koneksi k = new Koneksi();
    
    public PesanPelanggan() {
        initComponents();
        k.connect();

    }
    
    class db_aplikasi extends PesanPelanggan{
        int nohp_pelanggan, kode_pesanan, harga_wisata, jumlah_orang, bayar_pesanan, kembalian_pesanan;
        String nama_pelanggan, tujuan_wisata;
        java.time.LocalDate tanggal_transaksi;
        
        public db_aplikasi(){
            this.kode_pesanan = Integer.parseInt(isibayar.getText());
            this.nama_pelanggan = isinama.getText();
            this.tujuan_wisata = cmboxtujuan.getSelectedItem().toString();
            this.harga_wisata = Integer.parseInt(isiharga.getText());
            this.jumlah_orang = Integer.parseInt(isijumlah.getText());
            this.tanggal_transaksi = java.time.LocalDate.parse(isitanggal.getText());
        }
    }
    
    public void hitungTotalHarga() {
    try {
        this.stat = k.getCon().prepareStatement("SELECT SUM(total_harga) AS total FROM db_keranjang");
        this.rs = this.stat.executeQuery();

        if (rs.next()) {
            int total_pesanan = rs.getInt("total");
            
            // Update field TotalHargaB dengan total harga
            TotalHargaB.setText(String.valueOf(totalHarga));
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnhomepage = new javax.swing.JButton();
        btnpemesanan = new javax.swing.JButton();
        btnkeranjang = new javax.swing.JButton();
        btnobjekwisata = new javax.swing.JButton();
        btnpeta = new javax.swing.JButton();
        btnriwayat = new javax.swing.JButton();
        btntentang = new javax.swing.JButton();
        btnout = new javax.swing.JButton();
        btnkonfirmasi = new javax.swing.JButton();
        isinama = new javax.swing.JTextField();
        isikode = new javax.swing.JTextField();
        isiharga = new javax.swing.JTextField();
        isijumlah = new javax.swing.JTextField();
        isitotal = new javax.swing.JTextField();
        isibayar = new javax.swing.JTextField();
        isinohp = new javax.swing.JTextField();
        cmboxtujuan = new javax.swing.JComboBox<>();
        isikembalian = new javax.swing.JTextField();
        isitanggal = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        btnhomepage.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnhomepage.setBorderPainted(false);
        btnhomepage.setContentAreaFilled(false);
        btnhomepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomepageActionPerformed(evt);
            }
        });
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
        btnpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpetaActionPerformed(evt);
            }
        });
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
        btntentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntentangActionPerformed(evt);
            }
        });
        getContentPane().add(btntentang);
        btntentang.setBounds(30, 870, 160, 40);

        btnout.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnout.setBorderPainted(false);
        btnout.setContentAreaFilled(false);
        btnout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnout);
        btnout.setBounds(30, 920, 160, 40);

        btnkonfirmasi.setBorderPainted(false);
        btnkonfirmasi.setContentAreaFilled(false);
        getContentPane().add(btnkonfirmasi);
        btnkonfirmasi.setBounds(210, 920, 790, 90);

        isinama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isinamaActionPerformed(evt);
            }
        });
        getContentPane().add(isinama);
        isinama.setBounds(450, 180, 540, 60);
        getContentPane().add(isikode);
        isikode.setBounds(450, 620, 540, 60);
        getContentPane().add(isiharga);
        isiharga.setBounds(450, 400, 540, 60);
        getContentPane().add(isijumlah);
        isijumlah.setBounds(450, 470, 540, 70);
        getContentPane().add(isitotal);
        isitotal.setBounds(450, 550, 540, 60);
        getContentPane().add(isibayar);
        isibayar.setBounds(450, 690, 540, 60);

        isinohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isinohpActionPerformed(evt);
            }
        });
        getContentPane().add(isinohp);
        isinohp.setBounds(450, 250, 540, 60);

        cmboxtujuan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmboxtujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pantai Ujung Pandaran", "Stadion 29 November", "Taman Kota Sampit", "Icon Patung Jelawat", "Citimall Sampit", "Water Park Sampit" }));
        getContentPane().add(cmboxtujuan);
        cmboxtujuan.setBounds(450, 330, 540, 60);
        getContentPane().add(isikembalian);
        isikembalian.setBounds(450, 770, 540, 60);
        getContentPane().add(isitanggal);
        isitanggal.setBounds(220, 840, 200, 60);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/TEMPAT PESAN.png"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background);
        background.setBounds(0, 0, 1000, 1000);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnkeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeranjangActionPerformed
        // TODO add your handling code here:
        new Keranjang().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnkeranjangActionPerformed

    private void btnriwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnriwayatActionPerformed
        // TODO add your handling code here:
        new RiwayatPesananPelanggan().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnriwayatActionPerformed

    private void btnhomepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomepageActionPerformed
        // TODO add your handling code here:
        new HomePelanggan().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnhomepageActionPerformed

    private void btnpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpetaActionPerformed
        // TODO add your handling code here:
        new PetaKota().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnpetaActionPerformed

    private void btntentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntentangActionPerformed
        // TODO add your handling code here:
        new TentangPagePelanggan().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btntentangActionPerformed

    private void btnoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoutActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnoutActionPerformed

    private void isinamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isinamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isinamaActionPerformed

    private void isinohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isinohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isinohpActionPerformed

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
            java.util.logging.Logger.getLogger(PesanPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesanPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesanPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesanPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesanPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnhomepage;
    private javax.swing.JButton btnkeranjang;
    private javax.swing.JButton btnkonfirmasi;
    private javax.swing.JButton btnobjekwisata;
    private javax.swing.JButton btnout;
    private javax.swing.JButton btnpemesanan;
    private javax.swing.JButton btnpeta;
    private javax.swing.JButton btnriwayat;
    private javax.swing.JButton btntentang;
    private javax.swing.JComboBox<String> cmboxtujuan;
    private javax.swing.JTextField isibayar;
    private javax.swing.JTextField isiharga;
    private javax.swing.JTextField isijumlah;
    private javax.swing.JTextField isikembalian;
    private javax.swing.JTextField isikode;
    private javax.swing.JTextField isinama;
    private javax.swing.JTextField isinohp;
    private javax.swing.JTextField isitanggal;
    private javax.swing.JTextField isitotal;
    // End of variables declaration//GEN-END:variables
}
