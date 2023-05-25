package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

public class RectanguloServicio {
    
    Scanner scan = new Scanner(System.in);
    
    public Rectangulo CrearRectangulo() {
        
        Rectangulo r1 = new Rectangulo();
        System.out.println("Ingrese la base del rectangulo");
        r1.setBase(scan.nextInt());
        System.out.println("Ingrese la altura del rectangulo");
        r1.setAltura(scan.nextInt());
        
        return r1;
    }
    
    public int superficie(Rectangulo r1) {
        int superficie = r1.getAltura() * r1.getBase();
        return superficie;
    }
    
    public int perimetro(Rectangulo r1) {
        int perimetro = (r1.getAltura() + r1.getBase()) * 2;
        return perimetro;
    }
    
    public void mostrarRectangulo(Rectangulo r1) {
        
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                if (i == 0 || i == r1.getAltura() - 1 || j == 0 || j == r1.getBase() - 1)  {
                    System.out.print(" * ");
                } else if (i > 0 && j < r1.getBase()) {
                    System.out.print("   ");
                }
                if (j == r1.getBase() - 1) {
                    System.out.println("");
                }
            }
        }
        
    }
    
    
}
