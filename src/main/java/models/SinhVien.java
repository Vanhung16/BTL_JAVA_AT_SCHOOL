/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Doan Cuong
 */
public class SinhVien {
    private int id;
    private String codeSV;
    private String hoTen;
    private String nien_Khoa;
    private String tenKhoa;

    private String diachi;
    private String sdt;

    public SinhVien(int id, String codeSV, String hoTen, String nien_Khoa, String tenKhoa,  String diachi, String sdt) {
        this.id = id;
        this.codeSV = codeSV;
        this.hoTen = hoTen;
        this.nien_Khoa = nien_Khoa;
        this.tenKhoa = tenKhoa;
        this.diachi = diachi;
        this.sdt = sdt;
    }
    
    public SinhVien(int id, String codeSV, String hoTen, String nien_Khoa, String tenKhoa) {
        this.id = id;
        this.codeSV = codeSV;
        this.hoTen = hoTen;
        this.nien_Khoa = nien_Khoa;
        this.tenKhoa = tenKhoa;
    }

    public SinhVien() {
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeSV() {
        return codeSV;
    }

    public void setCodeSV(String codeSV) {
        this.codeSV = codeSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNien_Khoa() {
        return nien_Khoa;
    }

    public void setNien_Khoa(String nien_Khoa) {
        this.nien_Khoa = nien_Khoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
