package Services;

import Entidades.Matematica;

public class MatematicaService {
    
    public Matematica creaMat() {
        
        Matematica mat = new Matematica();
        mat.setNum1((float) Math.random() * 100 - 10);
        mat.setNum2((float) Math.random() * 100 -10);
        
        return mat;
    }
    
    public float devolverMayor(Matematica mat) {
        
        return Math.max(mat.getNum1(), mat.getNum2());
        
    }
    
    public long calcularPotencia(Matematica mat) {
        
        int n1 = (int) Math.max(Math.round(mat.getNum1()), Math.round(mat.getNum2()));
        int n2 = (int) Math.min(Math.round(mat.getNum1()), Math.round(mat.getNum2()));
        
        System.out.println("El número 1 redondeado = " + n1);
        System.out.println("El número 2 redondeado = " + n2);
        long potencia = (long) Math.pow(n1, n2);
        System.out.print("La potencia es =");
        
        return potencia;
    }
    
    public float calcularRaiz(Matematica mat) {
        
        float num = (float) Math.abs(Math.min(mat.getNum1(), mat.getNum2()));
        num = (float) Math.sqrt(num);
        
        return num;
    }
    
}
