package Services;

import Entidades.Alumno;
import Entidades.Curso;

import java.util.Scanner;

public class AlumnoService {
    
    Scanner scan = new Scanner(System.in);
    
    public Alumno cargarAlumnos(Curso curs) {
        
        String [ ] alumno = new String[ 5 ];
        Alumno alum = new Alumno();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            alumno [ i ] = scan.next();
            
        }
       
        curs.setAlumnos(alumno);
        
        return alum;
    }
    
    public void mostrarAlumnos(Curso curs) {
        
        String [ ] alumnos = curs.getAlumnos();
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Alumno [ " + (i + 1) + " ] = " + alumnos [ i ] );
            
        }
        
    }



    
}
