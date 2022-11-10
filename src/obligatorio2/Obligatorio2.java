package obligatorio2;

import dominio.Articulo;
import dominio.Dron;
import dominio.Funcionario;
import dominio.Sistema;
import interfazGrafica.VentanaPrincipal;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class Obligatorio2 {

    public static void main(String[] args) {
        Sistema s = new Sistema();
        s = s.cargarSistema();

        /* DATOS PRECARGADOS */
        
//        Articulo pasta = new Articulo("Pasta Colgate", "Pomo de 200gr");
//        s.agrearArticulo("Pasta Colgate", "Pomo de 200gr");
//        s.agrearArticulo("Shampo ClearMen", "Anticaspa de 400ml");
//        s.agrearArticulo("Detergente Cif", "Frasco de 500ml");
//        s.agrearArticulo("Pasta Colgate", "Pomo de 200gr");
//        
//        s.agregarFuncionario("Pepe", 20, 2);
//         s.agregarFuncionario("Jorge", 30, 4);
//          s.agregarFuncionario("Diego", 50, 23809);
//           s.agregarFuncionario("Messi", 30, 10);
//        
//        s.agregarDron("AC567G", "V2", 5);
//        s.agregarDron("MS896", "VHD", 2);
//        s.agregarDron("AK674F", "V2.5", 3);
//        s.agregarDron("BZ542", "V1", 1);
//        s.agregarDron("ZC09O", "FAST", 6);
//        
//        //Area A
//        s.ingresarCarga(0, 0, 0, s.getListaFuncionarios().get(0), s.getListaArticulos().get(0), 12, 540);
//        s.ingresarCarga(0, 2, 2, s.getListaFuncionarios().get(2), s.getListaArticulos().get(2), 40, 5478);
//        s.ingresarCarga(0, 5, 7, s.getListaFuncionarios().get(1), s.getListaArticulos().get(1), 56, 3450);
//        
//        //Area B
//        s.ingresarCarga(1, 4, 4, s.getListaFuncionarios().get(0), s.getListaArticulos().get(0), 12, 541);
//        s.ingresarCarga(1, 5, 2, s.getListaFuncionarios().get(2), s.getListaArticulos().get(2), 40, 54756);
//        s.ingresarCarga(1, 3, 0, s.getListaFuncionarios().get(1), s.getListaArticulos().get(1), 56, 34);

        

        /* FIN DATOS PRECARGADOS */
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        VentanaPrincipal v = new VentanaPrincipal(s);
        v.setVisible(true);
    }

}
