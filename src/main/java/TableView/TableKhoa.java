/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableView;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import models.Khoa;

/**
 *
 * @author XuanHoang
 */
public class TableKhoa extends AbstractTableModel {

    private String heading[] = {"Mã khoa", "Tên khoa"};

    private Class classess[] = {String.class, String.class};

    ArrayList<Khoa> dsKhoa = new ArrayList<>();

    public TableKhoa(ArrayList<Khoa> Khoa) {
        dsKhoa = Khoa;
    }

    @Override
    public int getRowCount() {
        return dsKhoa.size();
    }

    @Override
    public int getColumnCount() {
        return heading.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return dsKhoa.get(rowIndex).getId();
            case 1:
                return dsKhoa.get(rowIndex).getName();
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
