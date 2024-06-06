package core.ui.first;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static app.Main.registerJFrame;
import static app.Main.registerJPanel;

public class RegisterJpanel {
    public JPanel registerJpanel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JTextField textField;
    private JLabel userNameLable;
    private JLabel password1Lable;
    private JLabel password2Lable;
    private JButton cancelRegisterButton;
    private JButton registerButton;

    private JTextField textField2;

    public RegisterJpanel() {
        cancelRegisterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                registerJFrame.dispose();
            }
        });
    }

    public void registerFrameInit(){
        registerJFrame.setContentPane(registerJPanel.registerJpanel);
        registerJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        registerJFrame.pack();
        registerJFrame.setLocationRelativeTo(null);
        registerJFrame.setResizable(false);
        registerJFrame.setVisible(true);
    }

}
