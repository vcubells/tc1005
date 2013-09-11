/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab03ej01;

/**
 *
 * @author Administrator
 */
public class Estudiante {

    private String nombre;
    private String apellidos;
    private int edad;
    private String matricula;

    private Materia materias[] = new Materia[10];
    private int materias_inscritas = 0;

    Estudiante() {}

    Estudiante(String nombre, String apellidos, int edad, String matricula)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.matricula = matricula;
    }

    public void setNombre(String nombre) throws ValidaException
    {
        if (nombre.equals(""))
        {
            throw new ValidaException("El nombre no puede ser vacío");
        }

        this.nombre = nombre;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setApellidos(String apellidos) throws ValidaException
    {
        if (apellidos.equals(""))
        {
            throw new ValidaException("Los apellidos no pueden ser vacíos");
        }

        this.apellidos = apellidos;
    }

    public String getApellidos()
    {
        return this.apellidos;
    }

    public void setMatricula(String matricula) throws ValidaException
    {
        if (matricula.equals(""))
        {
            throw new ValidaException("La matrícula no puede ser vacía");
        }

        this.matricula = matricula;
    }

    public String getMatricula()
    {
        return this.matricula;
    }

    public void setEdad(int edad) throws ValidaException
    {
        if (edad < 17 || edad > 30) 
        {
            throw new ValidaException("Edad no se encuentra entre 17-30 años");
        }

        this.edad = edad;
    }

    public int getEdad()
    {
        return this.edad;
    }

    public void addMateria(Materia m) throws ValidaException
    {
        if (this.materias_inscritas < 10)
        {
            this.materias[this.materias_inscritas] = m;
            this.materias_inscritas++;
        }
    }
    
    public void updateMateria(Materia m, int index) throws ValidaException
    {
        if(index > this.materias_inscritas)
        {
            throw new ValidaException("Indice no válido");
        }
        this.materias[index] = m;
    }

    public double calcularPromedio()
    {
        int suma = 0;
        for(int i=0; i < this.materias_inscritas; i++ )
        {
           suma += materias[i].getCalificacion();
        }

        return (suma/this.materias_inscritas);
    }

    public void imprimir()
    {
        System.out.printf("Estudiante: %s %s \n", nombre, apellidos);
        System.out.printf("Edad: %d \n", edad);
        System.out.printf("Matrícula: %s \n\n", matricula);

        System.out.println("Materias que cursa:");
        System.out.println("========================");

        for(int i=0; i < this.materias_inscritas; i++ )
        {
           materias[i].imprimir();
        }

        System.out.printf("El promedio es : %.2f \n\n", calcularPromedio());
    }



}
