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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import koneksi.Koneksi;

/**
 *
 * @author ASUS
 */
public class stokbarang extends javax.swing.JFrame {

    /**
     * Creates new form stokbarang
     */
    public stokbarang() {
        initComponents();
        datatable();
    }
    addBarang tbarang = new addBarang();
    editBarang ebarang = new editBarang();
    
   private void datatable() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nama Barang");
        tbl.addColumn("Merk");
        tbl.addColumn("Kategori");
        tbl.addColumn("Ukuran");
        tbl.addColumn("Harga Beli");
        tbl.addColumn("Harga Jual");
        tbl.addColumn("Keterangan");
        table.setModel(tbl);
        try {
            Statement statement = (Statement) Koneksi.getConnection().createStatement();
            ResultSet res = statement.executeQuery("Select * from tb_barang brg left join tb_merk mrk on brg.id_merk=mrk.id left join tb_kategori ktr on brg.id_kategori=ktr.id");
            while (res.next()) {
                tbl.addRow(new Object[]{
                    "#" + res.getString("id").toUpperCase(),
                    res.getString("nama_barang"),
                    res.getString("merk"),
                    res.getString("kategori"),
                    res.getInt("ukuran"),
                    res.getDouble("harga_beli"),
                    res.getDouble("harga_jual"),
                    res.getString("keterangan"),});
                table.setModel(tbl);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Gagal");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderPanel = new javax.swing.JPanel();
        panelTitle1 = new javax.swing.JLabel();
        btnTambahBarang = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        orderPanel.setBackground(new java.awt.Color(241, 245, 249));
        orderPanel.setPreferredSize(new java.awt.Dimension(1200, 850));

        panelTitle1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        panelTitle1.setText("STOK BARANG");

        btnTambahBarang.setBackground(new java.awt.Color(59, 130, 246));
        btnTambahBarang.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnTambahBarang.setForeground(new java.awt.Color(255, 255, 255));
        btnTambahBarang.setText("Tambah Barang");
        btnTambahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBarangActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.setRowHeight(52);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 0, 0));
        btnExit.setText("EXIT");
        btnExit.setBorder(null);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(234, 179, 8));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokosepatu/images/outline/Edit.png"))); // NOI18N
        btnEdit.setBorder(null);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokosepatu/images/outline/Trash Bin.png"))); // NOI18N
        btnDelete.setBorder(null);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout orderPanelLayout = new javax.swing.GroupLayout(orderPanel);
        orderPanel.setLayout(orderPanelLayout);
        orderPanelLayout.setHorizontalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addComponent(panelTitle1)
                        .addGap(1138, 1138, 1138))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, orderPanelLayout.createSequentialGroup()
                                .addComponent(btnTambahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1361, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        orderPanelLayout.setVerticalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(panelTitle1)
                .addGap(35, 35, 35)
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTambahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBarangActionPerformed
        tbarang.setVisible(true);
        tbarang.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(false);
    }//GEN-LAST:event_btnTambahBarangActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

    }//GEN-LAST:event_tableMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int index = table.getSelectedRow();
        TableModel model = table.getModel();

        String id_barang = model.getValueAt(index, 0).toString();
        String nama_barang = model.getValueAt(index, 1).toString();
        String id_merk = model.getValueAt(index, 2).toString();
        String id_kategori =  model.getValueAt(index, 3).toString();
        String ukuran = model.getValueAt(index, 4).toString();
        String harga_beli = model.getValueAt(index, 5).toString();
        String harga_jual = model.getValueAt(index, 6).toString();
        String keterangan = model.getValueAt(index, 7).toString();
        
        ebarang.txtidbrg.setText(id_barang);

        ebarang.txtnamabrg.setText(nama_barang);
        
        ebarang.cmboxmerk.setSelectedItem(id_merk);
        
        ebarang.cmboxkategori.setSelectedItem(id_kategori);
        
        ebarang.txtnamabrg.setText(nama_barang);
        
        ebarang.txtukuran.setText(ukuran);
        
        ebarang.txthargabeli.setText(harga_beli);
        
        ebarang.txthargajual.setText(harga_jual);
        
        ebarang.txtketerangan.setText(keterangan);
        
        ebarang.setVisible(true);
        ebarang.pack();
        ebarang.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);      
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
         
        if (table.getSelectedRowCount() == 1) {
            String[] row = table.getValueAt(table.getSelectedRow(), 0).toString().split("#");
            String choosenId = row[1];

            int option = JOptionPane.showConfirmDialog(this, "Yakin Ingin DIhapus ?");

            switch (option) {
                case JOptionPane.YES_OPTION:
                    try {
                    String sql;
                sql = "DELETE FROM tb_barang WHERE id = '" + choosenId + "'";
                    java.sql.Connection conn = (Connection) Koneksi.getConnection();
                    java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
                    pstm.execute();
                    JOptionPane.showMessageDialog(null, "Data has been deleted");
                    tblModel.removeRow(table.getSelectedRow());
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            }
        } else {
            if (table.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is empty");
            } else {
                JOptionPane.showMessageDialog(this, "Please select single row for delete");
            }
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(stokbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stokbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stokbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stokbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stokbarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnTambahBarang;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JLabel panelTitle1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

   
}
