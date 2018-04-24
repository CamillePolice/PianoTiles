package matrice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Vector;

public class GenerationMatrice {
	
	int hauteurMatrice;
	int largeurMatrice;
	int[][] mat;
	
	public GenerationMatrice(int hauteurMatrice, int largeurMatrice) {
		
		this.hauteurMatrice = hauteurMatrice;
		this.largeurMatrice = largeurMatrice;
		
		 
        ArrayList<Vector<Integer>> MA = new ArrayList();
 
        for (int i =1; i<4; i++){
            Vector ligne = new Vector();
            for (int j =1; j <4; j++){
                if (i==j || j>i){
                    ligne.add(0);
                }
                else{
                    ligne.add(1);
                }
              MA.add(ligne);
              }
        }
        for(int i=0;i<MA.size();i++) {
        	System.out.println(MA.get(i));
        }
		
	}
	
	public static int getNombreEntre0et4(){
		 int min, max;
		 
		 min = (int) Math.ceil(0);
		 max = (int) Math.floor(1);
		 return (int) (Math.floor(Math.random() * (max - min +1)) + min);
		}
	
	
}
