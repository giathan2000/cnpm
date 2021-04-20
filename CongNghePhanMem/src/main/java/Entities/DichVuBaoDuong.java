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
public class DichVuBaoDuong {
    private int id;
    private String tenDichVuBaoDuong;
    private long phi;
    private String loaiXe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDichVuBaoDuong() {
        return tenDichVuBaoDuong;
    }

    public void setTenDichVuBaoDuong(String tenDichVuBaoDuong) {
        this.tenDichVuBaoDuong = tenDichVuBaoDuong;
    }

    public long getPhi() {
        return phi;
    }

    public void setPhi(long phi) {
        this.phi = phi;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }
    
    
}
