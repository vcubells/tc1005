/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ep;

/**
 *
 * @author Administrator
 */
public class Motocicleta extends Auto {
    private int cilindraje;

    public Motocicleta(int c, String m, int a, int k, int cl)
    {
        super(c, m, a, k);
        cilindraje = cl;
    }

    public void imprimir()
    {
        System.out.printf("Motocicleta\n");
        super.imprimir();
        System.out.printf("Cilindraje: %d\n", cilindraje);
    }

}
