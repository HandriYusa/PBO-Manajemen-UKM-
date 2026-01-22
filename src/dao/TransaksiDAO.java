package dao;

import config.Koneksi;
import model.Transaksi;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class TransaksiDAO {

    public void insert(Transaksi t) {
        String sql = "INSERT INTO transaksi (id_akun, tanggal, jenis, jumlah, keterangan) VALUES (?,?,?,?,?)";
        try (Connection c = Koneksi.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, t.getIdAkun());
            ps.setString(2, t.getTanggal());
            ps.setString(3, t.getJenis());
            ps.setDouble(4, t.getJumlah());
            ps.setString(5, t.getKeterangan());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getAll(DefaultTableModel model) {
        String sql = "SELECT * FROM transaksi";
        try (Connection c = Koneksi.getConnection();
             Statement s = c.createStatement();
             ResultSet r = s.executeQuery(sql)) {

            while (r.next()) {
                model.addRow(new Object[]{
                    r.getInt("id_transaksi"),
                    r.getInt("id_akun"),
                    r.getString("tanggal"),
                    r.getString("jenis"),
                    r.getDouble("jumlah"),
                    r.getString("keterangan")
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
