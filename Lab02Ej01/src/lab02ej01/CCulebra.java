/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab02ej01;

/**
 *
 * @author Administrator
 */
public class CCulebra extends CReptil {

    protected boolean esVenenoso = true;

    CCulebra() {}

    CCulebra(String sonido, boolean venenoso)
    {
        super(sonido);
        esVenenoso = venenoso;
    }

    private String esVenenosa()
    {
       return (esVenenoso == true ? "venenosa" : "no venenosa");
    }

    protected void imprime()
    {
        super.imprime();

        System.out.printf("reptil es una culebra %s y %s", esVenenosa(), sonido );
    }

}
