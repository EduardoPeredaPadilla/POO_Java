package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

public class CincunferenciaServicio {
    
    Scanner scan = new Scanner(System.in);
    
    public Circunferencia CrearCircunferencia() {
        
        Circunferencia c1 = new Circunferencia();
        
        System.out.println("Ingrese el radio de la circunferencia");
        c1.setRadio(scan.nextDouble());
        
        return c1;
    }
    
    public Double area(Circunferencia c1) {
        
        Double area = (3.1416 * (c1.getRadio() * c1.getRadio()));
        
        return area;
    }
    
    public Double perimetro(Circunferencia c1) {
        
        Double perimetro = (2 * 3.1416 * c1.getRadio());
        
        return perimetro;
    }
    
}
