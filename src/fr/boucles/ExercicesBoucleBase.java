package fr.boucles;

public class ExercicesBoucleBase {

	/*	TP 06
	 * 	Tableau, boucles et conditions
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String prenom 	= "vincent";
		String nom 		= "Prouchet";
		
		// compter de 1 à 10
		ExercicesBoucleBase.tousLesNombre(1, 10);
		
		// afficher 20 fois son nom et prénom
		ExercicesBoucleBase.afficherNTexte(20, (prenom + " " + nom) );
			
		ExercicesBoucleBase.lesNombresPairs(100);
		ExercicesBoucleBase.lesNombresImpairs(99);
		
		
		// fin du main
	}
	
	/**
	 * affiche tous les nombres IMPAIRS
	 * jusqu'à la valeur de la variable limite
	 * 0 ne serat jamais affiché
	 * @param limite
	 */
	public static void lesNombresImpairs(int limite) {
		for(int i=0; i<=limite; i++) {
			if ( (i%2) !=0 && i>0) {
				System.out.println(i + " est un nombre impair ");
			}
		}
	}
	/*
	 * 	affiche tous les nombres PAIRS
	 * jusqu'à la valeur de la variable limite
	 * 0 ne serat jamasi affiché
	 * @param limite 
	 */
	public static void lesNombresPairs(int limite) {
			for(int i=0; i<=limite; i++) {
				
				if ( (i%2) ==0 && i>0) {
					System.out.println(i + " est un nombre pair ");
			}
		}
	}
	
	/*	affiche tous les nombres
	 * en commençant par le debut et jusqu'à la fin
	 * @param debut
	 * @param fin
	 */
	public static void tousLesNombre(int debut, int fin) {
		for(int i=debut;i<=fin;i++) {
			System.out.println(i);
		}
		
	}
	/**
	 * repéte quantite de fois le texte
	 * @param quantite
	 * @param texte
	 */
	public static void afficherNTexte(int quantite , String texte ) {
		for(int i=0;i<quantite ;i++) {
			System.out.println(texte);
		}
//		
	}
	
}
