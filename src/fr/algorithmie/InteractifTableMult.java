package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	/**
	 * crire un programme qui demande un nombre à l’utilisateur qui doit être compris entre 1 et
	 * 10. Une fois que le nombre est bien entre 1 et 10, le programme affiche la table de
	 * multiplication de ce nombre. Exemple :
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nb = 0;
		String texte = "Entrez un nombre entre 1 et 10 ";
		
		do {
			
			System.out.println(texte);

			nb = scanner.nextInt();
			texte = "entrez un autre nombre";

		} while ( nb>10 || nb<1 );
		System.out.println(" voici la table de " + nb + " :");
		for(int i=0;i<=10;i++) {
			System.out.println(i*nb);
		}
		

	}
}
