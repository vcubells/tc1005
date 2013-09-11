/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package listaseystreams;
import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class ListaSE <T> implements Serializable {
    protected NodoAbstracto<T> primero;

    public ListaSE()
    {
        this.primero = null;
    }

    public boolean esVacia()
    {
        return primero == null;
    }

    public int tamaño()
    {
        int count = 0;

        NodoAbstracto<T> q = primero;

        while (q != null)
        {
            count++;
            q = q.getSiguiente();
        }

        return count;
    }

    public void Insertar(NodoAbstracto<T> nodo, int posicion)
    {
        if (esVacia())
        {
            primero = nodo; //Insertar el primer nodo
        }
        else {
            //Obtenet tamaño de la lista
            int longitud = tamaño();

            //Hay que insertar al inicio
            if (posicion == 0 && longitud > 1) 
            {
                nodo.setSiguiente(primero);
                primero = nodo;
            }
            else
            {
                //Buscar la posición que le corresponde

                 NodoAbstracto<T> q = primero;

                 int pos;

                 for(pos=0; pos < longitud && pos < posicion - 1 ; pos ++)
                 {
                    q = q.getSiguiente();
                 }

                 //Inserta en posición dada
                 if (pos < longitud) 
                 {
                     nodo.setSiguiente(q.getSiguiente());
                     q.setSiguiente(nodo);
                 }

            }
        }
    }

    public void InsertarInicio(NodoAbstracto<T> nodo)
    {
        Insertar(nodo, 0);
    }

    public void InsertarFinal(NodoAbstracto<T> nodo)
    {
        Insertar(nodo, tamaño());
    }

    public NodoAbstracto<T> Borrar(int posicion)
    {
        NodoAbstracto<T> temp = null;

        if (!esVacia())
        {
            int longitud = tamaño();

            //Borrar el primero
            if (posicion == 0)
            {
                temp = primero;
                primero = temp.getSiguiente();
            }
            else {

                NodoAbstracto<T> q = primero;


                int pos;
                for(pos = 0; pos < longitud && pos < posicion - 1; pos++)
                {
                    q = q.getSiguiente();
                }

                if (pos < longitud)
                {
                    temp = q.getSiguiente();
                    q.setSiguiente(temp.getSiguiente());
                }

            }
        }

        return temp;
    }

    public NodoAbstracto<T> borrarInicio()
    {
        return Borrar(0);
    }

    public NodoAbstracto<T> borrarFinal()
    {
        return Borrar(tamaño()-1);
    }

    public void borrarTodo()
    {
        NodoAbstracto<T> temp;
        while (primero != null)
        {
            temp = primero;
            primero = primero.getSiguiente();
            temp = null;
        }
    }

    public NodoAbstracto<T> getNodo(int posicion)
    {
        if(esVacia())
        {
            return null;
        }
        else {
            int pos = 0;
            NodoAbstracto<T> q = primero;

            while(q != null && pos < posicion)
            {
                pos++;
                q = q.getSiguiente();
            }

            return q;
        }
    }

    public NodoAbstracto<T> getPrimero()
    {
        return getNodo(0);
    }

    public NodoAbstracto<T> getUltimo()
    {
        return getNodo(tamaño()-1);
    }


}
