/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borja 303433
 */
public class Dron {

    private String id;
    private String modelo;
    private int tipoCamara;
    private ArrayList<Vuelo> listaVuelos;

    public Dron(String id, String modelo, int tipoCamara) {
        this.id = id;
        this.modelo = modelo;
        this.tipoCamara = tipoCamara;
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

}
