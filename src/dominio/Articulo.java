package dominio;

import java.io.Serializable;
import java.util.Observable;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class Articulo extends Observable implements Serializable{

    private String nombre;
    private String descripcion;

    public Articulo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.setChanged();
        this.notifyObservers();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        this.setChanged();
        this.notifyObservers();
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
