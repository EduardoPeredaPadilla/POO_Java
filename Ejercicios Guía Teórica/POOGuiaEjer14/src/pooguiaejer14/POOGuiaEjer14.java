package pooguiaejer14;

import Entidades.Movil;
import Service.MovilService;


public class POOGuiaEjer14 {

    public static void main(String[] args) {
        
        MovilService movServ = new MovilService();
        Movil cel = movServ.cargarCelular();
        
        System.out.println("Celular = " + cel.toString());

    }

}
