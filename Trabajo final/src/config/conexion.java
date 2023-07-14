/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class conexion {
    Connection con;
    private static final String driver="com.mysql.jdbc.driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/masterbash?characterEncoding=utf8";
    public Connection conectar(){
       con=null;
       try{
           con=(Connection) DriverManager.getConnection(url,user,pass);
           if(con!=null){
               
           }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "error"+e.toString());
       }
return con;
}
}
