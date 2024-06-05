package app;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import core.ui.first.LoginJpanel;
import core.ui.first.RegisterJpanel;

import javax.swing.*;

/**
 * 2019年11月5日21:15:34
 * @author 陌生人
 *
 */
public class Main {
    public static JFrame loginFrame;
    public static JFrame registerFrame;
    public static LoginJpanel loginJpanel;
    public static RegisterJpanel registerJpanel;

    public static void main(String[] args) {
        //FlatLightLaf.setup();
        FlatMacLightLaf.setup();

        //FlatIntelliJLaf.setup();

        //FirstFrame mf = new FirstFrame();

        UIManager.put( "Button.arc", 15 );
        UIManager.put( "Component.arc", 15 );
        UIManager.put( "ProgressBar.arc", 15 );
        UIManager.put( "TextComponent.arc", 15 );


        loginFrame = new JFrame("机票预定管理系统");
        registerFrame = new JFrame("用户注册");
        loginJpanel = new LoginJpanel();
        registerJpanel = new RegisterJpanel();


        loginFrame.setContentPane(loginJpanel.LoginJpanel);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setResizable(false);
        loginFrame.setVisible(true);
        // new AdminFrame("管理员");
        // new UserFrame("a12345","张三");
    }
}
