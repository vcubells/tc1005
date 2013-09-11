/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab02ej01;

/**
 *
 * @author Administrator
 */
public class CProfesor extends CPersona{

    private String nomina = "";

    public void setNomina(String nomina)
    {
        if (nomina.equals(""))
        {
            System.out.printf("Nómina no válida \n");
        }
        else {
            this.nomina = nomina;
        }
    }

    public String getNomina()
    {
        return nomina;
    }

    public void imprime()
    {
        System.out.printf("\nDatos del profesor \n");
        System.out.printf("============================== \n\n");

        System.out.printf("La edad del profesor es: %d años \n", getEdad());
        if (!nomina.equals(""))
        {
            System.out.printf("La nómina del profesor es: %s \n", nomina);
        }
    }

}
