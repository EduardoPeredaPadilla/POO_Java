package pooejerextra4;

import Entidades.NIF;
import Services.NIFService;

public class POOEjerExtra4 {


    public static void main(String[] args) {
        
        NIFService nfServ = new NIFService();
        NIF nf = nfServ.crearNif();
        nfServ.mostrar(nf);

    }

}
