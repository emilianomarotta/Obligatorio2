package dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class Dron implements Serializable{

    private String id;
    private String modelo;
    private int tipoCamara;
    private ArrayList<Vuelo> listaVuelos;

    public Dron(String id, String modelo, int tipoCamara) {
        this.id = id;
        this.modelo = modelo;
        this.tipoCamara = tipoCamara;
        this.listaVuelos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTipoCamara() {
        return tipoCamara;
    }

    public void setTipoCamara(int tipoCamara) {
        this.tipoCamara = tipoCamara;
    }

    public ArrayList<Vuelo> getListaVuelos() {
        return listaVuelos;
    }

    public void setListaVuelos(ArrayList<Vuelo> listaVuelos) {
        this.listaVuelos = listaVuelos;
    }
    
    

}
