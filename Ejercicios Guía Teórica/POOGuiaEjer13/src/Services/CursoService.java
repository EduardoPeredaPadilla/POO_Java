package Services;

import Entidades.Alumno;
import Entidades.Curso;
import java.util.Scanner;

public class CursoService {
    
    Scanner scan = new Scanner (System.in);
    
    
    
    public Curso crearCurso() {
        
        Curso curs = new Curso();
        System.out.println("Ingrese el nombre del curso");
        curs.setNombreCurso(scan.next());
        System.out.println("Ingrese la cantidad de horas por día");
        curs.setCantidadHorasPorDia(scan.nextInt());
        System.out.println("Ingrese los días por semana");
        curs.setCantidadDiasPorSemana(scan.nextInt());
        
        System.out.println("Ingrese el turno");
        String turno = scan.next();
        
        while (!turno.equalsIgnoreCase("mañana") && !turno.equalsIgnoreCase("tarde")) {
            System.out.println("Opción inválida");
            System.out.println("Ingrese el turno");
            turno = scan.next();
        }
        curs.setTurno(turno);
        
        System.out.println("Ingrese el precio $ por hora");
        curs.setPrecioPorHora(scan.nextDouble());
        
        AlumnoService alum = new AlumnoService();
        
        alum.cargarAlumnos(curs);
        
        return curs;
    }

    public double calcularGanaciaSemana(Curso curs) {
        
        double ganancia;
        
        ganancia = (double) curs.getCantidadHorasPorDia() * curs.getPrecioPorHora() * 5 * curs.getCantidadDiasPorSemana();
        
        return ganancia;
    }
    

    
    
    
    
    
}
