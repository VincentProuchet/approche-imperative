package fr.algorithmie;

import java.util.Scanner;
/*
 * Le jeu est simple mais la réalisation est plus délicate. Vous allez jouer contre l’ordinateur.
 * Celui qui prend le dernier baton a perdu.
 * Dans ce TP vous allez devoir imaginer vous-même le mécanisme à mettre en place, sur la base
 * de ce que vous avez vu précédemment.
 */

public class Interactif21Baton {

	Scanner scanner = new Scanner(System.in);
	static int batonsAuDepart = 21;
	int batons = batonsAuDepart;
	int nbEC = 0;

	public static void main(String[] args) {
			
		Interactif21Baton jeux = new Interactif21Baton();
		

		int joueur1 = 0;
		int joueur2 = 0;
		jeux.batons = batonsAuDepart;
		System.out.println(" Les 21 Batons  \n" + "	Il y a 21 batons sur la table. \n"
				+ "	Vous et votre adversaire pouver en prendre \n" + "	de 1 à 3 batons. \n"
				+ " Celui qui prend le dernier baton perd la partie. \n");
		
		jeux.prenezDesBatons(1,joueur1);
		jeux.prenezDesBatons(2, joueur2);
		
		
		
	}

	public void prenezDesBatons( int idJoueur ,int joueur) {

		boolean again = true;
		String texte ="- Joueur " + idJoueur + ", prenez de un à 3 batons ";
		

		do {
			System.out.println(texte);
			this.nbEC = scanner.nextInt();
			if (nbEC == 1 || nbEC == 2 || nbEC == 3) {
				// cas d'entrée dans la marge autorisé
				if( (this.batons -= this.nbEC) <=0 ) {
					
				}
				this.batons -= this.nbEC;
				joueur += this.nbEC;
				// logique de prise de baton
				again = false;

			} else {
				again = true;
				texte = " vous ne pouvez pas prendre plus de 3 baton par tours ";
			}
		} while (again);
		
		texte = "Il reste " + this.batons; 
		// affichage du nombre de baton restantF
	}
}
