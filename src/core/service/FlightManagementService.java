package core.service;
import javax.swing.table.TableColumn;

import static core.ui.admin.AdminFrame.*;


public class FlightManagementService {
    public FlightManagementService() {
        flightManagementServiceInit();
    }
    private void flightManagementServiceInit(){
        TableColumn aColumn = new TableColumn(1);
        flightManagementPanel.flightTable.addColumn(aColumn);
    }



}
