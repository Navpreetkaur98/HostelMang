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
import model.UserModel;

/**
 *
 * @author lenovo
 */
public class loginDAO {
      static Connection con=null;
    static PreparedStatement stmt=null;
    static ResultSet rs=null;
    public static UserModel checkInfo(UserModel user) throws SQLException {
        con=connection.getCon();
        stmt=con.prepareStatement("select * from user where uid=? and password=?");
        stmt.setString(1,user.getUid());
        stmt.setString(2,user.getPassword());
        rs=stmt.executeQuery();
        if(rs.next())
        {
            System.out.print("in if");
            user.setFirst_name(rs.getString("first_name"));
            user.setLast_name(rs.getString("last_name"));
            user.setUser_type(rs.getString("user_type"));
            return user;
        }
        else{
            return null;
    }
    
}
}
