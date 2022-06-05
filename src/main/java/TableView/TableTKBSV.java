/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableView;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import models.Khoa;
import models.TKBSV;

/**
 *
 * @author XuanHoang
 */
public class TableTKBSV extends AbstractTableModel {

    private String heading[] = {"Tên sinh viên", "Tên môn học", "Số phòng", "Tên giáo viên"};

    private Class classess[] = {String.class, String.class, String.class, String.class};

    ArrayList<TKBSV> dsTKBSV = new ArrayList<>();

    public TableTKBSV(ArrayList<TKBSV> tkbsv) {
        dsTKBSV = tkbsv;
    }

    @Override
    public int getRowCount() {
        return dsTKBSV.size();
    }

    @Override
    public int getColumnCount() {
        return heading.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return dsTKBSV.get(rowIndex).getTen_sv();
            case 1:
                return dsTKBSV.get(rowIndex).getTen_mon_hoc();
            case 2:
                return dsTKBSV.get(rowIndex).getSo_phong();
            case 3:
                return dsTKBSV.get(rowIndex).getTen_giao_vien();
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
