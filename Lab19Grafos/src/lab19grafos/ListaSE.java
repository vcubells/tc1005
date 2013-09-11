/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab19grafos;

/**
 *
 * @author Administrator
 */
public class ListaSE <T extends Comparable> implements Comparable {
    protected NodoAbstracto primero;

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

        NodoAbstracto q = primero;

        while (q != null)
        {
            count++;
            q = q.getSiguiente();
        }

        return count;
    }

    public void Insertar(NodoAbstracto nodo, int posicion)
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

                 NodoAbstracto q = primero;

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

    public void InsertarInicio(NodoAbstracto nodo)
    {
        Insertar(nodo, 0);
    }

    public void InsertarFinal(NodoAbstracto nodo)
    {
        Insertar(nodo, tamaño());
    }

    public NodoAbstracto Borrar(int posicion)
    {
        NodoAbstracto temp = null;

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

                NodoAbstracto q = primero;


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

    public NodoAbstracto Borrar(NodoAbstracto nodo)
    {
        NodoAbstracto temp = null, anterior = null;

        temp = primero;

        while (temp != null && temp != nodo)
        {
            anterior = temp;

            temp = temp.getSiguiente();
        }

        if (temp == nodo)
        {
            if (temp == primero)
            {
                primero = temp.getSiguiente();
            }
            else {
                anterior.setSiguiente(temp.getSiguiente());
            }
        }

        return temp;
    }

    public NodoAbstracto borrarInicio()
    {
        return Borrar(0);
    }

    public NodoAbstracto borrarFinal()
    {
        return Borrar(tamaño()-1);
    }

    public void borrarTodo()
    {
        NodoAbstracto temp;
        while (primero != null)
        {
            temp = primero;
            primero = primero.getSiguiente();
            temp = null;
        }
    }

    public int getPosicion(T info)
    {
        int pos = -1 ;
        int actual = 0;
        NodoAbstracto q = primero;

        while(q != null && pos == -1)
        {
            if (q.getInfo().equals(info))
            {
                pos = actual;
            }

            q = q.getSiguiente();
        }

        return pos;

    }

    public NodoAbstracto getNodo(int posicion)
    {
        if(esVacia())
        {
            return null;
        }
        else {
            int pos = 0;
            NodoAbstracto q = primero;

            while(q != null && pos < posicion)
            {
                pos++;
                q = q.getSiguiente();
            }

            return q;
        }
    }

    public NodoAbstracto getPrimero()
    {
        return getNodo(0);
    }

    public NodoAbstracto getUltimo()
    {
        return getNodo(tamaño()-1);
    }

    public NodoAbstracto buscar(Comparable info)
    {
        boolean encontrado = false;
        NodoAbstracto q = primero, anterior = null;

        while(q != null && !encontrado)
        {
            if (q.getInfo().equals(info))
            {
                encontrado = true;
                anterior = q;
            }

            q = q.getSiguiente();
        }

        return anterior;

    }

    public int compareTo(Object o)
    {
        return 0;
    }

    public void imprime()
    {
        NodoAbstracto q = primero;

        while (q != null)
        {
           q.imprime();
           q = q.getSiguiente();
        }

    }



}
