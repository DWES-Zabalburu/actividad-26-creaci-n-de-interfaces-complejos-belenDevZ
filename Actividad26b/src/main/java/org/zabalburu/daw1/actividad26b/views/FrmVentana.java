/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad26b.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author DAW1
 */
public class FrmVentana extends JFrame{
  private Dimension dmVentana = new Dimension(600, 550);
  
    
    
    private JLabel lblTitulo = new JLabel("Actualiza tu Perfil");
    private JLabel lblNombre = new JLabel("Nombre Completo");
    private JTextField txtNombre = new JTextField();
    private JLabel lblCorreo = new JLabel("Correo");
    private JTextField txtCorreo = new JTextField();
    private JLabel lblTelefono = new JLabel("Telefono");
    private JTextField txtTelefono = new JTextField();
    private JLabel lblDireccion = new JLabel("Dirección");
    private JTextField txtDireccion = new JTextField();
    private JLabel lblWeb = new JLabel("Sitio Web");
    private JTextField txtWeb = new JTextField();
    
    private JButton btnGuardar = new JButton("Guardar Cambios");
    private JButton btnCancelar = new JButton("Cancelar");

    
    
    private JPanel pnlDatos = new JPanel(new GridLayout(10,1,0,10));
    private JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    private final Color COLOR_FONDO = new Color(70, 105, 180);
    private final Color COLOR_TEXTO = new Color(255,255,255);
    private final Color COLOR_FONDODATOS = new Color(145,145,145,5);
    private final Font FUENTE = new Font("Calibri", Font.PLAIN,15);
    
    public FrmVentana(){
        this.setSize(dmVentana);
        
        this.setTitle("Mi Perfil");
        lblTitulo.setFont(new Font("Calibri",Font.BOLD,32));
        lblTitulo.setHorizontalAlignment(JLabel.LEFT);
        lblTitulo.setForeground(COLOR_TEXTO);
        lblTitulo.setOpaque(true);
        lblTitulo.setBackground(COLOR_FONDO);
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.add(lblTitulo, BorderLayout.NORTH);
        
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        pnlDatos.add(lblCorreo);
        pnlDatos.add(txtCorreo);
        pnlDatos.add(lblTelefono);
        pnlDatos.add(txtTelefono);
        pnlDatos.add(lblDireccion);
        pnlDatos.add(txtDireccion);
        pnlDatos.add(lblWeb);
        pnlDatos.add(txtWeb);
        pnlDatos.setBorder(BorderFactory.createEmptyBorder(0, 20, 10, 20));
        pnlDatos.setBackground(COLOR_FONDODATOS);
        
        for (int i = 0; i < pnlDatos.getComponentCount(); i++) {
            Component cmp = pnlDatos.getComponent(i);
            //if (i % 2 == 0){
            if (cmp instanceof JLabel) {
                cmp.setFont(FUENTE.deriveFont(Font.BOLD));
        } else {
            cmp.setFont(FUENTE);
            ((JTextField) cmp).setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(0, 102, 204)));
        }
    }
            
        
        
        
        this.add(pnlDatos, BorderLayout.CENTER);
        btnCancelar.setFont(FUENTE);
        btnGuardar.setFont(FUENTE);
        btnGuardar.setForeground(COLOR_TEXTO);
        btnGuardar.setBackground(COLOR_FONDO);
        btnGuardar.setToolTipText("Guardar Cambios");
        btnGuardar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCancelar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCancelar.setEnabled(false);


        pnlBotones.add(btnCancelar);
        pnlBotones.add(btnGuardar);
        btnGuardar.setMnemonic('E');

        //pnlBotones.setBackground(COLOR_FONDO.darker().darker());
        pnlBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  
        
        this.add(pnlBotones, BorderLayout.SOUTH);

    

        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(btnGuardar);
        this.setResizable(false);
        this.getRootPane().setDefaultButton(btnGuardar); // ENTERT GUARDA CAMBIOS

     }
    
    public static void main(String[] args) {
        FrmVentana v = new FrmVentana();
        v.setVisible(true);
       //v.btnEnviar.requestFocus();
        
    }
    
    
}  