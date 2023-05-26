package Entidades;

public class Cafetera {
    
    private int capacidadMaxima;
    private int CantidadActual;

    public Cafetera() {
    }
    
    public Cafetera(int capacidadMaxima, int CantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.CantidadActual = CantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return CantidadActual;
    }

    public void setCantidadActual(int CantidadActual) {
        this.CantidadActual = CantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", CantidadActual=" + CantidadActual + '}';
    }

    
    
}
