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
public class RiwayatPesananPelanggan extends javax.swing.JFrame {

    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    Koneksi k = new Koneksi();
    
    public RiwayatPesananPelanggan() {
        initComponents();
        k.connect();
        refreshTable();
    }

     public void refreshTable(){
        model = new DefaultTableModel();
        model.addColumn("Tanggal Pemesanan");
        model.addColumn("Nama");
        model.addColumn("No.HP");
        model.addColumn("Tujuan Wisata");
        model.addColumn("Harga");
        model.addColumn("Jumlah");
        model.addColumn("Total");
        model.addColumn("Kode Pesanan");
        tableriwayat.setModel(model);
        try {
            this.stat = k.getCon().prepareStatement("SELECT * FROM db_riwayat");
            this.rs = this.stat.executeQuery();
            while (rs.next()){
                Object[] data={
                    rs.getDate("tanggal_transaksi"),
                    rs.getInt("id_transaksi"),
                    rs.getInt("kode_barang"),
                    rs.getString("nama_barang"),
                    rs.getInt("harga_barang"),
                    rs.getInt("jumlah_barang"),
                    rs.getInt("total_harga")
                };
                model.addRow(data);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        isikodepesanan = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableriwayat = new javax.swing.JTable();
        btnhomepage = new javax.swing.JButton();
        btnpemesanan = new javax.swing.JButton();
        btnkeranjang = new javax.swing.JButton();
        btnobjekwisata = new javax.swing.JButton();
        btnpeta = new javax.swing.JButton();
        btnriwayat = new javax.swing.JButton();
        btntentang = new javax.swing.JButton();
        btnout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 370));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(null);
        getContentPane().add(isikodepesanan);
        isikodepesanan.setBounds(260, 180, 550, 80);

        btncari.setBorderPainted(false);
        btncari.setContentAreaFilled(false);
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        getContentPane().add(btncari);
        btncari.setBounds(810, 180, 130, 80);

        tableriwayat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tanggal Pemesanan", "Nama", "No.HP", "Tujuan Wisata", "Harga", "Jumlah", "Total", "Kode Pesanan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableriwayat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 270, 680, 660);

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
        btnpemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpemesananActionPerformed(evt);
            }
        });
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
        btnobjekwisata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnobjekwisataActionPerformed(evt);
            }
        });
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/Riwayat.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 1000);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncariActionPerformed

    private void btnhomepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomepageActionPerformed
        // TODO add your handling code here:
        new HomePelanggan().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnhomepageActionPerformed

    private void btnpemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpemesananActionPerformed
        // TODO add your handling code here:
        new PesanPelanggan().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnpemesananActionPerformed

    private void btnkeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeranjangActionPerformed
        // TODO add your handling code here:
        new Keranjang().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnkeranjangActionPerformed

    private void btnobjekwisataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnobjekwisataActionPerformed
        // TODO add your handling code here:
        new ObjekWisataPelanggan().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnobjekwisataActionPerformed

    private void btnriwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnriwayatActionPerformed
        // TODO add your handling code here:
        new RiwayatPesananPelanggan().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnriwayatActionPerformed

    private void btntentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntentangActionPerformed
        // TODO add your handling code here:
        new TentangPagePelanggan().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btntentangActionPerformed

    private void btnoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoutActionPerformed
        // TODO add your handling code here:
        System.exit(0);
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
            java.util.logging.Logger.getLogger(RiwayatPesananPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RiwayatPesananPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RiwayatPesananPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RiwayatPesananPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RiwayatPesananPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnhomepage;
    private javax.swing.JButton btnkeranjang;
    private javax.swing.JButton btnobjekwisata;
    private javax.swing.JButton btnout;
    private javax.swing.JButton btnpemesanan;
    private javax.swing.JButton btnpeta;
    private javax.swing.JButton btnriwayat;
    private javax.swing.JButton btntentang;
    private javax.swing.JTextField isikodepesanan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableriwayat;
    // End of variables declaration//GEN-END:variables
}
