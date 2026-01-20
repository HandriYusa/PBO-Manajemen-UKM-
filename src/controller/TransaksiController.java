// TransaksiController.java
package controller;

import model.*;
import service.TransaksiService;
import java.util.Date;

public class TransaksiController {

    private TransaksiService transaksiService = new TransaksiService();

    public void transaksiMasuk(Akun akun, double jumlah) {
        if (akun == null || jumlah <= 0) {
            throw new IllegalArgumentException("Data transaksi masuk tidak valid");
        }

        Transaksi transaksi = new TransaksiMasuk(
                0,
                new Date(),
                jumlah,
                akun
        );

        transaksiService.jalankanTransaksi(transaksi);
    }

    public void transaksiKeluar(Akun akun, double jumlah) {
        if (akun == null || jumlah <= 0) {
            throw new IllegalArgumentException("Data transaksi keluar tidak valid");
        }

        if (akun.getSaldo() < jumlah) {
            throw new IllegalArgumentException("Saldo tidak mencukupi");
        }

        Transaksi transaksi = new TransaksiKeluar(
                0,
                new Date(),
                jumlah,
                akun
        );

        transaksiService.jalankanTransaksi(transaksi);
    }
}
// TransaksiController.java
