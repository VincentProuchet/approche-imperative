package fr.algorithmie;

public class FirstLast6 {

	/*
	 * Dans cette classe, on déclare un tableau d’entiers • On calcule une valeur
	 * booléenne qui contrôle le tableau de la sorte : o elle vaut true si le
	 * tableau a au moins 1 élément et si le premier élément ou le dernier élément
	 * vaut 6. o elle vaut false dans les autres cas • écrire l’algo de valorisation
	 * de cette variable avec le minimum de ligne
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 11, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 11 };
		// int[] array1 = new int[4] ;

		boolean firstlast6 = false;

		if (array1.length > 0 && (array1[0] == 6 || array1[array1.length - 1] == 6)) {
			firstlast6 = true;
		}

		System.out.println(firstlast6);
	}

}
