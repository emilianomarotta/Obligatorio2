package dominio;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class Area {

    private Carga[][] cargas;
    private String area;
    
    public Area (String unArea){
        this.area = unArea;
        this.cargas = new Carga[10][12];
    }

    public Carga[][] getCargas() {
        return cargas;
    }

    public void setCargas(Carga[][] cargas) {
        this.cargas = cargas;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
    
    
}
