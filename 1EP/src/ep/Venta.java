/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ep;

/**
 *
 * @author Administrator
 */
public class Venta implements Comparable {
    private double monto;
    private Comprador comprador;
    private Auto vehiculo;

    public Venta(double m, Comprador c, Auto v)
    {
        monto = m;
        comprador = c;
        vehiculo = v;
    }

    public Comprador getComprador()
    {
        return comprador;
    }

    public Auto getVehiculo()
    {
        return vehiculo;
    }

    public int compareTo(Object o)
    {
        return (this.monto < ((Venta)o).monto) ? 1 : ( this.monto > ((Venta)o).monto ? -1 : 0);
    }

    public void imprimir()
    {
        System.out.printf("Monto de la venta: %.2f \n", monto);
        comprador.imprimir();
        vehiculo.imprimir();
    }
}
