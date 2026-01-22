package service;

import dao.AkunDAO;
import dao.TransaksiDAO;
import model.Transaksi;

public class TransaksiService {

    private AkunDAO akunDAO = new AkunDAO();
    private TransaksiDAO transaksiDAO = new TransaksiDAO();

    public void prosesTransaksi(Transaksi t) {
        transaksiDAO.insert(t);

        if (t.getJenis().equalsIgnoreCase("MASUK")) {
            akunDAO.tambahSaldo(t.getIdAkun(), t.getJumlah());
        } else {
            akunDAO.kurangSaldo(t.getIdAkun(), t.getJumlah());
        }
    }
}
