/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author hesac
 */
public class DatabaseConnection {
    public static Connection getConnection(){

        try {
            return DriverManager.getConnection("jdbc:sqlserver://;databaseName=QuanLyBaoDuong", "sa", "123");
        } catch (SQLException e) {
            System.err.println("Không thể kết nối Database");
            return null;
        }
    }
}
