/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgreenhorizon.CuartoPunto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class CuartoPunto extends ValorContable {
    
     /**
     * Crear una clase llamada valor contable, esta clase debe tener los atributos Id, valor y signo.
     * Ej: objeto { 1, 1000, '+'}
     * a. La clase debe contar con su constructor, getters y setters.
     * b. En la clase main se deben crear 12 objetos de valor contable.
     * c. Almacenar los 12 objetos en una lista.
     * d. Recorrer la lista.
     * e. Sumar los valores con signo positivo y almacenarlos en una variable llamada total positivo.
     * f. Sumar los valores con signo negativo y almacenarlos en una variable llamada total
     *    negativo.
     * g. Al final comparar los dos totales y emitir un mensaje informando cuál total es mayor o si
     *    son iguales.
     */
    
    private List<ValorContable> listaValores = new ArrayList<>();    
    private double totalPositivo = 0, totalNegativo = 0;

    public static void main(String[] args) {

        // Instanciar la clase
        CuartoPunto cuarto = new CuartoPunto();

        // Crear 12 objetos de valor contable.
        ValorContable objeto1 = new ValorContable(1, 1000, '+');
        ValorContable objeto2 = new ValorContable(2, 1525, '+');
        ValorContable objeto3 = new ValorContable(3, 2000, '+');
        ValorContable objeto4 = new ValorContable(4, 560, '-');
        ValorContable objeto5 = new ValorContable(5, 840, '-');
        ValorContable objeto6 = new ValorContable(6, 1340, '+');
        ValorContable objeto7 = new ValorContable(7, 950, '-');
        ValorContable objeto8 = new ValorContable(8, 350, '-');
        ValorContable objeto9 = new ValorContable(9, 250, '+');
        ValorContable objeto10 = new ValorContable(10, 600, '-');
        ValorContable objeto11 = new ValorContable(11, 370, '+');
        ValorContable objeto12 = new ValorContable(12, 710, '+');

        // Agregar los 12 objetos a la lista.
        cuarto.listaValores.add(objeto1);
        cuarto.listaValores.add(objeto2);
        cuarto.listaValores.add(objeto3);
        cuarto.listaValores.add(objeto4);
        cuarto.listaValores.add(objeto5);
        cuarto.listaValores.add(objeto6);
        cuarto.listaValores.add(objeto7);
        cuarto.listaValores.add(objeto8);
        cuarto.listaValores.add(objeto9);
        cuarto.listaValores.add(objeto10);
        cuarto.listaValores.add(objeto11);
        cuarto.listaValores.add(objeto12);

        // Inicializar totales
        double totalPositivo = 0;
        double totalNegativo = 0;

        // Recorrer la lista y calcular los totales
        for (ValorContable valorContable : cuarto.listaValores) {
            if (valorContable.getSigno() == '+') {
                totalPositivo += valorContable.getValor();
            } else if (valorContable.getSigno() == '-') {
                totalNegativo += valorContable.getValor();
            }
        }

        // Comparar los totales y emitir un mensaje
        if (totalPositivo > totalNegativo) {
            System.out.println("El total positivo [" + totalPositivo + "] es mayor que el total negativo [" + totalNegativo + "].");
        } else if (totalNegativo > totalPositivo) {
            System.out.println("El total negativo [" + totalNegativo + "] es mayor que el total positivo [" + totalPositivo + "].");
        } else {
            System.out.println("Los totales positivo y negativo son iguales [" + ( totalPositivo + totalNegativo ) / 2 + "].");
        }

    }

}
