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
        panelIngresarEgresar = new javax.swing.JPanel();
        panelIngreso = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelEgreso = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblTituloArticulo = new javax.swing.JLabel();
        lblArticulo = new javax.swing.JLabel();
        lblTituloCodigo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblTituloCantidad = new javax.swing.JLabel();
        lblTituloFuncionario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEgresar = new javax.swing.JButton();

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

        panelIngresarEgresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIngreso.setBackground(new java.awt.Color(51, 255, 51));
        panelIngreso.setPreferredSize(new java.awt.Dimension(480, 257));

        jLabel3.setText("Ingreso");

        javax.swing.GroupLayout panelIngresoLayout = new javax.swing.GroupLayout(panelIngreso);
        panelIngreso.setLayout(panelIngresoLayout);
        panelIngresoLayout.setHorizontalGroup(
            panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(429, Short.MAX_VALUE))
        );
        panelIngresoLayout.setVerticalGroup(
            panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        panelIngresarEgresar.add(panelIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelEgreso.setBackground(new java.awt.Color(102, 153, 255));

        lblTitulo.setText("Egreso");

        lblTituloArticulo.setText("Articulo:");

        lblTituloCodigo.setText("Código:");

        lblTituloCantidad.setText("Cantidad");

        lblTituloFuncionario.setText("Funcionario");

        jLabel2.setText("0");

        btnEgresar.setText("Egresar");

        javax.swing.GroupLayout panelEgresoLayout = new javax.swing.GroupLayout(panelEgreso);
        panelEgreso.setLayout(panelEgresoLayout);
        panelEgresoLayout.setHorizontalGroup(
            panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEgresoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEgresoLayout.createSequentialGroup()
                        .addComponent(lblTituloCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(panelEgresoLayout.createSequentialGroup()
                        .addComponent(lblTituloFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelEgresoLayout.createSequentialGroup()
                            .addComponent(lblTituloCodigo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblCodigo))
                        .addGroup(panelEgresoLayout.createSequentialGroup()
                            .addComponent(lblTituloArticulo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblArticulo))
                        .addComponent(lblTitulo)))
                .addContainerGap(369, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEgresoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEgresar)
                .addContainerGap())
        );
        panelEgresoLayout.setVerticalGroup(
            panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEgresoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addGap(22, 22, 22)
                .addGroup(panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloCodigo)
                    .addComponent(lblCodigo))
                .addGap(18, 18, 18)
                .addGroup(panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloArticulo)
                    .addComponent(lblArticulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloCantidad)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloFuncionario)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEgresar)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        panelIngresarEgresar.add(panelEgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(panelIngresarEgresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lblArea)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelIngresarEgresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAreaAnterior)
                    .addComponent(btnAreaSiguiente))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAreaSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaSiguienteActionPerformed
        if (this.areaActual < 4) {
            this.areaActual++;
            actualizarPantalla();
                        panelIngreso.setVisible(false);
            panelEgreso.setVisible(true);
        }

    }//GEN-LAST:event_btnAreaSiguienteActionPerformed

    private void btnAreaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaAnteriorActionPerformed
        if (this.areaActual > 0) {
            this.areaActual--;
            actualizarPantalla();
            panelIngreso.setVisible(true);
            panelEgreso.setVisible(false);
        }
    }//GEN-LAST:event_btnAreaAnteriorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAreaAnterior;
    private javax.swing.JButton btnAreaSiguiente;
    private javax.swing.JButton btnEgresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblArticulo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblColumnas;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloArticulo;
    private javax.swing.JLabel lblTituloCantidad;
    private javax.swing.JLabel lblTituloCodigo;
    private javax.swing.JLabel lblTituloFuncionario;
    private javax.swing.JPanel panelEgreso;
    private javax.swing.JPanel panelEspacios;
    private javax.swing.JPanel panelIngresarEgresar;
    private javax.swing.JPanel panelIngreso;
    // End of variables declaration//GEN-END:variables

    private class EspacioListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
// este código se ejecutará al presionar el botón, obtengo cuál botón
            JButton cual = ((JButton) e.getSource());
            String textoBoton[] = cual.getText().split(":");
            int fila = Integer.parseInt(textoBoton[0]) - 1;
            int columna = Integer.parseInt(textoBoton[1]) - 1;
            lblTituloArticulo.setText(sistema.getListaAreas()[0].getCargas()[fila][columna].getArticulo().getNombre());
// código a completar según el botón presionado
        }
    }
}
