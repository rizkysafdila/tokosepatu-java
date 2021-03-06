/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokosepatu.modul.karyawan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import koneksi.Koneksi;

/**
 *
 * @author Administrator
 */
public class createUser extends javax.swing.JFrame {

    /**
     * Creates new form createdDatauser
     */
    public createUser() {
        initComponents();

        selectKaryawan();
    }

    private void selectKaryawan() {
        try {
            Statement statement = (Statement) Koneksi.getConnection().createStatement();
            ResultSet res = statement.executeQuery("SELECT id, nama FROM tb_karyawan WHERE id NOT IN (SELECT id_karyawan FROM tb_users)");
            while (res.next()) {
                karyawanSelect.addItem(res.getInt("id") + " - " + res.getString("nama"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Gagal");
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

        createOrderPanel = new javax.swing.JPanel();
        panelTitle1 = new javax.swing.JLabel();
        karyawanSelect = new javax.swing.JComboBox<>();
        usernameInput = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        karyawanLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        roleSelect = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        roleLabel = new javax.swing.JLabel();
        passConfirmLabel = new javax.swing.JLabel();
        passInput = new javax.swing.JPasswordField();
        passConfirmInput = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createOrderPanel.setBackground(new java.awt.Color(241, 245, 249));
        createOrderPanel.setPreferredSize(new java.awt.Dimension(852, 600));

        panelTitle1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        panelTitle1.setText("Tambah User");

        karyawanSelect.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        karyawanSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karyawanSelectActionPerformed(evt);
            }
        });

        usernameInput.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        usernameInput.setToolTipText("");
        usernameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameInputActionPerformed(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        usernameLabel.setText("USERNAME");

        karyawanLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        karyawanLabel.setText("KARYAWAN");

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
        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        roleLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        roleLabel.setText("ROLE");

        passConfirmLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        passConfirmLabel.setText("KONFIRMASI PASSWORD");

        javax.swing.GroupLayout createOrderPanelLayout = new javax.swing.GroupLayout(createOrderPanel);
        createOrderPanel.setLayout(createOrderPanelLayout);
        createOrderPanelLayout.setHorizontalGroup(
            createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createOrderPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createOrderPanelLayout.createSequentialGroup()
                        .addComponent(panelTitle1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(createOrderPanelLayout.createSequentialGroup()
                        .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(karyawanLabel)
                            .addComponent(passLabel)
                            .addComponent(roleLabel)
                            .addComponent(passConfirmLabel))
                        .addGap(193, 193, 193)
                        .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(karyawanSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passInput, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passConfirmInput, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE))))
        );
        createOrderPanelLayout.setVerticalGroup(
            createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createOrderPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(panelTitle1)
                .addGap(28, 28, 28)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel))
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createOrderPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(karyawanSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(createOrderPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(karyawanLabel)))
                .addGap(18, 18, 18)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passLabel)
                    .addComponent(passInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passConfirmLabel)
                    .addComponent(passConfirmInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleLabel))
                .addGap(22, 22, 22)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void karyawanSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karyawanSelectActionPerformed

    }//GEN-LAST:event_karyawanSelectActionPerformed

    private void usernameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameInputActionPerformed

    private void roleSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleSelectActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            Connection conn = Koneksi.getConnection();
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement("insert into tb_users( username, id_karyawan, password, level) values(?,?,?,?)");

            stmt.setString(1, usernameInput.getText());

            String[] value = karyawanSelect.getSelectedItem().toString().split(" - ");
            int karyawan = Integer.parseInt(value[0]);
            stmt.setInt(2, karyawan);

            if (!passInput.getText().equals(passConfirmInput.getText())) {
                JOptionPane.showMessageDialog(this, "Konfirmasi password tidak sesuai");
            } else {
                stmt.setString(3, passInput.getText());
            }

            String role = roleSelect.getSelectedItem().toString();
            int no = 0;

            if (role == "Admin") {
                no = 1;
            } else if (role == "Kasir") {
                no = 2;
            } else if (role == "Barang") {
                no = 3;
            }

            stmt.setInt(4, no);

            stmt.executeUpdate();
            setVisible(false);
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            tableUser tuser = new tableUser();
            tuser.setVisible(true);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
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
            java.util.logging.Logger.getLogger(createUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.JPanel createOrderPanel;
    private javax.swing.JLabel karyawanLabel;
    private javax.swing.JComboBox<String> karyawanSelect;
    private javax.swing.JLabel panelTitle1;
    private javax.swing.JPasswordField passConfirmInput;
    private javax.swing.JLabel passConfirmLabel;
    private javax.swing.JPasswordField passInput;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JComboBox<String> roleSelect;
    private javax.swing.JTextField usernameInput;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
