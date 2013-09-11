/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab0910;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ArchivoPersona {

    File archivo = null;
    boolean adicionar = false;

    public boolean abrir(String archivo)
    {
        boolean seguir = false;

        File f = new File(archivo);

        if (f.exists())
        {
            System.out.print("El archivo ya existe, ¿desea sobreescribirlo? [s/n/a]: ");
            Scanner s = new Scanner(System.in);
            String cad = s.next().toLowerCase();
            if ( cad.length() == 1)
            {
               char opc = cad.charAt(0);
               if (opc == 's')
               {
                   this.archivo = f;
                   seguir = true;
               }
               else if (opc == 'a')
               {
                   this.archivo = f;
                   seguir = true;
                   adicionar = true;
               }
            }
        }
        else {
           this.archivo = f;
           seguir = true;
        }

        return seguir;
    }

    public void escribir(Persona persona)
    {
        FileOutputStream fs = null;
        DataOutputStream ds = null;

        if (archivo != null)
        {
            try {
                fs = new FileOutputStream(archivo, adicionar);
                ds = new DataOutputStream(fs);

                ds.writeChars(persona.getNombre());
                ds.writeChars(persona.getApellidos());
                ds.writeInt(persona.getEdad());
                ds.writeChar(persona.getSexo());
            }
            catch (IOException ex)
            {
                System.out.println("Error: " + ex.getMessage());
            }
            finally {
                try {
                    ds.close();
                    fs.close();
                }
                catch (IOException ex)
                {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
    }

    public void escribir(int numero)
    {
        FileOutputStream fs = null;
        DataOutputStream ds = null;

        if (archivo != null)
        {
            try {
                fs = new FileOutputStream(archivo, adicionar);
                ds = new DataOutputStream(fs);

                ds.writeInt(numero);
            }
            catch (IOException ex)
            {
                System.out.println("Error: " + ex.getMessage());
            }
            finally {
                try {
                    ds.close();
                    fs.close();
                }
                catch (IOException ex)
                {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
    }

}
