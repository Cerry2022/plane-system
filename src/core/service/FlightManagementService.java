package core.service;

import core.database.Database;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

import static core.ui.admin.AdminFrame.*;


public class FlightManagementService {
    private static JTable flightTable;
    static DefaultTableModel tableModel;

    public FlightManagementService() {
        flightTable = flightManagementPanel.flightTable;
        tableModel = flightManagementPanel.tableModel;
        flightManagementServiceInit();
    }
    private void flightManagementServiceInit(){

    }


    public static void deleteSelectedRow() {
        int selectedRow = flightTable.getSelectedRow();
        if (selectedRow >= 0) {
            // 获取选中行的主键值
            Object primaryKeyValue = tableModel.getValueAt(selectedRow, 0); // 假设主键在第一列

            // 从数据库中删除这一行
            deleteRowFromDatabase(primaryKeyValue);

            // 从表格模型中删除这一行
            tableModel.removeRow(selectedRow);

            JOptionPane.showMessageDialog(adminMenuJFrame, "删除成功。");
        } else {
            JOptionPane.showMessageDialog(adminMenuJFrame, "请先选择要删除的行！");
        }
    }

    public static void deleteRowFromDatabase(Object primaryKeyValue) {

        String deleteQuery = "DELETE FROM flightinfo WHERE id = ?"; // 修改为您的表名和主键列名
        try (Connection connection = new Database().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {

            preparedStatement.setObject(1, primaryKeyValue);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void fetchDataFromDatabase(DefaultTableModel tableModel) {
        String query = "SELECT * FROM flightinfo"; // 修改为您的表名

        try (Connection connection = new Database().getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            // 设置表头
            String[] columnNames = {"id","外键","航班号","飞机类型","出发时间","到达时间","出发地点","到达地点","商务舱价格","经济舱价格","商务舱座位数","经济舱座位数"};

            tableModel.setColumnIdentifiers(columnNames);

            // 添加数据行
            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i-1] = resultSet.getObject(i);
                }
                tableModel.addRow(rowData);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
