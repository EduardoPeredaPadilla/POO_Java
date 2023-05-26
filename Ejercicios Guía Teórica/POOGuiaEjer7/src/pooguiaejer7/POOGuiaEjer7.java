package pooguiaejer7;

import Entidades.Persona;
import Services.PersonaService;

public class POOGuiaEjer7 {

    public static void main(String[] args) {
        
        int N = 4;
        double [ ] vectorPI = new double [ N ];
        boolean [ ] vectorME = new boolean [ N ];
        int contPIDeb = 0;
        int contPIOk = 0;
        int contPISobP = 0;
        double porcentP1;
        double porcentP2;
        double porcentP3;
        int contMayorE = 0;
        int contMenorE = 0;
                
        double MayE;
        double MenE;
                
        PersonaService ps = new PersonaService();
        
        
        for (int i = 0; i < N; i++) {
            Persona pers = ps.crearPersona();
            vectorPI [ i ] = ps.calcularIMC(pers);
            vectorME [ i ] = ps.esMayorDeEdad(pers);
        }
        
        for (int i = 0; i < N; i++) {
            if (vectorPI [ i ] < 0) {
                contPIDeb++;
            }else if (vectorPI [ i ] == 0) {
                contPIOk++;
            } else if (vectorPI [ i ] == 1) {
                contPISobP++;
            }
            
            if (vectorME [ i ] == true) {
                contMayorE++;
            } else {
                contMenorE++;
            }
        }
        
//        System.out.println("Cont -1 = " + contPIDeb);
//        System.out.println("Cont 0 = " + contPIOk);
//        System.out.println("Cont +1 = " + contPISobP);
//        System.out.println("Mayores = " + contMayorE);
//        System.out.println("Menores = " + contMenorE);
//        
//        System.out.println("N = " + N);
//        
        porcentP1 = ((double) contPIDeb / N) * 100;
        porcentP2 = ((double) contPIOk / N) * 100;
        porcentP3 = ((double) contPISobP / N) * 100;
        
        MayE = ((double) contMayorE / N) * 100;
        MenE = ((double) contMenorE / N) * 100;
//        
//        System.out.println(porcentP1);
//        System.out.println(porcentP2);
//        System.out.println(porcentP3);
//        System.out.println(MayE);
//        System.out.println(MenE);
        
        System.out.println("------------------------------");
        System.out.println("Resultados");
        System.out.println("El porcentaje de personas por debajo de su peso ideal es de " + porcentP1 + "%");
        System.out.println("El porcentaje de personas en su peso ideal es de " + porcentP2 + "%");
        System.out.println("El porcentaje de personas con sobrepeso es de " + porcentP3+ "%");
        System.out.println("------------------------------");
        System.out.println("El pocentaje de personas mayores de edad es de " + (double) MayE + "%");
        System.out.println("El pocentaje de personas menores de edad es de " + (double) MenE + "%");

    }

}
