/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author XuanHoang
 */
public class TKBSV {
    private String ten_sv;
    private String ten_mon_hoc;
    private String so_phong;
    private String ten_giao_vien;

    public TKBSV(String ten_sv, String ten_mon_hoc, String so_phong, String ten_giao_vien) {
        this.ten_sv = ten_sv;
        this.ten_mon_hoc = ten_mon_hoc;
        this.so_phong = so_phong;
        this.ten_giao_vien = ten_giao_vien;
    }

    public String getTen_sv() {
        return ten_sv;
    }

    public void setTen_sv(String ten_sv) {
        this.ten_sv = ten_sv;
    }

    public String getTen_mon_hoc() {
        return ten_mon_hoc;
    }

    public void setTen_mon_hoc(String ten_mon_hoc) {
        this.ten_mon_hoc = ten_mon_hoc;
    }

    public String getSo_phong() {
        return so_phong;
    }

    public void setSo_phong(String so_phong) {
        this.so_phong = so_phong;
    }

    public String getTen_giao_vien() {
        return ten_giao_vien;
    }

    public void setTen_giao_vien(String ten_giao_vien) {
        this.ten_giao_vien = ten_giao_vien;
    }

    
    
}
