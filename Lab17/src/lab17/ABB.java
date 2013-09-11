/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab17;

/**
 *
 * @author Administrator
 */
public class ABB<T extends Comparable<T>> extends ArbolBinario<T> {

    public ABB()
    {
        super();
    }
    
    public NodoAbstracto buscar(T info, NodoAbstracto nodo)
    {
        
        NodoAbstracto p = raiz;
        while (p != null)
        {
           if (p.info == info)
                return  p;
           else
               p = (p.info.compareTo(info) > 0 ? p.getIzquierdo() : p.getDerecho());
        }
        return null;
    }

}
