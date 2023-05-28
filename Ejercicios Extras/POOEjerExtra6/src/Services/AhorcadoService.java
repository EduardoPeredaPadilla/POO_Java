package Services;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {
        
        Scanner scan = new Scanner(System.in);
    
    public Ahorcado crearJuego(){

        Ahorcado play = new Ahorcado();
        System.out.println("Ingrese la palabra para el juego");
        String palabra = scan.next();
        System.out.println("Ingrese la cantidad de jugadas máxima");
        play.setCantJugadasMax(scan.nextInt());
        int tamPal = palabra.length();
        
        String [ ] vector = new String [ tamPal ];
        for (int i = 0; i < tamPal; i++) {
            if (i < tamPal - 1) {
                vector [ i ] = palabra.substring( i, i + 1);
            } else {
                vector [ i ] = palabra.substring( i );
            }
        }
        play.setVector(vector);
        play.setCantLetrasEnc(0);
        
        return play;
    }
    
    public void longitud(Ahorcado play) {
        System.out.println("Tamaño de la palabra = " + play.getVector().length);
    }
    
    public void buscar(Ahorcado play) {
        
        System.out.println("Ingrese una letra a buscar");
        String letra = scan.next();
        
        for (int i = 0; i < play.getVector().length; i++) {
            if (play.getVector(i).equalsIgnoreCase(letra)) {
                System.out.println("La letra ingresada " + letra + " se encuentra en la palabra");
                return;
            } 
        }
        System.out.println("La letra ingresada " + letra + " no se encuentra en la palabra");
    }
    
    public boolean encontradas(Ahorcado play) {
        
        boolean encontrada;
        int cantEnc = 0;
        
        System.out.println("Ingrese una letra a buscar");
        String letra = scan.next();
        
        for (int i = 0; i < play.getVector().length; i++) {
            if (play.getVector(i).equalsIgnoreCase(letra)) {
                cantEnc++;
            } 
        }
        
        if(cantEnc > 0) {
            encontrada = true;
            System.out.println("Se han encontrado " + cantEnc + " veces, faltan por encontrar " + (play.getVector().length - cantEnc));
            return encontrada;
        } else {
            encontrada = false;
            play.setCantJugadasMax(play.getCantJugadasMax() - 1);
            System.out.println("La letra no se encontró, te quedan " + play.getCantJugadasMax() + " opotunidades");
            return encontrada;
        }
        
    }
    
    public int intentos(Ahorcado play) {
        return play.getCantJugadasMax();
    }
    
    public void juego() {
        
        Ahorcado play = crearJuego();
        longitud(play);
        buscar(play);
        encontradas(play);
        System.out.println("Intentos restantes = " + intentos(play));
        
        while (intentos(play) > 0) {
            encontradas(play);
            System.out.println("Intentos restantes = " + intentos(play));
        }
        
        if (intentos(play) == 0) {
            System.out.println("Lo sentimos, no hay más oportunidades");
        }
        
    }
    
}
