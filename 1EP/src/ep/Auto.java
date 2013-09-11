/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ep;

/**
 *
 * @author Administrator
 */
public class Auto {
    protected int codigo;
    protected String marca;
    protected int año;
    protected int kilometraje;

    public Auto(int c, String m, int a, int k)
    {
        codigo = c;
        marca = m;
        año = a;
        kilometraje = k;
    }

    public void imprimir()
    {
        System.out.printf("Codigo: %d\n", codigo);
        System.out.printf("Marca: %s\n", marca);
        System.out.printf("Año: %d\n", año);
        System.out.printf("Kilometraje: %d\n", kilometraje);
    }
}

