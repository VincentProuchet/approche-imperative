package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		 
		 afficherLesSuperieurs(3, array);
		 afficherLesEntiersPairs(array);
		 afficherLesIndexPairs(array);
		 
		 afficherLesEntiersImpairs(array);
	}
	
	// affichae chaque éléments d'un tableau en commençant par le début
		public static void afficherTableau ( int[] data) {
			System.out.println("Le tableau contient " );
			for(int i=0;i<data.length;i++) {
				System.out.println(data[i]);
			}
			System.out.println("");
		}
		// affiche chaque élements d'un tableau en commençant par la fin 
		public static void afficherTableauReverse(int[] data) {
			System.out.println(" la tableau à l'envers");
			for(int i=data.length-1;i>=0;i--) {
				System.out.println(data[i]);
			}
			System.out.println(" ");
		}
		/* n'affiche que les donnée dont la valeur est supérieure à 
		 * valeurMini
		 * 
		 */
		public static void afficherLesSuperieurs(int valeurMini, int[] data) {
			System.out.println(" Seulement les plus grand que " + valeurMini );
			
			for(int i=0;i<data.length;i++) {
				if(data[i]> valeurMini) {
					System.out.println(data[i]);
				}
			}
			System.out.println("");
		}
		/*n'affiche que les donnée dont la valeur est un entier pair
		 *  
		 */
		public static void afficherLesEntiersPairs(int[] data) {
			System.out.println(" Seulement les pairs " );
			
			for(int i=0;i<data.length;i++) {
				if(data[i]%2 ==0) {
					System.out.println(data[i]);
				}
			}
			System.out.println("");
		}
		/*
		 * n'affiche que les données dont la valeur et un entier impair
		 */
		public static void afficherLesEntiersImpairs(int[] data) {
			System.out.println(" Seulement les impairs " );
			for(int i=0;i<data.length;i++) {
				if(data[i]%2 !=0) {
					System.out.println(data[i]);
				}
			}
			System.out.println("");
		}
		/*
		 * n'affiche que les données présent dans un index pair
		 */
		public static void afficherLesIndexPairs(int[] data) {
			String indexSpace= " ";
			String array1Space = " ";
			System.out.println(" Seulement les index pairs " );
			for(int i=0;i<data.length;i++) {
				
				if(i%2 ==0) {
					if(i<10 ) {
						indexSpace = "  ";
					}
					else {
						indexSpace = " ";
					}
					if(data[i]>=0  && data[i]<10   ) {
						array1Space = "  ";
					}
					else {
						array1Space = " ";
					}
					System.out.println("index"+ indexSpace + i + " -> "+array1Space + data[i]);
				}
			}
			System.out.println("");
		}


}
