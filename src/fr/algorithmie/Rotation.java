package fr.algorithmie;

import java.lang.reflect.Array;

/*
 * Dans cette classe, on déclare un tableau d’entiers
 * Effectuez une rotation à droite des éléments.
 * Exemple : si vous avez {0,1,2,3} vous obtenez {3,0,1,2}
 */
public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		// on crée un tableau de la même longueur
		int[] rotated = new int[array1.length];

		// on place le dernier au debut du tableau
		rotated[0] = array1[array1.length-1];
		// puis on déplace chaque valeur dans la case adjacente
		for(int i=1;i<array1.length;i++) {
			rotated[i] = array1[i-1];
		}
		
		display2Array(array1, rotated);
	}
	public static void display2Array(int[] array, int[] array2) {

		if (array.length == array2.length) {
			System.out.println(" Voici deux tableau cote à cote ");
			String indexSpace = " ";
			String array1Space = " ";
			String array2Space = " ";
			for (int i = 0; i < array.length; i++) {
				indexSpace = formSpace(i);
				array1Space = formSpace(array[i]);
				array2Space = formSpace(array2[i]);
				// mise en forme
				System.out.println(
						"index" + indexSpace + i + " :" + array1Space + array[i] + " -->" + array2Space + array2[i]);
			}
			System.out.println("\n fin des tableau \n");
		}
	}
	/*
	 * Ne sert qu'à la mise en forme des présentation de tableau lorsqu'ils sont
	 * présenté cote à cote
	 * 
	 */
	public static String formSpace(int value) {
		String space = "";
		if (value >= 0 && value < 10) {
			space = "  ";
		} else if (value <= -10) {
			space = "";
		} else {
			space = " ";
		}
		return space;

	}
	

}
