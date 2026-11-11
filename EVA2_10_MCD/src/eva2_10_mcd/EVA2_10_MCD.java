/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_mcd;

/**
 *
 * @author TheGa
 */
public class EVA2_10_MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("El MCD es = " + MaximoDiv(11, 180));
    }
    public static int MaximoDiv(int dividendo, int divisor){
        if(divisor == 0){
            return dividendo;
        }
         return MaximoDiv(divisor, dividendo%divisor);
    }
    
}
