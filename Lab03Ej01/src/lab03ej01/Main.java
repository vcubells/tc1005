/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab03ej01;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int ne = 2;
        Estudiante estudiantes[] = new Estudiante[ne];


        Estudiante e1 = new Estudiante("Estudiante", "1", 20, "A0101010");
        try {
        e1.addMateria(new Materia("Progra 1", "TC1001", 80));
        e1.addMateria(new Materia("PED", "TC1005", 90));
        e1.addMateria(new Materia("Algoritmos", "TC2001", 85));
        }
        catch (Exception ex)
        {
            System.out.println("Ya no puede inscribir más materias");
        }

        estudiantes[0] = e1;

        //Datos del estudiante 2
        Estudiante e2 = new Estudiante("Estudiante", "2", 21, "A00987689");
        try {
            e2.addMateria(new Materia("Etica", "TC2009", 100));
        }
        catch (Exception ex)
        {
            System.out.println("Ya no puede inscribir más materias");
        }

        estudiantes[1] = e2;

        try {
            estudiantes[1].setEdad(20);
            estudiantes[1].setNombre("");
        }
        catch(ValidaException ex)
        {
            System.out.println(ex.getMessage());
        }

        //Inciso a) Imprimir promedio general del grupo

        double suma = 0;
        for(int i=0; i < ne; i++)
        {
            suma += estudiantes[i].calcularPromedio();
        }

        double promediog = suma / ne;
        System.out.printf("EL promedio general del grupo es: %.2f", promediog);

        //Inciso b) Imprimir información de los estudiantes y materias
        for(int i=0; i < ne; i++)
        {
            estudiantes[i].imprimir();
        }

        


    }

}
