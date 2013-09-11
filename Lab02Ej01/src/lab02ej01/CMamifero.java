/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab02ej01;

/**
 *
 * @author Administrator
 */
public class CMamifero extends CAnimal implements ISexo{

    protected int No_patas;

    CMamifero() {}

    CMamifero(String sonido, int patas)
    {
        super(sonido);
        No_patas = patas;
    }

    public void imprime()
    {
        super.imprime();
        System.out.printf("mamífero ");
    }

    public String getSexo()
    {
        return sexo;
    }
}
