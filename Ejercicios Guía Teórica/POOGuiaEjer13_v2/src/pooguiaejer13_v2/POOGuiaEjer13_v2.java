package pooguiaejer13_v2;

import Entidades.Curso;
import Services.CursoService;

public class POOGuiaEjer13_v2 {

    public static void main(String[] args) {
        
        CursoService curServ = new CursoService();
        Curso curs = curServ.crearCurso();
        
        System.out.println(curServ.calcularGanaciaSemana(curs));
        
        System.out.println("Curso = " + curs.toString());

    }

}
