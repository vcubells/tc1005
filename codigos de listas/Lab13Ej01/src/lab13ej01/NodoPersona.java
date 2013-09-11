/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab13ej01;

/**
 *
 * @author Administrator
 */
public class NodoPersona extends NodoAbstracto <Persona> {
    public NodoPersona(Persona info)
    {
        super(info);
    }

    public int compareTo(NodoAbstracto<Persona> nodo)
    {
        return this.getInfo().getApellidos().compareTo(nodo.getInfo().getApellidos());
    }
}
