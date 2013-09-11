/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hashtable;

/**
 *
 * @author Administrator
 */
public class HashMapL<K extends Comparable<K>, V extends Comparable<V>> {

    public int CAPACITY = 20;
    public ListaSE<K,V>[] hash;

    public HashMapL()
    {
        hash = new ListaSE[CAPACITY];
        for (int i=0; i < CAPACITY; i++)
        {
            hash[i] = new ListaSE<K,V>();
        }
    }

    public int tamaño()
    {
       int count = 0;
       for(int i=0; i < CAPACITY; i++)
       {
            count += hash[i].tamaño();
       }

       return count;
    }

    public boolean esVacio()
    {
        if (tamaño()==0) return true;
        else return false;
    }

    public void put(K key, V value)
    {
        int hashcode = Math.abs(key.hashCode());
        hashcode %= CAPACITY;

        hash[hashcode].InsertarFinal(new Nodo(key, value));
    }

    public boolean containsKey(K key)
    {
        boolean found = false;

        int i = 0;
        while (i < CAPACITY && !found)
        {
            found = hash[i].buscarKey(key) != -1;
            i++;
        }
        return found;
    }

    public Nodo<K,V> delete(K key)
    {
        if (!containsKey(key) || key == null) { return null; }

        int hashcode = Math.abs(key.hashCode());
        hashcode %= CAPACITY;

        return hash[hashcode].Borrar(hash[hashcode].buscarKey(key));
    }

    public Nodo<K,V> get(K key)
    {
        if (!containsKey(key) || key == null) { return null; }

        int hashcode = Math.abs(key.hashCode());
        hashcode %= CAPACITY;

        return hash[hashcode].getNodo(hash[hashcode].buscarKey(key));
    }


}
