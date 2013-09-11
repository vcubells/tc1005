/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab02ej01;

/**
 *
 * @author Administrator
 */
public abstract class CPersona implements ISexo {

    private int edad = 20;
    protected String sexo = "";

    CPersona()
    {
        
    }

    CPersona(String s)
    {
        sexo = s;
    }

    public int getEdad()
    {
       return edad;
    }

    public void setEdad(int e)
    {
        edad = e;
    }

    public void imprime(){}

    public String getSexo()
    {
        return (!sexo.equals("") ? sexo : "Sexo no definido");
    }

}
