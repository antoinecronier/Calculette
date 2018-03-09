package fr.imie.calculette.vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Vue extends JFrame {
	private JLabel output = new JLabel("0");
    private JButton equals = button("equal");
	
    public Vue(){
        int width = 400;
        int height = 350;
        Color accent = new Color(71,205,214);
        Color background = new Color(36,36,36);

        this.setSize(width, height);
        this.setTitle("Calculatrice");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        System.out.println(System.getProperty("user.dir"));

        ImageIcon icon = new ImageIcon(System.getProperty("user.dir")+"\\src\\images\\icon.png");
        this.setIconImage(icon.getImage());

        // Creating panels
        JPanel mainPanel = new JPanel(new GridBagLayout());
        JPanel resultPanel = new JPanel(new GridBagLayout());
        JPanel complexMethods = new JPanel(new GridBagLayout());
        JPanel basicMethods = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        resultPanel.setBackground(background);

        // Result panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 5;

        
        output.setFont(new Font("Arial", Font.BOLD, 22));
        output.setForeground(accent);
        resultPanel.add(output, constraints);

        // Adds the erase button
        constraints.gridx = 1;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.FIRST_LINE_END;
       // 
        resultPanel.setBorder(null);

        constraints.weighty = 1.0;

        // Basic methods
        constraints.gridx = 0;
        JButton sin = button("sin");
        basicMethods.add(sin, constraints);
        constraints.gridx = 1;
        JButton cos = button("cos");
        basicMethods.add(cos, constraints);
        constraints.gridx = 2;
        JButton tan = button("tan");
        basicMethods.add(tan, constraints);
        constraints.gridx = 3;
        JButton modulo = button("%");
        basicMethods.add(modulo, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        JButton sept = button("7");
        basicMethods.add(sept, constraints);
        constraints.gridx = 1;
        JButton huit = button("8");
        basicMethods.add(huit, constraints);
        constraints.gridx = 2;
        JButton nine = button("9");
        basicMethods.add(nine, constraints);
        constraints.gridx = 3;

        JButton divide = button("divide");
        basicMethods.add(divide, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        JButton quatre = button("4");
        basicMethods.add(quatre, constraints);
        constraints.gridx = 1;
        JButton cinq = button("5");
        basicMethods.add(cinq, constraints);
        constraints.gridx = 2;
        JButton six = button("6");
        basicMethods.add(six, constraints);
        constraints.gridx = 3;
        JButton multiply = button("multiply");
        basicMethods.add(multiply, constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        JButton un = button("1");
        basicMethods.add(un, constraints);
        constraints.gridx = 1;
        JButton deux = button("2");
        basicMethods.add(deux, constraints);
        constraints.gridx = 2;
        JButton trois = button("3");
        basicMethods.add(trois, constraints);
        constraints.gridx = 3;
        JButton substract = button("substract");
        basicMethods.add(substract, constraints);
        constraints.gridx = 0;
        constraints.gridy = 4;
        JButton minus = button("minus");
        basicMethods.add(minus, constraints);
        constraints.gridx = 1;
        JButton zero = button("0");
        basicMethods.add(zero, constraints);
        constraints.gridx = 2;
        JButton coma = button("coma");
        basicMethods.add(coma, constraints);
        constraints.gridx = 3;
        JButton plus = button("plus");
        basicMethods.add(plus, constraints);
        constraints.gridx = 0;
        constraints.gridy = 5;
        JButton bracket1 = button("bracket1");
        basicMethods.add(bracket1, constraints);
        constraints.gridx = 1;
        JButton bracket2 = button("bracket2");
        basicMethods.add(bracket2, constraints);
        constraints.gridx = 2;
        constraints.gridwidth = 2;
        equals.setBackground(accent);
        basicMethods.add(equals, constraints);

        // Complex methods
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        JButton power = button("power");
        complexMethods.add(power, constraints);
        constraints.gridx = 1;
        JButton square = button("square");
        complexMethods.add(square, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        JButton ten = button("ten");
        complexMethods.add(ten, constraints);
        constraints.gridx = 1;
        JButton xn = button("xn");
        complexMethods.add(xn, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        JButton ln = button("ln");
        complexMethods.add(ln, constraints);
        constraints.gridx = 1;
        JButton sqrt = button("sqrt");
        complexMethods.add(sqrt, constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        JButton invert = button("invert");
        complexMethods.add(invert, constraints);
        constraints.gridx = 1;
        JButton pi = button("pi");
        complexMethods.add(pi, constraints);
        constraints.gridx = 0;
        constraints.gridy = 4;
        JButton factorial = button("factorial");
        complexMethods.add(factorial, constraints);
        constraints.gridx = 1;
        JButton log = button("log");
        complexMethods.add(log, constraints);
        constraints.gridx = 0;
        constraints.gridy = 5;
        JButton abs = button("abs");
        complexMethods.add(abs, constraints);
        constraints.gridx = 1;
        JButton erase = button("erase");
        complexMethods.add(erase, constraints);
        
        complexMethods.setBackground(background);
        

        // Stacking the panels
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 6;
        mainPanel.add(resultPanel, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        mainPanel.add(complexMethods, constraints);
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 4;
        mainPanel.add(basicMethods, constraints);

        mainPanel.setBackground(new Color(20, 20, 20));

        UIManager.put("MyJButton.font", new Font("Arial", Font.BOLD, 48));
        this.setContentPane(mainPanel);
        this.setVisible(true);
    }

    private JButton button(String image){
        // Adding the image
        ImageIcon img = new ImageIcon(System.getProperty("user.dir")+"\\src\\images\\"+image+".png");

        JButton returnedOne = new JButton(img);
        returnedOne.setBorder(null);
        returnedOne.setPreferredSize(new Dimension(65, 45));

        returnedOne.setBackground(new Color(25, 25, 25));
        returnedOne.setForeground(new Color(250, 250, 250));

        return returnedOne;
    }
    
    // Set result
    public void setResult(int result) {
    	output.setText(Integer.toString(result));
    }
    // Get calcul
    public String getResult() {
    	return output.getText();
    }
    
    public void addCalculationListener(ActionListener listen) {
    	equals.addActionListener(listen);
    }
    
    
    
    
}
