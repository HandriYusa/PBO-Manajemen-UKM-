package controller;

import model.Transaksi;
import service.TransaksiService;

public class TransaksiController {

    private TransaksiService service = new TransaksiService();

    public void simpanTransaksi(
        int idAkun,
        String tanggal,
        String jenis,
        double jumlah,
        String keterangan
    ) {
        Transaksi t = new Transaksi();
        t.setIdAkun(idAkun);
        t.setTanggal(tanggal);
        t.setJenis(jenis);
        t.setJumlah(jumlah);
        t.setKeterangan(keterangan);

        service.prosesTransaksi(t);
    }
}
