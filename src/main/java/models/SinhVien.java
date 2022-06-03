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
    private String codeSV;
    private String hoTen;
    private String nien_Khoa;
    private String tenKhoa;

    public SinhVien(String codeSV, String hoTen, String nien_Khoa, String tenKhoa) {
        this.codeSV = codeSV;
        this.hoTen = hoTen;
        this.nien_Khoa = nien_Khoa;
        this.tenKhoa = tenKhoa;
    }

    public SinhVien() {
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
    
}
