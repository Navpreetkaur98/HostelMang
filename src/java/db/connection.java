/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lenovo
 */
public class connection implements Provider{
    
static  Connection con=null;
    public static Connection getCon() throws SQLException{
        try{
            Class.forName(driver);
            con=(Connection) DriverManager.getConnection(url,username,password);
        }
        catch(Exception e){
          System.out.println(e.getMessage());
        }
        
        return con;
    }
    }
