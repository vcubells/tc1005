/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pila;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila<Character> cadena = new Pila<Character>();

        String texto = "Queremos invertir esta cadena";

        for( int i=0; i < texto.length(); i++)
        {
            cadena.push(new Nodo<Character>(texto.charAt(i)));
        }

        System.out.println("Cadena original: " + texto);

        System.out.printf("\n Tamaño de la pila: %d \n", cadena.length());
        
        System.out.print("Cadena invertida: ");

        while(!cadena.esVacia())
        {
            System.out.print(cadena.pop().getInfo());
        }

        System.out.printf("\n Tamaño de la pila: %d", cadena.length());

        String cad = "((())())";

        System.out.printf(" \n\n La cadena '%s' %s", cad, Balanceados(cad)? "está balanceada" : "no está balanceada");

        //Palindromo
        cad = "dabale arroz a la zorra el abad";
        System.out.printf(" \n\n La cadena '%s' %s", cad, Palindromo(cad)? "es palíndromo" : "no es palíndromo");

    }

    public static boolean Balanceados(String texto)
    {
        
        int slen = texto.length();

        Pila<Character> pila = new Pila<Character>();

        int count = 0;
        char c;
        int diferencia = 0;
        while (count < slen )
        {
            c = texto.charAt(count);
            if ((c) == '(')
            {
                pila.push(new Nodo<Character>(c));
                diferencia++;
            }
            else {
                pila.pop();
                diferencia--;
            }
            count++;
        }

        if (pila.esVacia() && diferencia == 0)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean Palindromo(String s)
    {
        Pila<Character> pila = new Pila<Character>();

        s = s.replaceAll(" ", "");
        int slen = s.length();
        int mitad = slen / 2;
        int i;
        for (i=0; i < mitad; i++)
        {
            pila.push(new Nodo(s.charAt(i)));
        }

        if (slen % 2 != 0) {i++;}
        
        boolean iguales = true;
        while (!pila.esVacia() && iguales)
        {
            iguales = s.charAt(i) == pila.pop().getInfo();
            i++;
        }

            return iguales;

    }

}
