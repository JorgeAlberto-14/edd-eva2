/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_queue;

/**
 *
 * @author TheGa
 */
public class EVA2_4_QUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyQueue fila = new MyQueue();
        fila.agregar(67);
        fila.agregar(68);
        fila.agregar(69);
        fila.agregar(70);
        fila.agregar(71);
        fila.imprimir();
        fila.push(676767);
        fila.imprimir();
        fila.peek();
        fila.pop();
        fila.imprimir();
    }
    
}
