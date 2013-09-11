/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab02ej01;

/**
 *
 * @author Administrator
 */
public class CReptil extends CAnimal {

    CReptil() {}

    CReptil(String sonido)
    {
        super(sonido);
    }

    protected void imprime()
    {
        super.imprime();
        System.out.printf("reptil ");
    }

}
