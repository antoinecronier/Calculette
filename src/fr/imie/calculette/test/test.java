package fr.imie.calculette.test;

import java.lang.*;

public class test {
	
	public static void main(String[] args) {
		
		// get two double numbers
		double x = 45.0;
		double y = 180.0;
		
		int angleX = (int) x;
		int angleY = (int) y;
		   
		// convert them to radians
		x = Math.toRadians(x);
		y = Math.toRadians(y);

		// print their cosine
		System.out.println("Le Cosinus de (" + angleX + ") = " + Math.cos(x));
		System.out.println("Le Cosinus de (" + angleY + ") = " + Math.cos(y));
		
		
		
		// get two double numbers
		double x1 = 45.0;
		double y1 = 180.0;
		
		int angleX1 = (int) x1;
		int angleY1 = (int) y1;
		   
		// convert them to radians
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);

		// print their sine
		System.out.println("Le Sinus de (" + angleX1 + ") = " + Math.sin(x1));
		System.out.println("Le Sinus de (" + angleY1 + ") = " + Math.sin(y1));
	}
}
