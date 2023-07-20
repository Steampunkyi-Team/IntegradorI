/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.integradori;

import Controlador.OrdenControlador;
import Modelo.conexion;
import Modelo.orden;
import Modelo.ordenDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Steampunkyi
 */
public class OrdenProduccion extends javax.swing.JFrame {

    /**
     * Creates new form Formulacion
     */
    orden o=new orden();
    ordenDao dao=new ordenDao();
    public OrdenProduccion() {
        initComponents();
        mostrar2("formula");
        mostrar("orden");
    }
    public void mostrar(String tabla){
        String sql="select*from "+tabla;
        Statement st;
        conexion con=new conexion();
        Connection conexion=con.getConnection();
        System.out.println(sql);
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("idFormula");
        model.addColumn("NOF");
        model.addColumn("cantidad");
        model.addColumn("PesoITotal");
        model.addColumn("PesoITotal");
        model.addColumn("PesoITotal");
        model.addColumn("PesoITotal");
        model.addColumn("PesoITotal");
        tbl2.setModel(model);
        String [] datos=new String[9];
        try{
            st =conexion.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(9);
                datos[4]=rs.getString(4);
                datos[5]=rs.getString(5);
                datos[6]=rs.getString(6);
                datos[7]=rs.getString(7);
                datos[8]=rs.getString(8);
                model.addRow(datos);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error"+e.toString());
        }
    }
    public void mostrar2(String tabla){
        String sql="select*from "+tabla;
        Statement st;
        conexion con=new conexion();
        Connection conexion=con.getConnection();
        System.out.println(sql);
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("idFormula");
        model.addColumn("codigo");
        model.addColumn("producto");
        model.addColumn("insumo");
        model.addColumn("cantidad");
        model.addColumn("insumo");
        model.addColumn("cantidad");
        model.addColumn("insumo");
        model.addColumn("cantidad");
        model.addColumn("insumo");
        model.addColumn("cantidad");
        model.addColumn("insumo");
        model.addColumn("cantidad");
        tbl.setModel(model);
        String [] datos=new String[13];
        try{
            st =conexion.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                datos[9]=rs.getString(10);
                datos[10]=rs.getString(11);
                datos[11]=rs.getString(12);
                datos[12]=rs.getString(13);
                model.addRow(datos);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error"+e.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cantidad = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        insumo5txt = new javax.swing.JTextField();
        insumo1txt = new javax.swing.JTextField();
        insumo2txt = new javax.swing.JTextField();
        insumo3txt = new javax.swing.JTextField();
        insumo4txt = new javax.swing.JTextField();
        cantidad5txt = new javax.swing.JTextField();
        cantidad4txt = new javax.swing.JTextField();
        cantidad3txt = new javax.swing.JTextField();
        cantidad2txt = new javax.swing.JTextField();
        cantidad1txt = new javax.swing.JTextField();
        total5txt = new javax.swing.JTextField();
        total4txt = new javax.swing.JTextField();
        total3txt = new javax.swing.JTextField();
        total2txt = new javax.swing.JTextField();
        total1txt = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        idtxt = new javax.swing.JTextField();
        productotxt = new javax.swing.JTextField();
        codigotxt = new javax.swing.JTextField();
        consultarbtn = new javax.swing.JButton();
        calcularbtn = new javax.swing.JButton();
        noftxt = new javax.swing.JTextField();
        guardarbtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(37, 32, 47));
        jPanel1.setPreferredSize(new java.awt.Dimension(240, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagen/Recurso 1 (Custom) (Custom).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 22, -1, -1));

        jPanel4.setBackground(new java.awt.Color(37, 32, 47));
        jPanel4.setPreferredSize(new java.awt.Dimension(226, 45));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(187, 184, 193));
        jLabel3.setText("Inicio");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        jPanel10.setBackground(new java.awt.Color(37, 32, 47));
        jPanel10.setForeground(new java.awt.Color(187, 184, 193));
        jPanel10.setPreferredSize(new java.awt.Dimension(226, 45));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(187, 184, 193));
        jLabel16.setText("Mantenimiento");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel16)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));

        jPanel7.setBackground(new java.awt.Color(37, 32, 47));
        jPanel7.setPreferredSize(new java.awt.Dimension(226, 45));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(187, 184, 193));
        jLabel8.setText("Fórmula");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel8)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        jPanel8.setBackground(new java.awt.Color(47, 44, 57));
        jPanel8.setPreferredSize(new java.awt.Dimension(226, 45));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(193, 117, 121));
        jLabel17.setText("Registro");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel17)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addContainerGap())
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        jPanel2.setBackground(new java.awt.Color(26, 22, 31));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(134, 83, 140));
        jLabel5.setText("Registro");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(187, 184, 193));
        jLabel6.setText("Nº OP");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(187, 184, 193));
        jLabel7.setText("Producto");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        cantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 104, 38));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(187, 184, 193));
        jLabel10.setText("Código");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 37));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("09:24 a.m.");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("08/07/2023");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, -1));

        insumo5txt.setBackground(new java.awt.Color(45, 43, 57));
        insumo5txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        insumo5txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        insumo5txt.setBorder(null);
        jPanel2.add(insumo5txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 150, 30));

        insumo1txt.setBackground(new java.awt.Color(45, 43, 57));
        insumo1txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        insumo1txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        insumo1txt.setBorder(null);
        jPanel2.add(insumo1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 150, 30));

        insumo2txt.setBackground(new java.awt.Color(45, 43, 57));
        insumo2txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        insumo2txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        insumo2txt.setBorder(null);
        jPanel2.add(insumo2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 150, 30));

        insumo3txt.setBackground(new java.awt.Color(45, 43, 57));
        insumo3txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        insumo3txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        insumo3txt.setBorder(null);
        jPanel2.add(insumo3txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 150, 30));

        insumo4txt.setBackground(new java.awt.Color(45, 43, 57));
        insumo4txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        insumo4txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        insumo4txt.setBorder(null);
        jPanel2.add(insumo4txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 150, 30));

        cantidad5txt.setBackground(new java.awt.Color(45, 43, 57));
        cantidad5txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cantidad5txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad5txt.setBorder(null);
        jPanel2.add(cantidad5txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 70, 30));

        cantidad4txt.setBackground(new java.awt.Color(45, 43, 57));
        cantidad4txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cantidad4txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad4txt.setBorder(null);
        jPanel2.add(cantidad4txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 70, 30));

        cantidad3txt.setBackground(new java.awt.Color(45, 43, 57));
        cantidad3txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cantidad3txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad3txt.setBorder(null);
        jPanel2.add(cantidad3txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 70, 30));

        cantidad2txt.setBackground(new java.awt.Color(45, 43, 57));
        cantidad2txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cantidad2txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad2txt.setBorder(null);
        jPanel2.add(cantidad2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 70, 30));

        cantidad1txt.setBackground(new java.awt.Color(45, 43, 57));
        cantidad1txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cantidad1txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad1txt.setBorder(null);
        jPanel2.add(cantidad1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 70, 30));

        total5txt.setBackground(new java.awt.Color(45, 43, 57));
        total5txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        total5txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total5txt.setBorder(null);
        jPanel2.add(total5txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 80, 30));

        total4txt.setBackground(new java.awt.Color(45, 43, 57));
        total4txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        total4txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total4txt.setBorder(null);
        jPanel2.add(total4txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 80, 30));

        total3txt.setBackground(new java.awt.Color(45, 43, 57));
        total3txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        total3txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total3txt.setBorder(null);
        jPanel2.add(total3txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 80, 30));

        total2txt.setBackground(new java.awt.Color(45, 43, 57));
        total2txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        total2txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total2txt.setBorder(null);
        jPanel2.add(total2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 80, 30));

        total1txt.setBackground(new java.awt.Color(45, 43, 57));
        total1txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        total1txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total1txt.setBorder(null);
        jPanel2.add(total1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 80, 30));

        tbl2.setBackground(new java.awt.Color(45, 43, 57));
        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tbl2);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 430, 208));

        tbl.setBackground(new java.awt.Color(45, 43, 57));
        tbl.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 430, 110));

        idtxt.setBackground(new java.awt.Color(45, 43, 57));
        idtxt.setBorder(null);
        jPanel2.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, 30));

        productotxt.setBackground(new java.awt.Color(45, 43, 57));
        productotxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productotxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productotxt.setBorder(null);
        productotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productotxtActionPerformed(evt);
            }
        });
        jPanel2.add(productotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 250, 32));

        codigotxt.setBackground(new java.awt.Color(45, 43, 57));
        codigotxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        codigotxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codigotxt.setBorder(null);
        jPanel2.add(codigotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 250, 32));

        consultarbtn.setBackground(new java.awt.Color(47, 44, 57));
        consultarbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        consultarbtn.setForeground(new java.awt.Color(255, 255, 255));
        consultarbtn.setText("LISTAR");
        consultarbtn.setBorder(null);
        consultarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(consultarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 100, 40));

        calcularbtn.setBackground(new java.awt.Color(47, 44, 57));
        calcularbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        calcularbtn.setForeground(new java.awt.Color(255, 255, 255));
        calcularbtn.setText("CALCULAR");
        calcularbtn.setBorder(null);
        calcularbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularbtnActionPerformed(evt);
            }
        });
        jPanel2.add(calcularbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 120, 40));

        noftxt.setBackground(new java.awt.Color(45, 43, 57));
        noftxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        noftxt.setBorder(null);
        jPanel2.add(noftxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 310, 32));

        guardarbtn.setBackground(new java.awt.Color(47, 44, 57));
        guardarbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        guardarbtn.setForeground(new java.awt.Color(255, 255, 255));
        guardarbtn.setText("FINALIZAR");
        guardarbtn.setBorder(null);
        guardarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(guardarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 570, 140, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(187, 184, 193));
        jLabel9.setText("Cantidad");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(187, 184, 193));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Insumos");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 150, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(187, 184, 193));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Total");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 80, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(187, 184, 193));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Kg");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 70, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 900, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarbtnActionPerformed
        if(evt.getSource()==consultarbtn){
           int fila=tbl.getSelectedRow();
           if(fila==-1){
               
               JOptionPane.showMessageDialog(idtxt, "Seleccione una fila");
           }else{
               int id=Integer.parseInt((String)tbl.getValueAt(fila, 0));
               int codigo=Integer.parseInt((String)tbl.getValueAt(fila, 1));
               String producto=(String)tbl.getValueAt(fila, 2);
               String insumo1=(String)tbl.getValueAt(fila, 3);
               String insumo2=(String)tbl.getValueAt(fila, 5);
               String insumo3=(String)tbl.getValueAt(fila, 7);
               String insumo4=(String)tbl.getValueAt(fila, 9);
               String insumo5=(String)tbl.getValueAt(fila, 11);
               double cantidad1=Double.parseDouble((String)tbl.getValueAt(fila, 4));
               double cantidad2=Double.parseDouble((String)tbl.getValueAt(fila, 6));
               double cantidad3=Double.parseDouble((String)tbl.getValueAt(fila, 8));
               double cantidad4=Double.parseDouble((String)tbl.getValueAt(fila, 10));
               double cantidad5=Double.parseDouble((String)tbl.getValueAt(fila, 12));
               idtxt.setText(""+id);
               codigotxt.setText(""+codigo);
               productotxt.setText(producto);
               insumo1txt.setText(insumo1);
               insumo2txt.setText(insumo2);
               insumo3txt.setText(insumo3);
               insumo4txt.setText(insumo4);
               insumo5txt.setText(insumo5);
               cantidad1txt.setText(""+cantidad1);
               cantidad2txt.setText(""+cantidad2);
               cantidad3txt.setText(""+cantidad3);
               cantidad4txt.setText(""+cantidad4);
               cantidad5txt.setText(""+cantidad5);
           }
       }
    }//GEN-LAST:event_consultarbtnActionPerformed

    private void calcularbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularbtnActionPerformed
            double a = 0;
            double b = 0;
            double c = 0;
            double ab = 0;
            double ac = 0;
            double r = Double.parseDouble(cantidad1txt.getText());
            double s = Double.parseDouble(cantidad2txt.getText());
            double rr = Double.parseDouble(cantidad3txt.getText());
            double ss = Double.parseDouble(cantidad4txt.getText());
            double dd = Double.parseDouble(cantidad5txt.getText());
            int d = Integer.parseInt(cantidad.getValue().toString());
            /*DecimalFormat df=new DecimalFormat("#0.00");*/
            a = r * d;
            b = s * d;
            c = rr * d;
            ab = ss * d;
            ac = dd * d;
            total1txt.setText("" + a/*df.format(a)*/);
            total2txt.setText("" + b/*df.format(b)*/);
            total3txt.setText("" +c/*df.format(c)*/);
            total4txt.setText("" +ab /*df.format(ab)*/);
            total5txt.setText("" + ac/*df.format(ac)*/);
    }//GEN-LAST:event_calcularbtnActionPerformed

    private void guardarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarbtnActionPerformed
        int codigo=Integer.parseInt(codigotxt.getText());
        int onf=Integer.parseInt(noftxt.getText());
        double cantidad1=Double.parseDouble(total1txt.getText());
        double cantidad2=Double.parseDouble(total2txt.getText());
        double cantidad3=Double.parseDouble(total3txt.getText());
        double cantidad4=Double.parseDouble(total4txt.getText());
        double cantidad5=Double.parseDouble(total5txt.getText());
        o.setIdFormula(codigo);
        o.setCantidad(Integer.parseInt(cantidad.getValue().toString()));
        o.setNof(onf);
        o.setReal1(cantidad1);
        o.setReal2(cantidad2);
        o.setReal3(cantidad3);
        o.setReal4(cantidad4);
        o.setReal5(cantidad5);
         int r=  dao.agregar(o);
         if(r==1){
             JOptionPane.showMessageDialog(idtxt,"El pedido se agregó correctamente");
             mostrar("orden");
         }else{
             JOptionPane.showMessageDialog(idtxt,"Error");
         }
         
    }//GEN-LAST:event_guardarbtnActionPerformed

    private void productotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productotxtActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        
    }//GEN-LAST:event_jLabel17MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(OrdenProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(OrdenProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(OrdenProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(OrdenProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdenProduccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton calcularbtn;
    public javax.swing.JSpinner cantidad;
    public javax.swing.JTextField cantidad1txt;
    public javax.swing.JTextField cantidad2txt;
    public javax.swing.JTextField cantidad3txt;
    public javax.swing.JTextField cantidad4txt;
    public javax.swing.JTextField cantidad5txt;
    public javax.swing.JTextField codigotxt;
    public javax.swing.JButton consultarbtn;
    public javax.swing.JButton guardarbtn;
    public javax.swing.JTextField idtxt;
    public javax.swing.JTextField insumo1txt;
    public javax.swing.JTextField insumo2txt;
    public javax.swing.JTextField insumo3txt;
    public javax.swing.JTextField insumo4txt;
    public javax.swing.JTextField insumo5txt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JTextField noftxt;
    public javax.swing.JTextField productotxt;
    public javax.swing.JTable tbl;
    public javax.swing.JTable tbl2;
    public javax.swing.JTextField total1txt;
    public javax.swing.JTextField total2txt;
    public javax.swing.JTextField total3txt;
    public javax.swing.JTextField total4txt;
    public javax.swing.JTextField total5txt;
    // End of variables declaration//GEN-END:variables
}
