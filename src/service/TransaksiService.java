// TransaksiService.java

package service;

import model.Transaksi;

public class TransaksiService {

    public void jalankanTransaksi(Transaksi transaksi) {
        if (transaksi == null) {
            throw new IllegalArgumentException("Transaksi tidak boleh kosong");
        }
        transaksi.proses();
    }
}

