package fr.imie.calculette.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;


public class Controller {
    public Label result;

    public String defaultStringText = "Start typing";

    @FXML
    void keyPressed(KeyEvent event) {
        //System.out.println(event.getCode());
        switch (event.getCode()) {
            case BACK_SPACE:
                deleteLast();
                break;

            case DELETE:
                display(defaultStringText);
                break;
            case NUMPAD0:
                modifyOutput("0");
                break;
            case NUMPAD1:
                modifyOutput("1");
                break;
            case NUMPAD2:
                modifyOutput("2");
                break;
            case NUMPAD3:
                modifyOutput("3");
                break;
            case NUMPAD4:
                modifyOutput("4");
                break;
            case NUMPAD5:
                modifyOutput("5");
                break;
            case NUMPAD6:
                modifyOutput("6");
                break;
            case NUMPAD7:
                modifyOutput("7");
                break;
            case NUMPAD8:
                modifyOutput("8");
                break;
            case NUMPAD9:
                modifyOutput("9");
                break;
            case ADD:
                modifyOutput("+");
                break;
            case SUBTRACT:
                modifyOutput("-");
                break;
            case DIVIDE:
                modifyOutput("/");
                break;
            case MULTIPLY:
                modifyOutput("x");
                break;
            case V:
                addSqrt();
                break;
            case P:
                addPi();
                break;
            case ENTER:
                calculate();
                break;
            case RIGHT_PARENTHESIS:
                addClosingBracket();
                break;
            case DIGIT6:
                addAbs();
                break;
            case DIGIT5:
                addOpeningBracket();
                break;
            case COMMA:
                addComa();
                break;
            case DECIMAL:
                addComa();
                break;
            case DEAD_CIRCUMFLEX: 
            	addPower();
            	break;
            default:
                break;
        }
    }

    // Checkers to know the kind of thing we have
    private boolean isOperator(String toAdd){
        String[] operators = {
                "+", "-", "x", "/", "%"
        };

        for (String operator: operators) {
            if(operator.equals(toAdd)){
                return true;
            }
        }
        return false;
    }
    private boolean isValue(String toAdd){
        try{
            int value = Integer.parseInt(toAdd);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    private boolean isSpecialCharacter(String toAdd){
        String[] operators = {
                "π", ")"
        };

        for (String operator: operators) {
            if(operator.equals(toAdd)){
                return true;
            }
        }
        return false;
    }

    public void modifyOutput(String toAdd){
        String content = getOutput();
        if(content.equals(defaultStringText)){
            content = "";
        }

        if(isOperator(toAdd)){
            if(content.length() > 0){
                String lastCharacter = getLastCharacter();
                // Adds the operator
                if(isValue(lastCharacter) || isSpecialCharacter(lastCharacter)){
                    display(content.concat(toAdd));
                }else{
                    // In case the last character is an operator
                    if(isOperator(lastCharacter)){
                        removeLastCharacter();
                        // Refreshes content
                        content = result.getText();
                        display(content.concat(toAdd));
                    }
                }
            }
        }else {
            if(!isSpecialCharacter(getLastCharacter())){
                display(content.concat(toAdd));
            }
        }
    }

    // Add all the functions
    @FXML
    public void function(ActionEvent event){
        String func = ((Button) event.getSource()).getText();
        String space = " ";
        if(func.equals("!")){
            space = "";
        }
        if(getLastCharacter().equals("(")){
            display(getOutput().concat(func.concat(space)));
        }else {
            addPart(func.concat(space));
        }
    }

    // Checks if it has a coma or not
    private boolean hasComa(){
        String content = getOutput();
        Character testValue = null;
        for(int i = content.length()-1; i >= 0; i--){
            testValue = new Character(content.charAt(i));
            if(testValue.toString().equals(".")){
                return true;
            }
            if(isOperator(testValue.toString())){
                return false;
            }
        }
        return false;
    }

    public void addComa(){
        String content = getOutput();
        if(isValue(getLastCharacter())){
            if(!hasComa()){
                display(content.concat("."));
            }
        }
    }
    // Enter negative values
    public void addInvert(){
        addPart("(-");
        if(getLastCharacter().equals("(")){
            display(getOutput().concat("-"));
        }
    }

    // Enter square root
    public void addSqrt(){
        addPart("Sqrt(");
    }
    // Enter absolute symbol
    public void addAbs(){
        addPart("Abs(");
    }
    // Enter absolute symbol
    public void addExponential(){
        addPart("e^");
    }
    // Enter 10 power
    public void addTen(){
        addPart("10^");
    }
    
    // Enter x^2
    public void addSquare() {
    	System.out.println("Adds square");
    	addAfterNumbers("^2");
    }
    public void addPower() {
    	addAfterNumbers("^");
    }
    
    // Adds invert value
    public void addInvertX() {
        String content = getOutput();
        String previous = getLastCharacter();
        if(content.equals(defaultStringText)){
            display("1/");
        }else{
            if(!isValue(previous)){
            	display(content.concat("1/"));
            }
        }
    }

    // Add pi
    public void addPi(){
        String content = getOutput();
        String previous = getLastCharacter();
        if(content.equals(defaultStringText)){
            display("π");
        }else{
            if(isOperator(previous) || isValue(previous)
            		|| getLastCharacter().equals("^") || getLastCharacter().equals("(")){
                if(!previous.equals("π")){
                    display(content.concat("π"));
                }
            }
        }
    }
    // Adds opening parenthesis
    public void addOpeningBracket(){
        String content = getOutput();
        if(!isValue(getLastCharacter()) || content.equals(defaultStringText)){
            if(content.equals(defaultStringText)){
                content = "";
            }
            display(content.concat("("));
        }
    }

    // Adds closing parenthesis
    public void addClosingBracket(){
        // Search an open bracket
        String content = getOutput();
        Character tested = null;
        int neededOnes = 0;
        int openedOne = 0;

        for(int i = content.length()-1; i >= 0; i--){
            tested = new Character(content.charAt(i));
            if(tested.toString().equals(")")){
                neededOnes++;
            }
            if(tested.toString().equals("(")){
                openedOne++;
            }
        }
        if(openedOne > neededOnes){
            display(content.concat(")"));
        }
    }

    // Do the maths
    public void calculate(){
        String maths = getOutput();
        System.out.println(maths);
    }

    @FXML
    public void addNumber(ActionEvent e){
        String val = ((Button)e.getSource()).getText();
        modifyOutput(val);
    }

    @FXML
    public void deleteLast(){
        String[] groupException = {
                "Sqrt(", "cos ", "sin ", "tan ", "log ", "ln ", "Abs(", "e^"
        };
        String content = getOutput();
        if(!content.equals(defaultStringText)){
            if(content.length() <= 1){
                result.setText(defaultStringText);
            }else{
                if(isValue(getLastCharacter()) || isOperator(getLastCharacter())){
                    removeLastCharacter();
                }else{
                    int counter, expCursor = 0;
                    Character expChar = null;
                    Character contentChar = null;
                    boolean found = false;

                    // Tests each group exception
                    for(String exp: groupException) {
                        counter = content.length() - 1;
                        expCursor = exp.length() - 1;
                        do {
                        	try {
                                expChar = new Character(exp.charAt(expCursor));
                                contentChar = new Character(content.charAt(counter));
                        	} catch(Exception e) {
                        		break;
                        	}
                            counter--;
                            expCursor--;
                        } while(expChar.equals(contentChar) && expCursor != 0);
                        if(expCursor == 0){
                            content = content.substring(0, content.length() - exp.length());
                            found = true;
                            if(content.isEmpty()) {
                            	display(defaultStringText);
                            }else {
                                display(content);	
                            }
                            break;
                        }
                    }
                    if(!found){
                        removeLastCharacter();
                    }
                }
            }
        }
    }

    // Displays
    public void display(String text){
        result.setText(text);
    }


    // Method which returns the last character
    private String getLastCharacter(){
        String content = getOutput();
        char lastValue;
        try
        {
            lastValue = content.charAt(content.length()-1);
        }catch(StringIndexOutOfBoundsException e){
            return "";
        }
        return ""+lastValue;
    }

    // Method to remove the last value
    private void removeLastCharacter(){
        String content = getOutput();
        if(content.length() > 0){
            content = content.substring(0, content.length()-1);
            result.setText(content);
        }
    }

    // Method which returns the whole output
    private String getOutput(){
        return result.getText();
    }


    // For adding parts
    private void addPart(String part){
        String content = getOutput();
        String lastChar = getLastCharacter();
        if(isOperator(lastChar) || content.equals(defaultStringText) || getLastCharacter().equals("^")){
            if(content.equals(defaultStringText)){
                content = "";
            }
            display(content.concat(part));
        }
    }
    // For adding after numbers
    private void addAfterNumbers(String part) {
    	String lastChar = getLastCharacter();
    	if(isValue(lastChar)) {
    		display(getOutput().concat(part));
    	}
    }
}
