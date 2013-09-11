/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab19grafos;

/**
 *
 * @author Administrator
 */
public class NodoArco<T,P extends Comparable> extends NodoAbstracto<P> implements Comparable {
    NodoVertice destino, origen;

    public NodoArco(P peso, NodoVertice origen, NodoVertice destino)
    {
        super(peso);
        this.destino = destino;
        this.origen = origen;
    }

    public NodoVertice getOrigen() {
        return origen;
    }

    public void setOrigen(NodoVertice origen) {
        this.origen = origen;
    }

    public NodoVertice getDestino() {
        return destino;
    }

    public void setDestino(NodoVertice destino) {
        this.destino = destino;
    }

    @Override
    public int compareTo(Object o)
    {
        return compareTo((NodoArco<T, P>) o);
    }
    
    public int compareTo(NodoArco<T, P> nodo)
    {
        return this.getInfo().compareTo(nodo.getInfo());
    }

    public void imprime()
    {
        System.out.printf("%s -> %s (%s)\n", origen.getInfo(), destino.getInfo(), info);
    }

}
