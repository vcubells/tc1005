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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PrintStream salida = System.out;

        // Inicializar el scanner
        Scanner s = new Scanner(System.in);
        
        if (s == null)
        {
            salida.println("Error: No existe un dispositivo de entrada");
            System.exit(1);
        }

        //Inicializar y abrir el archivo
        ArchivoPersona ap = new ArchivoPersona();
        if (ap.abrir("lista.lst"))
        {
            char opcion = ' ';

            do {
                salida.print("Entre la opción deseada [a/s]:");
                String linea = s.next();

                if (linea.length() != 1)
                {
                    salida.printf("Opción '%s' incorrecta \n", linea);
                }
                else {
                    opcion = linea.toLowerCase().charAt(0);

                    switch (opcion)
                    {
                        case 'a':
                            salida.print("Entre la cantidad de personas a adicionar: ");
                            linea = s.next();
                            int num_personas = Integer.parseInt(linea);
                            int i = 1;

                            //Guardar el número de personas en el archivo
                            ap.escribir(num_personas);

                            //Entrar información de las personas y guardarlas en el archivo
                            while (i <= num_personas)
                            {
                                salida.printf("Captura de la persona #%d \n", i);
                                salida.println("-------------------------------");
                                salida.print("Entre el nombre: ");
                                String nombre = s.next();
                                salida.print("Entre los apellidos: ");
                                String apellidos = s.next();
                                salida.print("Entre la edad: ");
                                int edad = Integer.parseInt(s.next());
                                char sexo = ' ';
                                do {
                                    salida.print("Entre el sexo (M/F): ");
                                    linea = s.next().toUpperCase();
                                    if (linea.length() == 1) { sexo = linea.charAt(0); }
                                }
                                while (sexo != 'M' && sexo != 'F');

                                //Llamar al método que almacena la Persona
                                ap.escribir(new Persona(nombre, apellidos, edad, sexo));

                                i++;
                            }

                            break;
                    }
                }

            }
            while (opcion != 's');
        }

    }

}
