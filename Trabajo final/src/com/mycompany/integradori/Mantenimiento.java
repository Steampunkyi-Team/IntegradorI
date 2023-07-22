package com.mycompany.integradori;

import Controlador.FormulaControlador;
import Modelo.condicionMant;
import Modelo.condicionMantDAO;
import Modelo.ordenDao;
import Modelo.zona;
import Modelo.zonaDao;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Mantenimiento extends javax.swing.JFrame {

    /**
     * Creates new form Mantenimiento2
     */
    condicionMantDAO dao = new condicionMantDAO();
    condicionMant o = new condicionMant();
    ordenDao dd = new ordenDao();
    zonaDao d=new zonaDao();
    zona a=new zona();
    DefaultTableModel modelo = new DefaultTableModel();
    private int idCondicionMant;
    private int idZona;
    
    public Mantenimiento() {
        initComponents();
        this.setLocationRelativeTo(null);
        listar();
        listar2();
        
             
        Thread hiloReloj = new Thread(() -> {
        while (true) {
            actualizarHoraYFecha();
            try {
                Thread.sleep(1000); // Actualizar cada segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
    hiloReloj.start();
        
    }
    
    
    void listar() {
        @SuppressWarnings("unchecked")
        List<condicionMant> lista = dao.listar();
        //List<? extends condicionMant> lista = new ArrayList<>(dao.listar());
        modelo = (DefaultTableModel) jTable2.getModel();
        Object[] ob = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdCondicionMant();
            ob[1] = lista.get(i).getTolvaRPM();
            ob[2] = lista.get(i).getTornilloRPM();
            ob[3] = lista.get(i).getPresion();
            ob[4] = lista.get(i).getAmperaje();
            ob[5] = lista.get(i).getVacio();
            ob[6] = lista.get(i).getRendimiento();
            modelo.addRow(ob);
        }
        jTable2.setModel(modelo);
    }
    void listar2() {
        @SuppressWarnings("unchecked")
        List<zona> lista = d.listar();
        //List<? extends condicionMant> lista = new ArrayList<>(dao.listar());
        modelo = (DefaultTableModel) jTable1.getModel();
        Object[] ob = new Object[13];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdzonas();
            ob[1] = lista.get(i).getZ1();
            ob[2] = lista.get(i).getZ2();
            ob[3] = lista.get(i).getZ3();
            ob[4] = lista.get(i).getZ4();
            ob[5] = lista.get(i).getZ5();
            ob[6] = lista.get(i).getZ6();
            ob[7] = lista.get(i).getZ7();
            ob[8] = lista.get(i).getZ8();
            ob[9] = lista.get(i).getZ9();
            ob[10] = lista.get(i).getZ10();
            ob[11] = lista.get(i).getZ11();
            ob[12] = lista.get(i).getZ12();
            modelo.addRow(ob);
        }
        jTable1.setModel(modelo);
    }
    void agregar(){
        double TolvaRPM=Double.parseDouble(txtTolvaRPM.getText());
        double TornilloRPM=Double.parseDouble(txtTornilloRPM.getText());
        double cantidad1=Double.parseDouble(txtPresion.getText());
        double cantidad2=Double.parseDouble(txtAmperaje.getText());
        double cantidad3=Double.parseDouble(txtVacio.getText());
        double cantidad4=Double.parseDouble(txtRendimiento.getText());
        
        o.setTolvaRPM(TolvaRPM);
        o.setTornilloRPM(TornilloRPM);
        o.setPresion(cantidad1);
        o.setAmperaje(cantidad2);
        o.setVacio(cantidad3);
        o.setRendimiento(cantidad4);
        
         int r =  dao.agregar(o);
         if(r==1){
            JOptionPane.showMessageDialog(this,"Los datos se agregaron correctamente");
            limpiarTabla2();
            listar();
         }else{
            JOptionPane.showMessageDialog(this,"Error");
         }
    }
    void agregar2(){
        double codigo=Double.parseDouble(z1.getText());
        double onf=Double.parseDouble(z2.getText());
        double cantidad1=Double.parseDouble(z3.getText());
        double cantidad2=Double.parseDouble(z4.getText());
        double cantidad3=Double.parseDouble(z5.getText());
        double cantidad4=Double.parseDouble(z6.getText());
        double cantidad5=Double.parseDouble(z7.getText());
        double cantidad6=Double.parseDouble(z8.getText());
        double cantidad7=Double.parseDouble(z9.getText());
        double cantidad8=Double.parseDouble(z10.getText());
        double cantidad9=Double.parseDouble(z11.getText());
        double cantidad10=Double.parseDouble(z12.getText());
        
        a.setZ1(codigo);
        a.setZ2(onf);
        a.setZ3(cantidad1);
        a.setZ4(cantidad2);
        a.setZ5(cantidad3);
        a.setZ6(cantidad4);
        a.setZ7(cantidad5);
        a.setZ8(cantidad6);
        a.setZ9(cantidad7);
        a.setZ10(cantidad8);
        a.setZ11(cantidad9);
        a.setZ12(cantidad10);
        
         int r=  d.agregar(a);
         if(r==1){
            JOptionPane.showMessageDialog(this,"El datos se agregaron correctamente");
            limpiarTabla1();
            listar2();
         }else{
            JOptionPane.showMessageDialog(this,"Error");
         }
    }
    void limpiar(){
        txtTolvaRPM.setText(null);
        txtTornilloRPM.setText(null);
        txtPresion.setText(null);
        txtVacio.setText(null);
        txtAmperaje.setText(null);
        txtRendimiento.setText(null);
    }
    void limpiar2(){
        z1.setText(null);
        z2.setText(null);
        z3.setText(null);
        z4.setText(null);
        z5.setText(null);
        z6.setText(null);
        z7.setText(null);
        z8.setText(null);
        z9.setText(null);
        z10.setText(null);
        z11.setText(null);
        z12.setText(null);   
    }
    
    void actualizar() {
        double TolvaRPM=Double.parseDouble(txtTolvaRPM.getText());
        double TornilloRPM=Double.parseDouble(txtTornilloRPM.getText());
        double cantidad1=Double.parseDouble(txtPresion.getText());
        double cantidad2=Double.parseDouble(txtAmperaje.getText());
        double cantidad3=Double.parseDouble(txtVacio.getText());
        double cantidad4=Double.parseDouble(txtRendimiento.getText());
        
        condicionMant ou = new condicionMant();
        ou.setIdCondicionMant(idCondicionMant);
        ou.setTolvaRPM(TolvaRPM);
        ou.setTornilloRPM(TornilloRPM);
        ou.setPresion(cantidad1);
        ou.setAmperaje(cantidad2);
        ou.setVacio(cantidad3);
        ou.setRendimiento(cantidad4);
        

        // Luego, llama al método para actualizar en la base de datos
        int r = dao.actualizar(ou);
        if (r == 1) {
            JOptionPane.showMessageDialog(this, "Los datos se actualizaron correctamente");
            limpiarTabla2();
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar los datos");
        }
    }
    
    void actualizar2() {
        double codigo1 = Double.parseDouble(z1.getText());
        double onf1 = Double.parseDouble(z2.getText());
        double cantidad1 = Double.parseDouble(z3.getText());
        double cantidad2 = Double.parseDouble(z4.getText());
        double cantidad3 = Double.parseDouble(z5.getText());
        double cantidad4 = Double.parseDouble(z6.getText());
        double cantidad5 = Double.parseDouble(z7.getText());
        double cantidad6 = Double.parseDouble(z8.getText());
        double cantidad7 = Double.parseDouble(z9.getText());
        double cantidad8 = Double.parseDouble(z10.getText());
        double cantidad9 = Double.parseDouble(z11.getText());
        double cantidad10 = Double.parseDouble(z12.getText());

        zona au = new zona();
        au.setIdzonas(idZona);
        au.setZ1(codigo1);
        au.setZ2(onf1);
        au.setZ3(cantidad1);
        au.setZ4(cantidad2);
        au.setZ5(cantidad3);
        au.setZ6(cantidad4);
        au.setZ7(cantidad5);
        au.setZ8(cantidad6);
        au.setZ9(cantidad7);
        au.setZ10(cantidad8);
        au.setZ11(cantidad9);
        au.setZ12(cantidad10);

        int r = d.actualizar(au);
        if (r == 1) {
            JOptionPane.showMessageDialog(this, "Los datos se actualizaron correctamente");
            limpiarTabla1();
            listar2();
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar los datos");
        }
    }

    
    public void limpiarTabla1() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    public void limpiarTabla2() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }
 
    private void actualizarHoraYFecha() {
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date horaActual = new Date();
        lblHora.setText(formatoHora.format(horaActual));
        lblFecha.setText(formatoFecha.format(horaActual));
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        z12 = new javax.swing.JTextField();
        z11 = new javax.swing.JTextField();
        txtVacio = new javax.swing.JTextField();
        z7 = new javax.swing.JTextField();
        txtAmperaje = new javax.swing.JTextField();
        btncond3 = new javax.swing.JButton();
        btncond1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtRendimiento = new javax.swing.JTextField();
        btncond4 = new javax.swing.JButton();
        btncond5 = new javax.swing.JButton();
        btncond = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField20 = new javax.swing.JTextField();
        z10 = new javax.swing.JTextField();
        z9 = new javax.swing.JTextField();
        z8 = new javax.swing.JTextField();
        z6 = new javax.swing.JTextField();
        z5 = new javax.swing.JTextField();
        z4 = new javax.swing.JTextField();
        z3 = new javax.swing.JTextField();
        z2 = new javax.swing.JTextField();
        z1 = new javax.swing.JTextField();
        txtTolvaRPM = new javax.swing.JTextField();
        txtTornilloRPM = new javax.swing.JTextField();
        txtPresion = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btncond6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(37, 32, 47));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(37, 32, 47));
        jPanel4.setPreferredSize(new java.awt.Dimension(226, 45));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
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
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 113, -1, 37));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(187, 184, 193));
        jLabel4.setText("Registro");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(187, 184, 193));
        jLabel8.setText("Fórmula");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jPanel9.setBackground(new java.awt.Color(47, 44, 57));
        jPanel9.setPreferredSize(new java.awt.Dimension(226, 45));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(193, 117, 121));
        jLabel5.setText("Mantenimiento");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(187, 184, 193));
        jLabel10.setText("Atrás");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 600, -1, -1));

        jPanel2.setBackground(new java.awt.Color(26, 22, 31));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(187, 184, 193));
        jLabel11.setText("Temperatura en Zonas");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        lblHora.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 150, 40));

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(187, 184, 193));
        jPanel2.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 140, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(134, 83, 140));
        jLabel14.setText("Mantenimiento");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(187, 184, 193));
        jLabel15.setText("Producto");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(187, 184, 193));
        jLabel17.setText("Nº OP");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(187, 184, 193));
        jLabel18.setText("Rendimiento");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 230, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(187, 184, 193));
        jLabel19.setText("Responsable");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(187, 184, 193));
        jLabel22.setText("Tolva RPM");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(187, 184, 193));
        jLabel23.setText("Tornillo RPM");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 230, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(187, 184, 193));
        jLabel21.setText("Presión");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 230, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(187, 184, 193));
        jLabel24.setText("Amperaje");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 230, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(187, 184, 193));
        jLabel25.setText("Vacío");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 230, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(187, 184, 193));
        jLabel26.setText("Condiciones de Operación");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(187, 184, 193));
        jLabel27.setText("Z6");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 410, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(187, 184, 193));
        jLabel29.setText("Z1");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 410, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(187, 184, 193));
        jLabel30.setText("Z2");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 410, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(187, 184, 193));
        jLabel31.setText("Z3");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 410, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(187, 184, 193));
        jLabel32.setText("Z4");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 410, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(187, 184, 193));
        jLabel33.setText("Z5");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 410, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(187, 184, 193));
        jLabel34.setText("Z12");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, -1, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(187, 184, 193));
        jLabel35.setText("Z7");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 410, -1, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(187, 184, 193));
        jLabel36.setText("Z8");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(187, 184, 193));
        jLabel37.setText("Z9");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 410, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(187, 184, 193));
        jLabel38.setText("Z10");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, -1, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(187, 184, 193));
        jLabel39.setText("Z11");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, -1, -1));

        z12.setBackground(new java.awt.Color(47, 44, 57));
        z12.setForeground(new java.awt.Color(204, 204, 204));
        z12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z12.setBorder(null);
        jPanel2.add(z12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, 50, 30));

        z11.setBackground(new java.awt.Color(47, 44, 57));
        z11.setForeground(new java.awt.Color(204, 204, 204));
        z11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z11.setBorder(null);
        z11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z11ActionPerformed(evt);
            }
        });
        jPanel2.add(z11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 50, 30));

        txtVacio.setBackground(new java.awt.Color(47, 44, 57));
        txtVacio.setForeground(new java.awt.Color(204, 204, 204));
        txtVacio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVacio.setBorder(null);
        txtVacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVacioActionPerformed(evt);
            }
        });
        jPanel2.add(txtVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 90, 30));

        z7.setBackground(new java.awt.Color(47, 44, 57));
        z7.setForeground(new java.awt.Color(204, 204, 204));
        z7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z7.setBorder(null);
        jPanel2.add(z7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 50, 30));

        txtAmperaje.setBackground(new java.awt.Color(47, 44, 57));
        txtAmperaje.setForeground(new java.awt.Color(204, 204, 204));
        txtAmperaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmperaje.setBorder(null);
        jPanel2.add(txtAmperaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 90, 30));

        btncond3.setBackground(new java.awt.Color(153, 153, 153));
        btncond3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncond3.setForeground(new java.awt.Color(51, 51, 51));
        btncond3.setText("Buscar");
        btncond3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncond3ActionPerformed(evt);
            }
        });
        jPanel2.add(btncond3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 100, 30));

        btncond1.setBackground(new java.awt.Color(153, 153, 153));
        btncond1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncond1.setForeground(new java.awt.Color(51, 51, 51));
        btncond1.setText("Actualizar");
        btncond1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncond1ActionPerformed(evt);
            }
        });
        jPanel2.add(btncond1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 100, 40));

        jTable2.setBackground(new java.awt.Color(153, 153, 153));
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tolva RPM", "Tornillo RPM", "Presion", "Amperaje", "Vacio", "Rendimiento"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 710, 60));

        txtRendimiento.setBackground(new java.awt.Color(47, 44, 57));
        txtRendimiento.setForeground(new java.awt.Color(204, 204, 204));
        txtRendimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRendimiento.setBorder(null);
        jPanel2.add(txtRendimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 90, 30));

        btncond4.setBackground(new java.awt.Color(153, 153, 153));
        btncond4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncond4.setForeground(new java.awt.Color(51, 51, 51));
        btncond4.setText("Agregar");
        btncond4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncond4ActionPerformed(evt);
            }
        });
        jPanel2.add(btncond4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 100, 40));

        btncond5.setBackground(new java.awt.Color(153, 153, 153));
        btncond5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncond5.setForeground(new java.awt.Color(51, 51, 51));
        btncond5.setText("Actualizar");
        btncond5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncond5ActionPerformed(evt);
            }
        });
        jPanel2.add(btncond5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, 100, 40));

        btncond.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btncond.setText("Reporte");
        btncond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncondActionPerformed(evt);
            }
        });
        jPanel2.add(btncond, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 590, 120, 40));

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Z1", "Z2", "Z3", "Z4", "Z5", "Z6", "Z7", "Z8", "Z9", "Z10", "Z11", "Z12"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 710, 60));

        jTextField20.setBackground(new java.awt.Color(47, 44, 57));
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setBorder(null);
        jPanel2.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, 50, 30));

        z10.setBackground(new java.awt.Color(47, 44, 57));
        z10.setForeground(new java.awt.Color(204, 204, 204));
        z10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z10.setBorder(null);
        jPanel2.add(z10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 50, 30));

        z9.setBackground(new java.awt.Color(47, 44, 57));
        z9.setForeground(new java.awt.Color(204, 204, 204));
        z9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z9.setBorder(null);
        jPanel2.add(z9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 50, 30));

        z8.setBackground(new java.awt.Color(47, 44, 57));
        z8.setForeground(new java.awt.Color(204, 204, 204));
        z8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z8.setBorder(null);
        z8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z8ActionPerformed(evt);
            }
        });
        jPanel2.add(z8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 50, 30));

        z6.setBackground(new java.awt.Color(47, 44, 57));
        z6.setForeground(new java.awt.Color(204, 204, 204));
        z6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z6.setBorder(null);
        jPanel2.add(z6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 50, 30));

        z5.setBackground(new java.awt.Color(47, 44, 57));
        z5.setForeground(new java.awt.Color(204, 204, 204));
        z5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z5.setBorder(null);
        z5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z5ActionPerformed(evt);
            }
        });
        jPanel2.add(z5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 50, 30));

        z4.setBackground(new java.awt.Color(47, 44, 57));
        z4.setForeground(new java.awt.Color(204, 204, 204));
        z4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z4.setBorder(null);
        jPanel2.add(z4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 50, 30));

        z3.setBackground(new java.awt.Color(47, 44, 57));
        z3.setForeground(new java.awt.Color(204, 204, 204));
        z3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z3.setBorder(null);
        jPanel2.add(z3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 50, 30));

        z2.setBackground(new java.awt.Color(47, 44, 57));
        z2.setForeground(new java.awt.Color(204, 204, 204));
        z2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z2.setBorder(null);
        z2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z2ActionPerformed(evt);
            }
        });
        jPanel2.add(z2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 50, 30));

        z1.setBackground(new java.awt.Color(47, 44, 57));
        z1.setForeground(new java.awt.Color(204, 204, 204));
        z1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z1.setBorder(null);
        jPanel2.add(z1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 50, 30));

        txtTolvaRPM.setBackground(new java.awt.Color(47, 44, 57));
        txtTolvaRPM.setForeground(new java.awt.Color(204, 204, 204));
        txtTolvaRPM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTolvaRPM.setBorder(null);
        txtTolvaRPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTolvaRPMActionPerformed(evt);
            }
        });
        jPanel2.add(txtTolvaRPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 90, 30));

        txtTornilloRPM.setBackground(new java.awt.Color(47, 44, 57));
        txtTornilloRPM.setForeground(new java.awt.Color(204, 204, 204));
        txtTornilloRPM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTornilloRPM.setBorder(null);
        txtTornilloRPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTornilloRPMActionPerformed(evt);
            }
        });
        jPanel2.add(txtTornilloRPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 90, 30));

        txtPresion.setBackground(new java.awt.Color(47, 44, 57));
        txtPresion.setForeground(new java.awt.Color(204, 204, 204));
        txtPresion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPresion.setBorder(null);
        jPanel2.add(txtPresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 90, 30));

        jComboBox1.setBackground(new java.awt.Color(47, 44, 57));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Juan Perez", "Luis Ordoñez", "Mario Garrala", "Pedro Dominguez", "Miguel Juarez", "Daniel Valencia" }));
        jComboBox1.setToolTipText("");
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 142, 280, 30));

        txtNombre.setBackground(new java.awt.Color(47, 44, 57));
        txtNombre.setForeground(new java.awt.Color(187, 184, 193));
        txtNombre.setBorder(null);
        txtNombre.setFocusable(false);
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 280, 30));

        txtCodigo.setBackground(new java.awt.Color(47, 44, 57));
        txtCodigo.setForeground(new java.awt.Color(187, 184, 193));
        txtCodigo.setBorder(null);
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 280, 30));

        btncond6.setBackground(new java.awt.Color(153, 153, 153));
        btncond6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncond6.setForeground(new java.awt.Color(51, 51, 51));
        btncond6.setText("Agregar");
        btncond6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncond6ActionPerformed(evt);
            }
        });
        jPanel2.add(btncond6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        OrdenProduccion yy=new OrdenProduccion();
        yy.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Formulacion t=new Formulacion();
        FormulaControlador ctrl=new FormulaControlador(t);
        ctrl.iniciar();
        this.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Mantenimiento yy=new Mantenimiento();
        yy.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void z11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_z11ActionPerformed

    private void txtVacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVacioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVacioActionPerformed

    private void btncond3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncond3ActionPerformed
        int nof = Integer.parseInt(txtCodigo.getText());
        String nombreProducto = dd.obtenerNombrePorNof(nof);
        txtNombre.setText(nombreProducto);
    }//GEN-LAST:event_btncond3ActionPerformed

    private void btncond1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncond1ActionPerformed
        actualizar();
        limpiar();
    }//GEN-LAST:event_btncond1ActionPerformed

    private void btncond4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncond4ActionPerformed
        agregar2();
        limpiar2();
    }//GEN-LAST:event_btncond4ActionPerformed

    private void btncond5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncond5ActionPerformed
        actualizar2();
        limpiar2();
    }//GEN-LAST:event_btncond5ActionPerformed

    private void btncondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncondActionPerformed
       ReporteMant reporteMant = new ReporteMant();
        reporteMant.setVisible(true);
    }//GEN-LAST:event_btncondActionPerformed

    private void z8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_z8ActionPerformed

    private void z5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_z5ActionPerformed

    private void z2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_z2ActionPerformed

    private void txtTolvaRPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTolvaRPMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTolvaRPMActionPerformed

    private void txtTornilloRPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTornilloRPMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTornilloRPMActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int fila = jTable2.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");
        }else{
            idCondicionMant = Integer.parseInt(jTable2.getValueAt(fila, 0).toString());
            double TolvaRPM= (double)jTable2.getValueAt(fila, 1);
            double TornilloRPM=(double)jTable2.getValueAt(fila, 2);
            double cantidad1=(double)jTable2.getValueAt(fila, 3);
            double cantidad2=(double)jTable2.getValueAt(fila, 4);
            double cantidad3=(double)jTable2.getValueAt(fila, 5);
            double cantidad4=(double)jTable2.getValueAt(fila, 6);
            txtTolvaRPM.setText(String.valueOf(TolvaRPM));
            txtTornilloRPM.setText(String.valueOf(TornilloRPM));
            txtPresion.setText(String.valueOf(cantidad1));
            txtAmperaje.setText(String.valueOf(cantidad2));
            txtVacio.setText(String.valueOf(cantidad3));
            txtRendimiento.setText(String.valueOf(cantidad4));
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila = jTable1.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");
        }else{
            idZona = Integer.parseInt(jTable1.getValueAt(fila, 0).toString());
            double codigo= (double)jTable1.getValueAt(fila, 1);
            double onf=(double)jTable1.getValueAt(fila, 2);
            double cantidad1=(double)jTable1.getValueAt(fila, 3);
            double cantidad2=(double)jTable1.getValueAt(fila, 4);
            double cantidad3=(double)jTable1.getValueAt(fila, 5);
            double cantidad4=(double)jTable1.getValueAt(fila, 6);
            double cantidad5=(double)jTable1.getValueAt(fila, 7);
            double cantidad6=(double)jTable1.getValueAt(fila, 8);
            double cantidad7=(double)jTable1.getValueAt(fila, 9);
            double cantidad8=(double)jTable1.getValueAt(fila, 10);
            double cantidad9=(double)jTable1.getValueAt(fila, 11);
            double cantidad10=(double)jTable1.getValueAt(fila, 12);
            z1.setText(String.valueOf(codigo));
            z2.setText(String.valueOf(onf));
            z3.setText(String.valueOf(cantidad1));
            z4.setText(String.valueOf(cantidad2));
            z5.setText(String.valueOf(cantidad3));
            z6.setText(String.valueOf(cantidad4));
            z7.setText(String.valueOf(cantidad5));
            z8.setText(String.valueOf(cantidad6));
            z9.setText(String.valueOf(cantidad7));
            z10.setText(String.valueOf(cantidad8));
            z11.setText(String.valueOf(cantidad9));
            z12.setText(String.valueOf(cantidad10));
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btncond6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncond6ActionPerformed
        agregar();
        limpiar();
    }//GEN-LAST:event_btncond6ActionPerformed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
       PantallaInicio t=new PantallaInicio();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       PantallaInicio t=new PantallaInicio();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        PantallaInicio r=new PantallaInicio();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mantenimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btncond;
    public javax.swing.JButton btncond1;
    public javax.swing.JButton btncond3;
    public javax.swing.JButton btncond4;
    public javax.swing.JButton btncond5;
    public javax.swing.JButton btncond6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel30;
    public javax.swing.JLabel jLabel31;
    public javax.swing.JLabel jLabel32;
    public javax.swing.JLabel jLabel33;
    public javax.swing.JLabel jLabel34;
    public javax.swing.JLabel jLabel35;
    public javax.swing.JLabel jLabel36;
    public javax.swing.JLabel jLabel37;
    public javax.swing.JLabel jLabel38;
    public javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    public javax.swing.JTable jTable2;
    public javax.swing.JTextField jTextField20;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblHora;
    public javax.swing.JTextField txtAmperaje;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPresion;
    public javax.swing.JTextField txtRendimiento;
    public javax.swing.JTextField txtTolvaRPM;
    public javax.swing.JTextField txtTornilloRPM;
    public javax.swing.JTextField txtVacio;
    public javax.swing.JTextField z1;
    public javax.swing.JTextField z10;
    public javax.swing.JTextField z11;
    public javax.swing.JTextField z12;
    public javax.swing.JTextField z2;
    public javax.swing.JTextField z3;
    public javax.swing.JTextField z4;
    public javax.swing.JTextField z5;
    public javax.swing.JTextField z6;
    public javax.swing.JTextField z7;
    public javax.swing.JTextField z8;
    public javax.swing.JTextField z9;
    // End of variables declaration//GEN-END:variables
}
