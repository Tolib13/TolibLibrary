package javainterface;

import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Insert {

    Koneksi konek = new Koneksi();

    public void insert(int NoReg, String Nama, int NoNik, String Agama, int Telp, String Alamat) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
             String sql = "insert into tbdatawarga values('" + NoReg + "','" + Nama + "','" + NoNik + "','" + Agama +"','" + Telp +"','" + Alamat + "')"; 
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
