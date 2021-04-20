/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.*;
import Model.*;
import java.sql.SQLException;

/**
 *
 * @author hesac
 */
public class MainController {

    MainModel model;
    MainView view;
    DonBaoDuongController donBaoDuongController;

    public MainController() {
    }

    public MainController(MainModel model, MainView view) throws SQLException {
        this.model = model;
        this.view = view;
        view.setVisible(true);
        init();
    }

    private void init() throws SQLException {
        donBaoDuongController = new DonBaoDuongController((DonBaoDuongPanel) view.getDonBaoDuongPanel(), model.getDonBaoDuongModel());
    }
}
