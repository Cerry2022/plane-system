package core.ui.admin;

import javax.swing.*;
import java.awt.*;

public class AdminMenuJPanel {

    private JButton button2;
    private JButton userManagementButton;
    private JButton orderManagementButton;
    private JButton flightManagementButton;
    public JPanel adminMenuJPanel;
    public JPanel viewJPanel;
    public CardLayout cardLayout;

    public AdminMenuJPanel() {
        cardLayout = new CardLayout();
        viewJPanel.setLayout(cardLayout);
    }
}
