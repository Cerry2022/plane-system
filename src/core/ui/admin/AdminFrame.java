package core.ui.admin;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import core.service.FlightManagementService;

import javax.swing.*;
import java.awt.*;

public class AdminFrame {
    public static final String FLIGHT_MANAGEMENT_PANEL = "flight management panel";
    public static final String QUESTION_PANEL = "question panel";

    public static JFrame adminMenuJFrame;
    public static AdminMenuJPanel adminMenuJPanel;
    public static FlightManagementPanel flightManagementPanel;

    public AdminFrame() {
    }

    public void initFrame(){

        adminMenuJFrame = new JFrame("adminMenuJPanel");
        adminMenuJPanel = new AdminMenuJPanel();
        flightManagementPanel = new FlightManagementPanel();
        adminMenuJFrame.setContentPane(adminMenuJPanel.adminMenuJPanel);


        adminMenuJPanel.viewJPanel.add(FLIGHT_MANAGEMENT_PANEL,flightManagementPanel.flightManagementPanel);
        adminMenuJPanel.cardLayout.show(adminMenuJPanel.viewJPanel,FLIGHT_MANAGEMENT_PANEL);

        FlightManagementService flightManagementService = new FlightManagementService();
       //flightManagementService.flightManagementServiceInit();

        adminMenuJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adminMenuJFrame.pack();
        adminMenuJFrame.setVisible(true);
    }
}
