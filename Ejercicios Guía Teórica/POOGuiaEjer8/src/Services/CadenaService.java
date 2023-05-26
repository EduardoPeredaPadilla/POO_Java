package Services;

import Entidades.Cadena;
import java.util.Scanner;


public class CadenaService {
    
    Scanner sca = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena crearCadena() {
        
        Cadena cad = new Cadena();
        
        System.out.println("Ingrese una frase");
        cad.setFrase(sca.next());
        cad.setLongit(cad.getFrase().length());
        
        return cad;
    }
    
    public void mostrarVocales(Cadena cad) {
        
        int cantVocales = 0;
        int fin = (cad.getLongit() - 1);
        
        for (int i = 0; i < cad.getLongit(); i++) {
            if (i == cad.getLongit() - 1) {
                if (cad.getFrase().substring(fin).equalsIgnoreCase("A") || cad.getFrase().substring(fin).equalsIgnoreCase("E") || cad.getFrase().substring(fin).equalsIgnoreCase("I")
                        || cad.getFrase().substring(fin).equalsIgnoreCase("O") || cad.getFrase().substring(fin).equalsIgnoreCase("U")) {
                    cantVocales++;
                }
            } else {
                if (cad.getFrase().substring(i, (i + 1)).equalsIgnoreCase("A") || cad.getFrase().substring(i, (i + 1)).equalsIgnoreCase("E")
            || cad.getFrase().substring(i, (i + 1)).equalsIgnoreCase("I") || cad.getFrase().substring(i, (i + 1)).equalsIgnoreCase("O") || cad.getFrase().substring(i, (i + 1)).equalsIgnoreCase("U")) {
                cantVocales++;
            }
            }
        }
        
        System.out.println("La cantidad de vocales en la frase es de " + cantVocales);
        
    }
    
    public StringBuilder invertirFrase(Cadena cad) {
        //String fraseInvertida;
        int x = cad.getLongit() - 1;
        String [ ] v = new String [ cad.getLongit() ];
        
        for (int i = 0; i < cad.getLongit(); i++) {
            if ( i < cad.getLongit() - 1) {
                v [ x ] = cad.getFrase().substring(i, i + 1);
                x--;
            } else {
                v [ x ] = cad.getFrase().substring( i );
                x--;
            }
        }
        
        StringBuilder fraseInvertida = new StringBuilder();
        
        for (String letra : v) {
            fraseInvertida.append(letra);
        }
        return fraseInvertida;
    }
    
    public void vecesRepetido(Cadena cad, String letra) {
        
        int cant = 0;
        
        for (int i = 0; i < cad.getLongit(); i++) {
            if ( i == cad.getLongit() - 1) {
                if (cad.getFrase().substring(i).equalsIgnoreCase(letra)) {
                    cant++;
                }
            }
            if ( i < cad.getLongit() - 1) {
                if (cad.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                    cant++;
                } 
               }
        }
        
        System.out.println("La letra " + letra + ", se encontró " + cant + " veces en la frase" );
        
    }
    
    public void compararLongitud(Cadena cad, String frase) {
        
        int cantCadFrase = cad.getLongit();
        int cantFrase = frase.length();
        
        if (cantCadFrase < cantFrase) {
            System.out.println("La frase de la cadena es menor a la nueva frase ingresada");
            System.out.println("Cantidad frase cadena = " +  cantCadFrase);
            System.out.println("Cantidad nueva frase = " +  cantFrase);
        } else if (cantCadFrase == cantFrase) {
            System.out.println("La frase de la cadena es igual a la nueva frase ingresada");
            System.out.println("Cantidad frase cadena = " +  cantCadFrase);
            System.out.println("Cantidad nueva frase = " +  cantFrase);
        } else if (cantCadFrase > cantFrase) {
            System.out.println("La frase de la cadena es mayor a la nueva frase ingresada");
            System.out.println("Cantidad frase cadena = " +  cantCadFrase);
            System.out.println("Cantidad nueva frase = " +  cantFrase);
        }
        
    }
    
    public void unirFrases(Cadena cad, String frase) {
        
        String fraseIntegrada = cad.getFrase().concat(" ").concat(frase);
        System.out.println(fraseIntegrada);
        
    }
    
    public void reemplazar(Cadena cad, String letra) {
        
        cad.setFrase(cad.getFrase().replace("a", letra));
        System.out.println(cad.getFrase());
        
    }
    
    public boolean contiene(Cadena cad, String letra) {
        
        boolean contiene = false;
        
        for (int i = 0; i < cad.getLongit(); i++) {
            if ( i == cad.getLongit() - 1) {
                if (cad.getFrase().substring( i ).equalsIgnoreCase(letra)) {
                contiene = true;
                //return contiene;
                }
            }
            if (cad.getFrase().substring( i, i + 1).equalsIgnoreCase(letra)) {
                contiene = true;
                //return contiene;
            }
        }
    
    return contiene;
    }
}
