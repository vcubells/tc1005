/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab19grafos;

/**
 *
 * @author Administrator
 */
public class ListaSEOrdenada <T extends Comparable> extends ListaSE <T> implements Comparable{

    public ListaSEOrdenada()
    {
        super();
    }

    public void Insertar(NodoAbstracto nodo)
    {
        //Buscar la posición que le corresponde

         NodoAbstracto q = primero;
         NodoAbstracto anterior = null;

         while (q != null && (q.compareTo(nodo) < 0))
         {
            anterior = q;
            q = q.getSiguiente();

         }

         //Inserta en posición correspondiente
         if (anterior == null)
         {
             if (primero == null)
             {
                 primero = nodo; //Insertar cuando la lista está vacía
             }
             else { //Insertar cuando va en la primera posición y la lista no está vacía
                 nodo.setSiguiente(primero);
                 primero = nodo;
             }
         }
         else //Insertar en cualquier otra posición que le corresponda
         {
             nodo.setSiguiente(anterior.getSiguiente());
             anterior.setSiguiente(nodo);
         }
    }

    @Override
    public void Insertar(NodoAbstracto nodo, int posicion)
    {
        Insertar(nodo);
    }

    @Override
    public void InsertarInicio(NodoAbstracto nodo)
    {
        Insertar(nodo);
    }

    @Override
    public void InsertarFinal(NodoAbstracto nodo)
    {
        Insertar(nodo);
    }

    public int compareTo(Object o)
    {
        ListaSEOrdenada otra = (ListaSEOrdenada)o;

        if (this.tamaño() != otra.tamaño()) { return -1; }

        NodoAbstracto nodo1 = primero;
        NodoAbstracto nodo2 = otra.primero;

        while(nodo1 != null && nodo1.compareTo(nodo2) == 0)
        {
            nodo1 = nodo1.getSiguiente();
            nodo2 = nodo2.getSiguiente();
        }

        if (nodo1 == null) {return 0;} else { return -1;}
    }
}

