/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab02ej01;

/**
 *
 * @author Administrator
 */
public abstract class CAnimal {
    protected String sonido = "no hace ruido";
    protected String sexo = "No definido";

    CAnimal(){}

    CAnimal(String sonido)
    {
        this.sonido = sonido;
    }

    protected void imprime()
    {
        System.out.printf("El animal ");
    }
}
