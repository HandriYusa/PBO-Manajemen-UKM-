package view;

import javax.swing.*;

public class FormLogin extends JFrame {

    public FormLogin() {
        setTitle("Login");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton btn = new JButton("Masuk");
        btn.addActionListener(e -> {
            new MainForm().setVisible(true);
            dispose();
        });

        add(btn);
    }
}
