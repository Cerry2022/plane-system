package app;

import com.formdev.flatlaf.FlatLightLaf;

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
        FlatLightLaf.setup();
        //FlatMacLightLaf.setup();
        //FlatDarkLaf.setup();
        UIManager.put( "Button.arc", 20 );
        UIManager.put( "Component.arc", 15 );
        UIManager.put( "ProgressBar.arc", 15 );
        UIManager.put( "TextComponent.arc", 10 );


        loginJFrame = new JFrame("机票预定管理系统");
        registerJFrame = new JFrame("用户注册");
        loginJPanel = new LoginJpanel();
        registerJPanel = new RegisterJpanel();

        loginJPanel.loginFrameInit();

    }



}
