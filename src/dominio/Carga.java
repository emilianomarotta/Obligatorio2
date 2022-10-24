package dominio;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class Carga {

    private int codigo;
    private Funcionario funcionario;
    private Articulo articulo;
    private int cantArticulos;

    public Carga() {
       // Se asume el codigo -1 para cargas vacias
        this(-1, null, null, 0);
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
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCantArticulos() {
        return cantArticulos;
    }

    public void setCantArticulos(int cantArticulos) {
        this.cantArticulos = cantArticulos;
    }

}
