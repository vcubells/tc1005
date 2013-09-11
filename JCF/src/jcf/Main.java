/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jcf;
import java.util.LinkedList;
import java.util.Iterator;

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

        LinkedList<CPersona> personas = new LinkedList<CPersona>();

        CPersona p1 = new CPersona("Juana", "Bacallao", 54, "F");
        CPersona p2 = new CPersona("Elisa", "Pérez", 30, "F");
        CPersona p3 = new CPersona("Isabel", "González", 23, "F");
        CPersona p4 = new CPersona("Cyrielle", "Durán", 19, "F");

        //Insertar en la lista
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(2, p4);

        //Borrar en la posición i
        CPersona p = (CPersona) personas.remove(3);
        System.out.printf("Se borró de la lista a %s \n", p.getNombre());

        //Obtener persona en i
        CPersona pi = personas.get(2);
        System.out.printf("La persona en la posición i es %s \n", pi.getNombre());

        //Visualizar todas las personas
        Iterator it = personas.iterator();
        while (it.hasNext())
        {
            pi = (CPersona)it.next();
            System.out.printf("%s \n", pi.getNombre());
        }

        //Borrar todos los elementos
        personas.clear();

        //Elementos en la lista
        System.out.printf("La lista tiene %d personas", personas.size());


    }

}
