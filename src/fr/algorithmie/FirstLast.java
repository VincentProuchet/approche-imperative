package fr.algorithmie;

public class FirstLast {
	/*
	 * Dans cette classe, on déclare un tableau d’entiers • On calcule une valeur
	 * booléenne qui contrôle le tableau de la sorte : o elle vaut true si le
	 * tableau est de longueur supérieure ou égale à 1 et que le premier et le
	 * dernier élément du tableau ont la même valeur o elle vaut false dans les
	 * autres cas • écrire l’algo de valorisation de cette variable avec le minimum
	 * de ligne
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 11 };
		// int[] array1 = new int[4] ;

		boolean firstlast = false;

		if (array1.length >= 1 && (array1[0] == array1[array1.length - 1])) {
			firstlast = true;
		}

		System.out.println(firstlast);
	}

}
