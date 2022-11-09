package archivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Emiliano Marotta 187884 - Sebastian Borjas 303433
 */
public class Serializacion {

    public static final String nombreArchivo = "datos.dat";
    
    public static Object desserializar(){
        return desserializar(nombreArchivo);
    }
    
    public static Object desserializar(String archivo) {
        Object o = null;
        
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo));
            o = in.readObject();
            in.close();
        } catch (IOException e) {
            System.out.println("Error al desserializar: " + e.toString());
        } catch (Exception e) {
            System.out.println("Error al desserializar: " + e.toString());
        }
        
        return o;
    }

    public static void serializar(Object obj){
        serializar(nombreArchivo, obj);
    }
            
    public static void serializar(String archivo, Object obj) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo));
            out.writeObject(obj);
            out.close();
        } catch (IOException e) {
            System.out.println("Error al serializar: " + e.toString());
        } catch (Exception e) {
            System.out.println("Error al serializar: " + e.toString());
        }
    }
}
