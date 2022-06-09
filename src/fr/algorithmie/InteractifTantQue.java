package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int nb = 0;
		String texte = "Entrez un nombre entre 1 et 10 ";
		
		do {
			
			System.out.println(texte);

			nb = scanner.nextInt();
			texte = "entrez un autre nombre";

		} while ( nb>10 || nb<1 );
		texte = "Merci !";
		
		System.out.println(texte);

	}

}
