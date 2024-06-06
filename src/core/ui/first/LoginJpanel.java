package core.ui.first;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import core.service.loginService;

import static app.Main.*;

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
                try {
                    new loginService(loginJFrame);
                } catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        cancelLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginJFrame.dispose();
            }
        });
        registerLable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!isRegisterWindowOpen) {

                    registerJPanel.registerFrameInit();

                    isRegisterWindowOpen = true;

                    // 添加窗口监听器，确保注册窗口关闭后重新启用点击事件
                    registerJFrame.addWindowListener(new java.awt.event.WindowAdapter() {
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

    public void loginFrameInit(){
        loginJFrame.setContentPane(loginJPanel.LoginJpanel);
        loginJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginJFrame.pack();
        loginJFrame.setLocationRelativeTo(null);
        loginJFrame.setResizable(false);
        loginJFrame.setVisible(true);
    }


    public String getUserName(){
        return textField1.getText();
    }

    public String getPassword(){
        return passwordField1.getText();
    }

}
