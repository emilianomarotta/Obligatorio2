/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazGrafica;

import dominio.Sistema;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class VentanaIngresoEgresoCarga extends javax.swing.JFrame {

    private Sistema sistema;
    private int areaActual;

    public VentanaIngresoEgresoCarga(Sistema s) {
        this.sistema = s;
        this.areaActual = 0;
        initComponents();
        actualizarPantalla();
        crearGrilla();
    }

    public int getAreaActual() {
        return areaActual;
    }

    public void setAreaActual(int areaActual) {
        this.areaActual = areaActual;
    }

    public void crearGrilla() {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 10; j++) {
                JButton nuevo = new JButton(" ");
                nuevo.setMargin(new Insets(-5, -5, -5, -5));
                nuevo.setBackground(Color.GRAY);
                nuevo.setForeground(Color.WHITE);
                nuevo.setText((i + 1) + ":" + (j + 1)); // texto ejemplo, a completar
                nuevo.addActionListener(new EspacioListener());
                panelEspacios.add(nuevo);
            }
        }
    }

    public void actualizarPantalla() {
        String area = "ABCDE";
        lblArea.setText("Area: " + area.charAt(this.getAreaActual()) + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEspacios = new javax.swing.JPanel();
        lblColumnas = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        btnAreaAnterior = new javax.swing.JButton();
        btnAreaSiguiente = new javax.swing.JButton();
        panelCargas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblArticulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelEspacios.setBackground(new java.awt.Color(255, 255, 204));
        panelEspacios.setLayout(new java.awt.GridLayout(12, 10));

        lblColumnas.setText("       1              2              3              4              5              6              7              8              9              10");

        lblArea.setText("Area: ");

        btnAreaAnterior.setText("<<");
        btnAreaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaAnteriorActionPerformed(evt);
            }
        });

        btnAreaSiguiente.setText(">>");
        btnAreaSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaSiguienteActionPerformed(evt);
            }
        });

        panelCargas.setBackground(new java.awt.Color(102, 255, 204));

        jLabel1.setText("Ingreso/Egreso");

        lblArticulo.setText("jLabel2");

        javax.swing.GroupLayout panelCargasLayout = new javax.swing.GroupLayout(panelCargas);
        panelCargas.setLayout(panelCargasLayout);
        panelCargasLayout.setHorizontalGroup(
            panelCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCargasLayout.createSequentialGroup()
                .addGroup(panelCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCargasLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(panelCargasLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblArticulo)))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        panelCargasLayout.setVerticalGroup(
            panelCargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCargasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(94, 94, 94)
                .addComponent(lblArticulo)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lblArea))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAreaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAreaSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelEspacios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblColumnas))
                        .addGap(18, 18, 18)
                        .addComponent(panelCargas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCargas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAreaAnterior)
                    .addComponent(btnAreaSiguiente))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAreaSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaSiguienteActionPerformed
        if (this.areaActual < 4) {
            this.areaActual++;
            actualizarPantalla();
        }

    }//GEN-LAST:event_btnAreaSiguienteActionPerformed

    private void btnAreaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaAnteriorActionPerformed
        if (this.areaActual > 0) {
            this.areaActual--;
            actualizarPantalla();
        }
    }//GEN-LAST:event_btnAreaAnteriorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAreaAnterior;
    private javax.swing.JButton btnAreaSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblArticulo;
    private javax.swing.JLabel lblColumnas;
    private javax.swing.JPanel panelCargas;
    private javax.swing.JPanel panelEspacios;
    // End of variables declaration//GEN-END:variables

    private class EspacioListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
// este código se ejecutará al presionar el botón, obtengo cuál botón
            JButton cual = ((JButton) e.getSource());
            String textoBoton[] = cual.getText().split(":");
            int fila = Integer.parseInt(textoBoton[0]) - 1;
            int columna = Integer.parseInt(textoBoton[1]) - 1;
            lblArticulo.setText(sistema.getListaAreas()[0].getCargas()[fila][columna].getArticulo().getNombre());
// código a completar según el botón presionado
        }
    }
}
