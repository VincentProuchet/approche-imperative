package fr.algorithmie;

public class SommeDeTableaux {
	
	
	public static void main(String[] args) {
		
		int[] array  = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 ={-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
	
		display3Array(array, array2, (somme(array,array2)));
		
	}
	
	/*
	 * retourne un tableau contenant les somme des données des tableaux
	 * passé en paramètres 
	 * les tableaux doivent avoir la même taille
	 */
	public static int[] somme(int[]data, int[]data2) {
		
		int[] somme = new int [data.length];
		if(data.length == data2.length){
			for(int i=0;i<data.length;i++){
				somme[i] = data[i]+ data2[i];				
			}
		}
		return somme;
		
	}
	// affichae chaque éléments d'un tableau en commençant par le début
			public static void afficherTableau ( int[] data) {
				System.out.println("Le tableau contient " );
				for(int i=0;i<data.length;i++) {
					System.out.println(data[i]);
				}
				System.out.println("");
		}
			
			public static void display3Array(int[] array, int[] array2, int[] array3) {
				
				
				if(array.length == array2.length && array.length == array3.length ) {
					System.out.println(" Voici les tableaux tableau cote à cote " );
					String indexSpace= " ";
					String array1Space = " ";
					String array2Space = " ";
					String array3Space = " ";
					
					for(int i=0;i<array.length;i++) {
						// mise en forme
						indexSpace = formSpace(i);
						array1Space =formSpace(array[i]) ;
						array2Space =formSpace(array2[i]) ;
						array3Space = formSpace(array3[i]);
						
						// mise en forme
						System.out.println("index"+ indexSpace + i  + " :"+array1Space + array[i] +"|" +array2Space + array2[i]+ " |" + array3Space + array3[i] );
					}
					System.out.println("\n fin du tableau \n");			
				}
			}
			
			/*Ne sert qu'à la mise en forme des présentation de tableau 
			 * lorsqu'ils sont présenté cote à cote 
			 * 
			 */
			public static String formSpace(int value) {
				String space = "";
				if(value>=0  && value<10   ) {
					space = "  ";
				}
				else if (value <=-10) {
					space = "";
				}
				else{
					space = " ";
				}
				return space;
				
			}


}
