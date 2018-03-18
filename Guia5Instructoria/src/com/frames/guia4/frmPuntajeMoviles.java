/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frames.guia4;

import com.frames.guia3.*;
import com.frames.login.frmMenuLogin;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author enrique
 */
public class frmPuntajeMoviles extends javax.swing.JFrame {

    DefaultComboBoxModel modelo=new DefaultComboBoxModel();
    public frmPuntajeMoviles() {
        initComponents();
        setLocationRelativeTo(null);
        llenandoCombobox();
        txtPrincipal.setEnabled(false);
        txtSecundaria.setEnabled(false);
        chkFlash.setEnabled(false);
    }
    
    public void llenandoCombobox(){
        String [] valores={"NEXUS", "PIXIE", "LENOVO", "HUAWEI", "SONY", "APPLE", "SAMSUNG", "ALCATEL", "LG", "OTRA"};
        
        
        for (String valor : valores) {
            modelo.addElement(valor);
        }
        
        cmbMarca.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        chkSecundaria = new javax.swing.JCheckBox();
        chkFlash = new javax.swing.JCheckBox();
        chkPrincipal = new javax.swing.JCheckBox();
        txtSecundaria = new javax.swing.JTextField();
        cmbMarca = new javax.swing.JComboBox<>();
        txtNucleos = new javax.swing.JTextField();
        txtPantalla = new javax.swing.JTextField();
        txtRam = new javax.swing.JTextField();
        txtGarantia = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtPrincipal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnEjecutar = new javax.swing.JButton();
        txtPuntaje = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cpu numero de nucleos:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel2.setText("Tamaño de pantalla:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel3.setText("Cantidad de RAM:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel4.setText("Tiempo de garantia:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel5.setText("Precio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel6.setText("Marca:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel7.setText("Camaras:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel12.setText("Puntaje Resultante:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));

        chkSecundaria.setText("Secundaria");
        chkSecundaria.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkSecundariaStateChanged(evt);
            }
        });
        getContentPane().add(chkSecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        chkFlash.setText("Flash");
        getContentPane().add(chkFlash, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        chkPrincipal.setText("Principal");
        chkPrincipal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkPrincipalStateChanged(evt);
            }
        });
        getContentPane().add(chkPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 80, -1));

        txtSecundaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSecundariaKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSecundariaKeyPressed(evt);
            }
        });
        getContentPane().add(txtSecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 80, -1));

        getContentPane().add(cmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 110, -1));

        txtNucleos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNucleosKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNucleosKeyPressed(evt);
            }
        });
        getContentPane().add(txtNucleos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 100, -1));

        txtPantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPantallaKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPantallaKeyPressed(evt);
            }
        });
        getContentPane().add(txtPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 100, -1));

        txtRam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRamKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRamKeyPressed(evt);
            }
        });
        getContentPane().add(txtRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 100, -1));

        txtGarantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGarantiaKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGarantiaKeyPressed(evt);
            }
        });
        getContentPane().add(txtGarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 100, -1));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioKeyPressed(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 100, -1));

        txtPrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrincipalKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrincipalKeyPressed(evt);
            }
        });
        getContentPane().add(txtPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 80, -1));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 490, 160));

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEjecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        txtPuntaje.setEditable(false);
        txtPuntaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuntajeActionPerformed(evt);
            }
        });
        txtPuntaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPuntajeKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPuntajeKeyPressed(evt);
            }
        });
        getContentPane().add(txtPuntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 80, -1));

        jLabel13.setText("Puntaje de Moviles");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/recursos/iconos/908-64.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtNucleosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNucleosKeyTyped
        int c=(int) evt.getKeyChar();
        if ((c >=48 && c<=57) || (c==8) || (c== (char)KeyEvent.VK_BACK_SPACE) || (c== (char)KeyEvent.VK_ENTER)) {
            int largo=txtNucleos.getText().length();
            if (largo>=0 && largo<=1 ) {
                
            }else{
                evt.consume();
            }
        }else{
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNucleosKeyTyped

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        if (!txtNucleos.getText().isEmpty() && !txtPantalla.getText().isEmpty() && !txtGarantia.getText().isEmpty() && !txtRam.getText().isEmpty() && !txtPrecio.getText().isEmpty()) {
            int nucleos=Integer.parseInt(txtNucleos.getText());
            double pantalla=Double.parseDouble(txtPantalla.getText());
            double garantia=Double.parseDouble(txtGarantia.getText());
            double ram=Double.parseDouble(txtRam.getText());
            double precio=Double.parseDouble(txtPrecio.getText());
            String cadena="";
            Smartphone fon=new Smartphone();
            double puntaje=0;
            String marca=cmbMarca.getSelectedItem().toString();
            
            if (chkPrincipal.isSelected() && chkFlash.isSelected()) {
                double principal=Double.parseDouble(txtPrincipal.getText());
                cadena="La cantidad de nucleos son: "+nucleos+"\n"
                    +"El tamaño de la pantalla es: "+pantalla+"\n"
                    +"La garantia es de: "+garantia+"\n"
                    +"La memoria ram es de: "+ram+"\n"
                    +"La camara principal es de: "+principal+"\n"
                    +"Con flash "
                    +"El precio es de: "+precio;
                
                puntaje=fon.getCpu(nucleos)+fon.bateriaPantalla(pantalla, 2)+fon.getGarantia(garantia)+
                        fon.getRam(ram)+fon.pixelaje(principal,0)+fon.rangoPrecio(precio)+fon.referenciaMarca(marca);
                
                
            }
            if (chkSecundaria.isSelected() && chkFlash.isSelected()) {
                double secundaria=Double.parseDouble(txtSecundaria.getText());
                cadena="La cantidad de nucleos son: "+nucleos+"\n"
                    +"El tamaño de la pantalla es: "+pantalla+"\n"
                    +"La garantia es de: "+garantia+"\n"
                    +"La memoria ram es de: "+ram+"\n"
                    +"La camara secundaria es de: "+secundaria+"\n"
                    +"Con flash"+"\n"
                    +"El precio es de: "+precio;
                
                puntaje=fon.getCpu(nucleos)+fon.bateriaPantalla(pantalla, 2)+fon.getGarantia(garantia)+
                        fon.getRam(ram)+fon.pixelaje(0,secundaria)+fon.rangoPrecio(precio)+fon.referenciaMarca(marca);
                
            }
            if(chkPrincipal.isSelected() && chkSecundaria.isSelected() && chkFlash.isSelected()){
                double secundaria=Double.parseDouble(txtSecundaria.getText());
                double principal=Double.parseDouble(txtPrincipal.getText());
                cadena="La cantidad de nucleos son: "+nucleos+"\n"
                    +"El tamaño de la pantalla es: "+pantalla+"\n"
                    +"La garantia es de: "+garantia+"\n"
                    +"La memoria ram es de: "+ram+"\n"
                    +"La camara principal es de: "+principal+"\n"
                    +"La camara secundaria es de: "+secundaria+"\n"
                    +"Con memoria flash"+"\n"
                    +"El precio es de: "+precio;
                
                puntaje=fon.getCpu(nucleos)+fon.bateriaPantalla(pantalla, 2)+fon.getGarantia(garantia)+
                        fon.getRam(ram)+fon.pixelaje(principal,secundaria)+fon.rangoPrecio(precio)+fon.referenciaMarca(marca);
                
            }
            if(chkPrincipal.isSelected()){
           
                double principal=Double.parseDouble(txtPrincipal.getText());
                cadena="La cantidad de nucleos son: "+nucleos+"\n"
                    +"El tamaño de la pantalla es: "+pantalla+"\n"
                    +"La garantia es de: "+garantia+"\n"
                    +"La memoria ram es de: "+ram+"\n"
                    +"La camara principal es de: "+principal+"\n"
                    +"El precio es de: "+precio;
                
                puntaje=fon.getCpu(nucleos)+fon.bateriaPantalla(pantalla, 2)+fon.getGarantia(garantia)+
                        fon.getRam(ram)+fon.pixelaje(principal,0)+fon.rangoPrecio(precio)+fon.referenciaMarca(marca);
                
            }
            if(chkSecundaria.isSelected()){
                double secundaria=Double.parseDouble(txtSecundaria.getText());
                cadena="La cantidad de nucleos son: "+nucleos+"\n"
                    +"El tamaño de la pantalla es: "+pantalla+"\n"
                    +"La garantia es de: "+garantia+"\n"
                    +"La memoria ram es de: "+ram+"\n"
                    +"La camara secundaria es de: "+secundaria+"\n"
                    +"El precio es de: "+precio;
                
                puntaje=fon.getCpu(nucleos)+fon.bateriaPantalla(pantalla, 2)+fon.getGarantia(garantia)+
                        fon.getRam(ram)+fon.pixelaje(0,secundaria)+fon.rangoPrecio(precio)+fon.referenciaMarca(marca);
                
            }
            if(chkPrincipal.isSelected() && chkSecundaria.isSelected()){
                double secundaria=Double.parseDouble(txtSecundaria.getText());
                double principal=Double.parseDouble(txtPrincipal.getText());
                
                cadena="La cantidad de nucleos son: "+nucleos+"\n"
                    +"El tamaño de la pantalla es: "+pantalla+"\n"
                    +"La garantia es de: "+garantia+"\n"
                    +"La memoria ram es de: "+ram+"\n"
                    +"La camara principal es de: "+principal+"\n"
                    +"La camara secundaria es de: "+secundaria+"\n"
                    +"El precio es de: "+precio;
                
                puntaje=fon.getCpu(nucleos)+fon.bateriaPantalla(pantalla, 2)+fon.getGarantia(garantia)+
                        fon.getRam(ram)+fon.pixelaje(principal,secundaria)+fon.rangoPrecio(precio)+fon.referenciaMarca(marca);
                
            }
            if(!chkPrincipal.isSelected() && !chkSecundaria.isSelected() && !chkFlash.isSelected()){
                
                cadena="La cantidad de nucleos son: "+nucleos+"\n"
                    +"El tamaño de la pantalla es: "+pantalla+"\n"
                    +"La garantia es de: "+garantia+"\n"
                    +"La memoria ram es de: "+ram+"\n"
                    +"El precio es de: "+precio;
                puntaje=fon.getCpu(nucleos)+fon.bateriaPantalla(pantalla, 2)+fon.getGarantia(garantia)+
                        fon.getRam(ram)+fon.rangoPrecio(precio)+fon.referenciaMarca(marca);
                
            }
            
            txtPuntaje.setText(puntaje+"");
            txtArea.setText(cadena);
            
        }else{
            JOptionPane.showMessageDialog(null, "Rellene todo los campos por vafor");
        }
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void txtNucleosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNucleosKeyPressed
        char c=evt.getKeyChar();
        
        if (c==(char) KeyEvent.VK_ENTER) {
            
            if (!txtNucleos.getText().isEmpty()) {
                int valor=Integer.parseInt(txtNucleos.getText());
                if (valor>=1 && valor <=12) {
                    txtPantalla.requestFocus();
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Los nucleos van de 1 a 12");
                }
            }else{
                    JOptionPane.showMessageDialog(null, "Rellene el campo por favor");

            }
            
            
        }
    }//GEN-LAST:event_txtNucleosKeyPressed

    private void txtPantallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPantallaKeyTyped
        int c=(int) evt.getKeyChar();

        if ((c >=48 && c<=57)  || (c==46) || (c==8) || (c== (char)KeyEvent.VK_BACK_SPACE) || (c== (char)KeyEvent.VK_ENTER)) {
            if (c==46) {
                String cadena=txtPantalla.getText();
                int tamanio=cadena.length();
                
                if (tamanio>=0 && tamanio <=2) {
                    for (int i = 0; i <= tamanio; i++) {
                    if (cadena.contains(".")) {
                        evt.setKeyChar((char) KeyEvent.VK_CLEAR);
                        getToolkit().beep();
                        evt.consume();
                    }
                  }
                }else{
                    evt.consume();
                }
                
            }
        }else{
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPantallaKeyTyped

    private void txtPantallaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPantallaKeyPressed
        char c=evt.getKeyChar();
        if (c==(char) KeyEvent.VK_ENTER) {
            
            if (!txtPantalla.getText().isEmpty()) {
                double valor=Double.parseDouble(txtPantalla.getText());
                if (valor>=3 && valor <=6.7) {
                    txtRam.requestFocus();
                    
                }else{
                    JOptionPane.showMessageDialog(null, "El tamaño de pantalla va de 3 a 6.7");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Rellene el campo por favor");
            }
            
            
        }
    }//GEN-LAST:event_txtPantallaKeyPressed

    private void txtRamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRamKeyTyped
        int c=(int) evt.getKeyChar();

        if ((c >=48 && c<=57)  || (c==46) || (c==8) || (c== (char)KeyEvent.VK_BACK_SPACE) || (c== (char)KeyEvent.VK_ENTER)) {
            if (c==46) {
                String cadena=txtRam.getText();
                int tamanio=cadena.length();
                
                if (tamanio>=0 && tamanio <=2) {
                    for (int i = 0; i <= tamanio; i++) {
                    if (cadena.contains(".")) {
                        evt.setKeyChar((char) KeyEvent.VK_CLEAR);
                        getToolkit().beep();
                        evt.consume();
                    }
                  }
                }else{
                    evt.consume();
                }
                
            }
        }else{
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtRamKeyTyped

    private void txtRamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRamKeyPressed
        char c=evt.getKeyChar();
        if (c==(char) KeyEvent.VK_ENTER) {
            
            if (!txtRam.getText().isEmpty()) {
                double valor=Double.parseDouble(txtRam.getText());
                if (valor>=0.5 && valor <=6) {
                    txtGarantia.requestFocus();
                    
                }else{
                    JOptionPane.showMessageDialog(null, "La ram va de 0.5 a 6");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Rellene el campo por favor");
            }
            
            
        }
    }//GEN-LAST:event_txtRamKeyPressed

    private void txtGarantiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGarantiaKeyTyped
        int c=(int) evt.getKeyChar();
        if ((c >=48 && c<=57) || (c==8) || (c== (char)KeyEvent.VK_BACK_SPACE) || (c== (char)KeyEvent.VK_ENTER)) {
            int largo=txtNucleos.getText().length();
            if (largo>=0 && largo<=1 ) {
                
            }else{
                evt.consume();
            }
        }else{
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtGarantiaKeyTyped

    private void txtGarantiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGarantiaKeyPressed
        char c=evt.getKeyChar();
        
        if (c==(char) KeyEvent.VK_ENTER) {
            
            if (!txtGarantia.getText().isEmpty()) {
                int valor=Integer.parseInt(txtGarantia.getText());
                if (valor>=1 && valor <=24) {
                    txtPrecio.requestFocus();
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Los nucleos van de 1 a 24");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Rellene el campo");
            }
            
            
        }
    }//GEN-LAST:event_txtGarantiaKeyPressed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        int c=(int) evt.getKeyChar();

        if ((c >=48 && c<=57)  || (c==46) || (c==8) || (c== (char)KeyEvent.VK_BACK_SPACE) || (c== (char)KeyEvent.VK_ENTER)) {
            if (c==46) {
                String cadena=txtPrecio.getText();
                int tamanio=cadena.length();
                
                if (tamanio>=0 && tamanio <=5) {
                    for (int i = 0; i <= tamanio; i++) {
                    if (cadena.contains(".")) {
                        evt.setKeyChar((char) KeyEvent.VK_CLEAR);
                        getToolkit().beep();
                        evt.consume();
                    }
                  }
                }else{
                    evt.consume();
                }
                
            }
        }else{
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyPressed
        char c=evt.getKeyChar();
        if (c==(char) KeyEvent.VK_ENTER) {
            
            if (!txtPrecio.getText().isEmpty()) {
                double valor=Double.parseDouble(txtPrecio.getText());
                if (valor>=0.01 && valor <=999.99) {
                   
                    
                }else{
                    JOptionPane.showMessageDialog(null, "El precio va de 0.01 a 999.99");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Rellene el campo por favor");
            }
            
            
        }
    }//GEN-LAST:event_txtPrecioKeyPressed

    private void chkPrincipalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkPrincipalStateChanged
        if (chkPrincipal.isSelected()) {
            txtPrincipal.setEnabled(true);
            txtPrincipal.requestFocus();
            chkFlash.setEnabled(true);
            
        }else{
            txtPrincipal.setEnabled(false);
            txtPrincipal.setText("");
            if (!chkSecundaria.isSelected()) {
                chkFlash.setEnabled(false);
            }
            
        }
    }//GEN-LAST:event_chkPrincipalStateChanged

    private void chkSecundariaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkSecundariaStateChanged
        if (chkSecundaria.isSelected()) {
            txtSecundaria.setEnabled(true);
            txtSecundaria.requestFocus();
            chkFlash.setEnabled(true);
        }else{
            txtSecundaria.setEnabled(false);
            txtSecundaria.setText("");
            if (!chkPrincipal.isSelected()) {
                chkFlash.setEnabled(false);
            }
            
        }
    }//GEN-LAST:event_chkSecundariaStateChanged

    private void txtPrincipalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrincipalKeyPressed
        char c=evt.getKeyChar();
        if (c==(char) KeyEvent.VK_ENTER) {
            
            if (!txtPrincipal.getText().isEmpty()) {
                double valor=Double.parseDouble(txtPrecio.getText());
                if (valor>=0.01 && valor <=999.99) {
                   
                    
                }else{
                    JOptionPane.showMessageDialog(null, "El precio va de 0.01 a 999.99");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Rellene el campo por favor");
            }
            
            
        }
    }//GEN-LAST:event_txtPrincipalKeyPressed

    private void txtPrincipalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrincipalKeyTyped
        int c=(int) evt.getKeyChar();

        if ((c >=48 && c<=57)  || (c==46) || (c==8) || (c== (char)KeyEvent.VK_BACK_SPACE) || (c== (char)KeyEvent.VK_ENTER)) {
            if (c==46) {
                String cadena=txtPrincipal.getText();
                int tamanio=cadena.length();
                
                if (tamanio>=0 && tamanio <=3) {
                    for (int i = 0; i <= tamanio; i++) {
                    if (cadena.contains(".")) {
                        evt.setKeyChar((char) KeyEvent.VK_CLEAR);
                        getToolkit().beep();
                        evt.consume();
                    }
                  }
                }else{
                    evt.consume();
                }
                
            }
        }else{
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPrincipalKeyTyped

    private void txtSecundariaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecundariaKeyPressed
        char c=evt.getKeyChar();
        if (c==(char) KeyEvent.VK_ENTER) {
            
            if (!txtSecundaria.getText().isEmpty()) {
                double valor=Double.parseDouble(txtPrecio.getText());
                if (valor>=0.01 && valor <=999.99) {
                   
                    
                }else{
                    JOptionPane.showMessageDialog(null, "El precio va de 0.01 a 999.99");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Rellene el campo por favor");
            }
            
            
        }
    }//GEN-LAST:event_txtSecundariaKeyPressed

    private void txtSecundariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecundariaKeyTyped
        int c=(int) evt.getKeyChar();

        if ((c >=48 && c<=57)  || (c==46) || (c==8) || (c== (char)KeyEvent.VK_BACK_SPACE) || (c== (char)KeyEvent.VK_ENTER)) {
            if (c==46) {
                String cadena=txtSecundaria.getText();
                int tamanio=cadena.length();
                
                if (tamanio>=0 && tamanio <=3) {
                    for (int i = 0; i <= tamanio; i++) {
                    if (cadena.contains(".")) {
                        evt.setKeyChar((char) KeyEvent.VK_CLEAR);
                        getToolkit().beep();
                        evt.consume();
                    }
                  }
                }else{
                    evt.consume();
                }
                
            }
        }else{
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtSecundariaKeyTyped

    private void txtPuntajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPuntajeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuntajeKeyTyped

    private void txtPuntajeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPuntajeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuntajeKeyPressed

    private void txtPuntajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuntajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuntajeActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        frmMenuLogin menu=new frmMenuLogin();
        
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(frmPuntajeMoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPuntajeMoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPuntajeMoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPuntajeMoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPuntajeMoviles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JCheckBox chkFlash;
    private javax.swing.JCheckBox chkPrincipal;
    private javax.swing.JCheckBox chkSecundaria;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtGarantia;
    private javax.swing.JTextField txtNucleos;
    private javax.swing.JTextField txtPantalla;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrincipal;
    private javax.swing.JTextField txtPuntaje;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextField txtSecundaria;
    // End of variables declaration//GEN-END:variables
}
