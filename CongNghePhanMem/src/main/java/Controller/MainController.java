/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Controller;

import View.*;
import Model.*;
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

    public MainController(MainModel model, MainView view) {
        this.model = model;
        this.view = view;
        view.setVisible(true);
        init();
    }

    private void init() {
        donBaoDuongController = new DonBaoDuongController((DonBaoDuongPanel)view.getDonBaoDuongPanel(),model);
    } 
}
