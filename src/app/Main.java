package app;

import com.formdev.flatlaf.FlatLightLaf;
import core.ui.first.FirstFrame;

/**
 * 2019年11月5日21:15:34
 * @author 陌生人
 *
 */
public class Main {

    public static void main(String[] args) {
        FlatLightLaf.setup();

        FirstFrame mf = new FirstFrame();
        // new AdminFrame("管理员");
        // new UserFrame("a12345","张三");
    }
}
