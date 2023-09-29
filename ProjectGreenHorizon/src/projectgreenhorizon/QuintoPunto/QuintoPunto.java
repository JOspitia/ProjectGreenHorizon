/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgreenhorizon.QuintoPunto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class QuintoPunto extends Empresa {
    
    /**
     * 5 Crear una clase llamada Empresa, esta clase debe tener los atributos Id, nombre, ciudad, estado, nit.
     *    Ej: objeto { 1, evergreen, 'cali', 'activo', 12123}
     * a. La clase debe contar con su constructor, getters y setters.
     * b. En la clase main se debe crear una lista de 10 ciudades.
     *    Ej = 'cali', 'medellin'.
     * c. En la clase main se debe crear una lista de 3 estados.
     *    Ej = 'activo'.
     * d. En la clase main se debe crear una lista de 6 nits.
     *    Ej = 12312.
     * e. En la clase main se deben crear 5 objetos Empresa.
     * f. Una vez creado el objeto Empresa se debe validar si la ciudad que tiene se encuentra en la
     *    lista de ciudades, en caso de no existir emitir un mensaje de error
     * g. Se debe validar si el estado que tiene se encuentra en la lista de estados, en caso de no
     *    existir emitir un mensaje de error correspondiente.
     * h. Se debe validar si el estado que tiene se encuentra 'activo', en caso de no ser así, emitir un
     *    mensaje de error correspondiente.
     * i. Se debe validar si el nit que tiene se encuentra en la lista de nit, en caso de no existir emitir
     *    un mensaje de error correspondiente.
     * j. Si el objeto Empresa cuenta con todos los requisitos emitir un mensaje de Empresa
     *    correcta.
     */

    // listas de ciudades, estados y nits
    private static final List<String> ciudades = new ArrayList<>();
    private static final List<String> estados = new ArrayList<>();
    private static final List<Integer> nits = new ArrayList<>();

    public QuintoPunto() {

        // Constructor de listado de 10 ciudades
        ciudades.add("cali");
        ciudades.add("medellin");
        ciudades.add("bogota");
        ciudades.add("cartagena");
        ciudades.add("santiago");
        ciudades.add("lima");
        ciudades.add("quito");
        ciudades.add("guayaquil");
        ciudades.add("caracas");
        ciudades.add("mexico");

        // Constructor de listado de 3 estados
        estados.add("activo");
        estados.add("inactivo");
        estados.add("pendiente");

        // Constructor de listado de 6 nits
        nits.add(12312);
        nits.add(56789);
        nits.add(98765);
        nits.add(24680);
        nits.add(55555);
        nits.add(88888);

    }

    public static void validarEmpresa(Empresa empresa, List<String> ciudades, List<String> estados, List<Integer> nits) {

        // Validar si la ciudad que tiene se encuentra en la lista de ciudades, en caso de no existir emitir un mensaje de error
        if (!ciudades.contains(empresa.getCiudad())) {
            System.out.println("Error en la Empresa " + empresa.getNombre() + ": Ciudad [" + empresa.getNombre() + "] no válida.");
            return;
        }
        
        // Validar si el estado que tiene se encuentra en la lista de estados, en caso de no existir emitir un mensaje de error correspondiente.
        if (!estados.contains(empresa.getEstado())) {
            System.out.println("Error en la Empresa " + empresa.getNombre() + ": Estado [" + empresa.getEstado() + "] no válido.");
            return;
        }

        // Validar si el estado que tiene se encuentra 'activo', en caso de no ser así, emitir un mensaje de error correspondiente.
        if (!empresa.getEstado().equals("activo")) {
            System.out.println("Error en la Empresa " + empresa.getNombre() + ": el estado no es 'activo' es [" + empresa.getEstado() + "].");
            return;
        }

        // Validar si el nit que tiene se encuentra en la lista de nit, en caso de no existir emitir un mensaje de error correspondiente.
        if (!nits.contains(empresa.getNit())) {
            System.out.println("Error en la Empresa " + empresa.getNombre() + ": NIT [" + empresa.getNit() + "] no válido.");
            return;
        }

        // Si el objeto Empresa cuenta con todos los requisitos emitir un mensaje de Empresa correcta.
        System.out.println("Empresa " + empresa.getNombre() + " correcta.");

    }

    public static void main(String[] args) {

        // Instanciar la clase
        QuintoPunto quinto = new QuintoPunto();

        // Crear 5 objetos Empresa
        Empresa empresa1 = new Empresa(1, "evergreen", "cali", "activo", 12123);
        Empresa empresa2 = new Empresa(2, "acme", "medellin", "inactivo", 12312);
        Empresa empresa3 = new Empresa(3, "xyz", "bogota", "activo", 56789);
        Empresa empresa4 = new Empresa(4, "abc", "cartagena", "activo", 98765);
        Empresa empresa5 = new Empresa(5, "def", "cali", "activo", 24680);

        // Validar cada objeto Empresa
        validarEmpresa(empresa1, ciudades, estados, nits);
        validarEmpresa(empresa2, ciudades, estados, nits);
        validarEmpresa(empresa3, ciudades, estados, nits);
        validarEmpresa(empresa4, ciudades, estados, nits);
        validarEmpresa(empresa5, ciudades, estados, nits);

    }
      
}
