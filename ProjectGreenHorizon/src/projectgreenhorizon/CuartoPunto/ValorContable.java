/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgreenhorizon.CuartoPunto;

/**
 *
 * @author Usuario
 */
public class ValorContable {
    
    // Clase llamada valor contable, esta clase debe tener los atributos Id, valor y signo.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public char getSigno() {
        return signo;
    }

    public void setSigno(char signo) {
        this.signo = signo;
    }

    public ValorContable() {
    }

    public ValorContable(int id, double valor, char signo) {
        this.id = id;
        this.valor = valor;
        this.signo = signo;
    }

    private int id;
    private double valor;
    private char signo;
    
}
