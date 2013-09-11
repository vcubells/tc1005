/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab19grafos;

/**
 *
 * @author Administrator
 */
public class NodoVertice<T extends Comparable,P extends Comparable> extends NodoAbstracto<T> {
    private ListaSE<P> arcos = null;
    int referencias;
    private boolean visitado;

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public NodoVertice(T info)
    {
        super(info);
        arcos = new ListaSE<P>();
        referencias = 0;
        visitado = false;
    }

    public int getReferencias() {
        return referencias;
    }

    public void setReferencias(boolean b) {
        if (b) {this.referencias ++;}
        else {this.referencias --;}
    }

    public ListaSE<P> getArcos() {
        return arcos;
    }

    public void setArcos(ListaSE<P> arcos) {
        this.arcos = arcos;
    }

    public void imprime()
    {
        System.out.printf("\nVértice: %s \n", info);
        System.out.printf("# Referencias: %d \n", referencias);
        System.out.printf("Arcos: \n ");

        arcos.imprime();
    }



}
