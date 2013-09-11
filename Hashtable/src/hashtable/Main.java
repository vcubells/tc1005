/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hashtable;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap hashmap = new HashMap();

        hashmap.put("A010101", "Vicente Merario");
        hashmap.put("A020202", "Juana Bacallao");
        hashmap.put("A030303", "Agustin Siempre");
        hashmap.put("A040404", "Luis Gaspar");
        hashmap.put("A404040", "Luis Gaspar 2");

        hashmap.imprimir();

        //System.out.printf("Elemento borrado: %s \n", hashmap.delete("A0101"));

        //hashmap.imprimir();

    }

}
