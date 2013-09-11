/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab17;

/**
 *
 * @author Administrator
 */
public abstract class NodoAbstracto <T extends Comparable<T>> implements Comparable<T>{

    protected T info;
    protected NodoAbstracto izquierdo, derecho, padre;

    public NodoAbstracto(T info)
    {
        this.info = info;
        this.izquierdo = this.derecho = this.padre = null;
    }

    public NodoAbstracto getPadre() {
        return padre;
    }

    public void setPadre(NodoAbstracto padre) {
        this.padre = padre;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NodoAbstracto getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoAbstracto derecho) {
        this.derecho = derecho;
    }

    public NodoAbstracto getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoAbstracto izquierdo) {
        this.izquierdo = izquierdo;
    }

    public int compareTo(T info)
    {
        return this.info.compareTo(info);
    }

   






}
