/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab19grafos;

/**
 *
 * @author Administrator
 */
public class Nodo<T extends Comparable>  extends NodoAbstracto<T>{

    public Nodo(T info)
    {
        super(info);
    }

    public void imprime()
    {
        info.toString();
    }
}
