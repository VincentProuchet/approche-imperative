package fr.boucles;

public class ExerciceBouclesEtTest {

	// 
	public static void main(String[] args) {
		
		
		int[] tenFirst = {1,2,3,4,5,6,7,8,9,10};
		// affichage du premier élément et de la taille du tableau
		System.out.println( "Première valeur : " + tenFirst[0] + "\n" + 
							"Longueur du tableau : " + tenFirst.length + "\n");
		
		// changement de la 4 ième valeur du tableau
		tenFirst[4] = 8;
		
		
		
		// nouveau tableau
		int[] array = {1,15,-3,0,8,7,4,-2,28,
						7,-1,17,2,3,0,14,-4};
		
		
		ExerciceBouclesEtTest.afficherTableau(array);
		ExerciceBouclesEtTest.afficherTableauReverse(array);
		ExerciceBouclesEtTest.afficherLesSuperieurs(3, array);
		ExerciceBouclesEtTest.afficherLesEntiersPairs(array);
		ExerciceBouclesEtTest.afficherLesIndexPairs(array);
		ExerciceBouclesEtTest.afficherLesEntiersImpairs(array);
		
		
		
	
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
	public static void afficherLesSuperieurs(int valeurMini, int[] data) {
		System.out.println(" Seulement les plus grand que " + valeurMini );
		
		for(int i=0;i<data.length;i++) {
			if(data[i]> valeurMini) {
				System.out.println(data[i]);
			}
		}
		System.out.println("");
	}
	public static void afficherLesEntiersPairs(int[] data) {
		System.out.println(" Seulement les pairs " );
		
		for(int i=0;i<data.length;i++) {
			if(data[i]%2 ==0) {
				System.out.println(data[i]);
			}
		}
		System.out.println("");
	}
	public static void afficherLesEntiersImpairs(int[] data) {
		System.out.println(" Seulement les impairs " );
		for(int i=0;i<data.length;i++) {
			if(data[i]%2 !=0) {
				System.out.println(data[i]);
			}
		}
		System.out.println("");
	}
	public static void afficherLesIndexPairs(int[] data) {
		System.out.println(" Seulement les index pairs " );
		for(int i=0;i<data.length;i++) {
			if(i%2 ==0) {
				System.out.println("index " + i + " ->  " + data[i]);
			}
		}
		System.out.println("");
	}

}


