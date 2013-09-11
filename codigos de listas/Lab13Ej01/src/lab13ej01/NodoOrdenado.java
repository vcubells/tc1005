/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab13ej01;

/**
 *
 * @author Administrator
 */
public class NodoOrdenado extends NodoAbstracto <Integer> {

    public NodoOrdenado(Integer info)
    {
        super(info);
    }

    public int compareTo(NodoAbstracto<Integer> nodo)
    {
        return this.getInfo() < nodo.getInfo() ? -1 : (this.getInfo() > nodo.getInfo() ? 1 : 0);
    }
}
