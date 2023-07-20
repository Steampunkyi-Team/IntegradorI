/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class zonaDao {
    conexion conectar=new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar() {
        List<zona>datos=new ArrayList<>();
        String sql="select*from zonas order by Idzonas desc limit 2";
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()) {
                zona c = new zona();
                c.setIdzonas(rs.getInt(1));
                c.setZ1(rs.getInt(2));
                c.setZ2(rs.getInt(3));
                c.setZ3(rs.getInt(4));
                c.setZ4(rs.getInt(5));
                c.setZ5(rs.getInt(6));
                c.setZ6(rs.getInt(7));
                c.setZ7(rs.getInt(8));
                c.setZ8(rs.getInt(9));
                c.setZ9(rs.getInt(10));
                c.setZ10(rs.getInt(11));
                c.setZ11(rs.getInt(12));
                c.setZ12(rs.getInt(13));
                datos.add(c);
            }
        }catch (Exception e){
            
        }
        return datos;
    }
    public int agregar(zona o){
        String sql="insert into zonas(z1,z2,z3,z4,z5,z6,z7,z8,z9,z10,z11,z12) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.setDouble(1,o.getZ1());
            ps.setDouble(2, o.getZ2());
            ps.setDouble(3, o.getZ3());
            ps.setDouble(4, o.getZ4());
            ps.setDouble(5, o.getZ5());
            ps.setDouble(6, o.getZ6());
            ps.setDouble(7, o.getZ7());
            ps.setDouble(8, o.getZ8());
            ps.setDouble(9, o.getZ9());
            ps.setDouble(10, o.getZ10());
            ps.setDouble(11, o.getZ11());
            ps.setDouble(12, o.getZ12());
            ps.executeUpdate();
        }catch(Exception e){
            
        }
        return 1;
    }
    
    public int actualizar(zona o) {
        String sql = "update zona set z1=?, z2=?, z3=?, z4=?, z5=?, z6=?, z7=?, z8=?, z9=?, z10=?, z11=?, z12=? where idzonas=?";
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.setDouble(1, o.getZ1());
            ps.setDouble(2, o.getZ2());
            ps.setDouble(3, o.getZ3());
            ps.setDouble(4, o.getZ4());
            ps.setDouble(5, o.getZ5());
            ps.setDouble(6, o.getZ6());
            ps.setDouble(7, o.getZ7());
            ps.setDouble(8, o.getZ8());
            ps.setDouble(9, o.getZ9());
            ps.setDouble(10, o.getZ10());
            ps.setDouble(11, o.getZ11());
            ps.setDouble(12, o.getZ12());
            ps.setInt(13, o.getIdzonas());
            ps.executeUpdate();
        } catch (Exception e) {
            
        }
        return 1;
    }
}
