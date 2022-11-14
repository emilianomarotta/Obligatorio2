package dominio;

import java.io.Serializable;
import java.util.Observable;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class Funcionario extends Observable implements Serializable{

    private String nombre;
    private int edad;
    private int numero;

    public Funcionario(String nombre, int edad, int numero) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.setChanged();
        this.notifyObservers();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        this.setChanged();
        this.notifyObservers();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
        this.setChanged();
        this.notifyObservers();
    }
    
    @Override
    public String toString(){
        return this.getNombre();
    }

}
