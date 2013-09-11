/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab0607;

/**
 *
 * @author Administrator
 */
public class Persona implements Comparable{
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String n, String a, int e)
    {
        nombre = n;
        apellidos = a;
        edad = e;
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

    public int compareTo(Object o)
    {
        return (this.edad < ((Persona)o).edad ?  -1 : this.edad > ((Persona)o).edad ?  1 : 0);
    }
}
