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
		verifier(3, 1, 	8, 	true);
		verifier(3, 1,	9, false);
		verifier(3, 2, 10, 	true);
		verifier(3, 2,	8, 	true);
		verifier(3, 2, 	9, false);
		verifier(6, 1, 11, 	true);
		verifier(6, 0, 11, false);
		verifier(1, 4, 11,	true);
		verifier(0, 3, 10, 	true);
		verifier(1, 4, 12, false);
		verifier(3, 1, 	7, 	true);
		verifier(1, 1, 	7, false);
	}

	public static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
		// tant que le mur est pas fait
		boolean resultat = false;
		/// ça c'est mon TOC
		int bigSize = 5;
		int smallSize = 1;
		///
		// Combien de grandes briques entières sont nécessaires
		longueur = RetirerBrique(bigSize, nbBig, longueur);
		longueur = RetirerBrique(smallSize, nbSmall, longueur);
		// puis on controle l'état de la longueur restante
		if (longueur <= 0) {
			resultat = true;
		}

		return resultat;
	}
	private static int RetirerBrique(int size, int briques, int longueur ) {
		// on calcule la quantité nécessaire 
		int quantite = (int) longueur / size;
		// logique de controle pour limiter le stock
		// si on à plus de brique que necessaire
		if (quantite <= briques) {
			// on pose tout ce qu'on peut
			longueur -= quantite * size;
		}
		// si on a pas suffisement de briques 
		else {
			// on pose tout le stock
			longueur -= (int) size * briques;
		}
		return longueur;
	}

	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
			System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
		}
	}
}
