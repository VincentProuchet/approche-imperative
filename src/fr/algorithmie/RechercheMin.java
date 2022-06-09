package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
	
		valeurMini(array);
	}
	
	/*
	 * affiche la donnée dont la valeur est la plus grande du tableau
	 */
	public static void valeurMini(int[]data) {
		int valeurMini = data[0];
		
		for(int i=0;i<data.length;i++){
			
			if (valeurMini > data[i]) {
				valeurMini = data[i];
			}
		}
		System.out.println("  " + valeurMini +  "  est la plus petite valeur du tableau. ");
	}
	
	

}
