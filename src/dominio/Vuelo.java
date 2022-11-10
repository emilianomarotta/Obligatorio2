package dominio;

import java.io.Serializable;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class Vuelo implements Serializable{

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
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Dron getDron() {
        return dron;
    }

    public void setDron(Dron dron) {
        this.dron = dron;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getCoincidencias() {
        return coincidencias;
    }

    public void setCoincidencias(int coincidencias) {
        this.coincidencias = coincidencias;
    }

    public int getDiferencias() {
        return diferencias;
    }

    public void setDiferencias(int diferencias) {
        this.diferencias = diferencias;
    }

    public int getCantCargas() {
        return cantCargas;
    }

    public void setCantCargas(int cantCargas) {
        this.cantCargas = cantCargas;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

}
