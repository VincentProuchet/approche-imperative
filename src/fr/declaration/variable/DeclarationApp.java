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
		String phrase = "Une phrase d'introduction";
		String randomString = "Voici le résultat d'un calcul :\n 1+5 =6";
		

	
		System.out.print( "un byte  : " + octal  +"\n");
		System.out.print( "un short : " + court  +"\n");
		System.out.print( "un int  : " + entier +"\n");
		System.out.print( "un long  : " + tooLoooong  +"\n");
		System.out.print( "un float  : " + virgule +"\n");
		System.out.print( "un double  : " + grosseVirgule +"\n");
		System.out.print( "un char  : " + lettre +"\n");
		System.out.print( "un boolean : " + binaire +"\n");
		System.out.print( "un String   : " + phrase +"\n");
		
		System.out.print( randomString +"\n" );
	}

}
