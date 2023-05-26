package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

public class OperacionServicio {
    
    Scanner scan = new Scanner(System.in);
    
    public Operacion crearOperacion() {
        
        Operacion o1 = new Operacion();
        System.out.println("Ingrese el número 1");
        o1.setNum1(scan.nextInt());
        System.out.println("Ingrese el número 2");
        o1.setNum2(scan.nextInt());
        return o1;
    }
    
    public int sumar(Operacion o1) {
        int sumar = o1.getNum1() + o1.getNum2();
        return sumar;
    }
    
    public int restar(Operacion o1) {
        int restar = o1.getNum1() - o1.getNum2();
        return restar;
    }
    
    public int multiplicar(Operacion o1) {
        int multiplicacion;
        if (o1.getNum1() == 0 || o1.getNum2() == 0) {
            multiplicacion = 0;
            //System.out.println("Error Mult : Ingesaste un número 0");
        } else {
            multiplicacion = o1.getNum1() * o1.getNum2();
        }
        return multiplicacion;
    }
    
    public Double dividir(Operacion o1) {
        Double dividir;
        if (o1.getNum1() == 0 || o1.getNum2() == 0) {
            dividir = 0.0;
            //System.out.println("Error Div : Ingesaste un número 0");
        } else {
            dividir = (double) (o1.getNum1() / o1.getNum2());
        }
        return dividir;
    }
    
}
