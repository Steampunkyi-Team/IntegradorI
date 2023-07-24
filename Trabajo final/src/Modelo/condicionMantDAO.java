package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class condicionMantDAO {
    conexion conectar = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar() {
        List<condicionMant>datos=new ArrayList<>();
        String sql="select*from condicionmant order by IdCondicionMant desc limit 2";
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()) {
                condicionMant cm = new condicionMant();
                cm.setIdCondicionMant(rs.getInt(1));
                cm.setTolvaRPM(rs.getInt(2));
                cm.setTornilloRPM(rs.getInt(3));
                cm.setPresion(rs.getInt(4));
                cm.setAmperaje(rs.getInt(5));
                cm.setVacio(rs.getInt(6));
                cm.setRendimiento(rs.getInt(7));
                datos.add(cm);
            }
        }catch (Exception e){
            
        }
        return datos;
    }

    public int agregar(condicionMant o) {
        String sql="insert into condicionmant(TolvaRPM,TornilloRPM, Presion, Amperaje, Vacio, Rendimiento) values(?,?,?,?,?,?)";
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.setDouble(1, o.getTolvaRPM());
            ps.setDouble(2, o.getTornilloRPM());
            ps.setDouble(3, o.getPresion());
            ps.setDouble(4, o.getAmperaje());
            ps.setDouble(5, o.getVacio());
            ps.setDouble(6, o.getRendimiento());
            ps.executeUpdate();
        } catch (Exception e) {
            
        }
        return 1;
    }


    public int actualizar(condicionMant o) {
        String sql = "update condicionmant set TolvaRPM=?, TornilloRPM=?, Presion=?, Amperaje=?, Vacio=?, Rendimiento=? where IdCondicionMant=?";
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.setDouble(1, o.getTolvaRPM());
            ps.setDouble(2, o.getTornilloRPM());
            ps.setDouble(3, o.getPresion());
            ps.setDouble(4, o.getAmperaje());
            ps.setDouble(5, o.getVacio());
            ps.setDouble(6, o.getRendimiento());
            ps.setInt(7, o.getIdCondicionMant());
            ps.executeUpdate();
        } catch (Exception e) {
            
        }
        return 1;
    }
}

