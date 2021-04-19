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
    private Connection con;
    private DonBaoDuongModel DBDM;
    public MainModel() {
        init();
    }

    private void init() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://;databaseName=QuanLyBaoDuong [sa on dbo]", "sa", "123");
        } catch (ClassNotFoundException | SQLException e) {
        }
        
        
    }
    
    
    
}
