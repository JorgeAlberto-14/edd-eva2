/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_12_arbol_binario;

/**
 *
 * @author TheGa
 */
public class Nodo {
    //DOS ATRIBUTOS
    private int valor;
    private Nodo derecha;
    private Nodo izquierda;
    //CONSTRUTORES
    public Nodo(){
        this.derecha = null; //ESTO ES MUY IMPORTANTE 
        izquierda = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        derecha = null;
        izquierda = null;
    }
    

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getderecha() {
        return derecha;
    }

    public void setderecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getizquierda() {
        return izquierda;
    }

    public void setizquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    

    
    
}
