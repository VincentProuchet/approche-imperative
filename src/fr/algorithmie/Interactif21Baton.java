package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;
/*
 * Le jeu est simple mais la réalisation est plus délicate. Vous allez jouer contre l’ordinateur.
 * Celui qui prend le dernier baton a perdu.
 * Dans ce TP vous allez devoir imaginer vous-même le mécanisme à mettre en place, sur la base
 * de ce que vous avez vu précédemment.
 */

public class Interactif21Baton {

	static int batonsAuDepart = 21;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Interactif21Baton jeux = new Interactif21Baton();
		boolean continuer = true;
		int nbEC = 0;
		
		int joueur1 = 0;
		int joueur2 = 0;
		int gagnant = 0;
		int batons = Interactif21Baton.batonsAuDepart;
		Random random = new Random();
		
		
		System.out.println(" Les 21 Batons  \n" + "	Il y a 21 batons sur la table. \n"
				+ "	Vous et votre adversaire pouver en prendre \n" + "	de 1 à 3 batons. \n"
				+ " Celui qui prend le dernier baton perd la partie. \n");

		do {
			batons = Interactif21Baton.prenezDesBatons(1, joueur1, scanner, batons);
			if(batons>0) {
				// random
				batons -= random.nextInt(1,3);			
				// affichage du nombre de baton restantF
				System.out.println("Il reste " + batons);
				// human input
				//Interactif21Baton.prenezDesBatons(2, joueur2, scanner, batons);
						
				continuer = true;
				if(batons>0) {
					continuer = true;
				}
				else {
					continuer = false;
					gagnant = 1;
				}
			}else {
				continuer = false;
				gagnant = 2;
			}
			
			
		} while (continuer);
		System.out.println("Le joueur "+ gagnant +" remporte la partie" );
		

	}

	public static int prenezDesBatons(int idJoueur, int joueur, Scanner scanner, int batons) {

		boolean again = true;
		String texte = "- Joueur " + idJoueur + ", prenez de un à 3 batons ";

		do {
			System.out.println(texte);
			int nbEC = scanner.nextInt();
			if (nbEC == 1 || nbEC == 2 || nbEC == 3) {
				// cas d'entrée dans la marge autorisé
				// test pour voir si il reste assez de batons
				if ((batons -= nbEC) <= 0) {
					batons -= nbEC;
					joueur += nbEC;
				}
				
				
				// logique de prise de baton
				again = false;

			} else {
				again = true;
				texte = " vous ne pouvez pas prendre plus de 3 baton par tours ";
			}
		} while (again);

		texte = "Il reste " + batons;
		// affichage du nombre de baton restantF
		System.out.println(texte);

		return batons;
	}
}
