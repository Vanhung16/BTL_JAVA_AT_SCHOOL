/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableView;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import models.TKBMH;

/**
 *
 * @author XuanHoang
 */
public class TableTKBMH extends AbstractTableModel {

    private String heading[] = {"ID", "Tên môn", "Min HS", "Max HS", "Time start",
        "Số phòng", "Tên giáo viên", "Số tuần học"};

    private Class classess[] = {String.class, String.class, String.class, String.class, String.class, String.class,
        String.class, String.class};

    ArrayList<TKBMH> dsTKBMH = new ArrayList<>();

    public TableTKBMH(ArrayList<TKBMH> tkbmhs) {
        dsTKBMH = tkbmhs;
    }

    @Override
    public int getRowCount() {
        return dsTKBMH.size();
    }

    @Override
    public int getColumnCount() {
        return heading.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return dsTKBMH.get(rowIndex).getId();
            case 1:
                return dsTKBMH.get(rowIndex).getTen_mon_hoc();
            case 2:
                return dsTKBMH.get(rowIndex).getMin_sv();
            case 3:
                return dsTKBMH.get(rowIndex).getMax_sv();
            case 4:
                return dsTKBMH.get(rowIndex).getTime_start();
            case 5:
                return dsTKBMH.get(rowIndex).getSo_phong();
            case 6:
                return dsTKBMH.get(rowIndex).getTen_giao_vien();
            case 7:
                return dsTKBMH.get(rowIndex).getSo_tuan_hoc();
            default:
                return null;
        }
    }

    public Class getColumnClass(int columnIndex) {
        return classess[columnIndex];
    }

    public String getColumnName(int column) {
        return heading[column];
    }
}
