package Servicios;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

public class VendedorServicio {
    
    Scanner scan = new Scanner(System.in);
    
    public Vendedor altaVendedor(){
        
        //instanciar un objeto de tipo vendedor
        Vendedor v1 = new Vendedor();
        //lleno los atributos
        System.out.println("Ingrese el nombre del vendedor");
        v1.setNombre(scan.next());
        System.out.println("Ingrese el dni del vendedor");
        v1.setDni(scan.nextInt());
        System.out.println("Ingrese el sueldo base del vendedor");
        v1.setSueldoBasico(scan.nextDouble());
        System.out.println("Ingrese el día que comenxó a trabajar");
        int dia = scan.nextInt();
        System.out.println("Ingrese el mes que comenzó a trabajar");
        int mes = scan.nextInt();
        System.out.println("Ingrese el año que comenzó a trabajar");
        int anio = scan.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        v1.setFechaInicio(fecha);
        
        return v1;
    }
    
    public void SueldoMensual(Vendedor v1) {
        
        System.out.println("Ingrese cuales fueron las ventas totales del vendedor");
        Double ventas = scan.nextDouble();
        v1.setComisiones(ventas * 0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor :"
        + v1.getNombre() + " es de $" + v1.getSueldoMensual()); 
        
    }
    
    public void vacaciones(Vendedor v1) {
        
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();
        
        if (antiguedad < 5) {
            System.out.println("Le corresponden 14 días de vacaciones");
        } else if(antiguedad<10) {
            System.out.println("Le corresponden 21 días de vacaciones");
        } else if(antiguedad<20) {
            System.out.println("Le corresponden 28 días de vacaciones");
        } else if(antiguedad>20) {
            System.out.println("Le corresponden 35 días de vacaciones");
        } else {
            System.out.println("El vendedor tiene vacaciones proporcionales");
        }
        
    }
    
}
