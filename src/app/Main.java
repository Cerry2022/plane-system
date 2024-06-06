package app;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import core.ui.admin.AdminFrame;
import core.ui.first.LoginJpanel;
import core.ui.first.RegisterJpanel;

import javax.swing.*;

/**
 * 2019年11月5日21:15:34
 * @author 陌生人
 *
 */
public class Main {
    public static JFrame loginJFrame;
    public static JFrame registerJFrame;
    public static LoginJpanel loginJPanel;
    public static RegisterJpanel registerJPanel;

    public static AdminFrame adminFrame;

    public static void main(String[] args) {
        //FlatLightLaf.setup();
        FlatMacLightLaf.setup();
        //FlatIntelliJLaf.setup();
        UIManager.put( "Button.arc", 20 );
        UIManager.put( "Component.arc", 15 );
        UIManager.put( "ProgressBar.arc", 15 );
        UIManager.put( "TextComponent.arc", 10 );


        loginJFrame = new JFrame("机票预定管理系统");
        registerJFrame = new JFrame("用户注册");
        loginJPanel = new LoginJpanel();
        registerJPanel = new RegisterJpanel();


        loginJFrame.setContentPane(loginJPanel.LoginJpanel);
        loginJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginJFrame.pack();
        loginJFrame.setLocationRelativeTo(null);
        loginJFrame.setResizable(false);
        loginJFrame.setVisible(true);
        // new AdminFrame("管理员");
        // new UserFrame("a12345","张三");
    }
}
