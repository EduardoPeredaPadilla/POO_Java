package Entidades;

public class Ahorcado {
    
    private String [ ] vector;
    private int cantLetrasEnc;
    private int cantJugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] vector, int cantLetrasEnc, int cantJugadasMax) {
        this.vector = vector;
        this.cantLetrasEnc = cantLetrasEnc;
        this.cantJugadasMax = cantJugadasMax;
    }

    public String[] getVector() {
        return vector;
    }
    
    public String getVector(int i) {
        return vector [ i ];
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public int getCantLetrasEnc() {
        return cantLetrasEnc;
    }

    public void setCantLetrasEnc(int cantLetrasEnc) {
        this.cantLetrasEnc = cantLetrasEnc;
    }

    public int getCantJugadasMax() {
        return cantJugadasMax;
    }

    public void setCantJugadasMax(int cantJugadasMax) {
        this.cantJugadasMax = cantJugadasMax;
    }
    
    
    
}
