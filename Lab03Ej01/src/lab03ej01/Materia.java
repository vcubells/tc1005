/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab03ej01;

/**
 *
 * @author Administrator
 */
public class Materia {

    private String nombre;
    private String codigo;
    private int calificacion;

    Materia(){}

    Materia(String nombre, String codigo, int calificacion)
    {
        this.nombre = nombre;
        this.codigo = codigo;
        this.calificacion = calificacion;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public String getCodigo()
    {
        return this.codigo;
    }

    public void setCalificacion(int calificacion) throws ValidaException
    {
        if (calificacion < 0 || calificacion > 100) 
        {
            throw new ValidaException("Calificación no se encuentra entre 0-100 puntos");
        }
        this.calificacion = calificacion;
    }

    public int getCalificacion()
    {
        return this.calificacion;
    }

    public void imprimir()
    {
        System.out.printf(" Materia %s (%s) : %d \n", this.nombre, this.codigo, this.calificacion);
    }

}
