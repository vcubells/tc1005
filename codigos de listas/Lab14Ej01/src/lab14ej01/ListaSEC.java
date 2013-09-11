/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab14ej01;

/**
 *
 * @author Administrator
 */
public class ListaSEC <T> {
    protected NodoAbstracto<T> ultimo;

    public ListaSEC()
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
            
            NodoAbstracto<T> q = ultimo.siguiente;

            while (q != ultimo)
            {
                count++;
                q = q.getSiguiente();
            }
        }

        return count;
    }

    public void Insertar(NodoAbstracto<T> nodo, int posicion)
    {
        if (esVacia())
        {
            ultimo = nodo; //Insertar el primer nodo
        }
        else {
            //Obtenet tamaño de la lista
            int longitud = tamaño();

            //Buscar la posición que le corresponde

             NodoAbstracto<T> q = ultimo;

             int pos;

             for(pos=0; pos < longitud && pos < posicion ; pos ++)
             {
                q = q.getSiguiente();
             }

             nodo.setSiguiente(q.getSiguiente());
             q.setSiguiente(nodo);

             //Insertar al final
             if (pos == longitud)
             {
                 ultimo = nodo;
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

            NodoAbstracto<T> q = ultimo;

            int pos;
            for(pos = 0; pos < longitud && pos < posicion; pos++)
            {
                q = q.getSiguiente();
            }
   
            temp = q.getSiguiente();
            q.setSiguiente(temp.getSiguiente());
                    
            //Borrar al final
             if (pos == longitud - 1)
             {
                 ultimo = q;
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
        return Borrar(tamaño() - 1);
    }

    public void borrarTodo()
    {
        NodoAbstracto<T> temp = null, primero;
        primero = ultimo.getSiguiente();
        
        while (primero != ultimo)
        {
            temp = primero;
            primero = primero.getSiguiente();
            temp = null;
        }

        ultimo = null;
    }

    public NodoAbstracto<T> getNodo(int posicion)
    {
        if(esVacia())
        {
            return null;
        }
        else {
            int pos = 0;
            NodoAbstracto<T> q = ultimo.getSiguiente();

            while(q != ultimo && pos < posicion)
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
