package dao;

import config.Koneksi;
import model.Akun;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AkunDAO {

    public void insert(Akun akun) {
        String sql = "INSERT INTO akun (nama_akun, saldo) VALUES (?, ?)";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, akun.getNamaAkun());
            ps.setDouble(2, akun.getSaldo());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tambahSaldo(int idAkun, double jumlah) {
        String sql = "UPDATE akun SET saldo = saldo + ? WHERE id_akun = ?";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setDouble(1, jumlah);
            ps.setInt(2, idAkun);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kurangSaldo(int idAkun, double jumlah) {
        String sql = "UPDATE akun SET saldo = saldo - ? WHERE id_akun = ?";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setDouble(1, jumlah);
            ps.setInt(2, idAkun);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
