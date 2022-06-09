package fr.algorithmie;

import java.util.Scanner;

/*
 * La suite de Fibonacci est une suite qui commence par 0 et 1 et dans laquelle le nombre de
 * rang N est égal à la somme des nombres de rangs N-1 et N-2
 * • Créer une classe TestFibonacci
 * • Demander à l’utilisateur de choisir un rang N
 * • Ecrire un algorithme qui calcule et affiche le nombre de rang N
 */
public class InteractifFibonacci {

	public static void main(String[] args) {
		boolean continuer = true; 
		String text = "Suite de fibonnacci \n" 
				+ "entrez une valeur pour le rang N souhaité \n" 
				+ " Un zero quitteras le programme ";
		int nb = 0;
		

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println(text);
			nb = scanner.nextInt();

			if (nb > -1) {
				
				switch (nb) {
				case 0:
					continuer = false; 
				case 1:
					
					text = " le terme du rang " + nb + " est " + nb + "\n";
					break;
				default:
					
					long[] fibonacci = new long[nb+1];					
					fibonacci[1] = 1;
					for (int n = 2; n <= nb; n++) {
						fibonacci[n] = fibonacci[n - 2] + fibonacci[n - 1];
					}

					text = " le terme du rang " + nb + " est " + fibonacci[fibonacci.length - 1]+"\n";

					break;
				}
			} else {
				text = " Les rang négatif ne sont pas acceptés \n";

			}

			System.out.println(text);
			text = "entre une aute valeur :";

		} while(continuer);
		System.out.println("Fin du programme \n");

	}
}
