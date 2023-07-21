/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.integradori;


import javax.swing.JOptionPane;

/**
 *
 * @author vcc036
 */
public class PantallaInicio extends javax.swing.JFrame {

    /**
     * Creates new form PantallaInicio
     */
    public PantallaInicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevaOP1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnNuevaOP = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnBuscarOP = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnMant = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();

        btnNuevaOP1.setBackground(new java.awt.Color(102, 0, 102));
        btnNuevaOP1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNuevaOP1.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaOP1.setText("Nueva OP");
        btnNuevaOP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevaOP1MouseClicked(evt);
            }
        });
        btnNuevaOP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaOP1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1150, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(37, 32, 47));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(193, 117, 121));
        jLabel3.setText("Inicio");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

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

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, 30));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagen/Recurso 1 (Custom).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(187, 184, 193));
        jLabel5.setText("Mantenimiento");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(187, 184, 193));
        jLabel10.setText("Atrás");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 660));

        jPanel2.setBackground(new java.awt.Color(26, 22, 31));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(134, 83, 140));
        jLabel14.setText("Inicio");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 30));

        jPanel3.setBackground(new java.awt.Color(31, 30, 36));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagen/nuevo.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, -1));

        btnNuevaOP.setBackground(new java.awt.Color(102, 0, 102));
        btnNuevaOP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNuevaOP.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaOP.setText("Nueva OP");
        btnNuevaOP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevaOPMouseClicked(evt);
            }
        });
        btnNuevaOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaOPActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevaOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 170, 180));

        jPanel4.setBackground(new java.awt.Color(31, 30, 36));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagen/edit.png"))); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btnBuscarOP.setBackground(new java.awt.Color(102, 0, 102));
        btnBuscarOP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarOP.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarOP.setText("Buscar OP");
        btnBuscarOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarOPActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuscarOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 180, 180));

        jPanel5.setBackground(new java.awt.Color(31, 30, 36));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagen/settings.png"))); // NOI18N
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btnMant.setBackground(new java.awt.Color(102, 0, 102));
        btnMant.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMant.setForeground(new java.awt.Color(255, 255, 255));
        btnMant.setText("Mantenimiento");
        btnMant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantActionPerformed(evt);
            }
        });
        jPanel5.add(btnMant, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 180, 180));

        jPanel6.setBackground(new java.awt.Color(31, 30, 36));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(187, 184, 193));
        jLabel15.setText("Nº de Orden");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("-------------------------------------------");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(187, 184, 193));
        jLabel17.setText("Producto Actual");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel18.setForeground(new java.awt.Color(187, 184, 193));
        jLabel18.setText("Aquí va el número de la orden de prod.");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel19.setForeground(new java.awt.Color(187, 184, 193));
        jLabel19.setText("Aquí va el nombre del producto");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 230, 370));

        jTable1.setBackground(new java.awt.Color(31, 30, 36));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 830, 140));

        jPanel7.setBackground(new java.awt.Color(31, 30, 36));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 570, 170));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 900, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        OrdenProduccion yy=new OrdenProduccion();
        yy.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Formulacion yy=new Formulacion();
        yy.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Mantenimiento yy=new Mantenimiento();
        yy.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
             
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btnMantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantActionPerformed
        JOptionPane.showMessageDialog(null, "Hola");
    }//GEN-LAST:event_btnMantActionPerformed

    private void btnBuscarOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarOPActionPerformed
        JOptionPane.showMessageDialog(null, "Hola");
    }//GEN-LAST:event_btnBuscarOPActionPerformed

    private void btnNuevaOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaOPActionPerformed
        JOptionPane.showMessageDialog(null, "Hola");
    }//GEN-LAST:event_btnNuevaOPActionPerformed

    private void btnNuevaOPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaOPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaOPMouseClicked

    private void btnNuevaOP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaOP1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaOP1MouseClicked

    private void btnNuevaOP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaOP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaOP1ActionPerformed
 
   
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
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarOP;
    private javax.swing.JButton btnMant;
    private javax.swing.JButton btnNuevaOP;
    private javax.swing.JButton btnNuevaOP1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
