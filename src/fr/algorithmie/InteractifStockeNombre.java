package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockeNombre {

	/*
	 * EXERCICE INTERACTIFSTOCKAGENOMBRE (DIFFICILE) Créer une classe
	 * InteractifStockageNombre Faire un programme avec le menu suivant : 1. Ajouter
	 * un nombre 2. Afficher les nombres existants. Description : Demander à
	 * l’utilisateur de choisir une option dans le menu.
	 *
	 * Si l’utilisateur sélectionne l’option 1, le programme demande un nombre à
	 * l’utilisateur puis l’ajoute à un tableau. Si l’utilisateur sélectionne
	 * l’option 2, le programme affiche le contenu du tableau. Si le tableau est
	 * plein, écrire un algorithme pour agrandir le tableau
	 */
	public static void main(String[] args) {
		int[] nombre = new int[1];
		;
		int index = 0;
		boolean exit = false;

		Scanner scanner = new Scanner(System.in);
		int nb = 0;
		String texte = "";
		
		
		do {
			// menu display
			System.out.println("Menu \n");
			System.out.println("1. Ajouter un nombre");
			System.out.println("2. Afficher les nombre existants");
			// menu choice
			nb = scanner.nextInt();
			
			// Menu Backend
			switch (nb) {
			// ajouter des nombres
			case 1:

				System.out.println(" Entrez un nombre ");
				if (index == 0) {
					nb = scanner.nextInt();
					
					nombre[index] = nb;
					index++;

				} else {
					// on creér un tableau plus grand
					int[] temp = new int[nombre.length + 1];
					// on en y copie chaque valeur du tableau d'origine
					for(int i=0;i<nombre.length;i++) {
						temp[i]= nombre[i];
					}
					// user input
					nb = scanner.nextInt();
					// on place la dernière entrée à la fin
					temp[index] = nb;
					// et on écrase l'ancien tableau trop petit
					nombre = temp;
					// et on update l'index
					index++;
					
				}
				break;
			// Terminé et afficher les nombres
			case 2:
				InteractifStockeNombre.afficheTableau(nombre);
				exit = true;
				;
			// n'existe que pour traiter les inputs indésirables
			default:

				break;
			}

			

		} while (!exit);

		System.out.println(texte);

	}

	public static void afficheTableau(int[] data) {
		System.out.println("\n Voici le contenu du tableau : \n");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);

		}
	}
	

}
