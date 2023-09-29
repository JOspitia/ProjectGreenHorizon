/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgreenhorizon.TercerPunto;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TercerPunto {

    /**
     * 3. Crear un mapa Clave Integer, Value String con 10 registros; donde el Integer, 
     * es su ID único y el String es su estado (este estado puede ser activo o inactivo). 
     * a. Se debe crear una aplicación que reciba un id y busque si el id existe en el mapa creado. 
     * b. En caso de no existir el id, debe enviar un mensaje de error 
     * c. En caso de existir y su estado es 'inactivo' debe enviar un mensaje de error 
     * d. En caso de existir y su estado es 'activo' debe enviar un mensaje de proceso exitoso.
     */
    
    // Variable para almacenar mapa (HashMap) con ID y estado
    private final Map<Integer, String> mapa = new HashMap<>();
    private Scanner scanner;
    private int idIngresado;

    public TercerPunto() {
        mapa.put(1, "activo");
        mapa.put(2, "inactivo");
        mapa.put(3, "activo");
        mapa.put(4, "inactivo");
        mapa.put(5, "activo");
        mapa.put(6, "inactivo");
        mapa.put(7, "activo");
        mapa.put(8, "inactivo");
        mapa.put(9, "activo");
        mapa.put(10, "inactivo");
    }

    public boolean leerId() {
        scanner = new Scanner(System.in);
        System.out.print("Ingrese un ID: ");
        try {
            idIngresado = scanner.nextInt();
            return (true);
        } catch (Exception e) {
            System.out.println("Error: El valor ingresado no es un número válido.");
            return (false);
        }
    }

    public void validarId() {
        if (mapa.containsKey(idIngresado)) {
            String estado = mapa.get(idIngresado);
            if (estado.equals("activo")) {
                // En caso de existir y estado activo
                System.out.println("Proceso exitoso para el ID " + idIngresado);
            } else {
                // En caso de existir y estado inactivo
                System.out.println("Error: El ID " + idIngresado + " está inactivo.");
            }
        } else {
            // En caso de no existir el ID
            System.out.println("Error: El ID " + idIngresado + " no existe en el mapa.");
        }
    }

    public static void main(String[] args) {

        // Instanciar la clase
        TercerPunto tercero = new TercerPunto();

        // Iniciar lectura por consola de la id
        if(tercero.leerId())
            
            // Realizar validación de la id ingresada (Solo si la Id es valida)
            tercero.validarId();

    }
}
