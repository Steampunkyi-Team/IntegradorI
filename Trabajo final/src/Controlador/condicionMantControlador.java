package Controlador;

import Modelo.condicionMant;
import Modelo.condicionMantDAO;
import com.mycompany.integradori.Mantenimiento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class condicionMantControlador implements ActionListener{

    condicionMantDAO dao = new condicionMantDAO();
    condicionMant o = new condicionMant();
    Mantenimiento vista = new Mantenimiento();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public condicionMantControlador(Mantenimiento v) {
        this.vista = v;
        this.vista.btncond.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.btncond){
            listar(vista.jTable2);
        }
        if(e.getSource()==vista.btncond3){
            agregar();
        }
            
    }
    
    public void listar (JTable tabla) {
        modelo = (DefaultTableModel)tabla.getModel();
        List<condicionMant>lista=dao.listar();
        Object[]object = new Object[6];
        for (int i = 0; i<lista.size();i++) {
            object[0]=lista.get(i).getTolvaRPM();
            object[1]=lista.get(i).getTornilloRPM();
            object[2]=lista.get(i).getPresion();
            object[3]=lista.get(i).getAmperaje();
            object[4]=lista.get(i).getVacio();
            object[5]=lista.get(i).getRendimiento();
            modelo.addRow(object);
        }
        vista.jTable2.setModel(modelo);
    }
    public void agregar(){
        double codigo=Double.parseDouble(vista.txtTolvaRPM.getText());
        double onf=Double.parseDouble(vista.txtTornilloRPM.getText());
        double cantidad1=Double.parseDouble(vista.txtPresion.getText());
        double cantidad2=Double.parseDouble(vista.txtAmperaje.getText());
        double cantidad3=Double.parseDouble(vista.txtVacio.getText());
        double cantidad4=Double.parseDouble(vista.txtRendimiento.getText());
        
        o.setTolvaRPM(codigo);
        o.setTornilloRPM(onf);
        o.setPresion(cantidad1);
        o.setAmperaje(cantidad2);
        o.setVacio(cantidad3);
        o.setRendimiento(cantidad4);
        
         int r=  dao.agregar(o);
         if(r==1){
             JOptionPane.showMessageDialog(vista,"El pedido se agregó correctamente");
         }else{
             JOptionPane.showMessageDialog(vista,"Error");
         }
    }
}
