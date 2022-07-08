/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokosepatu.modul.karyawan;

import java.util.HashMap;
import java.util.Map;
import java.sql.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import koneksi.Koneksi;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.soap.Detail;

public class Karyawan extends javax.swing.JFrame {

    /**
     * Creates new form Karyawan
     */
    public Karyawan() {
        initComponents();
        datatable();

    }
    
    
    addKaryawan kry = new addKaryawan();
    editKaryawan Ekry = new editKaryawan();
    detailUser details = new detailUser();

    private void datatable() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nama");
        tbl.addColumn("Alamat");
        tbl.addColumn("Telepon");
        tbl.addColumn("Jenis Kelamin");
        tbl.addColumn("Jabatan");
        table.setModel(tbl);
        try {
            Statement statement = (Statement) Koneksi.getConnection().createStatement();
            ResultSet res = statement.executeQuery("Select * from tb_karyawan k left join tb_gaji_karyawan gk on k.jabatan = gk.id order by k.id");
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getInt("id"),
                    res.getString("nama"),
                    res.getString("alamat"),
                    res.getString("telepon"),
                    res.getString("jenis_kelamin"),
                    res.getString("bagian"), //                    res.getString("foto"),
                });
                table.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Gagal");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderPanel = new javax.swing.JPanel();
        panelTitle1 = new javax.swing.JLabel();
        btnNewOrder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btninfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        orderPanel.setBackground(new java.awt.Color(241, 245, 249));
        orderPanel.setPreferredSize(new java.awt.Dimension(1200, 850));

        panelTitle1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        panelTitle1.setText("Karyawan");

        btnNewOrder.setBackground(new java.awt.Color(59, 130, 246));
        btnNewOrder.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnNewOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnNewOrder.setText("Tambah Karyawan");
        btnNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrderActionPerformed(evt);
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

        btnReport.setBackground(new java.awt.Color(16, 185, 129));
        btnReport.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokosepatu/images/outline/Paper-Draft.png"))); // NOI18N
        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btninfo.setBackground(new java.awt.Color(14, 165, 233));
        btninfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokosepatu/images/outline/Info-Circle.png"))); // NOI18N
        btninfo.setBorder(null);
        btninfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout orderPanelLayout = new javax.swing.GroupLayout(orderPanel);
        orderPanel.setLayout(orderPanelLayout);
        orderPanelLayout.setHorizontalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addComponent(panelTitle1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderPanelLayout.createSequentialGroup()
                        .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
                            .addGroup(orderPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(orderPanelLayout.createSequentialGroup()
                                .addComponent(btnNewOrder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btninfo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74))))
        );
        orderPanelLayout.setVerticalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(panelTitle1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btninfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1212, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrderActionPerformed
        kry.setVisible(true);
        kry.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(false);
    }//GEN-LAST:event_btnNewOrderActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
      
    }//GEN-LAST:event_tableMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        int index = table.getSelectedRow();
        TableModel model = table.getModel();

        String id = model.getValueAt(index, 0).toString();
        String namaKaryawan = model.getValueAt(index, 1).toString();
        String noTelpon = model.getValueAt(index, 3).toString();
        String alamat = model.getValueAt(index, 2).toString();
        String jk = model.getValueAt(index, 4).toString();
        String jabatan = model.getValueAt(index, 5).toString();
        
        Ekry.txtId.setText(id);

        Ekry.txtNama.setText(namaKaryawan);
        
        Ekry.txtTelpon.setText(noTelpon);
        
        Ekry.cmboxjk.setSelectedItem(jk);
        
        Ekry.txtAlamat.setText(alamat);
        
        Ekry.cmboxJabatan.setSelectedItem(jabatan);
        
        Ekry.setVisible(true);
        Ekry.pack();
        Ekry.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) table.getModel();

        if (table.getSelectedRowCount() == 1) {
            String row = table.getValueAt(table.getSelectedRow(), 0).toString();
            int choosenId = Integer.parseInt(row);

            int option = JOptionPane.showConfirmDialog(this, "Yakin Ingin DIhapus ?");

            switch (option) {
                case JOptionPane.YES_OPTION:
                    try {
                    String sql = "DELETE FROM tb_karyawan WHERE id = " + choosenId;
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

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
              // TODO add your handling code here:
    }//GEN-LAST:event_btnReportActionPerformed

    private void btninfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninfoActionPerformed
        int idKaryawan = 0;
        if (table.getSelectedRowCount() == 1) {
            String row = table.getValueAt(table.getSelectedRow(), 0).toString();
            idKaryawan = Integer.parseInt(row);
        }
        
        try {
            Statement statement = (Statement) Koneksi.getConnection().createStatement();
            ResultSet res = statement.executeQuery("Select * from tb_karyawan k left join tb_gaji_karyawan gk on k.jabatan = gk.id WHERE k.id = " + idKaryawan);
            while (res.next()) {
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
        details.setVisible(true);
        details.pack();
        details.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);      // TODO add your handling code here:
    }//GEN-LAST:event_btninfoActionPerformed

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
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNewOrder;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btninfo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JLabel panelTitle1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
