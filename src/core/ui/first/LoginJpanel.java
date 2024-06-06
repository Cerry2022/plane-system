package core.ui.first;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import core.service.LoginService;

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
                    new LoginService(loginJFrame);
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

            }
        });
        registerLable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!isRegisterWindowOpen) {
                    registerJFrame.setContentPane(registerJPanel.registerJpanel);
                    registerJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    registerJFrame.pack();
                    registerJFrame.setLocationRelativeTo(null);
                    registerJFrame.setResizable(false);
                    registerJFrame.setVisible(true);
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


    public String getUserName(){
        return textField1.getText();
    }

    public String getPassword(){
        return passwordField1.getText();
    }

}
