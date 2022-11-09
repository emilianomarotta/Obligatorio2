package archivos;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class ArchivoLectura {
    private Scanner in;
    private String linea;
    
    public ArchivoLectura(String rutaArchivo){
        try {
            this.in = new Scanner(Paths.get(rutaArchivo));
        }catch(IOException e){
            System.out.println("Error: " + e.toString());
            System.exit(1);
        }
    }
    
    //Este metodo me retorna si hay mas lineas y avanza de linea cuando se invoca
    public boolean hayMasLineas(){
        boolean ret = false;
        this.linea = null;
        if(this.in.hasNext()){
            this.linea = this.in.nextLine();
            ret = true;
        }        
        return ret;
    }
    
    public String linea(){
        return this.linea;
    }
    
    public void cerrar(){
        this.in.close();
    }
}
