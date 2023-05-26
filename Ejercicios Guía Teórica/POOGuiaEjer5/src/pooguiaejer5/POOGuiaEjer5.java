package pooguiaejer5;

import Entidades.Cuenta;
import Service.CuentaService;

public class POOGuiaEjer5 {


    public static void main(String[] args) {
        
        CuentaService cs = new CuentaService();
        Cuenta c1 = cs.crearCuenta();
        
        cs.ingreso(c1);
        cs.retiro(c1);
        
        cs.extraccionRapida(c1);
        
        System.out.println("El saldo Actual de la cuenta = " + c1.getNumeroCuenta() + ", del cuentahabiente = " + c1.getNombre() + ", es = " + cs.consultarSaldo(c1));
        cs.consultarDatos(c1);

    }

}
