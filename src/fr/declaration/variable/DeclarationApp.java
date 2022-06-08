package fr.declaration.variable;

public class DeclarationApp {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte octal = 127;
		short court = 10024;
		int entier = 45654678;
		long tooLoooong = 987795463000L;
		float virgule = 1.24f;
		double grosseVirgule = 12316.546879d;
		char lettre = 'C';
		boolean binaire = true;
		int g = 057;
		String phrase = "Une phrase d'introduction";
		String randomString = "Voici le r�sultat d'un calcul :\n 1+5 =6";
		
		System.out.println("un byte  : " + octal);	
	 // raccourci syso + CTRL + SPACE
		System.out.println( "un short    : " + court  );
		System.out.println( "un int      : " + entier );
		System.out.println( "un long     : " + tooLoooong  );
		System.out.println( "un float    : " + virgule );
		System.out.println( "un double   : " + grosseVirgule );
		System.out.println( "un char     : " + lettre );
		System.out.println( "un boolean  : " + binaire );
		System.out.println( "un String   : " + phrase );
		System.out.println("un octal     :"  + g);
		
		System.out.print( randomString +"\n" );
		
	}

}
