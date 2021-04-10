/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minh.mvcexample;

/**
 *
 * @author hesac
 */
public class Main {

    public static void main(String[] args) {
        Model m = new Model("Sylvain", "Saurel");
        View v = new View("MVC with SSaurel");
        Controller c = new Controller(m, v);
        c.initController();
    }

}
