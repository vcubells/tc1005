/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab19grafos;

/**
 *
 * @author Administrator
 */
public class Grafo<T extends Comparable, P extends Comparable> {
    ListaSE<T> vertices;

    public Grafo()
    {
        vertices = new ListaSE<T>();
    }

    public ListaSE<T> getVertices() {
        return vertices;
    }

    public void setVertices(ListaSE<T> vertices) {
        this.vertices = vertices;
    }

    boolean esVacio()
    {
        return vertices.esVacia();
    }

    public void insertarVertice(T info)
    {
       vertices.InsertarFinal(new NodoVertice(info));
    }

    public void insertarArco(T origen, T destino, P peso)
    {
        NodoVertice<T,P> o = (NodoVertice<T,P>)vertices.buscar(origen);
        NodoVertice<T,P> d = (NodoVertice<T,P>)vertices.buscar(destino);

        if (o != null && d != null)
        {
            NodoArco<T,P> nuevo_arco = new NodoArco<T,P>(peso, o, d);
            o.getArcos().InsertarFinal(nuevo_arco);
            d.setReferencias(true);
        }
    }

    public void imprimir()
    {
        vertices.imprime();
    }

    public ListaSE<T> obtenerVecinos(T info)
    {
        NodoVertice<T,P> nodo = (NodoVertice<T,P>)vertices.buscar(info);
        if (nodo == null)
        {
            return null;
        }
        else {
            ListaSE<T> vecinos = new ListaSE<T>();

            ListaSE<P> arcos = nodo.getArcos();
            NodoArco<T,P> arco_actual = (NodoArco<T,P>)arcos.getPrimero();

            while (arco_actual != null)
            {
                vecinos.InsertarFinal(new NodoVertice(arco_actual.getDestino().getInfo()));
                arco_actual = (NodoArco<T,P>)arco_actual.getSiguiente();
            }

            return vecinos;
        }
    }

    public NodoVertice<T,P> borrarVertice(T info)
    {
        NodoVertice<T,P> nodo = (NodoVertice<T,P>)vertices.buscar(info);
        if (nodo != null)
        {
            // Borrar todos los arcos del vértice
            ListaSE<P> arcos = nodo.getArcos();
            NodoArco<T,P> arco_actual = (NodoArco<T,P>)arcos.getPrimero();
            NodoArco<T,P> arco_borrar = null;

            while (arco_actual != null)
            {
                arco_borrar = arco_actual;
                arco_actual = (NodoArco<T,P>)arco_actual.getSiguiente();
                borrarArco(nodo, arco_borrar);
            }

            if (nodo.getReferencias() != 0)
            {     
                borrarIncidentes(nodo);
            }

            vertices.Borrar(nodo);
        }

        return nodo;
    }

    public NodoArco<T,P> borrarArco(NodoVertice<T,P> nodo, NodoArco<T,P> arco)
    {
       nodo.getArcos().Borrar(arco);

       NodoVertice<T,P> destino = arco.getDestino();
       destino.setReferencias(false);
       if (destino.getReferencias() == 0 && destino.getArcos().esVacia())
       {
           vertices.Borrar(destino);
       }

       return arco;

    }

    public void borrarIncidentes(NodoVertice<T,P> nodo)
    {
        NodoVertice<T,P> vertice_actual = (NodoVertice<T,P>)vertices.getPrimero();
        NodoVertice<T,P> anterior = null;
        NodoArco<T,P> arco_actual = null;
        while (vertice_actual != null)
        {
            if (vertice_actual != nodo)
            {
                ListaSE<P> arcos = vertice_actual.getArcos();
                arco_actual = (NodoArco<T,P>)arcos.getPrimero();

                while (arco_actual != null && arco_actual.getDestino()!= nodo)
                {
                    arco_actual = (NodoArco<T,P>)arco_actual.getSiguiente();
                }

                if (arco_actual != null)
                {
                    borrarArco(vertice_actual, arco_actual);
                    if (vertice_actual.getReferencias() == 0 && vertice_actual.getArcos().esVacia())
                    {
                        anterior = vertice_actual;
                    }
                }
            }

            vertice_actual = (NodoVertice<T,P>)vertice_actual.getSiguiente();
            if (anterior != null)
            {
                borrarVertice(anterior.getInfo());
                anterior = null;
            }
        }
    }



    public NodoArco<T,P> buscarArco(T origen, T destino)
    {
        NodoVertice<T,P> o = (NodoVertice<T,P>)vertices.buscar(origen);
        NodoArco<T,P> arco_actual = null;

        if (o != null)
        {
            ListaSE<P> arcos = o.getArcos();

            arco_actual = (NodoArco<T,P>)arcos.getPrimero();

            while (arco_actual != null && !arco_actual.getDestino().getInfo().equals(destino))
            {
                arco_actual = (NodoArco<T,P>)arco_actual.getSiguiente();
            }
        }

        return arco_actual;
    }

    //Obtener todos los arcos
    public ListaSEOrdenada<P> obtenerArcos()
    {
        ListaSEOrdenada<P> todos_arcos = new ListaSEOrdenada<P>();

        NodoVertice<T,P> vertice_actual = (NodoVertice<T,P>)vertices.getPrimero();
        NodoArco<T,P> arco_actual = null;
        while (vertice_actual != null)
        {
            ListaSE<P> arcos = vertice_actual.getArcos();
            arco_actual = (NodoArco<T,P>)arcos.getPrimero();

            while (arco_actual != null)
            {
                NodoArco<T,P> na = new NodoArco<T,P>( arco_actual.getInfo(),
                        new NodoVertice( arco_actual.getOrigen().getInfo()),
                        new NodoVertice( arco_actual.getDestino().getInfo()));

                todos_arcos.Insertar(na);

                arco_actual = (NodoArco<T,P>)arco_actual.getSiguiente();
            }

            vertice_actual = (NodoVertice<T,P>)vertice_actual.getSiguiente();
        }

        return todos_arcos;
    }


    //Obtener clusters
    public ListaSE<T> obtenerClusters()
    {
        ListaSE<T> clusters = new ListaSE<T>();

        NodoVertice<T,P> vertice_actual = (NodoVertice<T,P>)vertices.getPrimero();

        while (vertice_actual != null)
        {
            NodoCluster n = new NodoCluster(vertice_actual.info);
            n.insertarItem(n.info);
            clusters.InsertarFinal(n);

            vertice_actual = (NodoVertice<T,P>)vertice_actual.getSiguiente();
        }

        return clusters;
    }

   private boolean clustersIguales(NodoArco na, ListaSE<T> clusters)
   {
       NodoCluster c1 = (NodoCluster)clusters.buscar(na.origen.info);
       NodoCluster c2 = (NodoCluster)clusters.buscar(na.destino.info);

       return c1.getElementos().compareTo(c2.getElementos()) == 0;
   }

   private void actualizaClusters(NodoArco na, ListaSE<T> clusters)
   {
       NodoCluster c1 = (NodoCluster)clusters.buscar(na.origen.info);
       NodoCluster c2 = (NodoCluster)clusters.buscar(na.destino.info);

       ListaSEOrdenada<T> elementos_c1 =  c1.getElementos();
       ListaSEOrdenada<T> elementos_c2 =  c2.getElementos();

       ListaSEOrdenada<T> elementos_juntos = new ListaSEOrdenada<T>();

       //Copiar elementos del cluster origen
       NodoAbstracto nodo = elementos_c1.getPrimero();
       while (nodo != null)
       {
           elementos_juntos.Insertar(new NodoVertice(nodo.getInfo()));
           nodo = nodo.getSiguiente();
       }

       //Copiar elementos del cluster destino
       nodo = elementos_c2.getPrimero();
       while (nodo != null)
       {
           elementos_juntos.Insertar(new NodoVertice(nodo.getInfo()));
           nodo = nodo.getSiguiente();
       }

       //Actualizar los clusters fusionados
       //Copiar elementos del cluster origen
       nodo = elementos_c1.getPrimero();
       while (nodo != null)
       {
           NodoCluster c = (NodoCluster)clusters.buscar(nodo.info);
           c.setElementos(elementos_juntos);
           nodo = nodo.getSiguiente();
       }

       //Copiar elementos del cluster destino
       nodo = elementos_c2.getPrimero();
       while (nodo != null)
       {
           NodoCluster c = (NodoCluster)clusters.buscar(nodo.info);
           c.setElementos(elementos_juntos);
           nodo = nodo.getSiguiente();
       }

       //Borrar listas temporales
       elementos_c1.borrarTodo();
       elementos_c2.borrarTodo();
   }

   //Algortimo de Kruskal
    public ListaSE<P> Kruskal()
    {
        //Inicializar lista Q de arcos ordenados por su peso
        ListaSEOrdenada<P> listaQ = obtenerArcos();

        //Inicializar lista T de arcos finales
        ListaSE<P> listaT = new ListaSE<P>();

        //Iniciar clusters
        ListaSE<T> clusters = obtenerClusters();

        //Algoritmo
        while (!listaQ.esVacia())
        {
            NodoArco na = (NodoArco) listaQ.borrarInicio();
            if (!clustersIguales(na, clusters))
            {
               listaT.InsertarFinal(na);
               actualizaClusters(na, clusters);
            }
        }

        return listaT;
    }
    
    public void DFS()
    {
        DFS((NodoVertice)vertices.getPrimero());
    }
    
    public void DFS(NodoVertice nodo)
    {
        if (!nodo.isVisitado())
        {
           nodo.setVisitado(true);
           System.out.printf("Nodo actual: %s \n", nodo.getInfo());
           NodoArco arco = (NodoArco)nodo.getArcos().getPrimero();
           while (arco != null)
           {
               DFS(arco.getDestino());
               arco = (NodoArco)arco.getSiguiente();
           }
        }
        else
        {
           System.out.printf("El nodo %s ya había sido visitado y se regresa\n", nodo.getInfo());
        }
    }

    public boolean esCiclico()
    {
        return Ciclico((NodoVertice)vertices.getPrimero());
    }

    public boolean Ciclico(NodoVertice nodo)
    {
        boolean ciclo = false;
        if (!nodo.isVisitado() && !ciclo)
        {
           nodo.setVisitado(true);
           NodoArco arco = (NodoArco)nodo.getArcos().getPrimero();
           while (arco != null && !ciclo)
           {
               ciclo = Ciclico(arco.getDestino());
               arco = (NodoArco)arco.getSiguiente();
           }
           
           return ciclo;
        }
        else
        {
           return true;
        }
    }

  public void getRelaciones (T info){
    NodoVertice <T,P> a= (NodoVertice<T, P>) vertices.buscar(info);
    ListaSE <P> arcos= (ListaSE<P>) a.getArcos();
    NodoArco arco=(NodoArco) arcos.primero;

    System.out.println("Relaciones de: "  + info );

    while (arco!=null){
        System.out.printf("%s - %.2f\n", arco.destino.info, arco.info);
        arco=(NodoArco) arco.siguiente;
    }

  }

  public NodoVertice<T,P> masRelaciones (){
    NodoVertice mayor= (NodoVertice) vertices.primero;
    int cont=mayor.getArcos().tamaño();
    NodoVertice q=(NodoVertice) mayor.siguiente;

    while (q!=null){
        int a= q.getArcos().tamaño();
        if (cont<a){
            cont=a;
            mayor=q;
        }
        q=  (NodoVertice) q.siguiente;
    }
    return mayor;
  }

  public ListaSE <T> noRelaciones (){
    NodoVertice q=(NodoVertice) vertices.primero;
    ListaSE<T> lista=new ListaSE<T> ();

    while (q!=null){
        if (q.getArcos().tamaño()==0){
            lista.InsertarFinal(q);
        }
        q =  (NodoVertice) q.siguiente;
    }
    return lista;
  }

    

}
