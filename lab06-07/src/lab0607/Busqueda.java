/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab0607;

/**
 *
 * @author Administrator
 */
public class Busqueda {

    public static boolean busquedaSecuencial(Comparable a[], Comparable valor)
    {
        int i = 0;
        boolean encontrado = false;

        while (!encontrado && i < a.length)
        {
            if ( valor.compareTo(a[i]) == 0 ) { encontrado = true; }
            i++;
        }

        return encontrado;
    }

    public static boolean busquedaBinaria(Comparable a[], Comparable valor)
    {
        if (a.length == 0) { return false; }

        int mitad, inf = 0, sup = a.length - 1;

        do {
            mitad = (inf + sup) / 2;

            if (valor.compareTo(a[mitad]) > 0)
            {
                inf = mitad + 1;
            }
            else
            {
                sup = mitad - 1;
            }
        }
        while (a[mitad] != valor && inf <= sup);

        if (a[mitad] == valor)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean BoyerMoore(String stexto, String scadena)
    {
        char[] texto = stexto.toCharArray();
        char[] cadena = scadena.toCharArray();

        //Construir tabla delta
        int[] delta = new int[256];
        int i, longitud = cadena.length;

        //Iniciar tabla delta
        for (i = 0; i < 256; i++)
        {
            delta[i] = longitud;
        }

         //Asignar valores a la tabla delta
        for (i = 0; i < longitud; i++)
        {
            delta[cadena[i]] = longitud - i - 1;
        }

        //Algoritmo de Boyer y Moore
        int j, longTexto = texto.length;
        i = longitud -1; //i es el índice dentro del texto

        while (i < longTexto)
        {
            j = longitud - 1; //j es el índice dentro de la cadena a buscar

            //Mientras coincidan los caracteres
            while (cadena[j] == texto[i])
            {
                if (j > 0)
                {
                    // Moverse a la siguiente posición a la izquierda
                    j--; i--;
                }
                else
                {
                    return true; //Se llegó al principio de la cadena y se encontró
                }
            }
            // Los caracteres no coinciden, mover i lo que indique delta
            i += delta[texto[i]];
        }

        return false;
    }

}
