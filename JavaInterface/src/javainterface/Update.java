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
public class Update {
    Koneksi konek = new Koneksi();

    public void update(int NoReg,String Nama,int NoNik,String Agama,int Telp,String Alamat) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            //String sql = "update tbdatawarga set NoReg='" + NoReg + "', Nama ='" + Nama + "', NoNik'" + NoNik + "', Agama = '" + Agama +"', Telp = '" + Telp +"', Alamat = '" + Alamat + "', where NoReg='"+ NoReg +"'" ;            
            String sql_Nama = "update tbdatawarga set Nama='" + Nama + "'where NoReg='" + NoReg + "'";
            String sql_NoNik = "update tbdatawarga set NoNik='" + NoNik + "'where NoReg='" + NoReg + "'";
            String sql_Agama = "update tbdatawarga set Agama='" + Agama + "'where NoReg='" + NoReg + "'";
            String sql_Telp = "update tbdatawarga set Telp='" + Telp + "'where NoReg='" + NoReg + "'";
            String sql_Alamat = "update tbdatawarga set Alamat='" + Alamat + "'where NoReg='" + NoReg + "'";
            
            
            statement.executeUpdate(sql_Nama);
            statement.executeUpdate(sql_NoNik);
            statement.executeUpdate(sql_Agama);
            statement.executeUpdate(sql_Telp);
            statement.executeUpdate(sql_Nama);
            
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil DiUbah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
