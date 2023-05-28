package pooejerextra3;

import Entidades.Raices;
import Services.RaicesService;

public class POOEjerExtra3 {

    public static void main(String[] args) {
        
        RaicesService rzServ = new RaicesService();
        Raices rz = rzServ.crearRaiz();
        System.out.println(rz.toString());
        
        System.out.println("Valor del discriminante = " + rzServ.getDiscriminante(rz));
        
        System.out.println("tiene raices = " + rzServ.tieneRaices(rz));
        System.out.println("tiene raiz = " + rzServ.tieneRaiz(rz));
        
        rzServ.obtenerRaices(rz);
        
        rzServ.calcular(rz);
        
    }
    


}
