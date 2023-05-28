package pooguiaejer13;

import Entidades.Curso;
import Services.AlumnoService;
import Services.CursoService;
import java.util.Arrays;
import java.util.Scanner;

public class POOGuiaEjer13 {
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        AlumnoService alumServ = new AlumnoService();
        
        CursoService curServ = new CursoService(); 
        Curso curs = curServ.crearCurso();
        
        System.out.println(curs.toString());
        
        System.out.println("Alumos = " + Arrays.toString(curs.getAlumnos()));
        
       //alumServ.mostrarAlumnos(curs);
        
        System.out.println("La ganancia del profesor a la semana es de = $" + curServ.calcularGanaciaSemana(curs));
        


    }

}
