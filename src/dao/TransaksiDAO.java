package dao;

import config.Koneksi;
import model.Transaksi;
import java.sql.PreparedStatement;
import java.sql.Date;

public class TransaksiDAO {

    public void insert(Transaksi t) {
        String sql = "INSERT INTO transaksi (id_akun, tanggal, jenis, jumlah, keterangan) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = Koneksi.getConnection().prepareStatement(sql);
            ps.setInt(1, t.getIdAkun());
            ps.setDate(2, Date.valueOf(t.getTanggal()));
            ps.setString(3, t.getJenis());
            ps.setDouble(4, t.getJumlah());
            ps.setString(5, t.getKeterangan());
            ps.executeUpdate();
            System.out.println("Transaksi berhasil disimpan");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
