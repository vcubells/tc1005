/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab01ej01;

/**
 *
 * @author Administrator
 */
public class CAProfesional extends CAlumno{

    private String carrera = "ITC";

    public void imprime()
    {
        super.imprime();
        System.out.printf("La carrera que cursa es: %s \n", carrera);
    }

}
