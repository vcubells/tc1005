/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pila;

/**
 *
 * @author Administrator
 */
public class Pila <T> {
    private NodoAbstracto<T> tope;
    private int _length;

    public Pila()
    {
        tope = null;
        _length = 0;
    }

    public int length()
    {
        return _length;
    }

    public boolean esVacia()
    {
        return tope == null;
    }

    public void push(NodoAbstracto<T> nodo)
    {
        nodo.siguiente = tope;
        tope = nodo;
        _length++;
    }

    public NodoAbstracto<T> pop()
    {
        NodoAbstracto<T> q = null;

        if (!esVacia())
        {
            q = tope;
            tope = tope.siguiente;
            _length--;
        }

        return q;
    }

    public NodoAbstracto<T> getTope() {
        return tope;
    }






}
