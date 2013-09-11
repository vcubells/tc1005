/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab02ej01;

/**
 *
 * @author Administrator
 */
public class CPerro extends CMamifero {

    CPerro() {}

    CPerro(String sonido, int patas, String sexo)
    {
        super(sonido, patas);
        this.sexo = sexo;
    }

    public void imprime()
    {
        super.imprime();
        System.out.printf("es un perro y hace %s \n ", sonido);
    }

}
