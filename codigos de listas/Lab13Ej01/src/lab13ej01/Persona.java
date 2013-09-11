/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab13ej01;

/**
 *
 * @author Administrator
 */
public class Persona {

    private String Nombre;
    private String Apellidos;
    private int Edad;
    private char Sexo;

    public Persona(String nombre, String apellidos, int edad, char sexo)
    {
        Nombre = nombre;
        Apellidos= apellidos;
        Edad = edad;
        Sexo = sexo;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public String toString()
    {
        return Nombre + " " + Apellidos + "( " + Edad + " años, " + Sexo + " )";
    }

}
