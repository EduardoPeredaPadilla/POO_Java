package Entidades;

import java.util.Scanner;

public class Meses {
    
    
    private String [ ] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto = meses [ 7 ];

    public Meses() {
    }
    
    
    
    public void adivinaMesSecreto() {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre del mes");
        String mes = scan.next();
        
        while (!mesSecreto.equalsIgnoreCase(mes)) {
            System.out.println("No ha acertado. Intentalo nuevamente");
            System.out.println("Ingrese el nombre del mes");
            mes = scan.next();
        }

        System.out.println("El mes secreto es " + mesSecreto + ", Acertaste!");
    }
    
}
