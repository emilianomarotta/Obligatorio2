package dominio;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class Area {

    private Carga[][] cargas;
    
    public Area (Carga[][] unaCarga){
        this.cargas = unaCarga;
    }

    public Carga[][] getCargas() {
        return cargas;
    }

    public void setCargas(Carga[][] cargas) {
        this.cargas = cargas;
    }
    
    
}
