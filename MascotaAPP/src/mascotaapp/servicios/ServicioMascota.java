package mascotaapp.servicios;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;

public class ServicioMascota {
    
    private Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public Mascota crearMascota() {
        
        System.out.println("Introducir nombre");
        String nombre = scan.next();
        
        System.out.println("Introducir apodo");
        String apodo = scan.next();
        
        System.out.println("Introducir tipo");
        String tipo = scan.next();
        

        return new Mascota(nombre, apodo, tipo); 
    }
    
}
