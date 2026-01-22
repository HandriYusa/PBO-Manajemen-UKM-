package view;

import controller.AkunController;
import javax.swing.JOptionPane;

public class FormDataAkun extends javax.swing.JFrame {

    private AkunController controller = new AkunController();

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {
        String nama = txtNamaAkun.getText();
        double saldo = Double.parseDouble(txtSaldo.getText());

        controller.tambahAkun(nama, saldo);

        JOptionPane.showMessageDialog(this, "Akun berhasil disimpan");
    }
}
