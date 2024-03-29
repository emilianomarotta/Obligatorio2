package interfazGrafica;

import dominio.Sistema;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class VentanaPrincipal extends javax.swing.JFrame implements Observer {

    private Sistema sistema;

    public VentanaPrincipal(Sistema s) {
        this.sistema = s;
         this.sistema.addObserver(this);
        initComponents();
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

        btnRegistrarArticulo = new javax.swing.JButton();
        btnRegistroVuelo = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnRegistrarFuncionario = new javax.swing.JButton();
        btnRegistrarDron = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnCarga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control de Inventario");
        setMaximumSize(new java.awt.Dimension(351, 530));
        setMinimumSize(new java.awt.Dimension(351, 530));
        setResizable(false);
        setSize(new java.awt.Dimension(351, 530));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnRegistrarArticulo.setText("Registrar Artículo");
        btnRegistrarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarArticuloActionPerformed(evt);
            }
        });

        btnRegistroVuelo.setText("Registro de Vuelo");
        btnRegistroVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroVueloActionPerformed(evt);
            }
        });

        btnEstadisticas.setText("Estadísticas");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

        btnRegistrarFuncionario.setText("Registrar Funcionario");
        btnRegistrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFuncionarioActionPerformed(evt);
            }
        });

        btnRegistrarDron.setText("Registrar Dron");
        btnRegistrarDron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDronActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Control de Inventario");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCarga.setText("Ingreso/Egreso Manual de Carga");
        btnCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistroVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarDron, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarDron, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistroVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarArticuloActionPerformed
        // TODO add your handling code here:
        VentanaRegistrarArticulo vRegistrarArticulo = new VentanaRegistrarArticulo(this.getSistema());
        vRegistrarArticulo.setVisible(true);
    }//GEN-LAST:event_btnRegistrarArticuloActionPerformed

    private void btnRegistrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFuncionarioActionPerformed
        // TODO add your handling code here:
        VentanaRegistrarFuncionario vRegistrarFuncionario = new VentanaRegistrarFuncionario(this.getSistema());
        vRegistrarFuncionario.setVisible(true);
    }//GEN-LAST:event_btnRegistrarFuncionarioActionPerformed

    private void btnRegistrarDronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDronActionPerformed
        // TODO add your handling code here:
        VentanaRegistrarDron vRegistrarDron = new VentanaRegistrarDron(this.getSistema());
        vRegistrarDron.setVisible(true);
    }//GEN-LAST:event_btnRegistrarDronActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.getSistema().guardarSistema(this.getSistema());
        this.dispose();
              
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaActionPerformed
        VentanaIngresoEgresoCarga vIngresoEgreso = new VentanaIngresoEgresoCarga(this.getSistema());
        vIngresoEgreso.setVisible(true);
    }//GEN-LAST:event_btnCargaActionPerformed

    private void btnRegistroVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroVueloActionPerformed
        // TODO add your handling code here:
        VentanaRegistrarVuelo vRegVuelo = new VentanaRegistrarVuelo(this.getSistema());
        vRegVuelo.setVisible(true);
    }//GEN-LAST:event_btnRegistroVueloActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.getSistema().guardarSistema(this.getSistema());
    }//GEN-LAST:event_formWindowClosing

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        VentanaEstadisticas vEstadisticas = new VentanaEstadisticas(this.getSistema());
        vEstadisticas.setVisible(true);
    }//GEN-LAST:event_btnEstadisticasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarga;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnRegistrarArticulo;
    private javax.swing.JButton btnRegistrarDron;
    private javax.swing.JButton btnRegistrarFuncionario;
    private javax.swing.JButton btnRegistroVuelo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {

    }
}
