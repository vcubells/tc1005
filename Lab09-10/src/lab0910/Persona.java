/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab0910;

/**
 *
 * @author Administrator
 */
public class Persona {

    private String _nombre;
    private String _apellidos;
    private int _edad;
    private char _sexo;

    public Persona(String nombre, String apellidos, int edad, char sexo)
    {
        _nombre = nombre;
        _apellidos = apellidos;
        _edad = edad;
        _sexo = sexo;
    }

    public String getNombre()
    {
        return _nombre;
    }

    public String getApellidos()
    {
        return _apellidos;
    }

    public int getEdad()
    {
        return _edad;
    }

    public char getSexo()
    {
        return _sexo;
    }

}
