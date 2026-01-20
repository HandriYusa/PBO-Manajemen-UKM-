// AkunController.java
package controller;

import model.Akun;
import java.util.ArrayList;
import java.util.List;

public class AkunController {

    private List<Akun> daftarAkun = new ArrayList<>();

    public void tambahAkun(int id, String namaAkun, double saldoAwal) {
        Akun akun = new Akun(id, namaAkun, saldoAwal);
        daftarAkun.add(akun);
    }

    public List<Akun> getDaftarAkun() {
        return daftarAkun;
    }

    public Akun cariAkunById(int idAkun) {
        for (Akun akun : daftarAkun) {
            if (akun.getIdAkun() == idAkun) {
                return akun;
            }
        }
        return null;
    }

    public double getSaldoAkun(int idAkun) {
        Akun akun = cariAkunById(idAkun);
        if (akun != null) {
            return akun.getSaldo();
        }
        return 0;
    }
}

