package pooguiaejer8;

import Entidades.Cadena;
import Services.CadenaService;
import java.util.Scanner;

public class POOGuiaEjer8 {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        CadenaService cadServ = new CadenaService();
        Cadena cad = cadServ.crearCadena();
        
        System.out.println(cad.getFrase());
        System.out.println(cad.getLongit());
        
        cadServ.mostrarVocales(cad);
        System.out.println(cadServ.invertirFrase(cad));
        
        System.out.println("Ingrese una letrapara buscar en la frase");
        cadServ.vecesRepetido(cad, scan.next());
        
        System.out.println("Ingrese una nueva frase para comparra su longitud con la frase de la cadena");
        cadServ.compararLongitud(cad, scan.next());
        
        System.out.println("Ingrese una nueva frase para unirla con la frase de la cadena");
        cadServ.unirFrases(cad, scan.next());
        
        System.out.println("Ingrese una letra par sustituir por la letra 'a' de la frase de la cadena ");
        cadServ.reemplazar(cad, scan.next());
        
        System.out.println("Ingrese una letra para validar si se encuentra en la frase de la cadena");
        System.out.println(cadServ.contiene(cad, scan.next()));

    }
    
    

}
