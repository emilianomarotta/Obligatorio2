package interfazGrafica;

import archivos.ArchivoLectura;
import dominio.*;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.accessibility.AccessibleContext;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class VentanaRegistrarVuelo extends javax.swing.JFrame implements Observer {

    private Sistema sistema;

    public VentanaRegistrarVuelo(Sistema s) {
        this.sistema = s;
        this.sistema.addObserver(this);
        //Traductir jFileChooser
        UIManager.put("FileChooser.openButtonText", "Abrir");
        UIManager.put("FileChooser.cancelButtonText", "Cancelar");
        UIManager.put("FileChooser.filesOfTypeLabelText", "Tipo");
        UIManager.put("FileChooser.fileNameLabelText", "Archivo");
        UIManager.put("FileChooser.lookInLabelText", "Mirar en");
        initComponents();
        tableVuelo.getTableHeader().setReorderingAllowed(false);
        configurarFileChooser();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFileChooser = new javax.swing.JPanel();
        jFileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        lblArea = new javax.swing.JLabel();
        lblFila = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVuelo = new javax.swing.JTable();
        lblCoincidencias = new javax.swing.JLabel();
        lblDiferencias = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Vuelo");
        setResizable(false);

        jFileChooser.setDialogTitle("");
        jFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFileChooserLayout = new javax.swing.GroupLayout(panelFileChooser);
        panelFileChooser.setLayout(panelFileChooserLayout);
        panelFileChooserLayout.setHorizontalGroup(
            panelFileChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFileChooserLayout.createSequentialGroup()
                .addComponent(jFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelFileChooserLayout.setVerticalGroup(
            panelFileChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFileChooserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblArea.setText("Area: ");

        lblFila.setText("Fila: ");

        tableVuelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "De", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableVuelo);
        if (tableVuelo.getColumnModel().getColumnCount() > 0) {
            tableVuelo.getColumnModel().getColumn(0).setResizable(false);
            tableVuelo.getColumnModel().getColumn(1).setResizable(false);
            tableVuelo.getColumnModel().getColumn(2).setResizable(false);
            tableVuelo.getColumnModel().getColumn(3).setResizable(false);
            tableVuelo.getColumnModel().getColumn(4).setResizable(false);
            tableVuelo.getColumnModel().getColumn(5).setResizable(false);
            tableVuelo.getColumnModel().getColumn(6).setResizable(false);
            tableVuelo.getColumnModel().getColumn(7).setResizable(false);
            tableVuelo.getColumnModel().getColumn(8).setResizable(false);
            tableVuelo.getColumnModel().getColumn(9).setResizable(false);
            tableVuelo.getColumnModel().getColumn(10).setResizable(false);
        }

        lblCoincidencias.setText("Total coincidencias: ");

        lblDiferencias.setText("Total diferencias: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblArea)
                .addGap(64, 64, 64)
                .addComponent(lblFila)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiferencias)
                    .addComponent(lblCoincidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArea)
                    .addComponent(lblFila))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCoincidencias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDiferencias)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panelFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooserActionPerformed
        lblArea.setText("Area:");
        lblFila.setText("Fila:");
        DefaultTableModel modelo = (DefaultTableModel) tableVuelo.getModel();
        modelo.setRowCount(0);
        lblCoincidencias.setText("Total coincidencias: ");
        lblDiferencias.setText("Total diferencias: ");
        if (evt.getActionCommand().equals("ApproveSelection")) {
            ArchivoLectura archivo = new ArchivoLectura(jFileChooser.getSelectedFile().getAbsolutePath());
            String nombreArchivo = jFileChooser.getSelectedFile().getName();
            procesarVuelo(archivo, nombreArchivo, modelo);
        } else if (evt.getActionCommand().equals("CancelSelection")) {
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Se ejecuto una acción no controlada", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jFileChooserActionPerformed

    private void procesarVuelo(ArchivoLectura archivo, String nombreArchivo, DefaultTableModel modelo) {
        ArrayList<String> lineasArchivo = new ArrayList<>();
        //Guardamos las lineas en una lista para ver si es un vuelo valido
        while (archivo.hayMasLineas()) {
            lineasArchivo.add(archivo.linea());
        }
        //Atributos del vuelo
        boolean exitoso = false;
        String[] areaFila = lineasArchivo.get(1).split("#");
        String areas = "ABCDE";
        String letraArea = areaFila[0];
        int numeroArea = areas.indexOf(letraArea);
        String codigoDron = lineasArchivo.get(0);
        int fila = Integer.parseInt(areaFila[1]) - 1;
        int coincidencias = 0;
        int diferencias = 0;
        int cantCargas = (lineasArchivo.size() - 2);
        //Fin atributos del vuelo
        //Chequeo de vuelo exitoso = 10 lineas de carga
        if (cantCargas != 10) {
            JOptionPane.showMessageDialog(this, "Vuelo no exitoso. El archivo contiene " + (lineasArchivo.size() - 2) + " líneas de cargas", "Información de vuelo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            exitoso = true;
            //Actualizacion de algunos datos la tabla
            Carga[] filaCargaManual = this.sistema.getListaAreas()[numeroArea].getCargas()[fila];
            String[] codCargasManuales = new String[11];
            String[] codCargasArchivo = new String[11];
            codCargasArchivo[0] = "Archivo";
            codCargasManuales[0] = "Manual";
            //
            //Itero en las lineas del vuelo para ver las coindicencias con las lineas de carga manual
            for (int i = 2; i < lineasArchivo.size(); i++) {
                int codigoCargaArchivo = Integer.parseInt(lineasArchivo.get(i));
                int codigoCargaManual = filaCargaManual[i - 2].getCodigo();
                if (codigoCargaManual == codigoCargaArchivo) {
                    coincidencias++;
                } else {
                    diferencias++;
                }
                //Voy cargando los valores en los array para luego mostrarlos en la tabla
                codCargasManuales[i - 1] = "" + codigoCargaManual;
                codCargasArchivo[i - 1] = "" + codigoCargaArchivo;
            }
            //Agrego el vuelo al dron, muestro mensaje y cargo los datos en la tabla con los colores
            if (this.sistema.agregarVuelo(exitoso, letraArea, codigoDron, (fila + 1), coincidencias, diferencias, cantCargas, nombreArchivo)) {
                modelo.addRow(codCargasArchivo);
                modelo.addRow(codCargasManuales);
                colorearTabla(modelo);
                lblCoincidencias.setText(lblCoincidencias.getText() + coincidencias);
                lblDiferencias.setText(lblDiferencias.getText() + diferencias);
                JOptionPane.showMessageDialog(this, "Vuelo registrado con exito", "OK", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Revise los datos del vuelo.\nNo se encontró el Dron en el sistema", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void colorearTabla(DefaultTableModel modelo) {
        for (int i = 0; i < 11; i++) {
            configurarTabla(tableVuelo, i, modelo.getValueAt(0, i), modelo.getValueAt(1, i));
        }
        tableVuelo.setRowHeight(22);
        tableVuelo.setRowSelectionAllowed(false);
        tableVuelo.getTableHeader().setReorderingAllowed(false);
    }

    public void configurarTabla(JTable table, int column_index, Object valorManual, Object valorArchivo) {
        table.getColumnModel().getColumn(column_index).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public void setHorizontalAlignment(int alignment) {
                super.setHorizontalAlignment(JLabel.CENTER);
            }

            @Override
            public void setBorder(Border border) {
                super.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));
            }

            public void setAccessibleContext(AccessibleContext accessibleContext) {
                this.accessibleContext = accessibleContext;
            }

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (column > 0) {
                    if (valorManual.equals(valorArchivo)) {
                        c.setBackground(Color.GREEN);
                    } else {
                        c.setBackground(Color.RED);
                    }
                } else {
                    c.setBackground(Color.LIGHT_GRAY);
                }
                return c;
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblCoincidencias;
    private javax.swing.JLabel lblDiferencias;
    private javax.swing.JLabel lblFila;
    private javax.swing.JPanel panelFileChooser;
    private javax.swing.JTable tableVuelo;
    // End of variables declaration//GEN-END:variables

    private void configurarFileChooser() {
        jFileChooser.setCurrentDirectory(new java.io.File("."));
        //Elimina All Files
        jFileChooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos.txt", "txt");
        jFileChooser.setFileFilter(filter);
    }

    @Override
    public void update(Observable o, Object arg) {
    }

}
