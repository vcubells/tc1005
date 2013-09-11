/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab13ej01;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //probarListaSE();
//        probarListaSEOrdenada();
//        probarListaSEOrdenadaStrings();

        ListaSEOrdenada<Persona> personas = new ListaSEOrdenada<Persona>();

        personas.Insertar(new NodoPersona(new Persona("Juan", "Urrutia", 45, 'M')));
        personas.Insertar(new NodoPersona(new Persona("Maria", "Garcia", 34, 'F')));
        personas.Insertar(new NodoPersona(new Persona("Elena", "Hortencia", 15, 'F')));
        personas.Insertar(new NodoPersona(new Persona("Emeregildo", "Lutero", 60, 'M')));

        //Imprimir la lista
        int longitud = personas.tamaño();
        for (int i=0; i<longitud;  i++)
        {
            System.out.println(personas.getNodo(i).getInfo().toString());
        }

    }

    public static void probarListaSE()
    {
        ListaSE<Integer> listaSE = new ListaSE<Integer>();

        NodoAbstracto<Integer> nodo = new Nodo<Integer>(5);
        listaSE.Insertar(nodo, 0);

        NodoAbstracto<Integer> nodo2 = new Nodo<Integer>(7);
        listaSE.InsertarFinal(nodo2);

        NodoAbstracto<Integer> nodo3 = new Nodo<Integer>(9);
        listaSE.InsertarInicio(nodo3);

        NodoAbstracto<Integer> nodo4 = new Nodo<Integer>(8);
        listaSE.Insertar(nodo4, 1);

        NodoAbstracto<Integer> nodo5 = new Nodo<Integer>(10);
        listaSE.InsertarFinal(nodo5);

        NodoAbstracto<Integer> nodo6 = new Nodo<Integer>(4);
        listaSE.Insertar(nodo6, 3);

        listaSE.borrarFinal(); //debe borrar el 10
        listaSE.borrarInicio(); // debe borrar el 9
        listaSE.Borrar(2); // debe borrar el 4

        //Nodo temporal para recoger los valores buscados
        NodoAbstracto<Integer> nodob = null;

        //Obtener el primero
        nodob = listaSE.getPrimero();

        if (nodob != null)
        {
            System.out.printf("El nodo en la primera posición es %s \n", nodob.getInfo());
        }
        else {
            System.out.printf("La lista está vacía \n");
        }

        //Obtener en una posición i
        int pos = 3;
        nodob = listaSE.getNodo(pos);

        if (nodob != null)
        {
            System.out.printf("El nodo en la posición %d es %s \n", pos, nodob.getInfo());
        }
        else {
            System.out.printf("La posición %d no es válida \n", pos);
        }

        //Obtener el último
        nodob = listaSE.getUltimo();
        if (nodob != null)
        {
            System.out.printf("El nodo en la última posición es %s \n", nodob.getInfo());
        }
        else {
            System.out.printf("La lista está vacía \n");
        }

        //Borrar toda la lista
        listaSE.borrarTodo();

        //Imprimir la lista
        int longitud = listaSE.tamaño();
        for (int i=0; i<longitud;  i++)
        {
            System.out.println(listaSE.getNodo(i).getInfo());
        }
    }

    public static void probarListaSEOrdenada()
    {
        ListaSEOrdenada<Integer> listaSE = new ListaSEOrdenada<Integer>();

        NodoAbstracto<Integer> nodo = new NodoOrdenado(5);
        listaSE.Insertar(nodo, 0);

        NodoAbstracto<Integer> nodo2 = new NodoOrdenado(7);
        listaSE.InsertarFinal(nodo2);

        NodoAbstracto<Integer> nodo3 = new NodoOrdenado(9);
        listaSE.InsertarInicio(nodo3);

        NodoAbstracto<Integer> nodo4 = new NodoOrdenado(8);
        listaSE.Insertar(nodo4, 1);

        NodoAbstracto<Integer> nodo5 = new NodoOrdenado(10);
        listaSE.InsertarFinal(nodo5);

        NodoAbstracto<Integer> nodo6 = new NodoOrdenado(4);
        listaSE.Insertar(nodo6, 3);

        //Imprimir la lista
        int longitud = listaSE.tamaño();
        for (int i=0; i<longitud;  i++)
        {
            System.out.println(listaSE.getNodo(i).getInfo());
        }
    }

    public static void probarListaSEOrdenadaStrings()
    {
        ListaSEOrdenada<String> listaSE = new ListaSEOrdenada<String>();

        NodoAbstracto<String> nodo = new NodoOrdenadoString("Juan");
        listaSE.Insertar(nodo, 0);

        NodoAbstracto<String> nodo2 = new NodoOrdenadoString("Maria");
        listaSE.InsertarFinal(nodo2);

        NodoAbstracto<String> nodo3 = new NodoOrdenadoString("Josefa");
        listaSE.InsertarInicio(nodo3);

        NodoAbstracto<String> nodo4 = new NodoOrdenadoString("Alberto");
        listaSE.Insertar(nodo4, 1);

        NodoAbstracto<String> nodo5 = new NodoOrdenadoString("Camila");
        listaSE.InsertarFinal(nodo5);

        NodoAbstracto<String> nodo6 = new NodoOrdenadoString("Ximena");
        listaSE.Insertar(nodo6, 3);

        //Imprimir la lista
        int longitud = listaSE.tamaño();
        for (int i=0; i<longitud;  i++)
        {
            System.out.println(listaSE.getNodo(i).getInfo());
        }
    }

}
