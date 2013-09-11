/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ep;

/**
 *
 * @author Administrator
 */
public class Camioneta extends Auto {
    private String traccion;

    public Camioneta(int c, String m, int a, int k, String t)
    {
        super(c, m, a, k);
        traccion = t;
    }

    public void imprimir()
    {
        System.out.printf("Camioneta\n");
        super.imprimir();
        System.out.printf("Tracción: %s\n", traccion);
    }

}
