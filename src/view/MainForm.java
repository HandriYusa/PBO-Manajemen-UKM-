// MainForm.java
package view;

import controller.AkunController;
import controller.TransaksiController;
import model.Akun;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {

    private AkunController akunController = new AkunController();
    private TransaksiController transaksiController = new TransaksiController();

    private JTextField txtJumlah;
    private JTextArea txtOutput;
    private JButton btnMasuk, btnKeluar;

    private Akun akunKas;

    public MainForm() {
        setTitle("Aplikasi Keuangan UKM");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblJumlah = new JLabel("Jumlah Transaksi:");
        lblJumlah.setBounds(20, 20, 150, 25);
        add(lblJumlah);

        txtJumlah = new JTextField();
        txtJumlah.setBounds(150, 20, 200, 25);
        add(txtJumlah);

        btnMasuk = new JButton("Transaksi Masuk");
        btnMasuk.setBounds(20, 60, 150, 30);
        add(btnMasuk);

        btnKeluar = new JButton("Transaksi Keluar");
        btnKeluar.setBounds(200, 60, 150, 30);
        add(btnKeluar);

        txtOutput = new JTextArea();
        txtOutput.setBounds(20, 110, 330, 120);
        txtOutput.setEditable(false);
        add(txtOutput);

        // Inisialisasi akun
        akunController.tambahAkun(1, "Kas UKM", 0);
        akunKas = akunController.cariAkunById(1);

        aksiButton();
    }

    private void aksiButton() {
        btnMasuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double jumlah = Double.parseDouble(txtJumlah.getText());
                transaksiController.transaksiMasuk(akunKas, jumlah);
                tampilSaldo();
            }
        });

        btnKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double jumlah = Double.parseDouble(txtJumlah.getText());
                transaksiController.transaksiKeluar(akunKas, jumlah);
                tampilSaldo();
            }
        });
    }

    private void tampilSaldo() {
        txtOutput.setText(
                "Nama Akun : " + akunKas.getNamaAkun() + "\n" +
                "Saldo Saat Ini : Rp " + akunKas.getSaldo()
        );
    }

    public static void main(String[] args) {
        new MainForm().setVisible(true);
    }
}
