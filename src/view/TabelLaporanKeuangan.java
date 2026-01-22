package view;

import dao.TransaksiDAO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TabelLaporanKeuangan extends JFrame {

    public TabelLaporanKeuangan() {
        setTitle("Laporan Keuangan");
        setSize(600,300);
        setLocationRelativeTo(null);

        DefaultTableModel model = new DefaultTableModel(
            new String[]{"ID","Akun","Tanggal","Jenis","Jumlah","Keterangan"},0
        );

        JTable table = new JTable(model);
        new TransaksiDAO().getAll(model);

        add(new JScrollPane(table));
    }
}
