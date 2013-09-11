/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ep;

/**
 *
 * @author Administrator
 */
public class Comprador {
    private String nombre;
    private String apellidos;
    private String IFE;

    public Comprador(String n, String a, String i)
    {
        nombre = n;
        apellidos = a;
        IFE = i;
    }

    public String getIFE()
    {
        return IFE;
    }

    public void imprimir()
    {
        System.out.printf("Comprador: %s %s (%s)\n", nombre, apellidos, IFE);
    }

}
