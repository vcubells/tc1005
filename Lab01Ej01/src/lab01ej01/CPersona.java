/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab01ej01;

/**
 *
 * @author Administrator
 */
public abstract class CPersona {

    private int edad = 20;

    public int getEdad()
    {
       return edad;
    }

    public void setEdad(int e)
    {
        edad = e;
    }

    public abstract void imprime();

}
