package core.ui.admin;


import core.database.Database;
import core.service.FlightManagementService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import static core.service.FlightManagementService.deleteSelectedRow;


public class FlightManagementPanel {
    public JPanel flightManagementPanel;
    public JTable flightTable;
    private JButton 查询Button;
    private JTextField textField4;
    private JButton 添加Button;
    private JButton 取消修改Button;
    private JButton deleteRow;
    private JButton 保存修改Button;
    private JButton 完成Button;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField textField1;
    private JTextField textField2;
    private JRadioButton 精确搜索RadioButton;
    private JRadioButton 模糊搜索RadioButton;

    public DefaultTableModel tableModel = new DefaultTableModel();


    public FlightManagementPanel() {

        flightTable.setModel(tableModel);
        // 初始化表格
        FlightManagementService.fetchDataFromDatabase(tableModel);




        deleteRow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FlightManagementService.deleteSelectedRow();
            }
        });
    }


}
