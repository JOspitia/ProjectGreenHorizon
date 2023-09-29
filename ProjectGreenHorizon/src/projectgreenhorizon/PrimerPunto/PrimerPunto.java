/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgreenhorizon.PrimerPunto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class PrimerPunto {

    /**
     * 1. Crear y recorrer un listado de palabras (mínimo 5). 
     * a. Validar cuales palabras son mayores a 10 letras 
     * b. Al final emitir un mensaje con las palabras mayores de 10 letras encontradas.
     */
    
    // Variable para almacenar le listado de palabras
    private final List<String> palabras = new ArrayList<>();

    // Constructor de PrimerPunto para crear listado de palabras
    public PrimerPunto() {
        palabras.add("elefante");
        palabras.add("computadora");
        palabras.add("jirafa");
        palabras.add("hipopotamo");
        palabras.add("programacion");
    }
    
    public void imprimirPalabras() {
        System.out.println("Listado de palabras:");
        for (String palabra : palabras) {
            System.out.println( " - " + palabra);
        }
    }

    public void validaPalabras() {

        // Validar cuáles palabras son mayores a 10 letras
        List<String> palabrasMayoresDe10Letras = new ArrayList<>();

        // Usando Java Streams, filtramos las palabras mayores de 10 letras y las agregamos a palabrasMayoresDe10Letras
        palabras.stream().filter(palabra -> (palabra.length() > 10)).forEachOrdered(palabra -> {
            palabrasMayoresDe10Letras.add(palabra);
        });

        // Mensaje con las palabras mayores de 10 letras encontradas
        if (palabrasMayoresDe10Letras.isEmpty()) {
            System.out.println("\nNo se encontraron palabras mayores de 10 letras.");
        } else {
            System.out.println("\nPalabras mayores de 10 letras encontradas:");
            for (String palabra : palabrasMayoresDe10Letras) {
                System.out.println( " - " + palabra);
            }
        }

    }

    public static void main(String[] args) {

        // Instanciar la clase
        PrimerPunto primero = new PrimerPunto();
        
        // Imprimir listado de palabras del constructor
        primero.imprimirPalabras();

        // Realizar validación de listado de palabras
        primero.validaPalabras();

    }

}
