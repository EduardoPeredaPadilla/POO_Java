package mascotaapp;

import mascotaapp.entidades.Mascota;
import mascotaapp.servicios.ServicioMascota;

public class MascotaAPP {

    public static void main(String[] args) {
        
//        Mascota m1 = new Mascota("Maya Delmal", "Maya", "Perro", "Negro", 3, true, "Electric");
//        
//        System.out.println(m1.getApodo());
//        
//        System.out.println(m1.toString());
//        
//        m1.pasear(100, 3);
//
//        System.out.println(m1.toString());

//        ServicioMascota sm = new ServicioMascota();
//        Mascota m1 = sm.crearMascota();
//        System.out.println(m1.toString());
//        
//        m1 = null;

        //Parámetro por valor o por Referencia
        //Los métodos que creamos siempre pasan por referencia y las variables por valor
        int a = 10;
        
        Mascota mm = new Mascota();
        
        modificador(a, mm);
        
        System.out.println("a " + a);
        System.out.println("Mascota " + mm);
       
    }
    
    public static void modificador(int num, Mascota m) {
        
        num = 100;
        m.setApodo("Nuevo apodo referencia");
    }

}
