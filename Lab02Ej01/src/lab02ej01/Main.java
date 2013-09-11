/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab02ej01;

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

        /* CPersona[] personas = new CPersona[3];

        personas[0] = new CAlumno("Femenino");
        personas[1] = new CProfesor();
        personas[2] = new CAProfesional();
        */

        ISexo animales[] = new ISexo[4];

        int i=0;
        animales[i++] = new CAlumno("Femenino");
        animales[i++] = new CProfesor();
        animales[i++] = new CPerro("guau guau", 4, "Macho");
        animales[i++] = new CGato("miau miau", 4, "Hembra");
        
        
        for(ISexo a : animales)
        {
            a.imprime();
            System.out.printf("El sexo es: %s \n", a.getSexo());

        }

    }

}
