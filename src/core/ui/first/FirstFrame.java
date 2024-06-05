package core.ui.first;

import javax.swing.*;

public class FirstFrame {
    public FirstFrame( ) {

    }

    private JPanel mainFrame;

    public void initFrame() {
        JFrame frame = new JFrame("MainFrame");
        frame.setContentPane(new FirstFrame().mainFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
