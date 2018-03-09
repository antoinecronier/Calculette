package fr.imie.calculette.model;

abstract public class MotherInput {

	public int checkOperator(String toCheck) {

		int result = 0;

		switch (toCheck) {
		case "+":
			result = 1;
			break;
		case "-":
			result = 2;
			break;
		case "*":
			result = 3;
			break;
		case ")(":
			result = 3;
			break;
		case "/":
			result = 4;
			break;
		case "%":
			result = 5;
			break;
		case "^":
			result = 6;
			break;
		case "sqrt":
			result = 7;
			break;
		case "*10^":
			result = 8;
			break;
		case "!":
			result = 9;
			break;
		case "cos":
			result = 10;
			break;
		case "sin":
			result = 11;
			break;
		case "log":
			result = 12;
			break;
		case "ln":
			result = 13;
			break;
		case "e":
			result = 14;
			break;
		case "||":
			result = 15;
			break;
		case "tang":
			result = 16;
			break;
		case "pi":
			result = 17;
			break;
		default:
			result = 18;
		}

		return result;
	}

	public void calc(int operator, int val1, int val2) {
		

		
		switch (operator) {
		
		case 1: 
			Fonction.addition(val1, val2);
		break;
		
		
		case 2:
			Fonction.soustraction(val1, val2);
		break;
		
		
		case 3:
			Fonction.multiplication(val1, val2);
		break;
		
		
		case 4:
			Fonction.division(val1, val2);
		break;
		
		
		case 5:
			Fonction.modulo(val1, val2);
		break;
		
		
		case 6: 
			Fonction.puissance(val1,val2);
		break;
			
			
		case 7:
			Fonction.racine(val1);
		break;
			
			
		case 8:
			Fonction.puissanceDix(val1);
		break;
			
			
		case 9:
			Fonction.factorielle(val1);	
		break;
			
			
		case 10:
			Fonction.cos(val1);	
		break;
		
		
		case 11: 
			Fonction.sin(val1);
		break;
			
			
		case 12:
			Fonction.log(val1);	
		break;
			
		
		case 13:
			Fonction.ln(val1);	
		break;
			
			
		case 14:
			Fonction.exponentielle(val1);
		break;
			
			
		case 15:
			Fonction.valeurAbsolue(val1);
		break;
			
			
		case 16: 
			Fonction.tan(val1);
		break;
				
				
		case 17:
			Fonction.pi();		
		break;
				
				
		case 18:
			System.out.println("pas normal");
		break;
		}

	}

}
