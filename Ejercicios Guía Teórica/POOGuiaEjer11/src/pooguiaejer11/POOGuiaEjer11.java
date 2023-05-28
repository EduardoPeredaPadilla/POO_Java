package pooguiaejer11;

import java.util.Date;
import java.util.Scanner;

public class POOGuiaEjer11 {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresa un año");
        int anio = scan.nextInt();
        System.out.println("Ingresa un mes");
        int mes = scan.nextInt() - 1;
        System.out.println("Ingresa un día");
        int dia = scan.nextInt();
        
        Date fecha = new Date(anio - 1900, mes, dia);
        System.out.println(fecha);
        
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        
        Date fechaDif = new Date();
        
        fechaDif.setYear(fechaActual.getYear() - fecha.getYear());
        
        System.out.println("años transcurridos de la fecha ingresada a la actual = " + fechaDif.getYear());

    }

}
