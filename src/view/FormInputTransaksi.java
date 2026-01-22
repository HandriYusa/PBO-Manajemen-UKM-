package view;

import controller.TransaksiController;
import javax.swing.*;

public class FormInputTransaksi extends JFrame {

    private TransaksiController controller = new TransaksiController();

    public FormInputTransaksi() {
        setTitle("Input Transaksi");
        setSize(300,250);
        setLocationRelativeTo(null);

        JTextField idAkun = new JTextField(5);
        JTextField tanggal = new JTextField(10);
        JComboBox<String> jenis = new JComboBox<>(new String[]{"MASUK","KELUAR"});
        JTextField jumlah = new JTextField(10);
        JTextField ket = new JTextField(10);

        JButton simpan = new JButton("Simpan");
        simpan.addActionListener(e -> {
            controller.simpanTransaksi(
                Integer.parseInt(idAkun.getText()),
                tanggal.getText(),
                jenis.getSelectedItem().toString(),
                Double.parseDouble(jumlah.getText()),
                ket.getText()
            );
            JOptionPane.showMessageDialog(this, "Transaksi disimpan");
        });

        JPanel p = new JPanel();
        p.add(new JLabel("ID Akun")); p.add(idAkun);
        p.add(new JLabel("Tanggal")); p.add(tanggal);
        p.add(new JLabel("Jenis")); p.add(jenis);
        p.add(new JLabel("Jumlah")); p.add(jumlah);
        p.add(new JLabel("Keterangan")); p.add(ket);
        p.add(simpan);
        add(p);
    }
}
