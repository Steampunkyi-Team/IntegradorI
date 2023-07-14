package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class condicionMantDAO {
    conexion conectar=new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar() {
        List<condicionMant>datos=new ArrayList<>();
        String sql="select*from condicionMant";
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()) {
                condicionMant cm = new condicionMant();
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
}
