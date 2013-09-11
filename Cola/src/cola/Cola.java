/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cola;

/**
 *
 * @author Administrator
 */
public class Cola <T>{

    private NodoAbstracto<T> inicio, fin;
    int length;

    public Cola()
    {
        inicio = fin = null;
        length = 0;
    }

    public int length()
    {
        return length;
    }

    public boolean esVacia()
    {
        return inicio == null;
    }

    public void enqueue(NodoAbstracto<T> nodo)
    {
        if (esVacia())
        {
            inicio = fin = nodo;
        }
        else {
            fin.setSiguiente(nodo);
            fin = nodo;
        }

        length++;
    }

    public NodoAbstracto<T> dequeue()
    {
        NodoAbstracto<T> q;
        q = inicio;
        inicio = inicio.getSiguiente();

        length--;

        return q;
    }

}
