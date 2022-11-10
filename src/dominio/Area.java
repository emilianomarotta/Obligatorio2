package dominio;

import java.io.Serializable;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class Area implements Serializable{

    private Carga[][] cargas;
    private String area;

    public Area(String unArea) {
        this.area = unArea;
        this.cargas = crearCargas();
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

    public Carga[][] crearCargas() {
        Carga ret[][] = new Carga[12][10];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 10; j++) {
                ret[i][j] = new Carga();
            }
        }
        return ret;
    }

}
