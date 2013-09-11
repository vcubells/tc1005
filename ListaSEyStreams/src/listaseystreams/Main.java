/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package listaseystreams;

import java.io.*;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaSE<Persona> personas = new ListaSE<Persona>();

        personas.InsertarInicio(new NodoPersona(new Persona("Juan", "Urrutia", 45, 'M')));
        personas.InsertarInicio(new NodoPersona(new Persona("Maria", "Garcia", 34, 'F')));
        personas.InsertarInicio(new NodoPersona(new Persona("Elena", "Hortencia", 15, 'F')));
        personas.InsertarInicio(new NodoPersona(new Persona("Emeregildo", "Lutero", 60, 'M')));

        //Imprimir la lista
        int longitud = personas.tamaño();
        for (int i=0; i<longitud;  i++)
        {
            System.out.println(personas.getNodo(i).getInfo().toString());
        }

        //Código que almacena
         FileOutputStream fos = null;
         ObjectOutputStream oos = null;

        try {
             fos = new FileOutputStream("lista.txt");
             oos = new ObjectOutputStream(fos);

             oos.writeObject(personas);
        }
        catch (IOException ex)
        {
        }
        finally {
            try {
                oos.close();
                fos.close();
            }
            catch (IOException ex)
            {
            }

        }

        personas.borrarTodo();
        System.out.println("La lista está vacía");


        //Código que lee
         FileInputStream fis = null;
         ObjectInputStream ois = null;

        try {
             fis = new FileInputStream("lista.txt");
             ois = new ObjectInputStream(fis);

             personas = (ListaSE<Persona>)ois.readObject();
        }
        catch (Exception ex)
        {
        }
        finally {
            try {
                ois.close();
                fis.close();
            }
            catch (IOException ex)
            {
            }

        }

         longitud = personas.tamaño();
        for (int i=0; i<longitud;  i++)
        {
            System.out.println(personas.getNodo(i).getInfo().toString());
        }




    }

}
