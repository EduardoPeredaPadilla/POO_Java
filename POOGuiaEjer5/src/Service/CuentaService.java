package Service;

import Entidades.Cuenta;
import java.util.Scanner;

public class CuentaService {
    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public Cuenta crearCuenta() {
        
        Cuenta c1 = new Cuenta();
        System.out.println("Ingresa el nombre del nuevo cuentahabiente");
        c1.setNombre(scan.next());
        System.out.println("Ingresa el DNI");
        c1.setDni(scan.nextInt());
        c1.setNumeroCuenta((int)(Math.random()*9999+1111));
        System.out.println("Ingrese el monto con el que apertura la cuenta");
        c1.setSaldoActual(scan.nextInt());
        System.out.println("El número de tu nueva cuenta es = " + c1.getNumeroCuenta());
        return c1;
    }
    
    public Double ingreso(Cuenta c1) {
        
        System.out.println("Cantidad a ingresar a la cuenta número" + c1.getNumeroCuenta() + ", del cuentahabiente = " + c1.getNombre());
        double montoIngreso = scan.nextDouble();
        c1.setSaldoActual(c1.getSaldoActual() + (int)montoIngreso);
        double saldoNuevo = (double) c1.getSaldoActual();
        return saldoNuevo;
    }
    
    public Double retiro(Cuenta c1) {
        
        System.out.println("Cantidad a retirar de la cuenta " + c1.getNumeroCuenta() + ", del cuentahabiente = " + c1.getNombre());
        double retiro = scan.nextDouble();
        if (retiro > c1.getSaldoActual()) {
            c1.setSaldoActual(0);
        } else {
            c1.setSaldoActual(c1.getSaldoActual() - (int) retiro);
        }
        double saldoNuevo = (double) c1.getSaldoActual();
        return saldoNuevo;
    }
    
    public int extraccionRapida(Cuenta c1) {
        
        System.out.println("El método extracción rápida te permita retirar hasta el 20% de tu saldo actual, es decir :");
        System.out.println("Saldo actual = " + c1.getSaldoActual());
        System.out.println("Monto máximo a retirar = " + (double) (c1.getSaldoActual() * 0.2));
        
        System.out.println("Ingresa el monto a retirar");
        double montoRetiro = scan.nextDouble();
        
        while(montoRetiro > (double) (c1.getSaldoActual() * 0.2)) {
            System.out.println("La cantidad que deseas retirar excede el 20% del saldo actual de la cuenta, rectifica el monto");
             montoRetiro = scan.nextDouble();
        }
        
        c1.setSaldoActual(c1.getSaldoActual() - (int) montoRetiro);
        
        return c1.getSaldoActual();
    }
    
    public int consultarSaldo(Cuenta c1) {
        
        return c1.getSaldoActual();
    }
    
    public void consultarDatos(Cuenta c1) {
        
        System.out.println("Cuenta = " + c1.toString());
    }
    
}
