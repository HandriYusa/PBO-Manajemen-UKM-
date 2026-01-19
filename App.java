import dao.AkunDAO;
import model.Akun;

public class App {
    public static void main(String[] args) {

        Akun akun = new Akun();
        akun.setNamaAkun("Kas UKM");
        akun.setSaldo(1000000);

        AkunDAO dao = new AkunDAO();
        dao.insert(akun);

        System.out.println("TEST SELESAI");
    }
}
