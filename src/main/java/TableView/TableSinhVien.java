/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableView;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import models.SinhVien;

/**
 *
 * @author Admin
 */
public class TableSinhVien extends AbstractTableModel {

    private String heading[] = {"Mã sinh viên", "Họ và tên", "Khóa", "Tên Khoa"};
    private Class classes[] = {String.class, String.class, String.class, String.class};

    ArrayList<SinhVien> list = new ArrayList<SinhVien>();

    public TableSinhVien(ArrayList<SinhVien> sinhVien) {
        this.list = sinhVien;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return heading.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getCodeSV();
            case 1:
                return list.get(rowIndex).getHoTen();
            case 2:
                return list.get(rowIndex).getNien_Khoa();
            case 3:
                return list.get(rowIndex).getTenKhoa();
            default:
                return null;
        }
    }
    public Class getColumnClass(int columnIndex){
        return classes[columnIndex];
    }
    public String getColumnName(int column){
        return heading[column];
    }

}
