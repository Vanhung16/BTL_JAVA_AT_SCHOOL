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
public class TKBMH {

    private int id;
    private String ten_mon_hoc;
    private int min_sv;
    private int max_sv;
    private String time_start;
    private String so_phong;
    private String ten_giao_vien;
    private int so_tuan_hoc;

    public TKBMH(int id, String ten_mon_hoc, int min_sv, int max_sv, String time_start, String so_phong, String ten_giao_vien, int so_tuan_hoc) {
        this.id = id;
        this.ten_mon_hoc = ten_mon_hoc;
        this.min_sv = min_sv;
        this.max_sv = max_sv;
        this.time_start = time_start;
        this.so_phong = so_phong;
        this.ten_giao_vien = ten_giao_vien;
        this.so_tuan_hoc = so_tuan_hoc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen_mon_hoc() {
        return ten_mon_hoc;
    }

    public void setTen_mon_hoc(String ten_mon_hoc) {
        this.ten_mon_hoc = ten_mon_hoc;
    }

    public int getMin_sv() {
        return min_sv;
    }

    public void setMin_sv(int min_sv) {
        this.min_sv = min_sv;
    }

    public int getMax_sv() {
        return max_sv;
    }

    public void setMax_sv(int max_sv) {
        this.max_sv = max_sv;
    }

    public String getTime_start() {
        return time_start;
    }

    public void setTime_start(String time_start) {
        this.time_start = time_start;
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

    public int getSo_tuan_hoc() {
        return so_tuan_hoc;
    }

    public void setSo_tuan_hoc(int so_tuan_hoc) {
        this.so_tuan_hoc = so_tuan_hoc;
    }

}
