package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nb = 0;
		String texte = "Entrez un nombre entre 1 et 10 ";
		System.out.println(texte);

		nb = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + nb);
		}

	}
	
}
