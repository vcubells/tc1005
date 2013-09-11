/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab0607;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        int n = 10;
//        Comparable numeros[] = new Comparable[n];
//
//        for (int i=0; i < n; i++)
//        {
//            numeros[i] = (int)(Math.random() * 100);
//            System.out.printf("%d - ", numeros[i]);
//        }
//
//        System.out.println();
//
//
//
//        //Ordenamiento.BubbleSort(numeros);
//        //Ordenamiento.SelectionSort(numeros, false);
//        //Ordenamiento.InsertionSort(numeros);
//        //Ordenamiento.ShellSort(numeros);
//
//        Ordenamiento.QuickSort(numeros);
//        //Ordenamiento.MergeSort(numeros);
//
//        // Imprimir el arreglo ordenado
//        for(Comparable i: numeros)
//        {
//            System.out.printf("%d - ", i);
//        }
//
//        //Búsqueda
//
//        boolean existe = Busqueda.BoyerMoore("buscando una cadena", "adem");
//        System.out.print(existe);

        Comparable personas[] = new Comparable[3];
        personas[0] = new Persona("Juan","Pérez",12);
        personas[1] = new Persona("Maria","Salcedo",58);
        personas[2] = new Persona("Joven","Camilo",15);

        Ordenamiento.InsertionSort(personas);

        for (Comparable p:personas)
        {
            Persona pers = (Persona)p;
            System.out.printf("%s %s - %d \n", pers.getNombre(), pers.getApellidos(), pers.getEdad());
        }
    }

}
