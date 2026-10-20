
package eva2_2_lista_simple;


public class ListaSimple {
    private Nodo inicio;
    private Nodo fin;
    private int Ion;
    
    public ListaSimple(){
        inicio = null;//al crear la lista, se crea vacía
        fin = null;
        Ion = 0;
    }
    //SIEMPRE SE AGREGAN AL FINAL DE LA LISTA
    //VERSION 1: O(N) --> SE AGREGA AL FINAL. SE RECORREN TODO
    //VERSION MEJORADA: O(1) CON NODO FIN YA NO SE RECORREN TODOS
    public void agregar(int valor){
        Nodo nuevo = new Nodo(valor);//creo el nodo para el valor a insertar
        //Y LUEGO?? 
        if(inicio == null){//LISTA VACIA? VERDADERO
            inicio = nuevo;//nuevo es el primer nodo de la lista
            fin = nuevo;
        }else{//LISTA CON NODOS
            //movernos al final
            /*Nodo temp = inicio;
            while(temp.getSiguiente() != null){
              temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);//conecto nuevo al final de la lista*/
            fin.setSiguiente(nuevo);
            fin = nuevo;
            
        }   
        Ion++;
    }   
    //O(N)
    public void imprimir(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
    }
        public void imprimirInverso(){
        for(int i = Ion - 1; i >= 0; i--){
            System.out.print("[" + valorEn(i) + "]");
        }
    }

//impriman en orden inverso
    //O(N2)
    
    //0(n)
    //QUE AJUSTES HAY QUE HACER PARA QUE SEA O(1):
    public int longitud(){
    return Ion;
    }
    
    //O(N)
    public boolean listaVacia(){
        if(inicio == null){
            System.out.println("La lista esta vacia");
            return true;
        }else {
            return false;
        }
    }
    
    //O(1)
    public void vaciarLista(){
        inicio = null;
        fin = null;
        Ion = 0;
    }
    
    //VALIDAR:posicion tenga un valor valido
                                        //throws
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
    //REGRESA LA PRIMERA APARICION DEL VALOR DE LA LISTA
    //O(N)
    public int encontrar (int valor){
        Nodo temp = inicio;
        int posicion = 0;
        
        while(temp !=null){
            if(valor == temp.getValor()){
                System.out.println("la posicion de el valor "+valor +  " en el arreglo es: "+posicion);
                return posicion;
            }
            temp = temp.getSiguiente();
            posicion ++;
        } 
        System.out.println("el valor de la lista no existe");
        return -1;
    }
    //O(N) --> hay que recorrer hasta la posicion
    public void insertarEn(int posicion, int valor) throws RuntimeException {
      int tama = longitud();
    //para insertar, la posicion puede ser de 0 a N (N = al final)
    if (posicion < 0 || posicion > tama) {
        throw new RuntimeException("la posicion es invalida: " + posicion);
    }

    Nodo nuevo = new Nodo(valor);

    if (posicion == 0) {//insertar al inicio
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
        if (fin == null) {//la lista estaba vacia
            fin = nuevo;
        }
    } else if (posicion == tama) {//insertar al final
        fin.setSiguiente(nuevo);
        fin = nuevo;
    } else {//insertar en medio
        Nodo temp = inicio;
        //nos paramos en el nodo ANTERIOR a la posicion
        for (int i = 0; i < posicion - 1; i++) {
            temp = temp.getSiguiente();
        }
        nuevo.setSiguiente(temp.getSiguiente());//primero conectamos nuevo con el resto
        temp.setSiguiente(nuevo);//luego el anterior apunta a nuevo
    }
    Ion++;
}

    //O(N) --> hay que recorrer hasta la posicion
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
        if (inicio == null) {//la lista quedo vacia
            fin = null;
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
        if (borrar == fin) {//si borramos el ultimo, fin cambia
            fin = temp;
        }
    }
    Ion--;
    return valorBorrado;
    }
    
    }
