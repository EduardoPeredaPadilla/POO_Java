package pooguiaejer10;

import java.util.Arrays;


public class POOGuiaEjer10 {


    public static void main(String[] args) {
        
        double [ ] arregloA = new double [ 50 ];
        double [ ] arregloB = new double [ 20 ];
        
        for (int i = 0; i < 50; i++) {
            arregloA [ i ] = Math.round( (Math.random())* 100.0) / 100.0;
        }
        //Arrays.fill(arregloA, Math.round( (Math.random())* 100.0) / 100.0);
        System.out.println("Arreglo inicializado");
        System.out.println(Arrays.toString(arregloA));
        
        Arrays.sort(arregloA);
        System.out.println("Arreglo ordenado sort");
        System.out.println(Arrays.toString(arregloA));
        
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                arregloB [ i ] = arregloA [ i ];
            }
        }
        
        Arrays.fill(arregloB, 10, 20, 0.5);
        System.out.println("Arrglos A y B ordenados");
        System.out.println(Arrays.toString(arregloA));
        System.out.println(Arrays.toString(arregloB));
    }

}
