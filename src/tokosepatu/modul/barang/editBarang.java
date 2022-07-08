/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokosepatu.modul.barang;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import koneksi.Koneksi;

/**
 *
 * @author ASUS
 */
public class editBarang extends javax.swing.JFrame {

    /**
     * Creates new form editbarang
     */
    public editBarang() {
        initComponents();

        selectMerk();
        selectKategori();
    }

    private void selectMerk() {
        try {
            Statement statement = (Statement) Koneksi.getConnection().createStatement();
            ResultSet res = statement.executeQuery("SELECT id, merk FROM tb_merk");
            while (res.next()) {
                cmboxmerk.addItem(res.getInt("id") + " - " + res.getString("merk"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    private void selectKategori() {
        try {
            Statement statement = (Statement) Koneksi.getConnection().createStatement();
            ResultSet res = statement.executeQuery("SELECT id, kategori FROM tb_kategori");
            while (res.next()) {
                cmboxkategori.addItem(res.getInt("id") + " - " + res.getString("kategori"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createOrderPanel = new javax.swing.JPanel();
        panelTitle1 = new javax.swing.JLabel();
        labelProduk = new javax.swing.JLabel();
        cmboxkategori = new javax.swing.JComboBox<>();
        txtidbrg = new javax.swing.JTextField();
        qtyLabel2 = new javax.swing.JLabel();
        txtnamabrg = new javax.swing.JTextField();
        qtyLabel4 = new javax.swing.JLabel();
        qtyLabel6 = new javax.swing.JLabel();
        labelProduk1 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        qtyLabel7 = new javax.swing.JLabel();
        cmboxmerk = new javax.swing.JComboBox<>();
        txtukuran = new javax.swing.JTextField();
        qtyLabel8 = new javax.swing.JLabel();
        txthargajual = new javax.swing.JTextField();
        qtyLabel9 = new javax.swing.JLabel();
        txtketerangan = new javax.swing.JTextField();
        qtyLabel10 = new javax.swing.JLabel();
        txthargabeli = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createOrderPanel.setBackground(new java.awt.Color(241, 245, 249));
        createOrderPanel.setPreferredSize(new java.awt.Dimension(852, 600));

        panelTitle1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        panelTitle1.setText("Edit Data Barang");

        labelProduk.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelProduk.setText("MERK");

        cmboxkategori.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cmboxkategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxkategoriActionPerformed(evt);
            }
        });

        txtidbrg.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtidbrg.setToolTipText("");
        txtidbrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidbrgActionPerformed(evt);
            }
        });

        qtyLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        qtyLabel2.setText("ID BARANG");

        txtnamabrg.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtnamabrg.setToolTipText("");
        txtnamabrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamabrgActionPerformed(evt);
            }
        });

        qtyLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        qtyLabel4.setText("NAMA BARANG");

        qtyLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        qtyLabel6.setText("KATEGORI");

        labelProduk1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        btnSimpan.setBackground(new java.awt.Color(59, 130, 246));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        qtyLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        qtyLabel7.setText("UKURAN");

        cmboxmerk.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cmboxmerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxmerkActionPerformed(evt);
            }
        });

        qtyLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        qtyLabel8.setText("HARGA BELI");

        txthargajual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargajualActionPerformed(evt);
            }
        });

        qtyLabel9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        qtyLabel9.setText("KETERANGAN");

        txtketerangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtketeranganActionPerformed(evt);
            }
        });

        qtyLabel10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        qtyLabel10.setText("HARGA JUAL");

        txthargabeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargabeliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createOrderPanelLayout = new javax.swing.GroupLayout(createOrderPanel);
        createOrderPanel.setLayout(createOrderPanelLayout);
        createOrderPanelLayout.setHorizontalGroup(
            createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createOrderPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createOrderPanelLayout.createSequentialGroup()
                        .addComponent(qtyLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(txtnamabrg, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createOrderPanelLayout.createSequentialGroup()
                        .addComponent(qtyLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtidbrg, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createOrderPanelLayout.createSequentialGroup()
                        .addComponent(labelProduk1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createOrderPanelLayout.createSequentialGroup()
                        .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qtyLabel6)
                            .addComponent(qtyLabel7)
                            .addComponent(labelProduk)
                            .addComponent(qtyLabel8)
                            .addComponent(qtyLabel10)
                            .addComponent(qtyLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txthargabeli, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmboxmerk, 0, 510, Short.MAX_VALUE)
                                .addComponent(cmboxkategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtukuran))
                            .addComponent(txthargajual, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtketerangan, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(createOrderPanelLayout.createSequentialGroup()
                        .addComponent(panelTitle1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(32, 267, Short.MAX_VALUE))
        );
        createOrderPanelLayout.setVerticalGroup(
            createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createOrderPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(panelTitle1)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createOrderPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtidbrg, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createOrderPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtyLabel2)))
                .addGap(18, 18, 18)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnamabrg, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyLabel4))
                .addGap(11, 11, 11)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelProduk)
                    .addComponent(cmboxmerk, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmboxkategori, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createOrderPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(qtyLabel7))
                    .addGroup(createOrderPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtukuran, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txthargabeli, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyLabel8))
                .addGap(18, 18, 18)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txthargajual, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyLabel10))
                .addGap(18, 18, 18)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtketerangan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyLabel9))
                .addGap(26, 26, 26)
                .addComponent(labelProduk1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(createOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(createOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmboxkategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxkategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxkategoriActionPerformed

    private void txtidbrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidbrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidbrgActionPerformed

    private void txtnamabrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamabrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamabrgActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:

        String[] id = txtidbrg.getText().split("#");
        String idBarang = id[1].toLowerCase();

        String nama_barang = txtnamabrg.getText();

        String[] selectedMerk = cmboxmerk.getSelectedItem().toString().split(" - ");
        int idMerk = Integer.parseInt(selectedMerk[0]);

        String[] selectedKategori = cmboxkategori.getSelectedItem().toString().split(" - ");
        int idKategori = Integer.parseInt(selectedKategori[0]);

        int ukuran = Integer.parseInt(txtukuran.getText());

        double harga_beli = Double.parseDouble(txthargabeli.getText());
        double harga_jual = Double.parseDouble(txthargajual.getText());

        String keterangan = txtketerangan.getText();

        try {
            String sql = "UPDATE tb_barang SET "
                    + "nama_barang = '" + nama_barang + "'"
                    + ", id_merk = '" + idMerk + "'"
                    + ", id_kategori = '" + idKategori + "'"
                    + ", ukuran = '" + ukuran + "'"
                    + ", harga_beli = '" + harga_beli + "'"
                    + ", harga_jual = '" + harga_jual + "'"
                    + ", keterangan = '" + keterangan + "'"
                    + " WHERE id = '" + idBarang + "'";
//            String sql = "UPDATE `toko_sepatu`.`tb_barang` SET" + "'nama_barang'='', `id_merk`='3', `ukuran`='42', `harga_beli`='280000', `harga_jual`='290000', `keterangan`='67' WHERE  `id`='nk2199';

//          System.out.println(sql);
            java.sql.Connection conn;
            conn = (Connection) Koneksi.getConnection();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
             pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil");
            stokbarang sb = new stokbarang();
            sb.setVisible(true);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void cmboxmerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxmerkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxmerkActionPerformed

    private void txthargajualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargajualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargajualActionPerformed

    private void txtketeranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtketeranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtketeranganActionPerformed

    private void txthargabeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargabeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargabeliActionPerformed

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
            java.util.logging.Logger.getLogger(editBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    public javax.swing.JComboBox<String> cmboxkategori;
    public javax.swing.JComboBox<String> cmboxmerk;
    private javax.swing.JPanel createOrderPanel;
    private javax.swing.JLabel labelProduk;
    private javax.swing.JLabel labelProduk1;
    private javax.swing.JLabel panelTitle1;
    private javax.swing.JLabel qtyLabel10;
    private javax.swing.JLabel qtyLabel2;
    private javax.swing.JLabel qtyLabel4;
    private javax.swing.JLabel qtyLabel6;
    private javax.swing.JLabel qtyLabel7;
    private javax.swing.JLabel qtyLabel8;
    private javax.swing.JLabel qtyLabel9;
    public javax.swing.JTextField txthargabeli;
    public javax.swing.JTextField txthargajual;
    public javax.swing.JTextField txtidbrg;
    public javax.swing.JTextField txtketerangan;
    public javax.swing.JTextField txtnamabrg;
    public javax.swing.JTextField txtukuran;
    // End of variables declaration//GEN-END:variables
}
