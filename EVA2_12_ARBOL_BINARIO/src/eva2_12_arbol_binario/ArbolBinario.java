/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_12_arbol_binario;

/**
 *
 * @author TheGa
 */
public class ArbolBinario {
    private Nodo root;
    
    
    public ArbolBinario(){
        root = null; 
    }
    public void agregar(int valor){
        //ESTA VACIO EL ARBOL
        if(root == null){
            root = new Nodo(valor);//inserto el valor
        }else{
          agregarRecu(root, valor);  
        }
    }
    
    //METODO RECURSIVO PARA AGREGAR UN NODO
    private void agregarRecu(Nodo actual, int valor){
     if(valor > actual.getValor()){//A LA DERECHA
         if(actual.getderecha() !=null){//OCUPADO
             agregarRecu(actual.getderecha(), valor); 
         }else{//DISPONIBLE
             actual.setderecha(new Nodo(valor));
         }
     }else if(valor < actual.getValor()){//A LA IZQUIERDA
         if(actual.getizquierda() !=null){//OCUPADO
             agregarRecu(actual.getizquierda(), valor); 
         }else{//DISPONIBLE
             actual.setizquierda(new Nodo(valor));
         }
     }else if(valor < actual.getValor()){//A LA IZQUIERDA
         
     
     }/*ELSE ---> EL VALOR ESTA REPETIDO*/
     
    }
    public void preOrder(){
        preOrderRecu(root);
        System.out.println("");
    }
    private void preOrderRecu(Nodo actual){
        if(actual != null){
            System.out.println(actual.getValor() + "-");
        preOrderRecu(actual.getizquierda()); //LEER EL LADO IZQ
        preOrderRecu(actual.getderecha()); //LEER EL LADO DER
        }
        
    }
     public void inOrden(){
       inOrdenRecu(root);
       System.out.println("");
    }
    
    private void inOrdenRecu(Nodo actual){
       if(actual != null){
        inOrdenRecu(actual.getizquierda()); // LEER EL LADO IZQUIERDO
        System.out.print(actual.getValor() + "-");
        inOrdenRecu(actual.getderecha()); // LEER EL LADO DERECHO
         }
    }
    
    public void postOrden(){
        postOrdenRecu(root);
        System.out.println("");
      }

    private void postOrdenRecu(Nodo actual){
        if(actual != null){
         postOrdenRecu(actual.getizquierda()); // LEER EL LADO IZQUIERDO
         postOrdenRecu(actual.getderecha()); // LEER EL LADO DERECHO
         System.out.print(actual.getValor() + "-");
    }
  }


}
