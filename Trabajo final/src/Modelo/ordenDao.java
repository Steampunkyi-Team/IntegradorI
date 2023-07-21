/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Usuario
 */
public class ordenDao {
    conexion conectar=new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public int agregar(orden o){
        String sql="insert into orden(idFormula,nof,cantidad,real1,real2,real3,real4,real5) values(?,?,?,?,?,?,?,?)";
        try{
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1,o.getIdFormula());
            ps.setInt(2, o.getNof());
            ps.setInt(3, o.getCantidad());
            ps.setDouble(4, o.getReal1());
            ps.setDouble(5, o.getReal2());
            ps.setDouble(6, o.getReal3());
            ps.setDouble(7, o.getReal4());
            ps.setDouble(8, o.getReal5());
            ps.executeUpdate();
        }catch(Exception e){
            
        }
        return 1;
    }
}
