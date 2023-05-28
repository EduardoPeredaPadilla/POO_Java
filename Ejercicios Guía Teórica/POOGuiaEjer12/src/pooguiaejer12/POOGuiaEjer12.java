package pooguiaejer12;

import Entidades.Persona;
import Entidades.PersonaService;
import java.util.Scanner;


public class POOGuiaEjer12 {

    
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        PersonaService perServ = new PersonaService();
        Persona pers = perServ.crearPersona();
        
        System.out.println("La edad de la persona es " + perServ.calcularEdad(pers));
        
        System.out.println("Ingresa la edad de otra persona");
        //int edad = scan.nextInt();
        System.out.println("La persona " + pers.getNombre() + ", es menor que la edad que la ingresada = " + perServ.menorQue(pers, scan.nextInt()));
        
        perServ.mostrarPersona(pers);
        
    }

}
