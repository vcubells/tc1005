/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ep;

/**
 *
 * @author Administrator
 */
public class Ordenamiento {

    public static void BubbleSort(Comparable a[])
    {
        Comparable temp;
        boolean intercambio = true;

        for (int i = 0; intercambio && i < a.length - 1 ; i++)
        {
            intercambio = false;
            for (int j = 1; j < a.length; j++)
            {
                if (a[j-1].compareTo(a[j]) > 0)
                {
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                    intercambio = true;
                }
             }
        }
    }

    public static void SelectionSort(Comparable a[], boolean asc)
    {
        int min;
        Comparable aux;
        for(int i = 0; i < a.length; i++)
        {
            min = i;
            for(int j = i + 1; j < a.length; j++)
            {
                if (asc)
                {
                    if(a[min].compareTo(a[j]) > 0)
                    {
                        min = j;
                    }
                }
                else {
                    if(a[min].compareTo(a[j]) < 0)
                    {
                        min = j;
                    }
                }
            }
            aux = a[i];
            a[i] = a[min];
            a[min] = aux;
        }
    }

    public static void InsertionSort(Comparable a[])
    {
        int j;
        Comparable aux;
        for(int i=1; i < a.length; i++)
        {
            aux = a[i];
            j = i-1;
            while(j >= 0 && a[j].compareTo(aux) > 0)
            {
                a[j + 1] = a[j];
                j--;
            }
                a[j+1] = aux;
        }
    }

    public static void ShellSort(Comparable a[])
    {
        Comparable temp;
        for( int increment= a.length/ 2;
            increment > 0;
            increment = (increment == 2 ? 1 : (int) Math.round(increment/ 2.2)))
        {
            for(int i = increment; i < a.length; i++)
            {
                for(int j = i; (j >= increment) && (a[j - increment].compareTo(a[j]) > 0); j -= increment)
                {
                    temp = a[j];
                    a[j] = a[j - increment];
                    a[j - increment] = temp;
                }
            }
        }
    }

    public static void QuickSort (Comparable[] a)
    {
        QuickSort(a, 0, a.length - 1);
    }

    private static void QuickSort (Comparable[] a, int primero, int ultimo)
    {
        int izquierdo = primero;
        int derecho = ultimo;
        Comparable temp;

        //Se selecciona pivote
        Comparable pivote = a[(izquierdo + derecho) / 2];

        // particion
        do
        {
            while ( a[izquierdo].compareTo(pivote) < 0 && izquierdo < ultimo ) izquierdo++;
            while ( a[derecho].compareTo(pivote) > 0 && derecho > primero) derecho--;
            if ( izquierdo <= derecho) // se intercambian los 						contenidos
            {
                temp = a[derecho];
                a[derecho] = a[izquierdo];
                a[izquierdo] = temp;

                izquierdo++;
                derecho--;
            }
        }
        while ( izquierdo <= derecho);


        // Paso recursivo
        if (primero < derecho) QuickSort ( a, primero, derecho );
        if (izquierdo < ultimo) QuickSort ( a, izquierdo, ultimo );
    }

    public static void MergeSort(Comparable[] a)
    {
            int N = a.length;
            Comparable[] aux = new Comparable[N];
            MergeSort(a, aux, 0, N);
    }


    private static void MergeSort(Comparable[] a, Comparable[] aux, int lo, int hi)
     {
            // caso básico
             if (hi - lo <= 1) return;

            //Ordenar cada mitad recursivamente
            int mid = lo + (hi - lo) / 2;
            MergeSort(a, aux, lo, mid);
            MergeSort(a, aux, mid, hi);

            // mezcla
            merge(a, aux, lo, mid, hi);
    }

    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi)
    {
            int i = lo, j = mid;
            for (int k = lo; k < hi; k++)
            {
                    if (i == mid) aux[k] = a[j++];
                    else if (j == hi) aux[k] = a[i++];
                         else if (a[j].compareTo(a[i]) < 0) aux[k] = a[j++];
                               else aux[k] = a[i++];
            }
            // copiar al arreglo original
            for (int k = lo; k < hi; k++)
                    a[k] = aux[k];
    }




}


