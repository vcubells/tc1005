/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package recursividad;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static int contador = 0;

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println(robot(0,0,3,3));
        System.out.println(robot2(7,5));
        System.out.println(robot3(5,5,0,0));
    }

    //Gustavo
    public static int robot(int x, int y, int maxX, int maxY){
		if(x > maxX || y > maxY){
			return 0;
		}
		else{
			return 1 + robot(x+3,y,maxX,maxY) + robot(x,y+2,maxX,maxY);
		}
	}

    //Christian, Héctor, etc
    public static int robot2(int c, int r){
		if(c<=3) { return 1;}

                if (r <= 2) { return 1;}
		else{
                    return robot2(c-3,r) + robot2(c,r-2);
		}
	}

    //Manuel
    public static int robot3(int n, int m, int posX, int posY){
		if(posX+3<n)
                {
                    robot3(n,m,posX+3,posY);
                    contador++;
                }
                else if(posY+2<m)
                {
                    robot3(n,m,posX,posY+2);
                    contador++;
                }
                else { return contador; }
                return contador;

	}

    



}
