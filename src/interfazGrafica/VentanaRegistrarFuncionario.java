/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazGrafica;

import dominio.Funcionario;
import dominio.Sistema;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class VentanaRegistrarFuncionario extends javax.swing.JFrame {

    private Sistema sistema;
    private Util util;

    public Util getUtil() {
        return util;
    }

    /**
     * Creates new form VentanaRegistrarArticulo
     */
    public VentanaRegistrarFuncionario(Sistema s) {
        this.sistema = s;
        this.util = new Util();
        initComponents();
        actualizarVentana();
    }

    public Sistema getSistema() {
        return sistema;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaArticulos = new javax.swing.JTable();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionarios");

        lblNombre.setText("Nombre");

        lblEdad.setText("Edad");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tableListaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Numero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableListaArticulos.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tableListaArticulos);
        tableListaArticulos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tableListaArticulos.getColumnModel().getColumnCount() > 0) {
            tableListaArticulos.getColumnModel().getColumn(0).setResizable(false);
            tableListaArticulos.getColumnModel().getColumn(1).setResizable(false);
            tableListaArticulos.getColumnModel().getColumn(2).setResizable(false);
        }

        lblNumero.setText("Numero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblEdad)
                            .addComponent(lblNumero))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtEdad)
                            .addComponent(txtNumero))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEdad)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumero)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(btnAgregar)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        String nombreFuncionario = txtNombre.getText();
        int edadFuncionario = 0;
        //Se asume numero de funcionario valido mayor 0
        int numeroFuncionario = -1;

        if (this.getUtil().nombreValido(nombreFuncionario)) {
            edadFuncionario = this.getUtil().parsearString(txtEdad.getText(), this, "La edad debe ser un número");
            if (!this.getUtil().edadFuncionarioValida(edadFuncionario)) {
                JOptionPane.showMessageDialog(this, "El funcionario debe ser mayor de edad", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                numeroFuncionario = this.getUtil().parsearString(txtNumero.getText(), this, "El número del funcionario debe ser un número");
                boolean numeroUnico = this.getSistema().numeroFuncionarioValido(numeroFuncionario);
                if (numeroUnico) {
                    Funcionario f = new Funcionario(nombreFuncionario, edadFuncionario, numeroFuncionario);
                    this.getSistema().getListaFuncionarios().add(f);
                } else {
                    JOptionPane.showMessageDialog(this, "El funcionario ya está registrado en el sistema", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "El nombre del funcionario debe tener más de 3 caractéres", "Error", JOptionPane.ERROR_MESSAGE);
        }

//        String nombreArticulo = txtNombre.getText();
//        String descripcionArticulo = txtEdad.getText();
//        boolean nombreUnico = this.getSistema().nombreArticuloValido(nombreArticulo);
//        if (nombreUnico) {
//            Articulo a = new Articulo(nombreArticulo, descripcionArticulo);
//            this.getSistema().getListaArticulos().add(a);
//            actualizarVentana();
//        } else {
//            JOptionPane.showMessageDialog(this, "El Artículo ya esta registrado en el sistema", "Error", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JTable tableListaArticulos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables

    public void actualizarVentana() {
//        for (int i = 0; i < this.getSistema().getListaArticulos().size(); i++) {
//            //Obtengo articulos registrados en sistema
//            Funcionario f = this.getSistema().getListaFuncionarios().get(i);
//            //Inserto en la tabla
//            Vector<String> data = new Vector<>();
//            data.add(f.getNombre());
//            //data.add(f.getEdad());
//            DefaultTableModel modelo = (DefaultTableModel) tableListaArticulos.getModel();
//            if (!modelo.getDataVector().contains(data)) {
//                modelo.addRow(data);
//            }
//            
//        }
    }
}
