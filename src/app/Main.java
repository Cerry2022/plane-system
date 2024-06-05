package app;

import com.formdev.flatlaf.FlatLightLaf;
import core.ui.first.LoginJpanel;

import javax.swing.*;

/**
 * 2019年11月5日21:15:34
 * @author 陌生人
 *
 */
public class Main {

    public static void main(String[] args) {
        FlatLightLaf.setup();

        //FirstFrame mf = new FirstFrame();
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
        // new AdminFrame("管理员");
        // new UserFrame("a12345","张三");
    }
}
