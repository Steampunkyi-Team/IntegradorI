/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Usuario
 */
public class conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/masterbash";
    String user="root";
    String pass="";
    public Connection getConnection(){
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url, user,pass);
        }catch(Exception e){
            
        }
        return con;
    }
}