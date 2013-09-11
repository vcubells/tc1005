/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package objectstreams;
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

        FileOutputStream fos = null;
        //ObjectOutputStream oos = null;
        MiOutputStream oos = null;

        Datos [] p = new Datos[2];

        p[0] = new Datos(58, "probando un objeto seriable", true);

        p[1] = new Datos(67, "probando un objeto seriable 2", false);

        try {
            fos = new FileOutputStream("data.txt", true);
            //oos = new ObjectOutputStream(fos);
            oos = new MiOutputStream(fos);

            for(Datos d:p)
            {
                oos.writeObject(d);
            }

//            oos.writeInt(60);
//            oos.writeUTF("probando ObjectStreams");
//            oos.writeBoolean(true);
        }
        catch (IOException ex)
        {
            System.out.println("Error: " + ex.getMessage());
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


        //Leer
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("data.txt");
            ois = new ObjectInputStream(fis);

            Datos r =null;
            do {
                r = (Datos) ois.readObject();
                r.imprime();
            }
            while ( r != null);

//            System.out.printf("Entero: %d \n", ois.readInt());
//            System.out.printf("String: %s \n", ois.readUTF());
//            System.out.printf("Boolean: %s \n", ois.readBoolean());
        }
        catch (IOException ex)
        {

        }
        catch (ClassNotFoundException ex)
        {

        }
        finally {
               try {
                    ois.close();
                    fis.close();
               }
               catch(IOException ex)
               {

               }
        }
    }

}
