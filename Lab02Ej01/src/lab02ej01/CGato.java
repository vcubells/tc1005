/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab02ej01;

/**
 *
 * @author Administrator
 */
public class CGato extends CMamifero {

    CGato() {}

    CGato(String sonido, int patas, String sexo)
    {
        super(sonido, patas);
        this.sexo = sexo;
    }

    public void imprime()
    {
        super.imprime();
        System.out.printf("es un gato y hace %s \n ", sonido);
    }

}
