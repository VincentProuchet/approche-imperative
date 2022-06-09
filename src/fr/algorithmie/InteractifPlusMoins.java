package fr.algorithmie;

import java.util.Scanner;
/*
 * Ecrire un jeu qui :
 * - choisit un nombre aléatoire entre 1 et 100
 * - puis demande à l’utilisateur de trouver ce nombre en lui indiquant s’il est au-dessus ou
 * en dessous du nombre,
 * - Lorsque l’utilisateur a trouvé le nombre, le programme affiche « Bravo, vous avez
 * trouvé en N coups » où N représente le nombre d’essais effecté par l’utilisateur
 * - le programme se termine.
 */
public class InteractifPlusMoins {

	public static void main(String[] args) {
		int nombre = (int) (Math.random()*100);
		boolean trouve =true;

		Scanner scanner = new Scanner(System.in);
		int nb = 0;
		
		String texte = "trouvez le bon chiffre entre 1 et 100 ";
		System.out.println(texte);	
		System.out.println("entrez un nombre ");
		do {		

			nb = scanner.nextInt();
			
			if(nb == nombre) {
				trouve = false;
				texte = " Vous avez trouvé !!!!";
			}
			else if(nb> nombre ) {
				texte = "c'est moins ";

			}
			else if(nb < nombre) {
				texte = "c'est plus ";
			}
			
			System.out.println(texte);	
			
		} while (trouve);
	}
}
