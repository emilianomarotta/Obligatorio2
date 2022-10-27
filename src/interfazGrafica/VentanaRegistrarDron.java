/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazGrafica;

import dominio.Dron;
import dominio.Funcionario;
import dominio.Sistema;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class VentanaRegistrarDron extends javax.swing.JFrame {

    private Sistema sistema;
    private Util util;

    public Util getUtil() {
        return util;
    }

    /**
     * Creates new form VentanaRegistrarArticulo
     */
    public VentanaRegistrarDron(Sistema s) {
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

        lblIdentificacion = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaDrones = new javax.swing.JTable();
        lblTipoDeCamara = new javax.swing.JLabel();
        spnTipoDeCamara = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionarios");

        lblIdentificacion.setText("Identificación");

        lblModelo.setText("Modelo");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tableListaDrones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación", "Modelo", "Tipo de Camara"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        tableListaDrones.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tableListaDrones);
        tableListaDrones.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tableListaDrones.getColumnModel().getColumnCount() > 0) {
            tableListaDrones.getColumnModel().getColumn(0).setResizable(false);
            tableListaDrones.getColumnModel().getColumn(1).setResizable(false);
            tableListaDrones.getColumnModel().getColumn(2).setResizable(false);
        }

        lblTipoDeCamara.setText("Tipo de Camara");

        spnTipoDeCamara.setModel(new javax.swing.SpinnerNumberModel(1, 1, 6, 1));
        spnTipoDeCamara.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdentificacion)
                                    .addComponent(lblModelo))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipoDeCamara)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnTipoDeCamara, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdentificacion)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModelo)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnTipoDeCamara, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoDeCamara))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        String idDron = txtIdentificacion.getText();
        String modeloDron = txtModelo.getText();
        int tipoCamara = (int) spnTipoDeCamara.getValue();
        //Chequeo si quieren registrar un Dron vacio o un modelo vacio
        if (!idDron.isEmpty() && !modeloDron.isEmpty()) {
            //Chequeo que no este registrado
            if (this.getSistema().idDronValido(idDron)) {
                //Si todo esta ok, lo agrego a la lista y a la tabla de la interfaz
                Dron d = new Dron(idDron, modeloDron, tipoCamara);
                String[] dDatos = {d.getId(), d.getModelo(), Integer.toString(d.getTipoCamara())};
                this.getSistema().getListaDrones().add(d);
                //Los agrego a la tabla
                DefaultTableModel modelo = (DefaultTableModel) tableListaDrones.getModel();
                modelo.addRow(dDatos);
            } else {
                JOptionPane.showMessageDialog(this, "El Dron ya se encuentra registrado en el sistema", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblTipoDeCamara;
    private javax.swing.JSpinner spnTipoDeCamara;
    private javax.swing.JTable tableListaDrones;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables

    public void actualizarVentana() {
        for (int i = 0; i < this.getSistema().getListaDrones().size(); i++) {
            //Obtengo drones registrados en sistema
            Dron d = this.getSistema().getListaDrones().get(i);
            String[] dDatos = {d.getId(), d.getModelo(), Integer.toString(d.getTipoCamara())};

            //Los agrego a la tabla
            DefaultTableModel modelo = (DefaultTableModel) tableListaDrones.getModel();
            modelo.addRow(dDatos);

        }

    }
}
