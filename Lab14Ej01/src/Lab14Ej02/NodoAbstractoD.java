/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab14Ej02;

/**
 *
 * @author Administrator
 */
public abstract class NodoAbstractoD <T> {

    protected T info;
    protected NodoAbstractoD siguiente, anterior;

    public NodoAbstractoD(T info)
    {
        this.info = info;
        this.siguiente = this.anterior = this;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NodoAbstractoD getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoAbstractoD anterior) {
        this.anterior = anterior;
    }

    public NodoAbstractoD getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAbstractoD siguiente) {
        this.siguiente = siguiente;
    }


}
