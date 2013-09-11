/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ep;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Comparable[] ventas = new Comparable[4];

        ventas[0] = new Venta(150000, new Comprador("Alejandro", "García","A23"), new Camioneta(456, "LandRover", 2010, 30000, "4x4"));
        ventas[1] = new Venta(300000, new Comprador("Santiago", "García","S35"), new Motocicleta(65, "BMW", 2009, 10000, 1000));
        ventas[2] = new Venta(44000, new Comprador("Vicente", "Cubells","CUNV73"), new Auto(456, "Civic", 2008, 45000));
        ventas[3] = new Venta(30000, new Comprador("Alejandro", "García","A23"), new Auto(456, "Chevy", 2010, 30000));

        Ordenamiento.QuickSort(ventas);

        for(Comparable v: ventas)
        {
           ((Venta)v).imprimir();
           System.out.println();
        }

        System.out.println("Autos del comprador");
        String ife = "A23";

        for(Comparable v: ventas)
        {
           Venta v1 = (Venta)v;
           if ((v1.getComprador().getIFE().equals(ife))) //Aquí se esta comparando el IFE de cada objeto del arreglo con el que setá buscando
           {
            v1.getVehiculo().imprimir();
             System.out.println();
           }
        }

        // Ejercicio 3
        int a[] = new int[3];

        a[0] = 5;
        a[1] = 3;
        a[2] = 4;

        System.out.printf("El resultado de multiplicar los elementos del vector es : %d \n", Recursivo.mult(a, a.length-1));


    }
}
