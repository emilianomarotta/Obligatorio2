package interfazGrafica;

import dominio.*;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class VentanaIngresoEgresoCarga extends javax.swing.JFrame implements Observer {

    private Sistema sistema;
    private Util util;
    private int areaActual;
    private Carga cargaSeleccionada;
    private int filaSeleccionda;
    private int columnaSeleccionada;

    public VentanaIngresoEgresoCarga(Sistema s) {
        this.sistema = s;
        this.sistema.addObserver(this);
        this.util = new Util();
        this.areaActual = 0;
        initComponents();
        actualizarPantalla();
        crearGrilla();
        cargaSeleccionada = null;

    }

    public Util getUtil() {
        return util;
    }

    public int getAreaActual() {
        return areaActual;
    }

    public void setAreaActual(int areaActual) {
        this.areaActual = areaActual;
    }

    public int getFilaSeleccionda() {
        return filaSeleccionda;
    }

    public void setFilaSeleccionda(int filaSeleccionda) {
        this.filaSeleccionda = filaSeleccionda;
    }

    public int getColumnaSeleccionada() {
        return columnaSeleccionada;
    }

    public void setColumnaSeleccionada(int columnaSeleccionada) {
        this.columnaSeleccionada = columnaSeleccionada;
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

    public void actualizarColorBotones() {
        for (int i = 0; i < panelEspacios.getComponentCount(); i++) {
            JButton boton = (JButton) panelEspacios.getComponent(i);
            boton.setBackground(Color.GRAY);

        }
    }

    public void actualizarPantalla() {
        String area = "ABCDE";
        lblArea.setText("Area: " + area.charAt(this.getAreaActual()) + "");
        panelEgreso.setVisible(false);
        panelIngreso.setVisible(false);
        actualizarColorBotones();
    }

    public void actualizarListas() {
        jListArticulos.setListData(this.sistema.getListaArticulos().toArray());
        jListFuncionarios.setListData(this.sistema.getListaFuncionarios().toArray());
    }

    public void actualizarPaneles() {
        actualizarListas();
        if (sistema.getListaAreas()[areaActual].getCargas()[this.filaSeleccionda][this.columnaSeleccionada].getCodigo() == 0) {
            panelIngreso.setVisible(true);
            panelEgreso.setVisible(false);
        } else {
            panelEgreso.setVisible(true);
            panelIngreso.setVisible(false);
            Carga carga = sistema.getListaAreas()[areaActual].getCargas()[this.filaSeleccionda][this.columnaSeleccionada];
            cargaSeleccionada = carga;
            lblCodigo.setText(carga.getCodigo() + "");
            lblArticulo.setText(carga.getArticulo().getNombre());
            lblCantidadEgreso.setText(carga.getCantArticulos() + "");
            lblFuncionario.setText(carga.getFuncionario().getNombre());
        }
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
        lblFuncionarios = new javax.swing.JLabel();
        lblArticulos = new javax.swing.JLabel();
        lblCantidadIngreso = new javax.swing.JLabel();
        lblCodigoIngreso = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListFuncionarios = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListArticulos = new javax.swing.JList();
        panelEgreso = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblTituloArticulo = new javax.swing.JLabel();
        lblArticulo = new javax.swing.JLabel();
        lblTituloCodigo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblTituloCantidad = new javax.swing.JLabel();
        lblTituloFuncionario = new javax.swing.JLabel();
        lblCantidadEgreso = new javax.swing.JLabel();
        lblFuncionario = new javax.swing.JLabel();
        btnEgresar = new javax.swing.JButton();
        lblFila1 = new javax.swing.JLabel();
        lblFila2 = new javax.swing.JLabel();
        lblFila3 = new javax.swing.JLabel();
        lblFila4 = new javax.swing.JLabel();
        lblFila5 = new javax.swing.JLabel();
        lblFila6 = new javax.swing.JLabel();
        lblFila8 = new javax.swing.JLabel();
        lblFila7 = new javax.swing.JLabel();
        lblFila9 = new javax.swing.JLabel();
        lblFila10 = new javax.swing.JLabel();
        lblFila11 = new javax.swing.JLabel();
        lblFila12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso/Egreso de Carga");
        setResizable(false);

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

        lblFuncionarios.setText("Funcionarios");

        lblArticulos.setText("Artículos");

        lblCantidadIngreso.setText("Cantidad");

        lblCodigoIngreso.setText("Código");

        txtCantidad.setNextFocusableComponent(txtCodigo);

        txtCodigo.setNextFocusableComponent(btnIngresar);

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jListFuncionarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListFuncionarios.setFixedCellHeight(16);
        jScrollPane1.setViewportView(jListFuncionarios);

        jListArticulos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListArticulos.setFixedCellHeight(16);
        jListArticulos.setValueIsAdjusting(true);
        jScrollPane2.setViewportView(jListArticulos);

        javax.swing.GroupLayout panelIngresoLayout = new javax.swing.GroupLayout(panelIngreso);
        panelIngreso.setLayout(panelIngresoLayout);
        panelIngresoLayout.setHorizontalGroup(
            panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIngresoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFuncionarios)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblArticulos)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIngresoLayout.createSequentialGroup()
                                .addGap(18, 57, Short.MAX_VALUE)
                                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodigoIngreso)
                                    .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(lblCantidadIngreso))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(panelIngresoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelIngresoLayout.setVerticalGroup(
            panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFuncionarios)
                    .addComponent(lblArticulos))
                .addGap(1, 1, 1)
                .addComponent(lblCantidadIngreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIngresoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelIngresoLayout.createSequentialGroup()
                        .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelIngresoLayout.createSequentialGroup()
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCodigoIngreso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIngresar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        panelIngresarEgresar.add(panelIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelEgreso.setBackground(new java.awt.Color(102, 153, 255));

        lblTitulo.setText("Egreso");

        lblTituloArticulo.setText("Articulo:");

        lblTituloCodigo.setText("Código:");

        lblTituloCantidad.setText("Cantidad:");

        lblTituloFuncionario.setText("Funcionario:");

        btnEgresar.setText("Egresar");
        btnEgresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEgresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEgresoLayout = new javax.swing.GroupLayout(panelEgreso);
        panelEgreso.setLayout(panelEgresoLayout);
        panelEgresoLayout.setHorizontalGroup(
            panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEgresoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelEgresoLayout.createSequentialGroup()
                        .addComponent(lblTituloCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCantidadEgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelEgresoLayout.createSequentialGroup()
                        .addComponent(lblTituloFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelEgresoLayout.createSequentialGroup()
                        .addComponent(lblTituloCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblTitulo)
                    .addGroup(panelEgresoLayout.createSequentialGroup()
                        .addComponent(lblTituloArticulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(129, 129, 129))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEgresoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEgresar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelEgresoLayout.setVerticalGroup(
            panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEgresoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addGap(22, 22, 22)
                .addGroup(panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTituloCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloArticulo)
                    .addComponent(lblArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTituloCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCantidadEgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloFuncionario)
                    .addComponent(lblFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEgresar)
                .addGap(18, 54, Short.MAX_VALUE))
        );

        panelIngresarEgresar.add(panelEgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblFila1.setText("1");

        lblFila2.setText("2");

        lblFila3.setText("3");

        lblFila4.setText("4");

        lblFila5.setText("5");

        lblFila6.setText("6");

        lblFila8.setText("8");

        lblFila7.setText("7");

        lblFila9.setText("9");

        lblFila10.setText("10");

        lblFila11.setText("11");

        lblFila12.setText("12");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lblFila1)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFila4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFila5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFila6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFila8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFila9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFila3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFila7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFila10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFila2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFila11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFila12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
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
                .addContainerGap(46, Short.MAX_VALUE))
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelIngresarEgresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFila1)
                                .addGap(7, 7, 7)
                                .addComponent(lblFila2)
                                .addGap(7, 7, 7)
                                .addComponent(lblFila3)
                                .addGap(7, 7, 7)
                                .addComponent(lblFila4)
                                .addGap(7, 7, 7)
                                .addComponent(lblFila5)
                                .addGap(7, 7, 7)
                                .addComponent(lblFila6)
                                .addGap(7, 7, 7)
                                .addComponent(lblFila7)
                                .addGap(7, 7, 7)
                                .addComponent(lblFila8)
                                .addGap(7, 7, 7)
                                .addComponent(lblFila9)
                                .addGap(7, 7, 7)
                                .addComponent(lblFila10)
                                .addGap(7, 7, 7)
                                .addComponent(lblFila11)
                                .addGap(7, 7, 7)
                                .addComponent(lblFila12)
                                .addGap(7, 7, 7)))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAreaAnterior)
                    .addComponent(btnAreaSiguiente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAreaSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaSiguienteActionPerformed
        if (this.getAreaActual() < 4) {
            this.setAreaActual(this.getAreaActual() + 1);
            actualizarPantalla();
        } else {
            this.setAreaActual(0);
            actualizarPantalla();
        }


    }//GEN-LAST:event_btnAreaSiguienteActionPerformed

    private void btnAreaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaAnteriorActionPerformed
        if (this.getAreaActual() > 0) {
            this.setAreaActual(this.getAreaActual() - 1);
            actualizarPantalla();
        } else {
            this.setAreaActual(4);
            actualizarPantalla();
        }
    }//GEN-LAST:event_btnAreaAnteriorActionPerformed

    private void btnEgresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEgresarActionPerformed
        this.sistema.egresarCarga(cargaSeleccionada);
        actualizarPantalla();
        JOptionPane.showMessageDialog(this, "Carga egresada correctamente", "OK", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnEgresarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        if (jListFuncionarios.getSelectedIndex() != -1) {
            if (jListArticulos.getSelectedIndex() != -1) {
                Funcionario f = (Funcionario) jListFuncionarios.getSelectedValue();
                Articulo a = (Articulo) jListArticulos.getSelectedValue();
                if (this.getUtil().esNumeroValido(txtCantidad.getText())) {
                    int cantidad = Integer.parseInt(txtCantidad.getText());
                    if (this.getUtil().esNumeroValido(txtCodigo.getText())) {
                        int codigo = Integer.parseInt(txtCodigo.getText());
                        if (this.sistema.ingresarCarga(this.getAreaActual(), this.getFilaSeleccionda(), this.getColumnaSeleccionada(), f, a, cantidad, codigo)) {
                            // Actualizar la pantalla
                            txtCantidad.setText("");
                            txtCodigo.setText("");
                            actualizarPaneles();
                            JOptionPane.showMessageDialog(this, "Carga " + (this.getFilaSeleccionda() + 1) + ":" + (this.getColumnaSeleccionada() + 1) + " ingresada con éxito", "OK", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this, "El código de carga ya está registrado", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "El código debe ser un número", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "La cantidad debe ser un número", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un artículo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un funcionario", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnIngresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAreaAnterior;
    private javax.swing.JButton btnAreaSiguiente;
    private javax.swing.JButton btnEgresar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jListArticulos;
    private javax.swing.JList jListFuncionarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblArticulo;
    private javax.swing.JLabel lblArticulos;
    private javax.swing.JLabel lblCantidadEgreso;
    private javax.swing.JLabel lblCantidadIngreso;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoIngreso;
    private javax.swing.JLabel lblColumnas;
    private javax.swing.JLabel lblFila1;
    private javax.swing.JLabel lblFila10;
    private javax.swing.JLabel lblFila11;
    private javax.swing.JLabel lblFila12;
    private javax.swing.JLabel lblFila2;
    private javax.swing.JLabel lblFila3;
    private javax.swing.JLabel lblFila4;
    private javax.swing.JLabel lblFila5;
    private javax.swing.JLabel lblFila6;
    private javax.swing.JLabel lblFila7;
    private javax.swing.JLabel lblFila8;
    private javax.swing.JLabel lblFila9;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JLabel lblFuncionarios;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloArticulo;
    private javax.swing.JLabel lblTituloCantidad;
    private javax.swing.JLabel lblTituloCodigo;
    private javax.swing.JLabel lblTituloFuncionario;
    private javax.swing.JPanel panelEgreso;
    private javax.swing.JPanel panelEspacios;
    private javax.swing.JPanel panelIngresarEgresar;
    private javax.swing.JPanel panelIngreso;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables

    public class EspacioListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            // este código se ejecutará al presionar el botón, obtengo cuál botón
            actualizarColorBotones();
            JButton cual = ((JButton) e.getSource());
            cual.setBackground(Color.red);
            String textoBoton[] = cual.getText().split(":");
            int fila = Integer.parseInt(textoBoton[0]) - 1;
            int columna = Integer.parseInt(textoBoton[1]) - 1;
            filaSeleccionda = fila;
            columnaSeleccionada = columna;
            actualizarPaneles();
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        actualizarPaneles();
    }
}
