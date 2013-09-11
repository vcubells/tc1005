/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package objectstreams;
import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Datos implements Serializable {
    int entero;
    String string;
    boolean bool;

    public Datos(int i, String s, boolean b)
    {
        entero = i;
        string = s;
        bool = b;
    }

    public void imprime()
    {
        System.out.printf("Entero: %d \n", entero);
        System.out.printf("String: %s \n", string);
        System.out.printf("Boolean: %s \n", bool);
    }


}
