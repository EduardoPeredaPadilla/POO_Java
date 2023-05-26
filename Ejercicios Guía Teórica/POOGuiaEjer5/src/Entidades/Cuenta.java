package Entidades;

public class Cuenta {
    
    private int numeroCuenta;
    private long dni;
    private String nombre;
    private int saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni, String nombre, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.nombre = nombre;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", nombre=" + nombre + ", saldoActual=" + saldoActual + '}';
    }
    
    
    
}
