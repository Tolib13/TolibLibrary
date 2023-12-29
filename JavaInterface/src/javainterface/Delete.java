/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javainterface;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class Delete {
    Koneksi konek = new Koneksi();

    public void delete(int NoReg) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
             String sql = "delete from tbdatawarga where NoReg = '" + NoReg +"'";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil DiHapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
