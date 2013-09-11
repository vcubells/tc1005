/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab01ej01;

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

        //Crear objeto Alumno
        CAlumno alumno = new CAlumno();

        alumno.setEdad(40);
        alumno.setMatricula("");

        alumno.imprime();

        //Crear profesor
        CProfesor profesor = new CProfesor();
        profesor.setEdad(55);
        profesor.setNomina("L0101010");

        profesor.imprime();


        

    }

}
