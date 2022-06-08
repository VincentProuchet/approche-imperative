package fr.operateurs;

public class DeclarationOperateurs {

	/*	TP 4
	 * les opérateur
	 * les équations booléenes 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a  = 10;
		int b = 20 ;
		boolean testEt = a > 0 && b< 10;
		boolean testOu = 0>0 || b<10 ; 
		
		System.out.println(testEt +"\n");
		System.out.print(testOu +"\n");
		
		a= a+1;
		System.out.print(a+"\n");
		a++;
		System.out.print(a+"\n");
		a+=1;
		System.out.print(a+"\n");
		
		
		String c =  a>0 ? "a est plus grand que 0 ": "a est inférieur à 0 ";
		System.out.print(c + "\n" );

	}

}
