/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frames.guia1;

import java.text.DecimalFormat;

/**
 *
 * @author enrique
 */
public class frmEjercicio3 extends javax.swing.JFrame {

    /**
     * Creates new form frmEjercicio3
     */
    DecimalFormat formato=new DecimalFormat("0.00");
    
    public frmEjercicio3() {
        initComponents();
        setLocationRelativeTo(null);
        rbtRadio.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgVolumen = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDiametro = new javax.swing.JTextField();
        txtVolumenDiametro = new javax.swing.JTextField();
        txtVolumenRadio = new javax.swing.JTextField();
        txtRadio = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        rbtRadio = new javax.swing.JRadioButton();
        rbtDiametro = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Radio:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        jLabel2.setText("Diametro:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        jLabel3.setText("Volumen con diametro:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, 20));

        jLabel4.setText("Volumen con radio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, 30));

        jLabel5.setText("Volumen de Circunferencia");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 20));
        getContentPane().add(txtDiametro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 140, -1));

        txtVolumenDiametro.setEditable(false);
        txtVolumenDiametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolumenDiametroActionPerformed(evt);
            }
        });
        getContentPane().add(txtVolumenDiametro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 140, -1));

        txtVolumenRadio.setEditable(false);
        getContentPane().add(txtVolumenRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 140, -1));
        getContentPane().add(txtRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 140, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        btgVolumen.add(rbtRadio);
        rbtRadio.setText("Radio");
        rbtRadio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtRadioStateChanged(evt);
            }
        });
        getContentPane().add(rbtRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        btgVolumen.add(rbtDiametro);
        rbtDiametro.setText("Diametro");
        rbtDiametro.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtDiametroStateChanged(evt);
            }
        });
        getContentPane().add(rbtDiametro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtVolumenDiametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolumenDiametroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolumenDiametroActionPerformed

    private void rbtRadioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtRadioStateChanged
        if (rbtRadio.isSelected()) {
            txtDiametro.setEnabled(false);
            txtDiametro.setText("");
            txtRadio.requestFocus();
       }
        else{
            txtDiametro.setEnabled(true);
        }
        
    }//GEN-LAST:event_rbtRadioStateChanged

    private void rbtDiametroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtDiametroStateChanged
        if (rbtDiametro.isSelected()) {
            txtRadio.setEnabled(false);
            txtRadio.setText("");
            txtDiametro.requestFocus();
        }
        else{
            txtRadio.setEnabled(true);
        }
    }//GEN-LAST:event_rbtDiametroStateChanged

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double resultador;
        double resultadod;
        
        
        if (rbtRadio.isSelected()==true) {
            double radio=Double.parseDouble(txtRadio.getText());
            double potencia=Math.pow(radio, 3);
            resultador=4*Math.PI;
           resultador=resultador/3;
           resultador=resultador*potencia;
           System.out.println(resultador);
        txtVolumenRadio.setText(formato.format(resultador)+""); 
        }
        if (rbtDiametro.isSelected()==true) {
            double diametro=Double.parseDouble(txtDiametro.getText());
            diametro=diametro/2;
            resultadod=4*Math.PI*Math.pow(diametro, 3);
            resultadod=resultadod/3;
        txtVolumenDiametro.setText(formato.format(resultadod)+"");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtVolumenDiametro.setText("");
       txtVolumenRadio.setText("");
       txtDiametro.setText("");
       txtRadio.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(frmEjercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEjercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEjercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEjercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEjercicio3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgVolumen;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton rbtDiametro;
    private javax.swing.JRadioButton rbtRadio;
    private javax.swing.JTextField txtDiametro;
    private javax.swing.JTextField txtRadio;
    private javax.swing.JTextField txtVolumenDiametro;
    private javax.swing.JTextField txtVolumenRadio;
    // End of variables declaration//GEN-END:variables
}