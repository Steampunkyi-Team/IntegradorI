/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.orden;
import Modelo.ordenDao;
import com.mycompany.integradori.OrdenProduccion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class OrdenControlador implements ActionListener {
    orden o=new orden();
    ordenDao dao=new ordenDao();
    OrdenProduccion vista=new OrdenProduccion();
         DefaultTableModel modelo=new DefaultTableModel();

    
    public OrdenControlador(OrdenProduccion v){
        this.vista=v;
        this.vista.guardarbtn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==vista.guardarbtn){
           agregar();
       }
    }
    public void agregar(){
        int codigo=Integer.parseInt(vista.codigotxt.getText());
        int onf=Integer.parseInt(vista.noftxt.getText());
        
        double cantidad1=Double.parseDouble(vista.total1txt.getText());
        double cantidad2=Double.parseDouble(vista.total2txt.getText());
        double cantidad3=Double.parseDouble(vista.total3txt.getText());
        double cantidad4=Double.parseDouble(vista.total4txt.getText());
        double cantidad5=Double.parseDouble(vista.total5txt.getText());
        o.setIdFormula(codigo);
        
        o.setNof(onf);
        o.setReal1(cantidad1);
        o.setReal2(cantidad2);
        o.setReal3(cantidad3);
        o.setReal4(cantidad4);
        o.setReal5(cantidad5);
         int r=  dao.agregar(o);
         if(r==1){
             JOptionPane.showMessageDialog(vista,"El pedido se agregó correctamente");
         }else{
             JOptionPane.showMessageDialog(vista,"Error");
         }
         
    }
}

