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

	public void calc() {

	}

}
