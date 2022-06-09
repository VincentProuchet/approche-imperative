package fr.algorithmie;

/*
 * Dans cette classe vous devez mettre au point la méthode fabriquerMur
 * • Cette méthode doit produire un algorithme qui retourne s’il est possible ou non de
 * fabriquer un mur avec des briques de longueur 1 et des briques de longueur 5.
 */
public class FabriquerMur {
// TODO classe à terminer
	public static void main(String[] args) {
		
		// Tests de vérification
		verifier(3, 1, 8, true);
		verifier(3, 1, 9, false);
		verifier(3, 2, 10, true);
		verifier(3, 2, 8, true);
		verifier(3, 2, 9, false);
		verifier(6, 1, 11, true);
		verifier(6, 0, 11, false);
		verifier(1, 4, 11, true);
		verifier(0, 3, 10, true);
		verifier(1, 4, 12, false);
		verifier(3, 1, 7, true);
		verifier(1, 1, 7, false);
	}

	public static boolean fabriquerMur(int nbSmal, int nbBig, int longueur) {
		boolean resultat = false;
		int longueurRestante = longueur;
		int bigNeeded = 0;
		int smallNeeded = 0;
		int bigSize = 5;
		int smallSize = 1;
		// Combien de grandes briques entières sont nécessaires
		bigNeeded =  (longueur/bigSize);
		// logique de controle pour ne pas en retirer plsu que le stock
		
		// logique de retrait
		
		// combien de petite brique sont neccessaires
		
		// logique de controle pour ne pas en retirer plsu que le stock
		
		// logique de retrait
				
		if(longueurRestante == 0 ) {
			resultat = true;
		}
	
		

		return resultat;
	}

	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
			System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
		}
	}
}
