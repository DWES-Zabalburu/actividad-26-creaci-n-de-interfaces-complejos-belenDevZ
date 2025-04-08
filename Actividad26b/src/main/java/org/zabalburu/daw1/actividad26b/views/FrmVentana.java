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
  private Dimension dmVentana = new Dimension(800, 450);
    
    
    private JLabel lblTitulo = new JLabel("Formulario de Empleados");
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
    private final Color COLOR_FONDO = new Color(153,204,255);
    private final Color COLOR_TEXTO = new Color(0,0,153);
    private final Font FUENTE = new Font("Calibri", Font.PLAIN,22);
    
    public FrmVentana(){
        this.setSize(dmVentana);
        this.setTitle("Mi Perfil");
        lblTitulo.setFont(new Font("Calibri",Font.BOLD,32));
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);
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
        pnlDatos.setBackground(Color.WHITE);
        
        for (int i = 0; i < pnlDatos.getComponentCount(); i++) {
            Component cmp = pnlDatos.getComponent(i);
            //if (i % 2 == 0){
            if (cmp instanceof JLabel) {
                cmp.setFont(FUENTE.deriveFont(Font.BOLD));
            } else {
                cmp.setFont(FUENTE);
            }
        }
            
        
        
        
        this.add(pnlDatos, BorderLayout.CENTER);
        btnCancelar.setFont(FUENTE);
        btnGuardar.setFont(FUENTE);
        btnGuardar.setToolTipText("Guardar Cambios");
        btnGuardar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pnlBotones.add(btnGuardar);
        btnGuardar.setMnemonic('E');
        pnlBotones.add(btnCancelar);
        //pnlBotones.setBackground(COLOR_FONDO.darker().darker());
        pnlBotones.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.BLUE),
            BorderFactory.createEmptyBorder(0, 0, 0,0)
            ));
    

        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(btnGuardar);
        this.setResizable(false);
     }
    
    public static void main(String[] args) {
        FrmVentana v = new FrmVentana();
        v.setVisible(true);
       //v.btnEnviar.requestFocus();
        
    }
    
    
}
