/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_stack;

/**
 *
 * @author TheGa
 */
public class MyStack {
    private Nodo inicio;
    private Nodo fin;
    private int Ion;
    
    public MyStack(){
        inicio = null;//al crear la lista, se crea vacía
        fin = null;
        Ion = 0;
    }
       public void imprimir(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
           System.out.println("");
    }
    //O(N)
    public void imprimirInv(){
        Nodo temp = fin;
        while(temp != null){
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getPrevio();
        }
           System.out.println("");
}
    public int longitud(){
    return Ion;
    }
    public boolean listaVacia(){
        if(inicio == null){
            System.out.println("La lista esta vacia");
            return true;
        }else {
            return false;
        }
    }
    public void vaciarLista(){
        inicio = null;
        fin = null;
        Ion = 0;
    }
    public void agregar(int valor){
        Nodo nuevo = new Nodo(valor);//creo el nodo para el valor a insertar
        //Y LUEGO?? 
        if(inicio == null){//LISTA VACIA? VERDADERO
            inicio = nuevo;//nuevo es el primer nodo de la lista
            fin = nuevo;
        }else{
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
           
            fin = nuevo;
            
        }  Ion++; 
        
}
    
   public void insertarEn(int posicion, int valor) throws RuntimeException {
        int tama = longitud();
        if (posicion < 0 || posicion > tama) {
        throw new RuntimeException("la posicion es invalida: " + posicion);
    }
    Nodo nuevo = new Nodo(valor);

    if (posicion == 0) {//insertar al inicio
        nuevo.setSiguiente(inicio);
        inicio.setPrevio(nuevo);
        inicio = nuevo;
        
        }else if (fin == null) {//la lista estaba vacia
            fin = nuevo;
            fin.setPrevio(null);
            fin.setSiguiente(null);
            }
        else if (posicion == tama) {//insertar al final
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin); 
            nuevo.setSiguiente(null);
            fin = nuevo;
        } else {//insertar en medio
            Nodo temp = inicio;
            //nos paramos en el nodo de la posicion
            for (int i = 0; i < posicion; i++) { 
            temp = temp.getSiguiente();
        }
            nuevo.setSiguiente(temp);
            nuevo.setPrevio(temp.getPrevio());
            temp.getPrevio().setSiguiente(nuevo); 
            temp.setPrevio(nuevo);
        
        
        }
        Ion++;
    }
    public int borrarEn(int posicion) throws RuntimeException {
    int tama = longitud();
    //para borrar, las posiciones validas son de 0 a N-1
    if (posicion < 0 || posicion >= tama) {
        throw new RuntimeException("la posicion es invalida: " + posicion);
    }

    int valorBorrado;

    if (posicion == 0) {//borrar el primero
        valorBorrado = inicio.getValor();
        inicio = inicio.getSiguiente();
        if(inicio != null){
            inicio.setPrevio(null);
        }
    } else {
        Nodo temp = inicio;
        //nos paramos en el nodo ANTERIOR al que se va a borrar
        for (int i = 0; i < posicion - 1; i++) {
            temp = temp.getSiguiente();
        }
        Nodo borrar = temp.getSiguiente();
        valorBorrado = borrar.getValor();
        temp.setSiguiente(borrar.getSiguiente());//saltamos el nodo a borrar
        if(borrar.getSiguiente() != null){
           borrar.getSiguiente().setPrevio(temp);
        }else{
            fin =temp;
        }

    }
    Ion--;
    return valorBorrado;
    }
    public int valorEn(int posicion) throws RuntimeException {
    if (posicion >= 0 && posicion < Ion) {
        Nodo temp = inicio;
        for (int i = 0; i < posicion; i++) {
            temp = temp.getSiguiente();
        }
        return temp.getValor();
    } else {
        throw new RuntimeException("la posicion " + posicion + " no es valida!!");
    }
    }
    //AGREGA UN VALOR AL FINAL DE LA LISTA
    public void push(int valor) {
    agregar(valor);
}

    //LEE EL VALOR DIRECTAMENTE ACCESIBLE,SIN BORRARLO
    public int peek() {
    if (inicio == null) {
        throw new RuntimeException("el stack esta vacio");
    }
    return fin.getValor();
}
    //LEE EL VALOR DIRECTAMENTE ACCESIBLE, Y DESPUES LO BORRA
    public int pop() {
    if (inicio == null) {
        throw new RuntimeException("el stack esta vacio");
    }
    int valor = fin.getValor();
    fin = fin.getPrevio();
    if (fin == null) {
        inicio = null;
    } else {
        fin.setSiguiente(null);
    }
    Ion--; 
    return valor;
}
}
