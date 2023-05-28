package Services;

import Entidades.Raices;
import java.util.Random;

public class RaicesService {
    
    Random random = new Random();
    
    public Raices crearRaiz(){
        
        Raices rz = new Raices();
        rz.setA(random.nextInt(10-1+1)+1);
        rz.setB(random.nextInt(10-1+1)+1);
        rz.setC(random.nextInt(10-1+1)+1);
        
//        rz.setA(1);
//        rz.setB(9);
//        rz.setC(6);

        return rz;
    }
    
    public double getDiscriminante(Raices rz) {
        
        double disc;
        
        disc = Math.pow(rz.getB(), 2) - 4 * rz.getA() * rz.getC();
        
        return disc;
    }

public boolean tieneRaices(Raices rz) {
    
    boolean tieneRaices;
    
    if(getDiscriminante(rz) >= 0) {
        tieneRaices = true;
    } else {
        tieneRaices = false;
    }
    
    return tieneRaices;
}

public boolean tieneRaiz(Raices rz) {
    
    boolean tieneRaiz;
    
    if(getDiscriminante(rz) == 0) {
        tieneRaiz = true;
    } else {
        tieneRaiz = false;
    }
    
    return tieneRaiz;
}

    public void obtenerRaices(Raices rz) {
        
        double sol1;
        double sol2;
        
        if (tieneRaices(rz) == true){
            sol1 = (- rz.getB() + ((Math.pow(rz.getB(), 2))-(4 * rz.getA() * rz.getC()))) / (2 * rz.getA());
            sol2 = (- rz.getB() - ((Math.pow(rz.getB(), 2))-(4 * rz.getA() * rz.getC()))) / (2 * rz.getA());
            System.out.println(sol1);
            System.out.println(sol2);
        } else {
            System.out.println("No tiene raices");
        }
    }
    
    public void obtenerRaiz(Raices rz) {
        
        double sol;

        if (tieneRaiz(rz) == true){
            sol = (- rz.getB() + ((Math.pow(rz.getB(), 2))-(4 * rz.getA() * rz.getC()))) / (2 * rz.getA());
            System.out.println(sol);
        } else {
            System.out.println("No tiene raices");
        }
    }
    
    public void calcular(Raices rz) {
        
        double sol1;
        double sol2;
        double sol;
        
        if (tieneRaices(rz) == true){
            sol1 = (- rz.getB() + ((Math.pow(rz.getB(), 2))-(4 * rz.getA() * rz.getC()))) / (2 * rz.getA());
            sol2 = (- rz.getB() - ((Math.pow(rz.getB(), 2))-(4 * rz.getA() * rz.getC()))) / (2 * rz.getA());
            System.out.println(sol1);
            System.out.println(sol2);
        } else {
            System.out.println("No tiene raices");
        }
        
        if (tieneRaiz(rz) == true){
            sol = (- rz.getB() + ((Math.pow(rz.getB(), 2))-(4 * rz.getA() * rz.getC()))) / (2 * rz.getA());
            System.out.println(sol);
        } else {
            System.out.println("No tiene raices");
        }
        
    }
    
}
