package pooguiaejer6;

import Entidades.Cafetera;
import Service.CafeteraService;

public class POOGuiaEjer6 {

    public static void main(String[] args) {
        
        CafeteraService cs = new CafeteraService();
        Cafetera caf = cs.crearCafetera();
        
        cs.llenarCafetera(caf);
        cs.servirTaza(caf);
        
        cs.agregarCafe(caf);
        
        cs.vaciarCafe(caf);
    }

}
