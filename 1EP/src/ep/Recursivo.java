/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ep;

/**
 *
 * @author Administrator
 */
public class Recursivo {
    public static int mult(int a[], int n)
    {
        if (n < 0) { return -1; }
        if (n == 0) { return a[0]; }
        else { return a[n] * mult(a, n-1); }

    }
}
