package obligatorio2;

import dominio.Articulo;
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

        /* DATOS PRECARGADOS */
        s.getListaArticulos().add(new Articulo("Pasta Colgate", "Pomo de 200gr"));
        s.getListaArticulos().add(new Articulo("Shampo ClearMen", "Anticaspa de 400ml"));
        s.getListaArticulos().add(new Articulo("Cubierta Auto", "165/30/13"));
        s.getListaArticulos().add(new Articulo("Detergente Cif", "Frasco de 500ml"));

        s.getListaFuncionarios().add(new Funcionario("Pepe", 20, 2));
        s.getListaFuncionarios().add(new Funcionario("Jorge", 30, 4));
        s.getListaFuncionarios().add(new Funcionario("Diego", 50, 23809));

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
