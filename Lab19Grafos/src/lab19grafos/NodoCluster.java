/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab19grafos;

/**
 *
 * @author Administrator
 */
public class NodoCluster<T extends Comparable> extends NodoAbstracto<T> {
    private ListaSEOrdenada<T> elementos = null;

    public NodoCluster(T info)
    {
        super(info);
        elementos = new ListaSEOrdenada<T>();
    }

    public ListaSEOrdenada<T> getElementos() {
        return elementos;
    }

    public void setElementos(ListaSEOrdenada<T> elementos) {
        this.elementos = elementos;
    }

    public void insertarItem(T info)
    {
        elementos.Insertar(new NodoVertice(info));
    }

    public void imprime()
    {
        
    }


}
