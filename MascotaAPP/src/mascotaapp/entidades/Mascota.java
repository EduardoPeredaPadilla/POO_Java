package mascotaapp.entidades;

public class Mascota {
    
    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    
    private int energia;

    public Mascota() {
        energia = 1000;
    }
    
    public Mascota(String nombre, String apodo, String tipo) {
        energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        
        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo") || tipo.equals("Cuyo") ) {
            this.tipo = tipo;
        }
        
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        
        this.energia = 1000;
 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    /**
     * Función para pasear
     * 
     * @param energiaRestar
     * @return energia 
     */
    public int pasear(int energiaRestar) {
        //energia = energia - energiaRestar;
        energia -= energiaRestar;
        return energia;
    }
    
    /**
     * Función para pasear un número de vieltas
     * 
     * @param energiaRestar
     * @param vueltas
     * @return energia 
     */
    public int pasear(int energiaRestar, int vueltas) {
        
        for (int i = 0; i < vueltas; i++) {
            energia -= energiaRestar;
        }
        
        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }



    
    
    
    
}
