package interfazGrafica;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class Util {

    public boolean esNumeroValido(String texto) {
        boolean retorno = false;
        try {
            int num = Integer.parseInt(texto);
            retorno = true;
        } catch (NumberFormatException e) {
            retorno = false;
        }
        return retorno;
    }
    
    public boolean edadFuncionarioValida(int edad) {
        boolean edadFuncionarioValida = true;
        if (edad > 65 || edad < 18) {
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
