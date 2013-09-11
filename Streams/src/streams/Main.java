/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package streams;
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
        DataOutputStream dos = null;
        
        try {
            fos = new FileOutputStream("data.txt");
            dos = new DataOutputStream(fos);

            dos.writeInt(45);
            dos.writeUTF("probando");
            dos.writeBoolean(false);
        }
        catch (IOException ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        finally {

             try {
                 dos.close();
                 fos.close();
             }
             catch (IOException ex)
             {
             }
         }


        //Leer
        FileInputStream fis = null;
        DataInputStream dis = null;

        try {
            fis = new FileInputStream("data.txt");
            dis = new DataInputStream(fis);

            System.out.printf("Entero: %d \n", dis.readInt());
            System.out.printf("String: %s \n", dis.readUTF());
            System.out.printf("Boolean: %s \n", dis.readBoolean());
        }
        catch (IOException ex)
        {

        }
        finally {
               try {
                    dis.close();
                    fis.close();
               }
               catch(IOException ex)
               {

               }
        }


    }

}
