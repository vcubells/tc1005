/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab17;

import java.util.LinkedList;

/**
 *
 * @author Administrator
 */
public class ArbolBinario <T> {

    NodoAbstracto raiz;

    private String leyenda = "";
    private LinkedList<String> palabras = new LinkedList<String>();

    public ArbolBinario()
    {
        raiz = null;
    }

    //Recorrido en pre-orden
    public void preOrden()
    {
        if (raiz != null)
            preOrden(raiz);
    }

    public void preOrden(NodoAbstracto nodo)
    {
        if (nodo != null)
        {
            System.out.println(nodo.getInfo());

            preOrden(nodo.getIzquierdo());

            preOrden(nodo.getDerecho());
        }
    }

    //Recorrido en en-orden
    public void enOrden()
    {
        if (raiz != null)
            enOrden(raiz);
    }

    public void enOrden(NodoAbstracto nodo)
    {
        if (nodo != null)
        {
            enOrden(nodo.getIzquierdo());

            System.out.println(nodo.getInfo());

            enOrden(nodo.getDerecho());
        }
    }

     //Recorrido en post-orden
    public void postOrden()
    {
        if (raiz != null)
            postOrden(raiz);
    }

    public void postOrden(NodoAbstracto nodo)
    {
        if (nodo != null)
        {
            postOrden(nodo.getIzquierdo());

            postOrden(nodo.getDerecho());

            System.out.println(nodo.getInfo());
        }
    }

    //Buscar un nodo
    public NodoAbstracto buscar(T info)
    {
        return buscar(info, raiz);
    }


    public NodoAbstracto buscar(T info, NodoAbstracto nodo)
    {
        if (nodo == null) { return null;}
        if (nodo.getInfo() == info) { return nodo; }

        NodoAbstracto encontrado = null;

        encontrado = buscar(info, nodo.getIzquierdo());
        if (encontrado != null)
        {
            return encontrado;
        }

        return buscar(info, nodo.getDerecho());
    }

    public boolean esVacio()
    {
        return (raiz == null);
    }

    public boolean insertar(T info, T padre, boolean pos)
    {
        boolean seInserto = false;
        NodoAbstracto nodo;

        if (!esVacio())
        {
            NodoAbstracto nPadre = buscar(padre);

            if (nPadre == null) { return seInserto;}

            if (nPadre.getIzquierdo() == null && pos)
            {
                nodo = new Nodo((Comparable) info);
                nodo.setPadre(nPadre);
                nPadre.setIzquierdo(nodo);
                seInserto = true;

            }
            else if (nPadre.getDerecho() == null && !pos)
            {
                nodo = new Nodo((Comparable) info);
                nodo.setPadre(nPadre);
                nPadre.setDerecho(nodo);
                seInserto = true;

            }
        }
        else {
            raiz = new Nodo((Comparable) info);
            seInserto = true;
        }

        return seInserto;
    }


    public NodoAbstracto borrarHoja(T info)
    {
        NodoAbstracto nodoABorrar, padre;

        nodoABorrar = buscar(info);

        if (nodoABorrar != null)
        {
            if (nodoABorrar.getIzquierdo() == null && nodoABorrar.getDerecho() == null)
            {
                padre = nodoABorrar.getPadre();

                if (padre == null) //Caso extremo de un solo nodo
                {
                    raiz = null;
                }
                else if (padre.getIzquierdo() == nodoABorrar)
                {
                    padre.setIzquierdo(null);
                }
                else {
                    padre.setDerecho(null);
                }
            }
        }

        return nodoABorrar;
    }

    public void generaArbol(T[] array)
    {   
        int izq, der;
        int i = 0;
        boolean seguir = array.length > 0;

        while (seguir)
        {
            izq = 2*i + 1;
            der = 2*i + 2;

            if (izq < array.length)
            {
                insertar(array[izq], array[i], true);
                seguir = true;
            }
            else if (der < array.length)
            {
                insertar(array[2*i + 2], array[i], false);
                seguir = true;
            }
            else {
                seguir = false;
            }
        }
    }

    public int altura(NodoAbstracto nodo)
    {
        if(nodo == null)
        {
            return 0;
        }
        else
        {
            return 1 + (Math.max(altura(nodo.getIzquierdo()),altura(nodo.getDerecho())));
        }
    }

    public int sumaElementos(ArbolBinario<T> ab){
        return sumaElementos(ab.raiz);
    }

    public int sumaElementos(NodoAbstracto nodo){
        if(nodo == null){
            return 0;
        }
        else{
            return (Integer)nodo.getInfo() + sumaElementos(nodo.getIzquierdo()) + sumaElementos(nodo.getDerecho());
        }
    }

    public boolean equals(){
        NodoAbstracto a = raiz.getIzquierdo();
        NodoAbstracto b = raiz.getDerecho();
        return equals(a,b);
    }
    private boolean equals(NodoAbstracto a, NodoAbstracto b){
        boolean q= false;
            if(a == null && b == null){
                q = true;
                return q;
            }
            else if(a != null && b != null){
                return q = equals(a.getIzquierdo(),b.getDerecho()) && equals(a.getDerecho(),b.getIzquierdo());
                }
        return q;
        }

    public String palabra() {
        return palabraX(this.raiz, "");
    }

    private String palabraX(NodoAbstracto nodo, String palabra) {
        if (nodo==null) {
            return palabra;
        }
        if (nodo.getIzquierdo()==null && nodo.getDerecho()==null) {
            return palabra+=nodo.getInfo()+"\n";
        }
        else {
            return palabra += nodo.getInfo()+palabraX(nodo.getIzquierdo(), palabra)+nodo.getInfo()+palabra+palabraX(nodo.getDerecho(), palabra);

        }
    }

    public LinkedList<String> palabrasT (){
    return palabrasT(raiz);
}

public LinkedList<String> palabrasT (NodoAbstracto node){
    if (node==null){
        palabras.add(leyenda);
        //leyenda="";
    }
    else{
        leyenda+=node.info;
        palabrasT(node.izquierdo);
        palabrasT(node.derecho);
    }
    return this.palabras;
}


public void frontera()
    {
        if (raiz != null)
            frontera(raiz);
    }

    public void frontera(NodoAbstracto nodo)
    {
        if (nodo != null)
        {
            if (nodo.getIzquierdo() == null && nodo.getDerecho()==null)
            {
                System.out.println(nodo.getInfo());
            }

            frontera(nodo.getIzquierdo());

            frontera(nodo.getDerecho());
        }
    }

    public void cadena()
    {
        if (raiz != null)
            cadena(raiz, "");
    }

    public void cadena(NodoAbstracto nodo, String cad)
    {
        if (nodo != null)
        {
            cad += nodo.getInfo().toString();
            if (nodo.getIzquierdo() == null && nodo.getDerecho()==null)
            {
                System.out.println(cad);
            }

            cadena(nodo.getIzquierdo(), cad);

            cadena(nodo.getDerecho(), cad);
        }
    }






}


