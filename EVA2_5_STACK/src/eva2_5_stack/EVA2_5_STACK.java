/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_stack;

/**
 *
 * @author TheGa
 */
public class EVA2_5_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStack pila = new MyStack();
        pila.agregar(67);
        pila.agregar(68);
        pila.agregar(69);
        pila.agregar(70);
        pila.agregar(71);
        pila.imprimir();
        pila.push(676767);
        pila.imprimir();
        pila.peek();
        pila.pop();
        pila.imprimir();
    }
    
}
