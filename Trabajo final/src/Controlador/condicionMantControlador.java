package Controlador;

import Modelo.condicionMant;
import Modelo.condicionMantDAO;
import com.mycompany.integradori.Mantenimiento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class condicionMantControlador implements ActionListener{

    condicionMantDAO dao = new condicionMantDAO();
    condicionMant cm = new condicionMant();
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
}
