package controller;

import dao.AkunDAO;
import model.Akun;

public class AkunController {

    private AkunDAO akunDAO = new AkunDAO();

    public void tambahAkun(String namaAkun, double saldo) {
        Akun akun = new Akun();
        akun.setNamaAkun(namaAkun);
        akun.setSaldo(saldo);
        akunDAO.insert(akun);
    }
}
