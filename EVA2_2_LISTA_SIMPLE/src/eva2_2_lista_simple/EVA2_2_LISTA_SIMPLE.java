
package eva2_2_lista_simple;

/**
 *
 * @author TheGa
 */
public class EVA2_2_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ListaSimple lista = new ListaSimple();
        System.out.println("Tamano de la lista "+ lista.longitud());
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.valorEn(2);
        
        lista.imprimir();
        System.out.println("");
        lista.imprimirInverso();
        lista.longitud();
        System.out.println("");
        lista.insertarEn(3, 999);
        lista.imprimir();
        lista.borrarEn(3);
        System.out.println("");
        lista.imprimir();
        lista.encontrar(300);

        System.out.println("Tamano de la lista "+ lista.longitud());
        lista.vaciarLista();
        lista.imprimir();
        System.out.println("Tamano de la lista "+ lista.longitud());
    } 
    
}
