package fr.algorithmie;

public class REchercheMAx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
	
		valeurMaxi(array);
	}
	
	/*
	 * affiche la donnée dont la valeur est la plus grande du tableau
	 */
	public static void valeurMaxi(int[]data) {
		int valeurMaxi = 0;
		
		for(int i=0;i<data.length;i++){
			
			if (valeurMaxi < data[i]) {
				valeurMaxi = data[i];
			}
		}
		System.out.println("  " + valeurMaxi +  "  est la plus grande valeur du tableau. ");
	}
	
	
	

}
