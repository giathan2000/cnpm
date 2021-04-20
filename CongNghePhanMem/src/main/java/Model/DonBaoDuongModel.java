/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.util.ArrayList;
import Entities.*;
/**
 *
 * @author hesac
 */
public class DonBaoDuongModel {
  
    
    public ArrayList<PhuTung> layDanhSachPhuTungCanKiemTra() throws SQLException{
        Connection con = DatabaseConnection.getConnection();
        Statement st = con.createStatement();
        
        ArrayList<PhuTung> arl = new ArrayList<>();
        String q = "select * from PhuTungCanKiemTra";
        ResultSet rs = st.executeQuery(q);
        while (rs.next()) {
            PhuTung pt= new PhuTung(rs.getInt("id"),rs.getString("TenPhuTung"));
            arl.add(pt);
        }
        
        con.close();
        
        return arl;
    }
    
    
}
