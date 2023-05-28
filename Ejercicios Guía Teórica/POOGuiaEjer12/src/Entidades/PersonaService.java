package Entidades;

import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        
        Persona pers = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        pers.setNombre(scan.next());
        System.out.println("Ingrese el año de nacimiento");
        int anio = scan.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = scan.nextInt() - 1;
        System.out.println("Ingrese el día de nacimiento");
        int dia = scan.nextInt();
        
        Date fecha = new Date(anio - 1900, mes, dia);
        pers.setFechaNac(fecha);
        
        return pers;
    }
    
    public int calcularEdad(Persona pers) {
        
        Date fechaAct = new Date();
        int edadPers = fechaAct.getYear() - pers.getFechaNac().getYear();
        
        return edadPers;
    }
    
    public boolean menorQue(Persona pers, int edad) {
        
        boolean validar;
        
        if (calcularEdad(pers) <= edad) {
            validar = true;
        } else {
            validar = false;
        }
        
        return validar;
    }
    
    public void mostrarPersona(Persona pers) {
        
        System.out.println("Persona creada = " + pers.toString());
        
    }

    
}
