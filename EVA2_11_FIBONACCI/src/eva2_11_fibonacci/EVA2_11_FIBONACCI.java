/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_fibonacci;

/**
 *
 * @author TheGa
 */
public class EVA2_11_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("El valor de fibonacci en la posicion indicada es: " + FIBO(4));
    }
    
    public static int FIBO(int posicion ){
        if(posicion < 1)return 1;
        return FIBO(posicion - 1) + FIBO(posicion - 2);
    }
}
