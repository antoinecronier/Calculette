package fr.imie.calculette.test;

public class test {
	
	public static void main(String[] args) {		
		
		// get two double numbers
		double cos1 = 90.0;
		double sin1 = 180.0;
		double tan1 = 180.0;
		
		//stock the printvariable
		int Cos1 = (int) cos1;
		int Sin1 = (int) sin1;
		int Tan1 = (int) tan1;
		
		// convert them to radians
		cos1 = Math.toRadians(cos1);
		sin1 = Math.toRadians(sin1);
		tan1 = Math.toRadians(tan1);
		
		// print their cosine
		System.out.println("Le Cosinus de (" + Cos1 + ") = " + Math.cos(cos1));
		System.out.println("Le Sinus de (" + Sin1 + ") = " + Math.sin(sin1));
		System.out.println("La Tangente de (" + Tan1 + ") = " + Math.tan(tan1));
		
		
		double degrees = 90 ;
		
		degrees = Math.cos(Math.toRadians(degrees));
		System.out.println(degrees);
		
	}
}
