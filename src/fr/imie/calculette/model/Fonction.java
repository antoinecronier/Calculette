package fr.imie.calculette.model;

public class Fonction {
	
	public static double addition(double val1, double val2) { //1
		double fin;
		fin = val1 + val2;
		return fin;
	}
	
	public static double soustraction(double val1, double val2) { //2
		double fin;
		fin = val1 - val2;
		return fin;
	}
	
	public static double division(double val1, double val2) { //4
		double fin;
		fin = val1 / val2;
		return fin;
	}
	
	public static double multiplication(double val1, double val2) { //3
		double fin;
		fin = val1 * val2;
		return fin;
	}
	
	public static double modulo(double val1, double val2) { //5
		double fin;
		fin = val1 % val2;
		return fin;
	}
	
	public static int factorielle(int val) { //9
		int fin = 1;
		for(int i = 1; i <= val; i++) {
			fin *= i;
		}
		return fin;
	}
	
	public static double racine(double val) { //7
		double fin = 0;
		fin = Math.sqrt(val);
		return fin;
	}
	
	public static double puissance(double val1, double val2) { //6
		double fin = 1;
		for(int i = 0; i < val2; i++) {
			fin *= val1;
		}
		return fin;
	}
	
	public static double carre(double val) { //23
		double fin = val*val;
		return fin;
	}
	
	public static int puissanceDix(int val) { //8
		int fin = 1;
		if(val < 0) {
			for(int j = 0; j > val; j--) {
				fin *= 0.1;
			}
		} else if(val > 0) {
			for(int i = 0; i < val; i++) {
				fin *= 10;
			}
		}
		return fin;
	}
	
	public static int negatif(int val) { //24
		int fin = 1/val;
		return fin;
	}
		
	public static double cos(double val) { //10
		double cos = val, fin;
		cos = Math.toRadians(cos);
		fin = Math.cos(cos);
		return fin;
	}
	
	public static double sin(double val) { //11
		double fin, sin = val;
		sin = Math.toRadians(sin);
		fin = Math.sin(sin);
		return fin;
	}
	
	public static double log(double val) { //12
		double fin = Math.log(val)/Math.log(10);
		return fin;
	}
	
	public static double ln(double val) { //13
		double fin = Math.log(val);
		return fin;
	}
	
	public static double variableSolver(double val1, double val2) { //18
		double fin = 0;
		2 + a = 3;
		return fin;
	}
	
	public static double exponentielle(double val) { //14
		double fin = 0;
		fin = Math.exp(val);
		return fin;
	}
	
	public static double valeurAbsolue(double val) { //15
		double fin = 0;
		if(val < 0) {
			fin = -val;
		}
		else {
			fin = val;
		}
		return fin;
	}
	
	public static double pi() { //17
		double fin = Math.PI;
		return fin;
	}
	
	public static double tan(double val) { //16
		double tan = val, fin;
		tan = Math.toRadians(tan);
		fin = Math.tan(tan);
		return fin;
	}
	
	public static double arccos(double val) { //20
		double aCos = val, fin;
		aCos = Math.toRadians(aCos);
		fin = Math.acos(aCos);
		return fin;
	}
	
	public static double arcsin(double val) { //21
		double fin, aSin = val;
		aSin = Math.toRadians(aSin);
		fin = Math.asin(aSin);
		return fin;
	}
	
	public static double arctan(double val) { //22
		double aTan = val, fin;
		aTan = Math.toRadians(aTan);
		fin = Math.atan(aTan);
		return fin;
	}

}
