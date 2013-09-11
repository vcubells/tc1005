/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab13ej01;

/**
 *
 * @author Administrator
 */
public class NodoOrdenadoString extends NodoAbstracto <String> {

    public NodoOrdenadoString(String info)
    {
        super(info);
    }

    public int compareTo(NodoAbstracto<String> nodo)
    {
        return this.getInfo().compareTo(nodo.getInfo());
    }
}
