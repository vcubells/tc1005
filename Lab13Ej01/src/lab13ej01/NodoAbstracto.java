/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab13ej01;

/**
 *
 * @author Administrator
 */
public abstract class NodoAbstracto <T extends Comparable<T>> implements Comparable<T>{

    protected T info;
    protected NodoAbstracto siguiente;

    public NodoAbstracto(T info)
    {
        this.info = info;
        this.siguiente = null;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NodoAbstracto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAbstracto siguiente) {
        this.siguiente = siguiente;
    }

    public int compareTo(T info)
    {
        return this.info.compareTo(info);
    }

}
