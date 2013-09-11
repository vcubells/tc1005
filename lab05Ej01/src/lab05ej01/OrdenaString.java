/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab05ej01;

/**
 *
 * @author Administrator
 */
public class OrdenaString extends Ordenamiento {

    public void Seleccion(Object a[], boolean asc)
    {
        int min;
        String aux;
        for(int i = 0; i < a.length; i++)
        {
            min = i;
            for(int j = i + 1; j < a.length; j++)
            {
                if(((String)a[min]).compareTo((String)a[j]) > 0)
                {
                    min = j;
                }
            }
            aux = (String)a[i];
            a[i] = a[min];
            a[min] = aux;
        }
    }

    public void Insercion(Object a[])
    {
        int j;
        String aux;
        for(int i=1; i < a.length; i++)
        {
            aux = (String)a[i];
            j = i-1;
            while(j >= 0 && ((String)a[j]).compareTo(aux) > 0)
            {
                a[j + 1] = a[j];
                j--;
            }
                a[j+1] = aux;
        }
    }

    public void ShellSort(Object a[])
    {
        String temp;
        for( int increment= a.length/ 2;
            increment> 0;
            increment= (increment== 2 ? 1 : (int) Math.round(increment/ 2.2)))
        {
        for(int i = increment; i < a.length; i++)
            {
                for(int j = i; j >= increment && ((String)a[j -increment]).compareTo((String)a[j]) > 0; j -= increment)
                {
                    temp = (String)a[j];
                    a[j] = a[j -increment];
                    a[j -increment] = temp;
                }
            }
        }
    }

}
