/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_iterator;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author TheGa
 */
public class EVA2_14_ITERATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> lista = new LinkedList<>();
        /*lista.add(100);
        lista.add(200);
        lista.add(300);
        lista.add(400);
        lista.add(500);*/
        for (int i = 0; i < 1000000; i++) {
            lista.add((int) (Math.random() * 1000));
        }
        System.out.println("cantidad de nodos: " + lista.size());
        
        /*int promedio = 0;
        for (int i = 0; i < 1000000; i++) {//O(N2)
            promedio += lista.get(i);
            
        }
        System.out.println("Sumatoria : " + promedio);*/
        //ITERATOR: proporciona un mecanismo para accerder a todos los valores
        //almacenados en nuestra lista.
        Iterator<Integer> iterador = lista.iterator();
        int promedio = 0;
        while(iterador.hasNext()){
            promedio += iterador.next();
        }
        System.out.println("Sumatoria = " + promedio);
        System.out.println("promedio = " + (promedio / 1000000.0));
    }
    
}
