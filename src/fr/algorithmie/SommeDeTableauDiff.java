package fr.algorithmie;

public class SommeDeTableauDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array  = { 1, 15, -3,  0, 8,  7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 };
		
		SommeDeTableauDiff.afficherTableau(somme(array, array2));
	}
	
		/*
		 * retourne un tableau contenant les somme des données des tableaux
		 * passé en paramètres 
		 */
		
		
	public static int[] somme(int[]data, int[]data2) {
		// on definit quel est le tableau le plus grand
		int resultSize = data.length;
		if (resultSize < data2.length) {
			resultSize = data2.length;
		}
		int[] somme = new int [resultSize]; // on créer un tableau avec cette valeur pour taille 
		somme = sommeDiff(somme,data);
		somme = sommeDiff(somme,data2);
		
		return somme;
	}
	/*
	 * retourne un tableau contenant les somme des données des tableaux
	 * passé en paramètres 
	 * le tableau passé en premier paramètre seras écrasé par l'opération
	 * 
	 * l'opération retourne le premier paramètre intact si le second tableau est plus grand que premier.
	 */
	
	public static int[] sommeDiff(int[]data, int[]data2) {
		
		if(data.length >= data2.length){
			for(int i=0;i<data2.length;i++){
				data[i] = data[i]+ data2[i];				
			}
		}
		return data;
		
	}
 
	// affichage chaque éléments d'un tableau en commençant par le début
	public static void afficherTableau ( int[] data) {
		System.out.println("Le tableau contient " );
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
			}
		System.out.println("");
	}				
	
}
