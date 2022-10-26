package interfazGrafica;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class Util {

    public int parsearString(String texto, Component c, String mensaje) {
        int ret = -1;
        try {
            ret = Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(c, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return ret;
    }

    public boolean edadFuncionarioValida(int edad) {
        boolean edadFuncionarioValida = true;
        if (edad > 100 || edad < 18) {
            edadFuncionarioValida = false;
        }
        return edadFuncionarioValida;
    }

    public boolean nombreValido(String nombre) {
        boolean nombreValido = true;
        if (nombre.length() < 3) {
            nombreValido = false;
        }
        return nombreValido;
    }
}
