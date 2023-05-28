package Services;

import Entidades.NIF;
import java.util.Scanner;

public class NIFService {
    
    Scanner scan = new Scanner(System.in);
    
    public NIF crearNif() {
        
        NIF nf = new NIF();
        System.out.println("Ingrese el DNI ( 8 digitos)");
        nf.setDNI(scan.nextLong());
        nf.setLetra(obtenerLetra(nf));
        
        return nf;
    }
    
    public String obtenerLetra(NIF nf) {
        
        String letra = "Error";
        long resulDiv = (long) (nf.getDNI() / 23) * 23;
        //System.out.println(resulDiv);
        int resto = (int) (nf.getDNI() - resulDiv);
       //System.out.println(resto);
        int [ ] pos =  {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        String [ ] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V"};
        
        for (int i = 0; i < 18; i++) {
            if (pos[ i ] == resto) {
                letra = letras [ i ];
                return letra;
            }
        }
        
        return letra;
    }
    
    public void mostrar(NIF nf) {
        
        System.out.println("NIF = " + nf.getDNI() + "-" + nf.getLetra());
        
    }
    
}
