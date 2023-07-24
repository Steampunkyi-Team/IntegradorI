/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class FormulacionDao {
    conexion conectar=new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public List listar(){
        List<formulacion>datos=new ArrayList<>();
        String sql="select*from formula";
        try{
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                formulacion f=new formulacion();
                f.setIdFormula(rs.getInt(1));
                f.setCodigo(rs.getInt(2));
                f.setProducto(rs.getString(3));
                f.setInsumo1(rs.getString(4));
                f.setInsumo2(rs.getString(5));
                f.setInsumo3(rs.getString(6));
                f.setInsumo4(rs.getString(7));
                f.setInsumo5(rs.getString(8));
                f.setCantidad1(rs.getDouble(9));
                f.setCantidad2(rs.getDouble(10));
                f.setCantidad3(rs.getDouble(11));
                f.setCantidad4(rs.getDouble(12));
                f.setCantidad5(rs.getDouble(13));
                datos.add(f);
            }
        }catch (Exception e){
            
        }
        return datos;
    }
    public int agregar(formulacion f){
        String sql="insert into formula(codigo,producto,insumo1,insumo2,insumo3,insumo4,insumo5,cantidad1,cantidad2,cantidad3,cantidad4,cantidad5) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1,f.getCodigo());
            ps.setString(2, f.getProducto());
            ps.setString(3, f.getInsumo1());
            ps.setString(4, f.getInsumo2());
            ps.setString(5, f.getInsumo3());
            ps.setString(6, f.getInsumo4());
            ps.setString(7, f.getInsumo5());
            ps.setDouble(8, f.getCantidad1());
            ps.setDouble(9, f.getCantidad2());
            ps.setDouble(10, f.getCantidad3());
            ps.setDouble(11, f.getCantidad4());
            ps.setDouble(12, f.getCantidad5());
            ps.executeUpdate();
        }catch(Exception e){
            
        }
        return 1;
    }
    public int Actualizar(formulacion f){
        int r=0;
        String sql="update formula set codigo=?, producto=?, insumo1=?, insumo2=?, insumo3=?, insumo4 =?, insumo5=?, cantidad1=?, cantidad2=?, cantidad3=?, cantidad4=?, cantidad5=? where idFormula=?";
        try{
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1,f.getCodigo());
            ps.setString(2, f.getProducto());
            ps.setString(3, f.getInsumo1());
            ps.setString(4, f.getInsumo2());
            ps.setString(5, f.getInsumo3());
            ps.setString(6, f.getInsumo4());
            ps.setString(7, f.getInsumo5());
            ps.setDouble(8, f.getCantidad1());
            ps.setDouble(9, f.getCantidad2());
            ps.setDouble(10, f.getCantidad3());
            ps.setDouble(11, f.getCantidad4());
            ps.setDouble(12, f.getCantidad5());
            ps.setInt(13, f.getIdFormula());
            r=ps.executeUpdate();
            if(r==1){
                return 1;
            }else{
                return 0;
            }
        }catch(Exception e){
            
        }return r;
    }
    public void eliminar(int id){
        String sql="delete from formula where idFormula="+id;
        try{
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
                
        }
    }
}
