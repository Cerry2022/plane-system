package core.ui.first;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;

public class RegisterJpanel {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JTextField textField;
    private JLabel userNameLable;
    private JLabel password1Lable;
    private JLabel password2Lable;
    private JButton cancelRegisterButton;
    private JButton registerButton;
    private JPanel registerJpanel;
    private JTextField textField2;

    public static void main(String[] args) {
        FlatLightLaf.install();
        JFrame frame = new JFrame("RegisterJpanel");
        frame.setContentPane(new RegisterJpanel().registerJpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
