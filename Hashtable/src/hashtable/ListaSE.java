/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hashtable;

/**
 *
 * @author Administrator
 */
public class ListaSE <K extends Comparable<K>, V extends Comparable<V>> {
    protected Nodo<K, V> primero;

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

        Nodo<K, V> q = primero;

        while (q != null)
        {
            count++;
            q = q.getSiguiente();
        }

        return count;
    }

    public void Insertar(Nodo<K, V> nodo, int posicion)
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

                 Nodo<K, V> q = primero;

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

    public void InsertarInicio(Nodo<K, V> nodo)
    {
        Insertar(nodo, 0);
    }

    public void InsertarFinal(Nodo<K, V> nodo)
    {
        Insertar(nodo, tamaño());
    }

    public Nodo<K, V> Borrar(int posicion)
    {
        Nodo<K, V> temp = null;

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

                Nodo<K, V> q = primero;


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

    public Nodo<K, V> borrarInicio()
    {
        return Borrar(0);
    }

    public Nodo<K, V> borrarFinal()
    {
        return Borrar(tamaño()-1);
    }

    public void borrarTodo()
    {
        Nodo<K, V> temp;
        while (primero != null)
        {
            temp = primero;
            primero = primero.getSiguiente();
            temp = null;
        }
    }

    public Nodo<K, V> getNodo(int posicion)
    {
        if(esVacia())
        {
            return null;
        }
        else {
            int pos = 0;
            Nodo<K, V> q = primero;

            while(q != null && pos < posicion)
            {
                pos++;
                q = q.getSiguiente();
            }

            return q;
        }
    }

    public Nodo<K, V> getPrimero()
    {
        return getNodo(0);
    }

    public Nodo<K, V> getUltimo()
    {
        return getNodo(tamaño()-1);
    }

    public int buscarKey(K key)
    {
        int found = -1;
        int i = -1;

        Nodo q = primero;
        while (q != null && found != 0)
        {
            found = q.getKey().compareTo(key) ;
            q = q.getSiguiente();
            i++;
        }

        return i;
    }


}
