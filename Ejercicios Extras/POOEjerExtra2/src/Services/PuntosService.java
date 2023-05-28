package Services;

import Entidades.Puntos;
import java.util.Scanner;

public class PuntosService {
    
    Scanner sc = new Scanner (System.in);
    
    public Puntos crearPuntos() {
        
        Puntos pt = new Puntos();
        
        System.out.println("Ingrese el valor del punto 1");
        System.out.println("Valor para x1");
        pt.setX1(sc.nextInt());
        System.out.println("Valor para y1");
        pt.setY1(sc.nextInt());
        System.out.println("Ingrese el valor del punto 2");
        System.out.println("Valor para x2");
        pt.setX2(sc.nextInt());
        System.out.println("Valor para y2");
        pt.setY2(sc.nextInt());
        
        return pt;
    }
    
    public double calcularDistancia(Puntos pt) {
        
        double distancia;
        
        distancia = Math.sqrt(Math.pow((pt.getX2() - pt.getX1()), 2) + Math.pow(pt.getY2() - pt.getY1(), 2));
        
        return distancia;
    }
    
}
