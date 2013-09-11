/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab14ej01;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ListaSEC<Integer> listaSEC = new ListaSEC<Integer>();

        NodoAbstracto<Integer> nodo = new Nodo<Integer>(5);
        listaSEC.Insertar(nodo, 0);

        NodoAbstracto<Integer> nodo2 = new Nodo<Integer>(7);
        listaSEC.InsertarFinal(nodo2);

        NodoAbstracto<Integer> nodo3 = new Nodo<Integer>(9);
        listaSEC.InsertarInicio(nodo3);

        NodoAbstracto<Integer> nodo4 = new Nodo<Integer>(8);
        listaSEC.Insertar(nodo4, 1);

        NodoAbstracto<Integer> nodo5 = new Nodo<Integer>(10);
        listaSEC.InsertarFinal(nodo5);

        NodoAbstracto<Integer> nodo6 = new Nodo<Integer>(4);
        listaSEC.Insertar(nodo6, 3);

        listaSEC.borrarFinal(); //debe borrar el 10
//        listaSEC.borrarInicio(); // debe borrar el 9
//        listaSEC.Borrar(5); // debe borrar el 4

        //Nodo temporal para recoger los valores buscados
        NodoAbstracto<Integer> nodob = null;

        //Obtener el primero
//        nodob = listaSE.getPrimero();
//
//        if (nodob != null)
//        {
//            System.out.printf("El nodo en la primera posición es %s \n", nodob.getInfo());
//        }
//        else {
//            System.out.printf("La lista está vacía \n");
//        }
//
//        //Obtener en una posición i
//        int pos = 3;
//        nodob = listaSE.getNodo(pos);
//
//        if (nodob != null)
//        {
//            System.out.printf("El nodo en la posición %d es %s \n", pos, nodob.getInfo());
//        }
//        else {
//            System.out.printf("La posición %d no es válida \n", pos);
//        }
//
//        //Obtener el último
//        nodob = listaSE.getUltimo();
//        if (nodob != null)
//        {
//            System.out.printf("El nodo en la última posición es %s \n", nodob.getInfo());
//        }
//        else {
//            System.out.printf("La lista está vacía \n");
//        }
//
//        //Borrar toda la lista
//        listaSE.borrarTodo();

        //Imprimir la lista
        int longitud = listaSEC.tamaño();
        for (int i=0; i<longitud;  i++)
        {
            System.out.println(listaSEC.getNodo(i).getInfo());
        }
    }

}
