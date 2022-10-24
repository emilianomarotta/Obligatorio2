package obligatorio2;

import dominio.Sistema;
import interfazGrafica.VentanaPrincipal;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class Obligatorio2 {

    public static void main(String[] args) {
        Sistema s = new Sistema();
        VentanaPrincipal v = new VentanaPrincipal(s);
        v.setVisible(true);
    }
    
}
