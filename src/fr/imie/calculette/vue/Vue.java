package fr.imie.calculette.vue;

import javax.swing.*;
import java.awt.*;

public class Vue extends JFrame {
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

        JLabel output = new JLabel("0");
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
        basicMethods.add(button("cos"), constraints);
        constraints.gridx = 2;
        basicMethods.add(button("tan"), constraints);
        constraints.gridx = 3;
        basicMethods.add(button("%"), constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        basicMethods.add(button("7"), constraints);
        constraints.gridx = 1;
        basicMethods.add(button("8"), constraints);
        constraints.gridx = 2;
        basicMethods.add(button("9"), constraints);
        constraints.gridx = 3;
        basicMethods.add(button("divide"), constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        basicMethods.add(button("4"), constraints);
        constraints.gridx = 1;
        basicMethods.add(button("5"), constraints);
        constraints.gridx = 2;
        basicMethods.add(button("6"), constraints);
        constraints.gridx = 3;
        basicMethods.add(button("multiply"), constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        basicMethods.add(button("1"), constraints);
        constraints.gridx = 1;
        basicMethods.add(button("2"), constraints);
        constraints.gridx = 2;
        basicMethods.add(button("3"), constraints);
        constraints.gridx = 3;
        basicMethods.add(button("substract"), constraints);
        constraints.gridx = 0;
        constraints.gridy = 4;
        basicMethods.add(button("minus"), constraints);
        constraints.gridx = 1;
        basicMethods.add(button("0"), constraints);
        constraints.gridx = 2;
        basicMethods.add(button("coma"), constraints);
        constraints.gridx = 3;
        basicMethods.add(button("plus"), constraints);
        constraints.gridx = 0;
        constraints.gridy = 5;
        basicMethods.add(button("bracket1"), constraints);
        constraints.gridx = 1;
        basicMethods.add(button("bracket2"), constraints);
        constraints.gridx = 2;
        constraints.gridwidth = 2;
        JButton equals = button("equal");
        equals.setBackground(accent);
        basicMethods.add(equals, constraints);

        // Complex methods

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        complexMethods.add(button("power"), constraints);
        constraints.gridx = 1;
        complexMethods.add(button("square"), constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        complexMethods.add(button("ten"), constraints);
        constraints.gridx = 1;
        complexMethods.add(button("xn"), constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        complexMethods.add(button("ln"), constraints);
        constraints.gridx = 1;
        complexMethods.add(button("sqrt"), constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        complexMethods.add(button("invert"), constraints);
        constraints.gridx = 1;
        complexMethods.add(button("pi"), constraints);
        constraints.gridx = 0;
        constraints.gridy = 4;
        complexMethods.add(button("factorial"), constraints);
        constraints.gridx = 1;
        complexMethods.add(button("log"), constraints);
        constraints.gridx = 0;
        constraints.gridy = 5;
        complexMethods.add(button("abs"), constraints);
        constraints.gridx = 1;
        complexMethods.add(button("erase"), constraints);
        
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
}
