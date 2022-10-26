package dominio;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class Sistema {

    private ArrayList<Articulo> listaArticulos;
    private ArrayList<Funcionario> listaFuncionarios;
    private ArrayList<Dron> listaDrones;
    private ArrayList<Carga> listaCargas;

    public Sistema() {
        this.listaArticulos = new ArrayList();
        this.listaFuncionarios = new ArrayList();
        this.listaDrones = new ArrayList();
        this.listaCargas = new ArrayList();
    }

    public ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }

    public ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public ArrayList<Dron> getListaDrones() {
        return listaDrones;
    }

    public void setListaDrones(ArrayList<Dron> listaDrones) {
        this.listaDrones = listaDrones;
    }

    public ArrayList<Carga> getListaCargas() {
        return listaCargas;
    }

    public void setListaCargas(ArrayList<Carga> listaCargas) {
        this.listaCargas = listaCargas;
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

    public boolean edadFuncionarioValida(int edad) {
        boolean edadFuncionarioValida = true;
        if (edad > 100 || edad < 18) {
            edadFuncionarioValida = false;
        }
        return edadFuncionarioValida;
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

    public void egresarCarga(Carga unaCarga) {
        unaCarga.setCodigo(-1);
        unaCarga.setFuncionario(null);
        unaCarga.setArticulo(null);
        unaCarga.setCantArticulos(0);
    }
}
