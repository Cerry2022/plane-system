package core.ui.first;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginJpanel {
    public JPanel LoginJpanel;
    private static JPasswordField passwordField1;
    private static JTextField textField1;
    private JLabel userNameLable;
    private JLabel passwordLable;
    private JButton loginButton;
    private JButton cancelLoginButton;
    private JLabel registerLable;
    private boolean isRegisterWindowOpen = false;
    public LoginJpanel() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cancelLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        registerLable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!isRegisterWindowOpen) {
                    JFrame frame = new JFrame("注册");
                    frame.setContentPane(new RegisterJpanel().registerJpanel);
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setResizable(false);
                    frame.setVisible(true);
                    isRegisterWindowOpen = true;

                    // 添加窗口监听器，确保注册窗口关闭后重新启用点击事件
                    frame.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                            isRegisterWindowOpen = false;
                        }
                    });
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
            }
        });

    }


    public static String getUserName(){
        return textField1.getText();
    }

    public static String getUserPassword(){
        return passwordField1.getText();
    }

}
