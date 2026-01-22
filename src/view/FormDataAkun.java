package view;

import controller.AkunController;
import javax.swing.*;

public class FormDataAkun extends JFrame {

    private JTextField txtNama = new JTextField(15);
    private JTextField txtSaldo = new JTextField(10);
    private AkunController controller = new AkunController();

    public FormDataAkun() {
        setTitle("Tambah Akun");
        setSize(300,200);
        setLocationRelativeTo(null);

        JButton simpan = new JButton("Simpan");
        simpan.addActionListener(e -> {
            controller.tambahAkun(
                txtNama.getText(),
                Double.parseDouble(txtSaldo.getText())
            );
            JOptionPane.showMessageDialog(this, "Akun disimpan");
        });

        JPanel p = new JPanel();
        p.add(new JLabel("Nama Akun"));
        p.add(txtNama);
        p.add(new JLabel("Saldo"));
        p.add(txtSaldo);
        p.add(simpan);
        add(p);
    }
}
