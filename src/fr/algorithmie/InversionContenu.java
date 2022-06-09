package fr.algorithmie;

/*	TP 07
 * 
 */
public class InversionContenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] arrayCopy = new int[array.length];

		InversionContenu.copyAnInversedArray(array, arrayCopy);

		display2Array(array, arrayCopy);

	}

	/**
	 * CRéer une copy inversée du tableau passé en premier paramètre dans le tableau
	 * passé en second les deux tableau doivent avoir la même taille
	 * 
	 * @param array
	 * @param arrayCopy
	 */
	public static void copyAnInversedArray(int[] array, int[] arrayCopy) {

		if (array.length == arrayCopy.length) {

			int y = 0; // index miroir
			for (int i = array.length - 1; i >= 0; i--) {
				arrayCopy[y] = array[i];
				y++;
			}

		}

	}

	/*
	 * affiche les deux tableau côte à côte dans la console pour comparaison les
	 * deux tableaux doivent avoir la même taille
	 */
	public static void display2Array(int[] array, int[] array2) {

		if (array.length == array2.length) {
			System.out.println(" Voici deux tableau cote à cote ");
			String indexSpace = " ";
			String array1Space = " ";
			String array2Space = " ";
			for (int i = 0; i < array.length; i++) {
				// mise en forme
				if (i < 10) {
					indexSpace = "  ";
				} else {
					indexSpace = " ";
				}
				if (array[i] >= 0 && array[i] < 10) {
					array1Space = "  ";
				} else {
					array1Space = " ";
				}
				if (array2[i] >= 0 && array2[i] < 10) {
					array2Space = "  ";
				} else {
					array2Space = " ";
				}
				// mise en forme
				System.out.println(
						"index" + indexSpace + i + " :" + array1Space + array[i] + " -->" + array2Space + array2[i]);
			}
			System.out.println("\n fin du tableau \n");
		}
	}

}
