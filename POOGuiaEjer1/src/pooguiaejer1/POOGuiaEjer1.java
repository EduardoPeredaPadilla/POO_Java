package pooguiaejer1;

import Entidades.Libro;
import Servicios.LibroServicio;

public class POOGuiaEjer1 {


    public static void main(String[] args) {
        
        LibroServicio ls = new LibroServicio();
        Libro l1 = ls.cargarLibro();
        
        ls.mostrar(l1);

    }

}
