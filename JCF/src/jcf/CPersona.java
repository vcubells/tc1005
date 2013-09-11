/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jcf;

/**
 *
 * @author Administrator
 */
public class CPersona {

    private String nombre = "";
    private String apellidos = "";
    private int edad = 0;
    private String sexo = "F";

    CPersona()
    {        
    }

    CPersona(String n, String a, int e, String s )
    {
       this.nombre = n;
       this.apellidos = a;
       this.edad = e;
       this.sexo = s;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

   

}
