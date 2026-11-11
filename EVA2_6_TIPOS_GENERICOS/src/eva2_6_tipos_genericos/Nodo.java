/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_tipos_genericos;

/**
 *
 * @author TheGa
 */
public class Nodo <T> {
    //DOS ATRIBUTOS
    private T valor;
    private Nodo siguiente;
    private Nodo previo;
    //CONSTRUTORES
    public Nodo(){
        this.siguiente = null; //ESTO ES MUY IMPORTANTE 
        previo = null;
    }

    public Nodo(T valor) {
        this.valor = valor;
        siguiente = null;
        previo = null;
    }
    

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
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
