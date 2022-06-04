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
public class TableGiaoVien extends AbstractTableModel {

    private String heading[] = {"Mã giáo viên", "Tên giáo viên",  "Địa Chỉ","Điện Thoại"};

    private Class classess[] = {String.class,String.class, String.class, String.class};

//    ArrayList<GiaoVien> dsGiaoVien = new ArrayList<GiaoVien>();
    ArrayList<GiaoVien> dsGiaoVien = new ArrayList<>();

    public TableGiaoVien(ArrayList<GiaoVien> GiaoVien) {
        dsGiaoVien = GiaoVien;
    }

    @Override
    public int getRowCount() {
        return dsGiaoVien.size();
    }

    @Override
    public int getColumnCount() {
        return heading.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
               return dsGiaoVien.get(rowIndex).getId();
            case 1:
                return dsGiaoVien.get(rowIndex).getName();
            case 2:
                return dsGiaoVien.get(rowIndex).getAddress();
            case 3:
                return dsGiaoVien.get(rowIndex).getPhone();

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
