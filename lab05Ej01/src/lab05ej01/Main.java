/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab05ej01;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int n = 10;
        Integer numeros[] = new Integer[n];

        for (int i=0; i < n; i++)
        {
            numeros[i] = (int)(Math.random() * 100);
            System.out.printf("%d - ", numeros[i]);
        }

        System.out.println();

        
        Ordenamiento sort = new OrdenaNumeros();
       
        //sort.Seleccion(numeros, false);
        //sort.Insercion(numeros);
        sort.ShellSort(numeros);

       
        // Imprimir el arreglo ordenado
        for(Integer i: numeros)
        {
            System.out.printf("%d - ", i);
        }
    }

}
