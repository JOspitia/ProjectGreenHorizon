/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgreenhorizon.QuintoPunto;

/**
 *
 * @author Usuario
 */
public class Empresa {

    // Clase llamada empresa, esta clase debe tener los atributos Id, nombre, ciudad, estado, nit.
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public Empresa() {
    }

    public Empresa(int id, String nombre, String ciudad, String estado, int nit) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estado = estado;
        this.nit = nit;
    }

    private int id;
    private String nombre;
    private String ciudad;
    private String estado;
    private int nit;
}
