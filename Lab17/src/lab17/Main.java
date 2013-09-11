/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab17;

import java.util.LinkedList;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArbolBinario<Integer> arbol = new ArbolBinario<Integer>();

        arbol.insertar(40, -1, true);
        arbol.insertar(63, 40, true);
        arbol.insertar(35, 40, false);
        arbol.insertar(8, 35, true);
        arbol.insertar(95, 35, false);
        arbol.insertar(72, 63, true);
        arbol.insertar(9, 63, false);
//        arbol.insertar(7, 72);

//        arbol.borrarHoja(9);
//        arbol.borrarHoja(95);

        arbol.preOrden();

        //ArbolBinario<Integer> arbolSuma = new ArbolBinario<Integer>();

        System.out.printf("Es simétrico: %s \n", arbol.equals());
        arbol.frontera();


         ArbolBinario<String> arbolc = new ArbolBinario<String>();

        arbolc.insertar("c", " ", true);
        arbolc.insertar("a", "c", true);
        arbolc.insertar("o", "c", false);
        arbolc.insertar("s", "a", true);
        arbolc.insertar("t", "a", false);
        arbolc.insertar("i", "s", true);
        arbolc.insertar("e", "s", false);
        arbolc.insertar("l", "o", true);

        arbolc.cadena();

        //De Luis Angel regresa cadena vacia
        //System.out.printf("Palabras: \n", arbolc.palabra());

        //De Cristian
         LinkedList<String> palabras = new LinkedList<String>();
         palabras = arbolc.palabrasT();
//         for(String s: palabras)
//         {
//            System.out.printf("%s \n", s);
//         }

         //De Manuel
         //concatenar(arbolc.raiz, "");

//        crearArbolSuma(arbol.raiz, arbol, arbolSuma, -1);
//
//        arbolSuma.preOrden();
//        Integer[] a = {5,3,8,4,9,0,2,1};
//
//        ArbolBinario<Integer> ab = new ArbolBinario<Integer>();
//        ab.insertar(5,-1);
//        //ab.generaArbol(a);
//        ab.preOrden();


//        ABB<Integer> arbolB = new ABB<Integer>();

//        arbolB.insertar(40);
//        arbolB.insertar(63);
//        arbolB.insertar(35);
//        arbolB.insertar(8);
//        arbolB.insertar(95);
//        arbolB.insertar(72);
//        arbolB.insertar(9);
//        arbolB.insertar(7);
//
//        arbolB.enOrden();

//        String eo = "849251637";
//        String po = "124895367";





    }

    private static void concatenar(NodoAbstracto q, String actual){
        if(q != null){
            actual += q.getInfo();
            if(q.getDerecho() == null && q.getIzquierdo() == null){
                System.out.println(actual);
            }
            else {
                concatenar(q.getIzquierdo(),actual);
                concatenar(q.getDerecho(), actual);
            }
        }
    }


    public static void crearArbolSuma(NodoAbstracto<Integer> nodo, ArbolBinario<Integer>
        AB, ArbolBinario<Integer> AB2, Integer padre )
    {
        if (nodo != null)
        {
            Integer suma = AB.sumaElementos(nodo);
           // AB2.insertar(suma, padre, );
            
           crearArbolSuma(nodo.getIzquierdo(), AB, AB2, suma);
           crearArbolSuma(nodo.getDerecho(), AB, AB2, suma);
        }
    }



    static public boolean estaIzquierda(Character A, Character B, String rec)
    {
        boolean izquierda = true, seguir = true;
        int pos = 0;
        while (seguir)
        {
            if (A == rec.charAt(pos))
            {
                izquierda = true;
                seguir = false;
            }
            else if (B == rec.charAt(pos))
            {
                izquierda = false;
                seguir = false;
            }

            pos++;
        }

        return izquierda;
    }

    static public void generaDosRecorridos(String enOrden, String preOrden)
    {
        ArbolBinario<Character> arbol = new ArbolBinario<Character>();

//        arbol.insertar(preOrden.charAt(0), ' ');

        for (int i = 1; i < preOrden.length(); i++)
        {
            Character inicio = (Character)arbol.raiz.info;
            boolean izq = estaIzquierda((Character)(enOrden.charAt(i)), inicio, enOrden);
            //if (izq)
        }
    }

}
