package dao;

import config.Koneksi;
import model.Akun;
import java.sql.*;

public class AkunDAO {

    public void insert(Akun a) {
        String sql = "INSERT INTO akun (nama_akun, saldo) VALUES (?,?)";
        try (Connection c = Koneksi.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, a.getNamaAkun());
            ps.setDouble(2, a.getSaldo());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tambahSaldo(int idAkun, double jumlah) {
        String sql = "UPDATE akun SET saldo = saldo + ? WHERE id_akun = ?";
        try (Connection c = Koneksi.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setDouble(1, jumlah);
            ps.setInt(2, idAkun);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kurangSaldo(int idAkun, double jumlah) {
        String sql = "UPDATE akun SET saldo = saldo - ? WHERE id_akun = ?";
        try (Connection c = Koneksi.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setDouble(1, jumlah);
            ps.setInt(2, idAkun);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
