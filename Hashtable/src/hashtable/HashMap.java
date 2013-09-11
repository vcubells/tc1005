/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hashtable;

/**
 *
 * @author Administrator
 */
public class HashMap {

    public int CAPACITY = 20;
    public Object[] keys = new Object[CAPACITY];
    public Object[] values = new Object[CAPACITY];
    public String[] status = new String[CAPACITY];

    // Inicializar el HashMap vacío

    public HashMap()
    {
        for (int i=0; i < CAPACITY; i++)
        {
            status[i] = "vacio";
            keys[i] = null;
            values[i] = null;
        }
    }

    public int tamaño()
    {
        int count = 0;

        for (int i=0; i < CAPACITY; i++)
        {
        if (status[i].compareTo("ocupado") == 0)
                count++;
        }

        return count;
    }

    public boolean esVacio()
    {
        if (tamaño()==0) return true;
        else return false;
    }

    public void put(Object key, Object value)
    {
        int hashcode = Math.abs(key.hashCode());
        hashcode %= CAPACITY;

        if (status[hashcode].compareTo("ocupado") == 0)
        {
            if (!keys[hashcode].equals(key))
            {
                hashcode = rehash(hashcode, 0); //Recalcular
            }
        }

        keys[hashcode] = key;
        values[hashcode] = value;
        status[hashcode] = "ocupado";
    }

    public boolean containsKey(Object key)
    {
        boolean found = false;

        for (int i=0; i < CAPACITY; i++)
        {
            if (keys[i] != null)
                if (keys[i].equals(key))
                    found = true;
        }
        return found;
    }

    private int rehash(int hashcode, int intentos)
    {
        if (hashcode < CAPACITY && intentos < CAPACITY)
        {
            hashcode++;
            if (hashcode == CAPACITY) hashcode = 0;

            if (status[hashcode].compareTo("ocupado") == 0)
            {
                hashcode = rehash(hashcode, ++intentos);
            }

            return hashcode;
        }
        else
            return -1;
    }

    public void imprimir()
    {
        for(int i = 0; i < CAPACITY; i++)
        {
            if (status[i].compareTo("ocupado") == 0)
            {
                System.out.printf("[%d] %s -> %s \n", i, keys[i], values[i]);
            }
        }
    }

    private int previous(int index)
    {
        return (index == 0) ? CAPACITY - 1 : --index;
    }

    public Object delete(Object key)
    {
        if (!containsKey(key) || key == null) { return null; }

        int hashcode = Math.abs(key.hashCode());
        hashcode %= CAPACITY;

        int anterior = previous(hashcode);

        while (hashcode != anterior && !keys[hashcode].equals(key))
        {
            hashcode =  (hashcode == CAPACITY - 1) ? 0 : ++hashcode;
        }

        if (keys[hashcode].equals(key))
        {
            status[hashcode] = "borrado";
            Object tmp = values[hashcode];
            keys[hashcode] = values[hashcode] = null;
            return tmp;

        }

        return null;
    }

    public Object get(Object key)
    {
        if (!containsKey(key) || key == null) { return null; }

        int hashcode = Math.abs(key.hashCode());
        hashcode %= CAPACITY;

        int anterior = previous(hashcode);

        while (hashcode != anterior && !keys[hashcode].equals(key))
        {
            hashcode =  (hashcode == CAPACITY - 1) ? 0 : ++hashcode;
        }

        if (keys[hashcode].equals(key))
        {
            return values[hashcode];
        }

        return null;
    }

    public Object[] getKeys()
    {
        Object k[] = new Object[tamaño()];
        int index = 0;
        for (int i = 0; i < CAPACITY; i++)
        {
            if (status[i].compareTo("ocupado") == 0)
            {
                k[index++] = keys[i];
            }
        }

        return k;
    }

    public Object[] getValues()
    {
        Object v[] = new Object[tamaño()];
        int index = 0;
        for (int i = 0; i < CAPACITY; i++)
        {
            if (status[i].compareTo("ocupado") == 0)
            {
                v[index++] = values[i];
            }
        }

        return v;
    }


}
