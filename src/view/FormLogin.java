import controller.UserController;
import model.User;
import javax.swing.JOptionPane;

public class FormLogin extends javax.swing.JFrame {

    private UserController controller = new UserController();

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        User user = controller.login(username, password);

        if (user != null) {
            new MainForm().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Login gagal");
        }
    }
}
