package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] villes = new String[] {"Béziers",
										"Montpellier",
										"Agde",
										"Séte",
										"Reims",
										"Hérépian",
										};
		
		System.out.println("la liste contient " + villes.length + " villes.");
		ExerciceTableauChaines.afficheTableau(villes);
	}
	
	public static void afficheTableau(String[] data) {
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
			
		}
	}

}
