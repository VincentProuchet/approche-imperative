package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		int[] nombres = new int[10];
		int plusGrandNombre = 0;
		Scanner scanner = new Scanner(System.in);
		int nb = 0;
		String texte = "Entrez un nombre  : \n";
		for (int i = 0; i < nombres.length; i++) {
			System.out.println( " - " + i+1 + "  " + texte  );
			nombres[i] = scanner.nextInt();
			if(plusGrandNombre < nombres[i]) {
				plusGrandNombre = nombres[i];
			}
			
		}
		System.out.println(" la plus grande valeur entrée est  :" + plusGrandNombre );
		InteractifPlusGrand.afficheTableau(nombres);
	}
	/*
	 * sert à l'affichage des tableaux
	 */
	public static void afficheTableau(int[] data) {
		System.out.println( "\n Rappel des valeurs : \n");
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
			
		}
	}
}
