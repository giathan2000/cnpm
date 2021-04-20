/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;

/**
 *
 * @author hesac
 */
public class MainModel {


    private DonBaoDuongModel donBaoDuongModel;

    public MainModel() throws SQLException {
        init();
        donBaoDuongModel = new DonBaoDuongModel();

    }

    private void init() {

    }

    public DonBaoDuongModel getDonBaoDuongModel() {
        return donBaoDuongModel;
    }

    public void setDonBaoDuongModel(DonBaoDuongModel DBDM) {
        this.donBaoDuongModel = DBDM;
    }

}
