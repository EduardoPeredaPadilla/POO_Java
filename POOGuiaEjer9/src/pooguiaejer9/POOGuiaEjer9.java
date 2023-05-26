package pooguiaejer9;

import Entidades.Matematica;
import Services.MatematicaService;

public class POOGuiaEjer9 {


    public static void main(String[] args) {
        
        MatematicaService matServ = new MatematicaService();
        Matematica mat = matServ.creaMat();
        
        System.out.println("número 1 = " + mat.getNum1());
        System.out.println("número 2 = " + mat.getNum2());
        
        System.out.println("El número mayor es el " + matServ.devolverMayor(mat));
        
        System.out.println("Calcular Potencia");
        System.out.println(matServ.calcularPotencia(mat));
        
        System.out.println("La raiz cuadrada del menor número es = " + matServ.calcularRaiz(mat));
        
        
    }

}
