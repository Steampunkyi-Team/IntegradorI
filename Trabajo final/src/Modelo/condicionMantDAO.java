package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class condicionMantDAO implements CRUD {
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listar() {
        List<condicionMant>lista=new ArrayList<>();
        String sql="select*from condicionmant order by IdCondicionMant desc";
        try {
            con=cn.getConnection();
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
                lista.add(cm);
            }
        }catch (SQLException e){
            
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql="insert into condicionmant(TolvaRPM,TornilloRPM, Presion, Amperaje, Vacio, Rendimiento) values(?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        } catch (SQLException e) {
            
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update condicionmant set TolvaRPM=?, TornilloRPM=?, Presion=?, Amperaje=?, Vacio=?, Rendimiento=? where IdCondicionMant=?";
        try {
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        } catch (SQLException e) {
            
        }
        return r;
    }
}
