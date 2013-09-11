/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab14Ej02;

/**
 *
 * @author Administrator
 */
public class ListaDEC <T> {
protected NodoAbstractoD<T> ultimo;

    public ListaDEC()
    {
        this.ultimo = null;
    }

    public boolean esVacia()
    {
        return ultimo == null;
    }

    public int tamaño()
    {
        int count = 0;

        if (!esVacia())
        {
            count = 1;

            NodoAbstractoD<T> q = ultimo.siguiente;

            while (q != ultimo)
            {
                count++;
                q = q.getSiguiente();
            }
        }

        return count;
    }

    public void Insertar(NodoAbstractoD<T> nodo, int posicion)
    {
        if (esVacia())
        {
            ultimo = nodo; //Insertar el primer nodo
        }
        else {
            //Obtenet tamaño de la lista
            int longitud = tamaño();

            //Buscar la posición que le corresponde

             NodoAbstractoD<T> q = ultimo;

             int pos;

             for(pos=0; pos < longitud && pos < posicion ; pos ++)
             {
                q = q.getSiguiente();
             }

             nodo.setSiguiente(q.getSiguiente());
             nodo.setAnterior(q);
             nodo.getSiguiente().setAnterior(nodo);
             q.setSiguiente(nodo);

             //Insertar al final
             if (pos == longitud)
             {
                 ultimo = nodo;
             }

        }
    }

    public void InsertarInicio(NodoAbstractoD<T> nodo)
    {
        Insertar(nodo, 0);
    }

    public void InsertarFinal(NodoAbstractoD<T> nodo)
    {
        Insertar(nodo, tamaño());
    }

    public NodoAbstractoD<T> Borrar(int posicion)
    {
        NodoAbstractoD<T> temp = null;

        if (!esVacia())
        {
            int longitud = tamaño();

            NodoAbstractoD<T> q = ultimo;

            int pos;
            for(pos = 0; pos < longitud && pos < posicion; pos++)
            {
                q = q.getSiguiente();
            }

            temp = q.getSiguiente();
            temp.getSiguiente().setAnterior(q);
            q.setSiguiente(temp.getSiguiente());

            //Borrar al final
             if (pos == longitud - 1)
             {
                 ultimo = q;
             }
        }

        return temp;
    }

    public NodoAbstractoD<T> borrarInicio()
    {
        return Borrar(0);
    }

    public NodoAbstractoD<T> borrarFinal()
    {
        return Borrar(tamaño() - 1);
    }

    public void borrarTodo()
    {
        NodoAbstractoD<T> temp = null, primero;
        primero = ultimo.getSiguiente();

        while (primero != ultimo)
        {
            temp = primero;
            primero = primero.getSiguiente();
            temp = null;
        }

        ultimo = null;
    }

    public NodoAbstractoD<T> getNodo(int posicion)
    {
        if(esVacia())
        {
            return null;
        }
        else {
            int pos = 0;
            NodoAbstractoD<T> q = ultimo.getSiguiente();

            while(q != ultimo && pos < posicion)
            {
                pos++;
                q = q.getSiguiente();
            }

            return q;
        }
    }

    public NodoAbstractoD<T> getPrimero()
    {
        return getNodo(0);
    }

    public NodoAbstractoD<T> getUltimo()
    {
        return getNodo(tamaño()-1);
    }
}
