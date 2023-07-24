/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.FormulacionDao;
import Modelo.formulacion;
import com.mycompany.integradori.Formulacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class FormulaControlador implements ActionListener {
    FormulacionDao dao=new FormulacionDao();
         formulacion f=new formulacion();
         Formulacion vista=new Formulacion();
         DefaultTableModel modelo=new DefaultTableModel();
         
    public FormulaControlador(Formulacion v){
        this.vista=v;
        this.vista.consultarbtn.addActionListener(this);
        this.vista.guardarbtn.addActionListener(this);
        this.vista.modificarbtn.addActionListener(this);
        this.vista.eliminarbtn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==vista.guardarbtn){
           agregar();
       }
       if(e.getSource()==vista.consultarbtn){
           int fila=vista.tbl.getSelectedRow();
           if(fila==-1){
               JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila");
           }else{
               int id=Integer.parseInt((String)vista.tbl.getValueAt(fila, 0));
               int codigo=Integer.parseInt((String)vista.tbl.getValueAt(fila, 1));
               String producto=(String)vista.tbl.getValueAt(fila, 2);
               String insumo1=(String)vista.tbl.getValueAt(fila, 3);
               String insumo2=(String)vista.tbl.getValueAt(fila, 5);
               String insumo3=(String)vista.tbl.getValueAt(fila, 7);
               String insumo4=(String)vista.tbl.getValueAt(fila, 9);
               String insumo5=(String)vista.tbl.getValueAt(fila, 11);
               double cantidad1=Double.parseDouble((String)vista.tbl.getValueAt(fila, 4));
               double cantidad2=Double.parseDouble((String)vista.tbl.getValueAt(fila, 6));
               double cantidad3=Double.parseDouble((String)vista.tbl.getValueAt(fila, 8));
               double cantidad4=Double.parseDouble((String)vista.tbl.getValueAt(fila, 10));
               double cantidad5=Double.parseDouble((String)vista.tbl.getValueAt(fila, 12));
               vista.idtxt.setText(""+id);
               vista.codigotxt.setText(""+codigo);
               vista.productotxt.setText(producto);
               vista.insumo1txt.setText(insumo1);
               vista.insumo2txt.setText(insumo2);
               vista.insumo3txt.setText(insumo3);
               vista.insumo4txt.setText(insumo4);
               vista.insumo5txt.setText(insumo5);
               vista.cantidad1txt.setText(""+cantidad1);
               vista.cantidad2txt.setText(""+cantidad2);
               vista.cantidad3txt.setText(""+cantidad3);
               vista.cantidad4txt.setText(""+cantidad4);
               vista.cantidad5txt.setText(""+cantidad5);
           }
       }
       if(e.getSource()==vista.modificarbtn){
           Actualizar();
           limpiar();
       }
       if(e.getSource()==vista.eliminarbtn){
           int fila=vista.tbl.getSelectedRow();
           
           if(fila==-1){
               JOptionPane.showMessageDialog(vista, "Seleccione una fila");
               
           }else{
                   int id=Integer.parseInt((String)vista.tbl.getValueAt(fila, 0).toString());
                   dao.eliminar(id);
                   JOptionPane.showMessageDialog(vista, "Se borro correctamente");
                   }
       }
    }
    public void agregar(){
        int codigo=Integer.parseInt(vista.codigotxt.getText());
        String producto=vista.productotxt.getText();
        String insumo1=vista.insumo1txt.getText();
        String insumo2=vista.insumo2txt.getText();
        String insumo3=vista.insumo3txt.getText();
        String insumo4=vista.insumo4txt.getText();
        String insumo5=vista.insumo5txt.getText();
        double cantidad1=Double.parseDouble(vista.cantidad1txt.getText());
        double cantidad2=Double.parseDouble(vista.cantidad2txt.getText());
        double cantidad3=Double.parseDouble(vista.cantidad3txt.getText());
        double cantidad4=Double.parseDouble(vista.cantidad4txt.getText());
        double cantidad5=Double.parseDouble(vista.cantidad5txt.getText());
        f.setCodigo(codigo);
        f.setProducto(producto);
        f.setInsumo1(insumo1);
        f.setInsumo2(insumo2);
        f.setInsumo3(insumo3);
        f.setInsumo4(insumo4);
        f.setInsumo5(insumo5);
        f.setCantidad1(cantidad1);
        f.setCantidad2(cantidad2);
        f.setCantidad3(cantidad3);
        f.setCantidad4(cantidad4);
        f.setCantidad5(cantidad5);
         int r=  dao.agregar(f);
         if(r==1){
             JOptionPane.showMessageDialog(vista,"La formula se agregó correctamente");
         }else{
             JOptionPane.showMessageDialog(vista,"Error");
         }
         limpiar();
    }
    public void Actualizar(){
        int id=Integer.parseInt(vista.idtxt.getText());
        int codigo=Integer.parseInt(vista.codigotxt.getText());
        String producto=vista.productotxt.getText();
        String insumo1=vista.insumo1txt.getText();
        String insumo2=vista.insumo2txt.getText();
        String insumo3=vista.insumo3txt.getText();
        String insumo4=vista.insumo4txt.getText();
        String insumo5=vista.insumo5txt.getText();
        double cantidad1=Double.parseDouble(vista.cantidad1txt.getText());
        double cantidad2=Double.parseDouble(vista.cantidad2txt.getText());
        double cantidad3=Double.parseDouble(vista.cantidad3txt.getText());
        double cantidad4=Double.parseDouble(vista.cantidad4txt.getText());
        double cantidad5=Double.parseDouble(vista.cantidad5txt.getText());
        f.setIdFormula(id);
        f.setCodigo(codigo);
        f.setProducto(producto);
        f.setInsumo1(insumo1);
        f.setInsumo2(insumo2);
        f.setInsumo3(insumo3);
        f.setInsumo4(insumo4);
        f.setInsumo5(insumo5);
        f.setCantidad1(cantidad1);
        f.setCantidad2(cantidad2);
        f.setCantidad3(cantidad3);
        f.setCantidad4(cantidad4);
        f.setCantidad5(cantidad5);
        int r=  dao.agregar(f);
         if(r==1){
             JOptionPane.showMessageDialog(vista,"La formula se modificó correctamente");
         }else{
             JOptionPane.showMessageDialog(vista,"Error");
         }
         limpiar();
    }
    public void listar(JTable tabla){
        modelo=(DefaultTableModel)tabla.getModel();
        List<formulacion>lista=dao.listar();
        Object[]object=new Object[12];
        for(int i=0;i<lista.size();i++){
            object[0]=lista.get(i).getIdFormula();
            object[1]=lista.get(i).getProducto();
            object[2]=lista.get(i).getCodigo();
            object[3]=lista.get(i).getInsumo1();
            object[4]=lista.get(i).getInsumo2();
            object[5]=lista.get(i).getInsumo3();
            object[6]=lista.get(i).getInsumo4();
            object[7]=lista.get(i).getInsumo5();
            object[8]=lista.get(i).getCantidad1();
            object[9]=lista.get(i).getCantidad2();
            object[10]=lista.get(i).getCantidad3();
            object[11]=lista.get(i).getCantidad4();
            object[12]=lista.get(i).getCantidad5();
            modelo.addRow(object);
        }
        vista.tbl.setModel(modelo);
    }
    public void limpiar(){
        vista.codigotxt.setText(null);
        vista.productotxt.setText(null);
        vista.insumo1txt.setText(null);
        vista.insumo2txt.setText(null);
        vista.insumo3txt.setText(null);
        vista.insumo4txt.setText(null);
        vista.insumo5txt.setText(null);
        vista.cantidad1txt.setText(null);
        vista.cantidad2txt.setText(null);
        vista.cantidad3txt.setText(null);
        vista.cantidad4txt.setText(null);
        vista.cantidad5txt.setText(null);
    }
    /*public void limpiarTabla(){
        for(int i=0;i<vista.tbl.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }*/
    
}
