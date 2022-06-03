/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class MonHoc {
    private int id;
    private String name;
    private int sotc;
    private String nameNhom;

    public MonHoc() {
    }

    public MonHoc(int id, String name, int sotc, String nameNhom) {
        this.id = id;
        this.name = name;
        this.sotc = sotc;
        this.nameNhom = nameNhom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSotc() {
        return sotc;
    }

    public void setSotc(int sotc) {
        this.sotc = sotc;
    }

    public String getnameNhom() {
        return nameNhom;
    }

    public void setnameNhom(String nameNhom) {
        this.nameNhom = nameNhom;
    }
    
}
