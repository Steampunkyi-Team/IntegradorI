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
    
    public String obtenerNombrePorNof(int nof) {
        String nombre = null;
        String sql = "SELECT f.producto FROM orden o JOIN Formula f ON o.idFormula = f.idFormula WHERE o.nof = ?"; // Reemplaza "tabla_nombre" con el nombre real de tu tabla y "codigo" con el nombre de la columna que contiene los códigos.
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, nof);
            rs = ps.executeQuery();
            if (rs.next()) {
                nombre = rs.getString("producto");
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Aquí puedes agregar cualquier manejo de excepciones que consideres necesario.
        } finally {
            // Asegurarse de cerrar los recursos adecuadamente
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return nombre;
    }
}
