/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgreenhorizon.SegundoPunto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SegundoPunto {
    
    /**
     *  2. Crear una aplicación que reciba una fecha, la entrada será de tipo String
     *  a. Debe tener el formato 'día/mes/año'.
     *  b. Convertirla a date
     *  c. Validar si el año y el mes de la fecha son los actuales, en caso de no serlo emitir mensaje
     *     de error correspondiente.
     */

    private final SimpleDateFormat formatoFecha;
    private Scanner scanner;
    private String fechaIngresada;

    // Constructor de SegundoPunto para crear formato de fechas
    public SegundoPunto() {
        this.formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    }

    public void leerFecha() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una fecha (día/mes/año): ");
        fechaIngresada = scanner.nextLine();
        scanner.close();
    }

    public void validarFecha() {

        try {
            
            // Convertir la cadena de texto a un objeto Date
            Date fecha = formatoFecha.parse(fechaIngresada);

            // Obtener el año y el mes actuales
            Calendar calendarioActual = Calendar.getInstance();
            int añoActual = calendarioActual.get(Calendar.YEAR);
            int mesActual = calendarioActual.get(Calendar.MONTH) + 1; // Sumamos 1 porque enero es 0

            // Obtener el año y el mes de la fecha ingresada
            Calendar calendarioFecha = Calendar.getInstance();
            calendarioFecha.setTime(fecha);
            int añoFecha = calendarioFecha.get(Calendar.YEAR);
            int mesFecha = calendarioFecha.get(Calendar.MONTH) + 1;

            // Comparar el año y el mes de la fecha ingresada con el año y el mes actuales
            if (añoFecha == añoActual && mesFecha == mesActual) {
                System.out.println("La fecha ingresada es del año y mes actuales.");
            } else {
                System.out.println("La fecha ingresada no es del año y mes actuales.");
            }
            
        } catch (ParseException e) {
            System.out.println("Error: La fecha ingresada no tiene el formato válido (día/mes/año).");
        }

    }

    public static void main(String[] args) {

        // Instanciar la clase
        SegundoPunto segundo = new SegundoPunto();
        
        // Iniciar lectura por consola de la fecha
        segundo.leerFecha();
        
        // Realizar validación de la fecha ingresada
        segundo.validarFecha();
        
    }

}
