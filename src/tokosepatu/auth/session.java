/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokosepatu.auth;

import java.sql.ResultSet;
import java.sql.Statement;
import koneksi.Koneksi;

/**
 *
 * @author asusl
 */
public class session {

    private static String username;
    private static String nama;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        session.username = username;
    }
    
    public static String getNamaKaryawan() {
        try {
            Statement statement = (Statement) Koneksi.getConnection().createStatement();
            ResultSet res = statement.executeQuery("SELECT nama FROM tb_karyawan kr"
                    + " LEFT JOIN tb_users u ON kr.id = u.id_karyawan"
                    + " WHERE username = '" + session.getUsername() + "'");
            while (res.next()) {
                nama = res.getString("nama");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return nama;
    }
}
