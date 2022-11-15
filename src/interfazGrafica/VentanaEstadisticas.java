package interfazGrafica;

import dominio.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListSelectionModel;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class VentanaEstadisticas extends javax.swing.JFrame implements Observer {

    private Sistema sistema;
    private Dron dronSeleccionado;

    public VentanaEstadisticas(Sistema s) {
        this.sistema = s;
        this.dronSeleccionado = null;
        this.sistema.addObserver(this);
        initComponents();
        class DisabledItemSelectionModel extends DefaultListSelectionModel {
            @Override
            public void setSelectionInterval(int index0, int index1) {
                super.setSelectionInterval(-1, -1);
            }
        }
        jListDronesSinVuelos.setSelectionModel(new DisabledItemSelectionModel());
        actualizarVentana();

    }

    public void actualizarVentana() {
        ArrayList<Dron> listaTotalDrones = this.sistema.getListaDrones();
        ArrayList<Dron> listaDronesConVuelo = new ArrayList<>();
        ArrayList<Dron> listaDronesSinVuelo = new ArrayList<>();
        Iterator<Dron> it = listaTotalDrones.iterator();
        while (it.hasNext()) {
            Dron d = it.next();
            if (d.getListaVuelos().size() > 0) {
                listaDronesConVuelo.add(d);
            } else {
                listaDronesSinVuelo.add(d);
            }
        }
        jListDronesConVuelos.setListData(listaDronesConVuelo.toArray(new Dron[listaDronesConVuelo.size()]));
        jListDronesSinVuelos.setListData(listaDronesSinVuelo.toArray(new Dron[listaDronesSinVuelo.size()]));
    }

    public void actualizarVuelos(Dron dron) {
        if (dron != null) {
            this.dronSeleccionado = dron;
            lblVuelosDron.setText("Vuelos del Dron: ");
            lblVuelosDron.setText(lblVuelosDron.getText() + dron.getId() + ", Cantidad de Vuelos: " + dron.getListaVuelos().size());
            ArrayList<Vuelo> listaVuelos = dron.getListaVuelos();
            jListVuelos.setListData(listaVuelos.toArray(new Vuelo[listaVuelos.size()]));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListDronesConVuelos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListDronesSinVuelos = new javax.swing.JList<>();
        lblDronesConVuelo = new javax.swing.JLabel();
        lblDronesSinVuelo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListVuelos = new javax.swing.JList<>();
        lblVuelosDron = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jListDronesConVuelos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListDronesConVuelos.setAutoscrolls(false);
        jListDronesConVuelos.setFixedCellHeight(17);
        jListDronesConVuelos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListDronesConVuelosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListDronesConVuelos);

        jListDronesSinVuelos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListDronesSinVuelos.setFixedCellHeight(17);
        jScrollPane2.setViewportView(jListDronesSinVuelos);

        lblDronesConVuelo.setText("Drones con vuelo");

        lblDronesSinVuelo.setText("Drones sin vuelo");

        jListVuelos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jListVuelos);

        lblVuelosDron.setText("Vuelos del Dron: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVuelosDron)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDronesConVuelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDronesSinVuelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDronesConVuelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDronesSinVuelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVuelosDron)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListDronesConVuelosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListDronesConVuelosValueChanged

        if (jListDronesConVuelos.getSelectedIndex() > -1) {
            Dron dron = jListDronesConVuelos.getSelectedValue();
            this.dronSeleccionado = dron;
            actualizarVuelos(dron);
        }
    }//GEN-LAST:event_jListDronesConVuelosValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Dron> jListDronesConVuelos;
    private javax.swing.JList<Dron> jListDronesSinVuelos;
    private javax.swing.JList<Vuelo> jListVuelos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDronesConVuelo;
    private javax.swing.JLabel lblDronesSinVuelo;
    private javax.swing.JLabel lblVuelosDron;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        actualizarVentana();
        actualizarVuelos(this.dronSeleccionado);
    }
}
