package fr.imie.calculette.model;

public class Fonction {
	
	public static float addition(float val1, float val2) {
		float fin;
		fin = val1 + val2;
		return fin;
	}
	
	public static float soustraction(float val1, float val2) {
		float fin;
		fin = val1 - val2;
		return fin;
	}
	
	public static float division(float val1, float val2) {
		float fin;
		fin = val1 / val2;
		return fin;
	}
	
	public static float multiplication(float val1, float val2) {
		float fin;
		fin = val1 * val2;
		return fin;
	}
	
	public static float modulo(float val1, float val2) {
		float fin;
		fin = val1 % val2;
		return fin;
	}
	
	public static int factorielle(int val) {
		int fin = 1;
		for(int i = 1; i <= val; i++) {
			fin *= i;
		}
		return fin;
	}
	
	public static float fraction() {
		
	}
	
	public static float puissance() {
		
	}
	
	public static float puissanceDix() {
		
	}
	
	public static float cos() {
		
	}
	
	public static float sin() {
		
	}
	
	public static float log() {
		
	}
	
	public static float ln() {
		
	}
	
	public static float variableSolver() {
		
	}
	
	public static float parenthèse() {
		
	}
	
	public static float exponentielle() {
		
	}
	
	public static float valeurAbsolue() {
		
	}
	
	public static float pi() {
		
	}
	
	public static float tan() {
		
	}

}
