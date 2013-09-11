/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hashtable;

/**
 *
 * @author Administrator
 */
public class Nodo <K extends Comparable<K>, V extends Comparable<V>> {
    
    protected K key;
    protected V valor;
    protected Nodo siguiente;

    public Nodo(K key, V value)
    {
        this.key = key;
        this.valor = value;
        siguiente = null;

    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }



}
