package Entidades;

public class Cadena {
    
    private String frase;
    private int longit;

    public Cadena() {
    }

    public Cadena(String frase, int longit) {
        this.frase = frase;
        this.longit = longit;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongit() {
        return longit;
    }

    public void setLongit(int longit) {
        this.longit = longit;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longit=" + longit + '}';
    }
    
    
}
