package pooguiaejer2;

import Entidades.Circunferencia;
import Servicios.CincunferenciaServicio;

public class POOGuiaEjer2 {

    public static void main(String[] args) {
        
        CincunferenciaServicio cs = new CincunferenciaServicio();
        
        Circunferencia c1 = cs.CrearCircunferencia();
        
        System.out.println("El area de la circunferencia es " + cs.area(c1));
        System.out.println("El perimetro de la circunferencia es " + cs.perimetro(c1));

    }

}
