package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
	
		Moyenne(array);
	}
	
	/*
	 * affiche la moyennes des valeurs du tableau
	 */
	public static void Moyenne(int[]data) {
		int somme = 0;
		int moyenne =0;
		for(int i=0;i<data.length;i++){
			somme += data[i];
			
		}
		moyenne = somme/ data.length;
		
		System.out.println("  " + moyenne +  "  est la moyenne des valeurs du tableau. ");
	}
	
	
}
