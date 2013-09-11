/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab13ej01;

/**
 *
 * @author Administrator
 */
public class Nodo <T> extends NodoAbstracto <T> {
    
    public Nodo(T info)
    {
        super(info);
    }

    public int compareTo(NodoAbstracto<T> nodo)
    {
        //No hace falta implementarlo
        return 0;
    }


}
