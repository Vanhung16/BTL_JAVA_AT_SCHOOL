/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableView;

import models.*;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author VanHung
 */
public class TableMonHoc extends AbstractTableModel {

    private String heading[] = {"Mã môn", "Tên Môn","Số tín chỉ", "Nhóm môn"};

    private Class classess[] = {String.class, String.class,int.class, String.class};

//    ArrayList<MonHoc> dsMonHoc = new ArrayList<MonHoc>();
    ArrayList<MonHoc> dsMonHoc = new ArrayList<>();

    public TableMonHoc (ArrayList<MonHoc> MonHoc) {
        dsMonHoc = MonHoc;
    }

    @Override
    public int getRowCount() {
        return dsMonHoc.size();
    }

    @Override
    public int getColumnCount() {
        return heading.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
               return dsMonHoc.get(rowIndex).getId();

            case 1:
                return dsMonHoc.get(rowIndex).getName();
            case 2:
                return dsMonHoc.get(rowIndex).getSotc();
            case 3:
                return dsMonHoc.get(rowIndex).getnameNhom();

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
