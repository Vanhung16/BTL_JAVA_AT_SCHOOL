/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author XuanHoang
 */
public class TableNhomMon extends AbstractTableModel {

    private String heading[] = {"Mã môn", "Tên môn"};

    private Class classess[] = {String.class, String.class};

//    ArrayList<NhomMon> dsNhomMon = new ArrayList<NhomMon>();
    ArrayList<NhomMon> dsNhomMon = new ArrayList<>();

    public TableNhomMon(ArrayList<NhomMon> nhomMon) {
        dsNhomMon = nhomMon;
    }

    @Override
    public int getRowCount() {
        return dsNhomMon.size();
    }

    @Override
    public int getColumnCount() {
        return heading.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
               return dsNhomMon.get(rowIndex).getId();

            case 1:
                return dsNhomMon.get(rowIndex).getName();

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
