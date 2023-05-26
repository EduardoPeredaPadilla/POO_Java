package Servicios;

import Entidades.Libro;
import java.util.Scanner;

public class LibroServicio {
    
    Scanner scan = new Scanner(System.in);
    
    public Libro cargarLibro() {
        
        Libro l1 = new Libro();
        
        System.out.println("Ingrese el ISBN del libro");
        l1.setIsbn(scan.nextInt());
        System.out.println("Ingrese el título del libro");
        l1.setTitulo(scan.next());
        System.out.println("Ingrese el autor del libro");
        l1.setAutor(scan.next());
        System.out.println("Ingrese el número de páginas del libro");
        l1.setNumPag(scan.nextInt());
        
        return l1;
    }
    
    public void mostrar(Libro l1) {
        
        System.out.println("Libro: " + l1.toString());
        
    }
    
}
