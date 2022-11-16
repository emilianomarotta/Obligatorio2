package dominio;

import java.io.Serializable;
import java.util.Observable;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class Vuelo extends Observable implements Serializable {

    private boolean exitoso;
    private String area;
    private Dron dron;
    private int fila;
    private int coincidencias;
    private int diferencias;
    private int cantCargas;
    private String nombreArchivo;

    public Vuelo(boolean exitoso, String area, Dron dron, int fila, int coincidencias, int diferencias, int cantCargas, String nombreArchivo) {
        this.exitoso = exitoso;
        this.area = area;
        this.dron = dron;
        this.fila = fila;
        this.coincidencias = coincidencias;
        this.diferencias = diferencias;
        this.cantCargas = cantCargas;
        this.nombreArchivo = nombreArchivo;
    }

    public boolean isExitoso() {
        return exitoso;
    }

    public void setExitoso(boolean exitoso) {
        this.exitoso = exitoso;
        this.setChanged();
        this.notifyObservers();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
        this.setChanged();
        this.notifyObservers();
    }

    public Dron getDron() {
        return dron;
    }

    public void setDron(Dron dron) {
        this.dron = dron;
        this.setChanged();
        this.notifyObservers();
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
        this.setChanged();
        this.notifyObservers();
    }

    public int getCoincidencias() {
        return coincidencias;
    }

    public void setCoincidencias(int coincidencias) {
        this.coincidencias = coincidencias;
        this.setChanged();
        this.notifyObservers();
    }

    public int getDiferencias() {
        return diferencias;
    }

    public void setDiferencias(int diferencias) {
        this.diferencias = diferencias;
        this.setChanged();
        this.notifyObservers();
    }

    public int getCantCargas() {
        return cantCargas;
    }

    public void setCantCargas(int cantCargas) {
        this.cantCargas = cantCargas;
        this.setChanged();
        this.notifyObservers();
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.setChanged();
        this.notifyObservers();
    }

    @Override
    public String toString() {
        String ret = "Archivo: " + this.getNombreArchivo() + ", Area: " + this.getArea() + ", Fila: " + this.getFila();
        if (this.isExitoso()) {
            ret = ret + ", Coincidencias: " + this.getCoincidencias() + ", Diferencias: " + this.getDiferencias() + " (Exitoso)";
        } else {
            ret = ret + ", Nro líneas: " + this.getCantCargas()+ " (No exitoso)";
        }
        return ret;
    }

}
