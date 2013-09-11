/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab02ej01;

/**
 *
 * @author Administrator
 */
public class CAlumno extends CPersona {
    
    private String matricula = "";

    CAlumno()
    {   
    }

    CAlumno(String s)
    {
        super(s);
    }

    public void setMatricula(String matricula)
    {
        if (matricula.equals(""))
        {
            System.out.printf("Matrícula no válida \n");
        }
        else {
            this.matricula = matricula;
        }
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void imprime()
    {
        System.out.printf("\nDatos del alumno \n");
        System.out.printf("============================== \n\n");

        System.out.printf("La edad del alumno es: %d años \n", getEdad());
        if (!matricula.equals(""))
        {
            System.out.printf("La matrícula del alumno es: %s \n", matricula);
        }
    }

}
