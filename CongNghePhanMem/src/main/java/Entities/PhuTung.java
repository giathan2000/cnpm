/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author hesac
 */
public class PhuTung {
    private int id;
    private String tenPhuTung;

    public PhuTung() {
    }

    public PhuTung(int id, String tenPhuTung) {
        this.id = id;
        this.tenPhuTung = tenPhuTung;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenPhuTung() {
        return tenPhuTung;
    }

    public void setTenPhuTung(String tenPhuTung) {
        this.tenPhuTung = tenPhuTung;
    }
    
}
