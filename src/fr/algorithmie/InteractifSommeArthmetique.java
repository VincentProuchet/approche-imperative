package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArthmetique {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int nb = 0;
		int somme = 0;
		String texte = "Entrez un nombre ";

		System.out.println(texte);

			nb = scanner.nextInt();
		
		for (int i = 0; i <= nb; i++) {
			somme = somme + i;
			
		}
		System.out.println(" La somme des nombre jusqu'à " + nb + " est : " +somme );

	}
}
