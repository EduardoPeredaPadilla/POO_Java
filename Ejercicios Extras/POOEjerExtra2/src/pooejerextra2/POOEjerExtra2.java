package pooejerextra2;

import Entidades.Puntos;
import Services.PuntosService;

public class POOEjerExtra2 {

    public static void main(String[] args) {
        
        PuntosService ptServ = new PuntosService();
        Puntos pt = ptServ.crearPuntos();
        
        System.out.println("La distancia es = " + ptServ.calcularDistancia(pt));

    }

}
