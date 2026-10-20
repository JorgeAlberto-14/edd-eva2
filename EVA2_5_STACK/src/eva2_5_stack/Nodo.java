/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_stack;

/**
 *
 * @author TheGa
 */
public class Nodo {
    //DOS ATRIBUTOS
    private int valor;
    private Nodo siguiente;
    private Nodo previo;
    //CONSTRUTORES
    public Nodo(){
        this.siguiente = null; //ESTO ES MUY IMPORTANTE 
        previo = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        siguiente = null;
        previo = null;
    }
    

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    

    
    
}
