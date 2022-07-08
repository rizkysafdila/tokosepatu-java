/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokosepatu.modul.karyawan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import koneksi.Koneksi;
/**
 *
 * @author Administrator
 */
public class addKaryawan extends javax.swing.JFrame {

    /**
     * Creates new form addKaryawan
     */
    public addKaryawan() {
        initComponents();
      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createOrderPanel = new javax.swing.JPanel();
        panelTitle1 = new javax.swing.JLabel();
        btnNewOrder = new javax.swing.JButton();
        labelProduk = new javax.swing.JLabel();
        cmboxjk = new javax.swing.JComboBox<>();
        txtNama = new javax.swing.JTextField();
        qtyLabel2 = new javax.swing.JLabel();
        txtTelpon = new javax.swing.JTextField();
        qtyLabel4 = new javax.swing.JLabel();
        qtyLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        cmboxJabatan = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        btnTambah1 = new javax.swing.JButton();
        btnTambah2 = new javax.swing.JButton();
        qtyLabel7 = new javax.swing.JLabel();
        qtyLabel3 = new javax.swing.JLabel();
        tgllahir = new com.toedter.calendar.JDateChooser();
        txtNik = new javax.swing.JTextField();
        qtyLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createOrderPanel.setBackground(new java.awt.Color(241, 245, 249));
        createOrderPanel.setPreferredSize(new java.awt.Dimension(852, 600));

        panelTitle1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        panelTitle1.setText("Tambah Data Karyawan");

        btnNewOrder.setBackground(new java.awt.Color(59, 130, 246));
        btnNewOrder.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnNewOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnNewOrder.setText("Buat Orderan");
        btnNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrderActionPerformed(evt);
            }
        });

        labelProduk.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelProduk.setText("JENIS KELAMIN");

        cmboxjk.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cmboxjk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pria", "Wanita" }));
        cmboxjk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxjkActionPerformed(evt);
            }
        });

        txtNama.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNama.setToolTipText("");
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        qtyLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        qtyLabel2.setText("NAMA");

        txtTelpon.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtTelpon.setToolTipText("");
        txtTelpon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelponActionPerformed(evt);
            }
        });

        qtyLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        qtyLabel4.setText("TELEPON");

        qtyLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        qtyLabel6.setText("ALAMAT");

        txtAlamat.setColumns(20);
        txtAlamat.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        cmboxJabatan.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cmboxJabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Kasir", "Costumer Service", "Gudang" }));
        cmboxJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxJabatanActionPerformed(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(59, 130, 246));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambah1.setBackground(new java.awt.Color(59, 130, 246));
        btnTambah1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnTambah1.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah1.setText("TAMBAH");
        btnTambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah1ActionPerformed(evt);
            }
        });

        btnTambah2.setBackground(new java.awt.Color(59, 130, 246));
        btnTambah2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnTambah2.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah2.setText("TAMBAH");
        btnTambah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah2ActionPerformed(evt);
            }
        });

        qtyLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        qtyLabel7.setText("JABATAN");

        qtyLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        qtyLabel3.setText("TANGGAL LAHIR");

        txtNik.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNik.setToolTipText("");
        txtNik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNikActionPerformed(evt);
            }
        });

        qtyLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        qtyLabel5.setText("NIK");

        javax.swing.GroupLayout createOrderPanelLayout = new javax.swing.GroupLayout(createOrderPanel);
        createOrderPanel.setLayout(createOrderPanelLayout);
        createOrderPanelLayout.setHorizontalGroup(
            createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createOrderPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(createOrderPanelLayout.createSequentialGroup()
                        .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelTitle1)
                            .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(createOrderPanelLayout.createSequentialGroup()
                                    .addComponent(qtyLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNik, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(createOrderPanelLayout.createSequentialGroup()
                                    .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelProduk)
                                        .addComponent(qtyLabel2)
                                        .addComponent(qtyLabel4)
                                        .addComponent(qtyLabel7)
                                        .addComponent(qtyLabel6)
                                        .addComponent(qtyLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(createOrderPanelLayout.createSequentialGroup()
                                            .addGap(161, 161, 161)
                                            .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(createOrderPanelLayout.createSequentialGroup()
                                                    .addGap(326, 326, 326)
                                                    .addComponent(btnNewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createOrderPanelLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtTelpon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cmboxjk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tgllahir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cmboxJabatan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnSimpan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(117, 117, 117)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        createOrderPanelLayout.setVerticalGroup(
            createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createOrderPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(panelTitle1)
                .addGap(95, 95, 95)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNik, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(createOrderPanelLayout.createSequentialGroup()
                        .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelpon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmboxjk, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelProduk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tgllahir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(qtyLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmboxJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyLabel7))
                .addGap(32, 32, 32)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197)
                .addComponent(btnTambah2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203)
                .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245)
                .addComponent(btnNewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createOrderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 774, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrderActionPerformed

    }//GEN-LAST:event_btnNewOrderActionPerformed

    private void cmboxjkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxjkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxjkActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtTelponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelponActionPerformed

    private void cmboxJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxJabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxJabatanActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            Connection conn = Koneksi.getConnection();
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement("insert into tb_karyawan( nik, nama, alamat, tgl_lahir, telepon, jabatan, jenis_kelamin) values(?,?,?,?,?,?,?)");
            
            stmt.setString(1, txtNik.getText());
            stmt.setString(2, txtNama.getText());
            stmt.setString(3, txtAlamat.getText());
            
            java.util.Date lahir = tgllahir.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String tgl_lahir = sdf.format(lahir);
            stmt.setString(4, tgl_lahir);
          
            stmt.setString(5, txtTelpon.getText());
          
            int number = 0;
            if (cmboxJabatan.getSelectedItem() == "Manager") {
                number = 1;
            } else if (cmboxJabatan.getSelectedItem() == "Kasir") {
                number = 2;
            } else if (cmboxJabatan.getSelectedItem() == "Costumer Service") {
                number = 3;
            } else if (cmboxJabatan.getSelectedItem() == "Gudang") {
                number = 4;
            }
            stmt.setInt(6, number);

            stmt.setString(7, (String) cmboxjk.getSelectedItem());

            stmt.executeUpdate();
            setVisible(false);
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            Karyawan ky = new Karyawan();
            ky.setVisible(true);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambah1ActionPerformed

    private void btnTambah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambah2ActionPerformed

    private void txtNikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNikActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewOrder;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah1;
    private javax.swing.JButton btnTambah2;
    private javax.swing.JComboBox<String> cmboxJabatan;
    private javax.swing.JComboBox<String> cmboxjk;
    private javax.swing.JPanel createOrderPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelProduk;
    private javax.swing.JLabel panelTitle1;
    private javax.swing.JLabel qtyLabel2;
    private javax.swing.JLabel qtyLabel3;
    private javax.swing.JLabel qtyLabel4;
    private javax.swing.JLabel qtyLabel5;
    private javax.swing.JLabel qtyLabel6;
    private javax.swing.JLabel qtyLabel7;
    private com.toedter.calendar.JDateChooser tgllahir;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNik;
    private javax.swing.JTextField txtTelpon;
    // End of variables declaration//GEN-END:variables

  
}