package pooguiaejer4;

import Entidades.Rectangulo;
import Servicios.RectanguloServicio;

public class POOGuiaEjer4 {


    public static void main(String[] args) {
        
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo r1 = rs.CrearRectangulo();
        
        System.out.println("La superficie del rectangulo es = " + rs.superficie(r1));
        System.out.println("El perímetro del rectangulo es = " + rs.perimetro(r1));
        rs.mostrarRectangulo(r1);
        
    }

}
