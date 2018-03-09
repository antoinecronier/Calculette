package fr.imie.calculette.test;

public class test {

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
		public static double log(double val) { //12
			double fin = Math.log(val)/Math.log(10);
			return fin;
		}
		public static double ln(double val) { //13
			double fin = Math.log(val);
			return fin;
		}
		public static double exponentielle(double val) { //14
			double fin = 0;
			fin = Math.exp(val);
			return fin;
		}
		public static double pi() { //17
			double fin = Math.PI;
			return fin;
		}
}
