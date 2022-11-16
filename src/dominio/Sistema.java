package dominio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class Sistema extends Observable implements Serializable {

    private ArrayList<Articulo> listaArticulos;
    private ArrayList<Funcionario> listaFuncionarios;
    private ArrayList<Dron> listaDrones;
    private ArrayList<Carga> listaCargas;
    private Area[] listaAreas;

    public Sistema() {
        this.listaArticulos = new ArrayList();
        this.listaFuncionarios = new ArrayList();
        this.listaDrones = new ArrayList();
        this.listaCargas = new ArrayList();
        this.listaAreas = crearAreas();
    }

    public ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
        this.listaArticulos = listaArticulos;
        this.setChanged();
        this.notifyObservers();
    }

    public ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
        this.setChanged();
        this.notifyObservers();
    }

    public ArrayList<Dron> getListaDrones() {
        return listaDrones;
    }

    public void setListaDrones(ArrayList<Dron> listaDrones) {
        this.listaDrones = listaDrones;
        this.setChanged();
        this.notifyObservers();
    }

    public ArrayList<Carga> getListaCargas() {
        return listaCargas;
    }

    public void setListaCargas(ArrayList<Carga> listaCargas) {
        this.listaCargas = listaCargas;
        this.setChanged();
        this.notifyObservers();
    }

    public Area[] getListaAreas() {
        return listaAreas;
    }

    public void setListaAreas(Area[] listaAreas) {
        this.listaAreas = listaAreas;
        this.setChanged();
        this.notifyObservers();
    }

    public boolean nombreArticuloValido(String unNombre) {
        boolean nombreArticuloValido = true;
        Iterator<Articulo> it = this.getListaArticulos().iterator();
        while (it.hasNext() && nombreArticuloValido) {
            if (it.next().getNombre().equalsIgnoreCase(unNombre)) {
                nombreArticuloValido = false;
            }
        }
        return nombreArticuloValido;
    }

    public boolean agrearArticulo(String nombre, String descripcion) {
        boolean ret = false;
        if (this.nombreArticuloValido(nombre)) {
            Articulo a = new Articulo(nombre, descripcion);
            this.getListaArticulos().add(a);
            this.setChanged();
            this.notifyObservers();
            ret = true;
        }
        return ret;
    }

    public boolean numeroFuncionarioValido(int unNumero) {
        boolean numeroFuncionarioValido = true;
        Iterator<Funcionario> it = this.getListaFuncionarios().iterator();
        while (it.hasNext() && numeroFuncionarioValido) {
            if (it.next().getNumero() == unNumero) {
                numeroFuncionarioValido = false;
            }
        }
        return numeroFuncionarioValido;
    }

    public boolean agregarFuncionario(String nombre, int edad, int numero) {
        boolean ret = false;
        if (numeroFuncionarioValido(numero)) {
            Funcionario f = new Funcionario(nombre, edad, numero);
            this.getListaFuncionarios().add(f);
            this.setChanged();
            this.notifyObservers();
            ret = true;
        }

        return ret;
    }

    public boolean idDronValido(String id) {
        boolean idDronValido = true;
        Iterator<Dron> it = this.getListaDrones().iterator();
        while (it.hasNext() && idDronValido) {
            if (it.next().getId().equalsIgnoreCase(id)) {
                idDronValido = false;
            }
        }
        return idDronValido;
    }

    public boolean agregarDron(String id, String modelo, int tipoCamara) {
        boolean ret = false;
        if (idDronValido(id)) {
            Dron d = new Dron(id, modelo, tipoCamara);
            this.getListaDrones().add(d);
            this.setChanged();
            this.notifyObservers();
            ret = true;
        }
        return ret;
    }

    public Dron buscarDron(String id) {
        Dron d = null;
        ArrayList<Dron> listaD = this.getListaDrones();
        for (int i = 0; i < listaD.size() && d == null; i++) {
            Dron unDron = listaD.get(i);
            if (unDron.getId().equals(id)) {
                d = unDron;
            }
        }
        return d;
    }

    public boolean agregarVuelo(boolean exitoso, String area, String idDron, int fila, int coincidencias, int diferencias, int cantCargas, String nombreArchivo) {
        boolean ret = false;
        Dron d = buscarDron(idDron);
        if (d != null) {
            Vuelo v = new Vuelo(exitoso, area, d, fila, coincidencias, diferencias, cantCargas, nombreArchivo);
            d.getListaVuelos().add(v);
            this.setChanged();
            this.notifyObservers();
            ret = true;
        }
        return ret;
    }

    public boolean codigoCargaValido(int unNumero) {
        boolean codigoCargaValido = true;
        Iterator<Carga> it = this.getListaCargas().iterator();
        while (it.hasNext() && codigoCargaValido) {
            if (it.next().getCodigo() == unNumero) {
                codigoCargaValido = false;
            }
        }
        return codigoCargaValido;
    }

    public boolean ingresarCarga(int area, int fila, int col, Funcionario f, Articulo a, int cantidad, int codigo) {
        boolean ret = false;
        if (codigoCargaValido(codigo)) {
            Area[] areas = this.getListaAreas();
            Carga[][] tableroCargas = areas[area].getCargas();
            tableroCargas[fila][col].setFuncionario(f);
            tableroCargas[fila][col].setArticulo(a);
            tableroCargas[fila][col].setCantArticulos(cantidad);
            tableroCargas[fila][col].setCodigo(codigo);
            this.getListaCargas().add(tableroCargas[fila][col]);
            this.setChanged();
            this.notifyObservers();
            ret = true;
        }

        return ret;
    }

    public void egresarCarga(Carga unaCarga) {
        this.getListaCargas().remove(unaCarga);
        unaCarga.setCodigo(0);
        unaCarga.setFuncionario(null);
        unaCarga.setArticulo(null);
        unaCarga.setCantArticulos(0);
        this.setChanged();
        this.notifyObservers();
    }

    public Area[] crearAreas() {
        Area[] ret = new Area[5];

        String nombreAreas = "ABCDE";
        //Le agrega el nombre correspondiente a cada area.
        for (int i = 0; i < ret.length; i++) {
            ret[i] = new Area(nombreAreas.charAt(i) + "");

        }

        return ret;
    }

    public void guardarSistema(Sistema s) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.dat"));
            out.writeObject(s);
            out.close();
            //Possibles excepciones https://docs.oracle.com/en/java/javase/13/docs/specs/serialization/exceptions.html
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public Sistema cargarSistema() {
        Sistema s = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.dat"));
            s = (Sistema) in.readObject();
            in.close();
            
         //Excepciones de readObject() https://docs.oracle.com/en/java/javase/13/docs/specs/serialization/input.html#the-readobject-method

        } catch (IOException | ClassNotFoundException e) {
            s = new Sistema();

        }
        return s;
    }
}
