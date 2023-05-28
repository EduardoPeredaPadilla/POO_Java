package Services;

import Entidades.Curso;
import java.util.Scanner;

public class CursoService {
    
    Scanner scan = new Scanner(System.in);
    
    
    
    public Curso crearCurso() { 

        Curso curs = new Curso();
        System.out.println("Ingresa el nombre del curso");
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
  
        //System.out.println("Total de alumnos = " + curs.getTotalAlumnos());
        
        cargarAlumnos(curs);
        
        return curs;
    }
    
    public void cargarAlumnos(Curso curs) {
        String [ ] alumnos = new String [curs.getTotalAlumnos() ];
        for (int i = 0; i < curs.getTotalAlumnos(); i++) {
            System.out.println("Ingresa el nombre del alumno " + (i + 1));
            alumnos [ i ] = scan.next();
        }
        curs.setAlumnos(alumnos);
    }
    
    public double calcularGanaciaSemana(Curso curs) {
        
        double ganancia;
        
        ganancia = (double) curs.getCantidadHorasPorDia() * curs.getPrecioPorHora() * 5 * curs.getCantidadDiasPorSemana();
        
        return ganancia;
    }
    
}
