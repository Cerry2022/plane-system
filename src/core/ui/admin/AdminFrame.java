package core.ui.admin;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;
import java.awt.*;

public class AdminFrame {
    public static final String FLIGHT_MANAGEMENT_PANEL = "flight management panel";
    public static final String QUESTION_PANEL = "question panel";

    private static JFrame adminMenuJFrame;
    private static AdminMenuJPanel adminMenuJPanel;
    private static FlightManagementPanel flightManagementPanel;

    public AdminFrame() {
        initFrame();
    }

    private void initFrame(){

        adminMenuJFrame = new JFrame("adminMenuJPanel");
        adminMenuJPanel = new AdminMenuJPanel();
        flightManagementPanel = new FlightManagementPanel();
        adminMenuJFrame.setContentPane(adminMenuJPanel.adminMenuJPanel);


        adminMenuJPanel.viewJPanel.add(FLIGHT_MANAGEMENT_PANEL,flightManagementPanel.flightManagementPanel);
        adminMenuJPanel.cardLayout.show(adminMenuJPanel.viewJPanel,FLIGHT_MANAGEMENT_PANEL);

        adminMenuJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adminMenuJFrame.pack();
        adminMenuJFrame.setVisible(true);
    }
}
