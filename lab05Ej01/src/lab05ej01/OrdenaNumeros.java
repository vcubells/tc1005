/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab05ej01;

/**
 *
 * @author Administrator
 */
public class OrdenaNumeros extends Ordenamiento {

    public void Seleccion(Object a[], boolean asc)
    {
        Integer min, aux;
        for(int i = 0; i < a.length; i++)
        {
            min = i;
            for(int j = i + 1; j < a.length; j++)
            {
                if (asc)
                {
                    if((Integer)a[min] > (Integer)a[j])
                    {
                        min = j;
                    }
                }
                else {
                    if((Integer)a[min] < (Integer)a[j])
                    {
                        min = j;
                    }
                }
            } 
            aux = (Integer)a[i];
            a[i] = a[min];
            a[min] = aux;
        }
    }

    public void Insercion(Object a[])
    {
        Integer aux, j;
        for(int i=1; i < a.length; i++)
        {
            aux = (Integer)a[i];
            j = i-1;
            while(j >= 0 && (Integer)a[j] > aux)
            {
                a[j + 1] = a[j];
                j--;
            }
                a[j+1] = aux;
        }     
    }

    public void ShellSort(Object a[])
    {
        Integer temp;
        for( int increment= a.length/ 2;
            increment> 0;
            increment= (increment== 2 ? 1 : (int) Math.round(increment/ 2.2)))
        {
        for(int i = increment; i < a.length; i++)
            {
                for(int j = i; j >= increment && (Integer)a[j -increment] > (Integer)a[j]; j -= increment)
                {
                    temp = (Integer)a[j];
                    a[j] = a[j -increment];
                    a[j -increment] = temp;
                }
            }
        }
    }

}