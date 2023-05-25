package pooguiaejer3;

import Entidades.Operacion;
import Servicios.OperacionServicio;

public class POOGuiaEjer3 {


    public static void main(String[] args) {
        
        OperacionServicio os = new OperacionServicio();
        Operacion o1 = os.crearOperacion();
        
        System.out.println("La suma de los números " + o1.getNum1() + " + " + o1.getNum2() + " = " + os.sumar(o1));
        System.out.println("La resta de los números " + o1.getNum1() + " - " + o1.getNum2() + " = " + os.restar(o1));
        
        if (os.multiplicar(o1) == 0) {
            System.out.println("Error Mult : Ingesaste un número 0");
            System.out.println(os.multiplicar(o1));
        } else {
            System.out.println("La multiplocación de los números " + o1.getNum1() + " * " + o1.getNum2() + " = " + os.multiplicar(o1));
        }
        
        if (os.dividir(o1) == 0) {
            System.out.println("Error Div : Ingesaste un número 0");
            System.out.println(os.dividir(o1));
        } else {
            System.out.println("La división de los números " + o1.getNum1() + " / " + o1.getNum2() + " = " + os.dividir(o1));
        }

    }

}
