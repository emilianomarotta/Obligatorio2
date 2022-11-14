package dominio;

import java.io.Serializable;
import java.util.Observable;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class Carga extends Observable implements Serializable{

    private int codigo;
    private Funcionario funcionario;
    private Articulo articulo;
    private int cantArticulos;

    public Carga() {
       // Se asume el codigo 0 para cargas vacias
        this(0, null, null, 0);
    }

    public Carga(int codigo, Funcionario funcionario, Articulo articulo, int cantArticulos) {
        this.codigo = codigo;
        this.funcionario = funcionario;
        this.articulo = articulo;
        this.cantArticulos = cantArticulos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
        this.setChanged();
        this.notifyObservers();
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
        this.setChanged();
        this.notifyObservers();
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
        this.setChanged();
        this.notifyObservers();
    }

    public int getCantArticulos() {
        return cantArticulos;
    }

    public void setCantArticulos(int cantArticulos) {
        this.cantArticulos = cantArticulos;
        this.setChanged();
        this.notifyObservers();
    }

}
