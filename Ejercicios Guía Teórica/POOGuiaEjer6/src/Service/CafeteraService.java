package Service;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraService {
    
    Scanner scan = new Scanner(System.in);
    
    public Cafetera crearCafetera() {
        
        Cafetera caf = new Cafetera();
        System.out.println("Ingrese la capacidad máxima de cargas de la cafetera");
        caf.setCapacidadMaxima(scan.nextInt());
        System.out.println("Ingrese la cantidad de cargas que continue actualmente la cafetera");
        caf.setCantidadActual(scan.nextInt());
        return caf;
    }
    
    public int llenarCafetera(Cafetera caf) {
        caf.setCantidadActual(caf.getCapacidadMaxima());
        System.out.println("Llenando cafetera");
        System.out.println("La cafetera ahora tiene " + caf.getCantidadActual() + " cargas");
        return caf.getCantidadActual();
    }
    
    public int servirTaza(Cafetera caf) {
        
        int cantActTaza;
        System.out.println("Ingrese la capacidad de cargas de la taza");
        int capTaza = scan.nextInt();
        System.out.println("Sirviendo café en la taza");
        if (capTaza > caf.getCantidadActual()) {
            System.out.println("La taza no se llenó, faltaron " + (capTaza - caf.getCantidadActual()) + " cargas para llenarla");
            cantActTaza = capTaza - caf.getCantidadActual();
            caf.setCantidadActual(0);
            System.out.println("La cafetera ahora tiene " + caf.getCantidadActual() + " cargas para café");
            return cantActTaza;
        } else {
            System.out.println("La taza se llenó");
            cantActTaza = capTaza;
        }
        caf.setCantidadActual(caf.getCantidadActual() - cantActTaza);
        System.out.println("La cafetera ahora tiene " + caf.getCantidadActual() + " cargas para café");
        return cantActTaza;
    }
    
    public int vaciarCafe(Cafetera caf) {
        System.out.println("Vaciando cafetera");
        caf.setCantidadActual(0);
        System.out.println("Cantidad de cargsa en cafetera = " + caf.getCantidadActual());
        return caf.getCantidadActual();
    }
    
    public int agregarCafe(Cafetera caf) {
        System.out.println("La cafetera een este momento tiene " + caf.getCantidadActual() + " cargas");
        System.out.println("Ingrese la cantidad de cargas de café para agregar a la cafetera");
        int cantIngresoCafe = scan.nextInt();
        while (cantIngresoCafe > (caf.getCapacidadMaxima() - caf.getCantidadActual())) {
            System.out.println("La cantidad de cargas que deseas agregar sobrepasa la capaciad actual restante, que es de " + (caf.getCapacidadMaxima() - caf.getCantidadActual()));
            System.out.println("Ingrese la cantidad de cargas de café para agregar a la cafetera");
            cantIngresoCafe = scan.nextInt();
        }
        caf.setCantidadActual(cantIngresoCafe + caf.getCantidadActual());
        System.out.println("La cafetera ahora tiene " + caf.getCantidadActual() + " cargas para café");

        return caf.getCantidadActual();
    }
    
}
