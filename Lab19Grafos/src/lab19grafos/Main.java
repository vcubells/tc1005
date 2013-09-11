/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab19grafos;
import java.util.Hashtable;
import java.util.Enumeration;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Grafo<Character,Float> grafo = new Grafo<Character,Float>();

        grafo.insertarVertice('A');
        grafo.insertarVertice('B');
        grafo.insertarVertice('C');
        grafo.insertarVertice('D');

        grafo.insertarArco('A', 'B', 5f);
        grafo.insertarArco('B', 'A', 5f);
//        grafo.insertarArco('D', 'A', 3f);
//        grafo.insertarArco('A', 'D', 3f);
        grafo.insertarArco('B', 'C', 8f);
        grafo.insertarArco('C', 'B', 8f);
//        grafo.insertarArco('C', 'D', 4f);
//        grafo.insertarArco('D', 'C', 4f);
        grafo.insertarArco('A', 'C', 6f);
        grafo.insertarArco('C', 'A', 6f);

        
        grafo.getRelaciones('A');
        System.out.println(grafo.masRelaciones().info);

        ListaSE<Character> lista= grafo.noRelaciones();

        lista.imprime();

//         //grafo.insertarArco('A', 'C', 5f);
//
//        //grafo.imprimir();
//
//        //grafo.borrarVertice('A');
//
//        //System.out.printf("El grafo es cíclico = %s", grafo.esCiclico());
//
////        NodoVertice<Character,Integer> nodo = (NodoVertice<Character,Integer>)grafo.vertices.buscar('B');
////        NodoArco<Character,Integer> arco = (NodoArco<Character,Integer>)grafo.buscarArco('B', 'C');
////        grafo.borrarArco(nodo, arco);
////        grafo.imprimir();
//
////        ListaSE<Integer> kruskal = grafo.Kruskal();
////        kruskal.imprime();
//
//        Character inicio = 'A';
//        Hashtable dijkstra = DijkstraInverso(grafo, inicio);
//        Enumeration keys = dijkstra.keys();
//        while (keys.hasMoreElements())
//        {
//            Object o = keys.nextElement();
//            System.out.printf(" distancia mayor para llegar a %c desde %c es %.2f \n",
//                    o,
//                    inicio,
//                    dijkstra.get(o));
//        }
//
//
//    }
//
//    //Algoritmo de Dijkstra
//    public static Hashtable Dijkstra(Grafo g, Character inicio)
//    {
//       int num_vertices = g.vertices.tamaño();
//
//       //Inicializar distancias y pedrecesores
//       Hashtable distancias = new Hashtable();
//       Hashtable predecesores = new Hashtable();
//       Hashtable listaQ = new Hashtable();
//
//       for (int i = 0; i < num_vertices; i++ )
//       {
//           distancias.put((Character)g.vertices.getNodo(i).getInfo(), Float.MAX_VALUE );
//
//           predecesores.put(g.vertices.getNodo(i).getInfo(), ' ');
//
//           listaQ.put(g.vertices.getNodo(i).getInfo(), 0f);
//       }
//       distancias.put(inicio, 0f);
//
//       //Algoritmo
//       while (!listaQ.isEmpty())
//       {
//
//           Character u = obtenerMenor(listaQ, distancias);
//
//           Float acumulado = (Float)distancias.get(u);
//
//           NodoVertice vertice = (NodoVertice) g.vertices.buscar(u);
//
//           ListaSE arcos = vertice.getArcos();
//           NodoArco arco_actual = (NodoArco)arcos.getPrimero();
//
//            while (arco_actual != null)
//            {
//                Comparable peso = arco_actual.getInfo();
//                Comparable destino = arco_actual.getDestino().getInfo();
//
//                Float comp = acumulado + (Float)peso;
//
//                if (comp < (Float)distancias.get(destino))
//                {
//                    distancias.put(destino, comp); //Actualizo la distancia
//                    predecesores.put(destino, u);  // Actualizo el predecesor
//                }
//                arco_actual = (NodoArco)arco_actual.getSiguiente();
//            }
//
//            listaQ.remove(u);
//       }
//
//       return distancias;
//    }
//
//
//   public static Character obtenerMenor(Hashtable Q, Hashtable D)
//   {
//       Float menor = Float.MAX_VALUE;
//       Character vertice = null;
//
//       Enumeration nodos = D.keys();
//       while (nodos.hasMoreElements())
//       {
//           Character o = (Character)nodos.nextElement();
//           Float f = (Float)D.get(o);
//           if (Q.containsKey(o) && f < menor)
//           {
//               menor = f;
//               vertice = o;
//           }
//       }
//
//       return vertice;
//   }
//
//   //Algoritmo de Dijkstra
//    public static Hashtable DijkstraInverso(Grafo g, Character inicio)
//    {
//       int num_vertices = g.vertices.tamaño();
//
//       //Inicializar distancias y pedrecesores
//       Hashtable distancias = new Hashtable();
//       Hashtable predecesores = new Hashtable();
//       Hashtable listaQ = new Hashtable();
//
//       for (int i = 0; i < num_vertices; i++ )
//       {
//           distancias.put((Character)g.vertices.getNodo(i).getInfo(), 0f );
//
//           predecesores.put(g.vertices.getNodo(i).getInfo(), ' ');
//
//           listaQ.put(g.vertices.getNodo(i).getInfo(), 0f);
//       }
//       distancias.put(inicio, 0f);
//
//       //Algoritmo
//       while (!listaQ.isEmpty())
//       {
//
//           Character u = obtenerMayor(listaQ, distancias);
//
//           Float acumulado = (Float)distancias.get(u);
//
//           NodoVertice vertice = (NodoVertice) g.vertices.buscar(u);
//
//           ListaSE arcos = vertice.getArcos();
//           NodoArco arco_actual = (NodoArco)arcos.getPrimero();
//
//            while (arco_actual != null)
//            {
//                Comparable peso = arco_actual.getInfo();
//                Comparable destino = arco_actual.getDestino().getInfo();
//
//                Float comp = acumulado + (Float)peso;
//
//                if (comp > (Float)distancias.get(destino))
//                {
//                    distancias.put(destino, comp); //Actualizo la distancia
//                    predecesores.put(destino, u);  // Actualizo el predecesor
//                }
//                arco_actual = (NodoArco)arco_actual.getSiguiente();
//            }
//
//            listaQ.remove(u);
//       }
//
//       return distancias;
//    }
//
//   public static Character obtenerMayor(Hashtable Q, Hashtable D)
//   {
//       Float mayor = -1f;
//       Character vertice = null;
//
//       Enumeration nodos = D.keys();
//       while (nodos.hasMoreElements())
//       {
//           Character o = (Character)nodos.nextElement();
//           Float f = (Float)D.get(o);
//           if (Q.containsKey(o) && f >= mayor)
//           {
//               mayor = f;
//               vertice = o;
//           }
//       }
//
//       return vertice;
//   }
//
    }
}
