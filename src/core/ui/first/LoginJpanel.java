package core.ui.first;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;

public class LoginJpanel {
    private JPanel LoginJpanel;
    private JPasswordField passwordField1;
    private JTextField textField1;
    private JLabel userNameLable;
    private JLabel passwordLable;
    private JButton loginButton;
    private JButton cancelLoginButton;

    public static void main(String[] args) {
        FlatLightLaf.install();

        UIManager.put( "Button.arc", 15 );
        UIManager.put( "Component.arc", 15 );
        UIManager.put( "ProgressBar.arc", 15 );
        UIManager.put( "TextComponent.arc", 15 );

        JFrame frame = new JFrame("机票预定管理系统");
        frame.setContentPane(new LoginJpanel().LoginJpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
