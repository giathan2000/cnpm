/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.*;
import Model.*;
import Entities.*;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hesac
 */
public class DonBaoDuongController {
    DonBaoDuongPanel thanhToanPanel;
    DonBaoDuongModel baoDuongModel;
    
    public DonBaoDuongController(DonBaoDuongPanel donBaoDuongPanel, DonBaoDuongModel model) throws SQLException {
        this.thanhToanPanel = donBaoDuongPanel;
        this.baoDuongModel = model;
        init();
    }
    
    public void init() throws SQLException{
        loadDanhSachTrangThaiPhuTungTiepNhan();
    }
    
    private void loadKhachHang(int id){
        
    }
    
    private void loadDanhSachTrangThaiPhuTungTiepNhan() throws SQLException{
        ArrayList<PhuTung> arl =  baoDuongModel.layDanhSachPhuTungCanKiemTra();
        DefaultTableModel dftb = (DefaultTableModel)thanhToanPanel.getDanhSachtrangThaiPhuTungTiepNhan().getModel();
        for (PhuTung pt : arl) {
            dftb.addRow(new Object[]{pt.getTenPhuTung(),null,null,null,null,null});
        }
    }
}
