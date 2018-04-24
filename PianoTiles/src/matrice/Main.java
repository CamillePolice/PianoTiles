package matrice;

public class Main {

	public static void main(String[] args) {
		int longueur = 4;
		int largeur = 5;
		
		
		boolean [][] tab = new boolean[longueur][largeur];
		
		for(int i=0;i<=tab.length;i++) {
			int choix = getNombreEntre0et4();
			for(int j=0;i<=tab[i].length;j++) {
				tab[i][j] = false;
				tab[i][choix] = true;
				System.out.println(tab[i][j]);
			}
		}
		
	}
	
	public static int getNombreEntre0et4(){
		 int min, max;
		 
		 min = (int) Math.ceil(0);
		 max = (int) Math.floor(4);
		 return (int) (Math.floor(Math.random() * (max - min +1)) + min);
		}
  }


