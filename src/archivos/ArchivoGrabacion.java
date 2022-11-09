package archivos;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class ArchivoGrabacion {
    private Formatter out;
    
    public ArchivoGrabacion(String archivo){
        try {
            out = new Formatter(archivo);
        }catch(FileNotFoundException e){
            System.out.println("Error: " + e.toString());
            System.exit(1);
        }        
    }
    
    public ArchivoGrabacion(String archivo, boolean ext){
        try {
            FileWriter file = new FileWriter(archivo, ext);
            out = new Formatter(file);
        }catch(IOException e){
            System.out.println("Error: " + e.toString());
            System.exit(1);
        }
    }
    
    public void grabarLinea(String linea){
        out.format("%s%n", linea);
    }
    
    public void cerrar(){
        out.close();
    }
}
