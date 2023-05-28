package Entidades;

public class Movil {
    
    private String marca;
    private double preciop;
    private String modelo;
    private int memoriaRAM;
    private int almacenamiento;
    private int [ ] codigo;

    public Movil() {
    }

    public Movil(String marca, double preciop, String modelo, int memoriaRAM, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.preciop = preciop;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreciop() {
        return preciop;
    }

    public void setPreciop(double preciop) {
        this.preciop = preciop;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", preciop=" + preciop + ", modelo=" + modelo + ", memoriaRAM=" + memoriaRAM + 
                ", almacenamiento=" + almacenamiento + ", codigo=" + codigo + '}';
    }
    
    
    
}
