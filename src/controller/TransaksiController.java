package controller;

import model.Transaksi;
import service.TransaksiService;

public class TransaksiController {

    private TransaksiService service = new TransaksiService();

    public void simpanTransaksi(Transaksi t) {
        service.prosesTransaksi(t);
    }
}
