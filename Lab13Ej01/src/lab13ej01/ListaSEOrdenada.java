/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab13ej01;

/**
 *
 * @author Administrator
 */
public class ListaSEOrdenada <T> extends ListaSE <T> {

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
    public void Insertar(NodoAbstracto<T> nodo, int posicion)
    {
        Insertar(nodo);
    }

    @Override
    public void InsertarInicio(NodoAbstracto<T> nodo)
    {
        Insertar(nodo);
    }

    @Override
    public void InsertarFinal(NodoAbstracto<T> nodo)
    {
        Insertar(nodo);
    }
}
