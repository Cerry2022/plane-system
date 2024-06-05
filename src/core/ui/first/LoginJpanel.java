package core.ui.first;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static app.Main.registerFrame;
import static app.Main.registerJpanel;

public class LoginJpanel {
    public JPanel LoginJpanel;
    private JPasswordField passwordField1;
    private JTextField textField1;
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
                    registerFrame.setContentPane(registerJpanel.registerJpanel);
                    registerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    registerFrame.pack();
                    registerFrame.setLocationRelativeTo(null);
                    registerFrame.setResizable(false);
                    registerFrame.setVisible(true);
                    isRegisterWindowOpen = true;

                    // 添加窗口监听器，确保注册窗口关闭后重新启用点击事件
                    registerFrame.addWindowListener(new java.awt.event.WindowAdapter() {
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


    public String getUserName(){
        return textField1.getText();
    }

    public String getPassword(){
        return passwordField1.getText();
    }

}
