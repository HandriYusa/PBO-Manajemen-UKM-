package dao;

import config.Koneksi;
import model.Akun;
import java.sql.PreparedStatement;

public class AkunDAO {

    public void insert(Akun a) {
        String sql = "INSERT INTO akun (nama_akun, saldo) VALUES (?,?)";
        try {
            PreparedStatement ps = Koneksi.getConnection().prepareStatement(sql);
            ps.setString(1, a.getNamaAkun());
            ps.setDouble(2, a.getSaldo());
            ps.executeUpdate();
            System.out.println("Data akun berhasil disimpan");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
