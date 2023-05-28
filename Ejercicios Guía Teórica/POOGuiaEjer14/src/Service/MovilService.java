package Service;

import Entidades.Movil;
import java.util.Scanner;

public class MovilService {
    
    Scanner scan = new Scanner(System.in);
    
    public Movil cargarCelular() {
        
        Movil cel = new Movil();
        int [ ] codigo = new int [ 7 ];
        
        System.out.println("Ingrese la marca del celular");
        cel.setMarca(scan.next());
        System.out.println("Ingrese el precio del celular");
        cel.setPreciop(scan.nextDouble());
        System.out.println("Ingrese el modelo del celular");
        cel.setModelo(scan.next());
        System.out.println("Ingrese la memoria RAM del celular");
        cel.setMemoriaRAM(scan.nextInt());
        System.out.println("Ingrese el almacenamiento del celular");
        cel.setAlmacenamiento(scan.nextInt());
        
        cel.setCodigo(ingresarCodigo(codigo));
        
        return cel;
    }
    
    public int [ ] ingresarCodigo(int [ ] codigo) {
        
        int cod;
        
        System.out.println("Ingresa un número de 7 digitos para el codigo");
        cod = scan.nextInt();
        
        while(cod > 9999999 || cod < 1000000 ) {
            System.out.println("Opcion inválida");
            System.out.println("Ingresa un número de 7 digitos para el codigo");
            cod = scan.nextInt();
        }
        
        System.out.print("Codigo = [");
        for (int i = 0; i < 7; i++) {
            
            codigo [ i ] =  scan.nextInt();
            
            System.out.print(" " + codigo [ i ]  + " ");
        }
        System.out.print("]");
        System.out.println("");
        
        return codigo;
    }
    
}
