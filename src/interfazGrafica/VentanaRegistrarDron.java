package interfazGrafica;

import dominio.Dron;
import dominio.Sistema;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class VentanaRegistrarDron extends javax.swing.JFrame implements Observer {

    private Sistema sistema;
    private Util util;

    public VentanaRegistrarDron(Sistema s) {
        this.sistema = s;
        this.sistema.addObserver(this);
        this.util = new Util();
        initComponents();
        actualizarVentana();
    }

    public Sistema getSistema() {
        return sistema;
    }

    public Util getUtil() {
        return util;
    }

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
        cBoxTipoCamara = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Drones");
        setResizable(false);

        lblIdentificacion.setText("Identificación");

        lblModelo.setText("Modelo");

        txtIdentificacion.setNextFocusableComponent(txtModelo);

        txtModelo.setNextFocusableComponent(cBoxTipoCamara);

        btnAgregar.setText("Agregar");
        btnAgregar.setNextFocusableComponent(txtIdentificacion);
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

        cBoxTipoCamara.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "1", "2", "3", "4", "5", "6" }));
        cBoxTipoCamara.setNextFocusableComponent(btnAgregar);

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
                                .addComponent(cBoxTipoCamara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregar)
                        .addGap(51, 51, 51)))
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
                            .addComponent(lblTipoDeCamara)
                            .addComponent(cBoxTipoCamara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String idDron = txtIdentificacion.getText();
        String modeloDron = txtModelo.getText();
        //Chequeo que todos los campos esten completos  
        if (!idDron.isEmpty() && !modeloDron.isEmpty() && !cBoxTipoCamara.getSelectedItem().equals("-")) {
            int tipoCamara = Integer.parseInt((String) cBoxTipoCamara.getSelectedItem());
            if (this.getSistema().agregarDron(idDron, modeloDron, tipoCamara)) {
                //Todo ok
                txtIdentificacion.setText("");
                txtModelo.setText("");
                cBoxTipoCamara.setSelectedIndex(0);
                actualizarVentana();
                JOptionPane.showMessageDialog(this, "Dron agregado con éxito", "OK", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this, "El Dron ya se encuentra registrado en el sistema", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox cBoxTipoCamara;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblTipoDeCamara;
    private javax.swing.JTable tableListaDrones;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables

    public void actualizarVentana() {
        //Obtengo modelo de tabla para manipular datos
        DefaultTableModel modelo = (DefaultTableModel) tableListaDrones.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < this.getSistema().getListaDrones().size(); i++) {
            //Obtengo drones registrados en sistema
            Dron d = this.getSistema().getListaDrones().get(i);
            //Los agrego a la tabla
            String[] dDatos = {d.getId(), d.getModelo(), Integer.toString(d.getTipoCamara())};
            modelo.addRow(dDatos);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        actualizarVentana();
    }
}
