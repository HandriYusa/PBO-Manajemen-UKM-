package view;

import javax.swing.*;

public class MainForm extends JFrame {

    public MainForm() {
        setTitle("Manajemen Keuangan UKM");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton akun = new JButton("Data Akun");
        JButton transaksi = new JButton("Input Transaksi");
        JButton laporan = new JButton("Laporan");

        akun.addActionListener(e -> new FormDataAkun().setVisible(true));
        transaksi.addActionListener(e -> new FormInputTransaksi().setVisible(true));
        laporan.addActionListener(e -> new TabelLaporanKeuangan().setVisible(true));

        JPanel p = new JPanel();
        p.add(akun);
        p.add(transaksi);
        p.add(laporan);
        add(p);
    }
}
