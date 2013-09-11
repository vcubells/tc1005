/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab04ejs;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static int movimientos = 0;

   public static int potencia(int x, int n)
   {
        if ( n == 0 )
        {
           return 1;
        }
        else
        {
            return (x * potencia(x, n - 1));
        }
    }

    public static int factorial(int n)
    {
        if ( n == 0 )
        {
            return 1;
        }
        else
        {
            return (n * factorial(n - 1));
        }
    }


    public static int fibonacci(int n)
    {
        if ( n == 0 )
        {
            return 0;
        }
        else if ( n == 1)
        {
            return 1;
        }
        else
        {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static boolean palindromo(String palabra, int i, int j)
    {
        if(i != (palabra.length()/2)){
             if(palabra.charAt(i) == palabra.charAt(j))
                 return palindromo(palabra, ++i, --j);
             else
                 return false;
         }

         return true;
    }


    public static int mcd(int a, int b)
    {
        if(b==0)
            return a;
        else
            return mcd(b, a % b);
    }

    public static void hanoi (int n, int inic, int tmp, int fin)
    {
        if (n > 0) {
            // Mover n-1 discos de "inic" a "tmp".
            // El temporal es "fin".
            hanoi (n-1, inic, fin, tmp);

            // Mover el que queda en "inic" a "fin"
            System.out.printf("%d -> %d \n", inic, fin);

            // Mover n-1 discos de "tmp" a "fin".
            // El temporal es "inic".
            hanoi (n-1, tmp, inic, fin);
            movimientos++;
        }
    }



    public static void main(String[] args) {

        //Potencia de x^y
        int x=5, y=3;
        System.out.printf("La potencia %d ^ %d = %d \n\n", x, y, potencia(x,y));

        //Factorial de n
        int n = 5;
        System.out.printf("El factorial de %d = %d \n\n", n, factorial(n));

        //Serie de Fibonacci
        n = 20;
        System.out.printf("Los primeros %d números de la Serie de Fibonacci son:\n", n);

        for(int i=0; i < n; i++)
        {
            System.out.printf("%d ", fibonacci(i));
        }

        System.out.printf("\n\n");

        //Palíndromo
        String s = "ANA";
        if (palindromo(s,0,s.length()-1)) {
            System.out.printf("La cadena '%s' es un palíndromo\n\n", s);
        }
        else {
            System.out.printf("La cadena '%s' no es un palíndromo\n\n", s);
        }

        //Máximo Común Divisor
        x=50;
        y=30;
        System.out.printf("El máximo común divisor de %d y %d = %d \n\n", x, y, mcd(x,y));

        //Solución a las Torres de Hanoi
        n = 3;
        System.out.printf("Solución a las Torres de Hanoi para %d discos\n", n);
        hanoi(n, 1, 2, 3);
        System.out.printf("Movimientos realizados: %d \n", movimientos);
    }

}
