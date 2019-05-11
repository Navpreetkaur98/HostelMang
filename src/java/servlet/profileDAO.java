/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import db.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.ProfileModel;
import model.UserModel;
import static servlet.loginDAO.rs;

/**
 *
 * @author SONY
 */
public class profileDAO {
    static Connection con=null;
    static PreparedStatement stmt=null;
    static ResultSet rs=null;
    public static ResultSet checkInfo(ProfileModel user) throws SQLException {
        try{
        con=connection.getCon();
        stmt=con.prepareStatement("select * from profile where uid=?");
        stmt.setString(1,user.getUid());
       rs=stmt.executeQuery();
        
    }catch(Exception e){
    e.printStackTrace();
}
    return rs;
}
}

