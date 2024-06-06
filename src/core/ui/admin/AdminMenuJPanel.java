package core.ui.admin;

import javax.swing.*;
import java.awt.*;

public class AdminMenuJPanel {

    private JButton button2;
    private JButton 用户管理Button;
    private JButton 订单管理Button;
    private JButton 航班航次管理Button;
    public JPanel adminMenuJPanel;
    public JPanel viewJPanel;
    public CardLayout cardLayout;

    public AdminMenuJPanel() {
        cardLayout = new CardLayout();
        viewJPanel.setLayout(cardLayout);
    }
}
