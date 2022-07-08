/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokosepatu.modul.karyawan;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import koneksi.Koneksi;

/**
 *
 * @author Administrator
 */
public class editUser extends javax.swing.JFrame {

    /**
     * Creates new form editUser
     */
    public editUser() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createOrderPanel = new javax.swing.JPanel();
        panelTitle1 = new javax.swing.JLabel();
        usernameInput = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        roleSelect = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        roleLabel = new javax.swing.JLabel();
        passConfirmLabel = new javax.swing.JLabel();
        passInput = new javax.swing.JPasswordField();
        passConfirmInput = new javax.swing.JPasswordField();
        txtId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createOrderPanel.setBackground(new java.awt.Color(241, 245, 249));
        createOrderPanel.setPreferredSize(new java.awt.Dimension(852, 600));

        panelTitle1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        panelTitle1.setText("Tambah User");

        usernameInput.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        usernameInput.setToolTipText("");
        usernameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameInputActionPerformed(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        usernameLabel.setText("USERNAME");

        passLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        passLabel.setText("PASSWORD");

        roleSelect.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        roleSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Kasir", "Barang" }));
        roleSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleSelectActionPerformed(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(59, 130, 246));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("EDIT");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        roleLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        roleLabel.setText("ROLE");

        passConfirmLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        passConfirmLabel.setText("KONFIRMASI PASSWORD");

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        txtId.setText("ID Karyawan");

        javax.swing.GroupLayout createOrderPanelLayout = new javax.swing.GroupLayout(createOrderPanel);
        createOrderPanel.setLayout(createOrderPanelLayout);
        createOrderPanelLayout.setHorizontalGroup(
            createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createOrderPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(createOrderPanelLayout.createSequentialGroup()
                        .addComponent(panelTitle1)
                        .addGap(593, 593, 593)
                        .addComponent(txtId))
                    .addGroup(createOrderPanelLayout.createSequentialGroup()
                        .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(passLabel)
                            .addComponent(roleLabel)
                            .addComponent(passConfirmLabel))
                        .addGap(193, 193, 193)
                        .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passInput, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passConfirmInput, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        createOrderPanelLayout.setVerticalGroup(
            createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createOrderPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelTitle1)
                    .addComponent(txtId))
                .addGap(28, 28, 28)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passLabel))
                .addGap(18, 18, 18)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passConfirmInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passConfirmLabel))
                .addGap(23, 23, 23)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleLabel))
                .addGap(80, 80, 80)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(createOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(createOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameInputActionPerformed

    private void roleSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleSelectActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        int idkaryawan = Integer.parseInt(txtId.getText());
        String username = usernameInput.getText();

        if (!passInput.getText().equals(passConfirmInput.getText())) {
            JOptionPane.showMessageDialog(this, "Konfirmasi password tidak sesuai");
        }
        String pass = passInput.getText();

        String role = (String) roleSelect.getSelectedItem();
        int no = 0;

        if (null != role) {
            switch (role) {
                case "Admin":
                    no = 1;
                    break;
                case "Kasir":
                    no = 2;
                    break;
                case "Barang":
                    no = 3;
                    break;
                default:
                    break;
            }
        }
        try {
            String sql = "UPDATE tb_users SET "
                    + " username = '" + username + "'"
                    + ", password = '" + pass + "'"
                    + ", level = '" + no + "'"
                    + " WHERE id = " + idkaryawan;

            java.sql.Connection conn;
            conn = (Connection) Koneksi.getConnection();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil");
            tableUser ky = new tableUser();
            ky.setVisible(true);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(editUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.JPanel createOrderPanel;
    private javax.swing.JLabel panelTitle1;
    public javax.swing.JPasswordField passConfirmInput;
    private javax.swing.JLabel passConfirmLabel;
    public javax.swing.JPasswordField passInput;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel roleLabel;
    public javax.swing.JComboBox<String> roleSelect;
    public javax.swing.JLabel txtId;
    public javax.swing.JTextField usernameInput;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
