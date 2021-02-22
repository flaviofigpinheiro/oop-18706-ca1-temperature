package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.InputMismatchException;

public class TemperatureConverter extends JFrame {

    private final double CelsiusToFahrenheit = 9 / 5d;
    private final double FahrenheitToCelsius = 5 / 9d;

    private CheckBoxHandler handler;
    private ButtonGroup checkBox;
    private JTextField textInput;
    private JTextField textResult;
    private JCheckBox CelsiusCheckBox;
    private JCheckBox FahrenheitCheckBox;
    private JButton Calcbutton;



    public TemperatureConverter() {
        super("Temperature Converter");
        setLayout(new FlowLayout());

        JLabel lblTitle = new JLabel("Temperature Converter");
        lblTitle.setOpaque(true);
        lblTitle.setFont(new Font("Serif", Font.PLAIN, 30));
        add(lblTitle);

        JLabel label = new JLabel("<html>               <br>                 <br></html>");
        add(label);

        FahrenheitCheckBox = new JCheckBox("Celsius to Fahrenheit"); // label
        CelsiusCheckBox = new JCheckBox("Fahrenheit to Celsius");
        add(FahrenheitCheckBox);
        add(CelsiusCheckBox);

        JLabel label2 = new JLabel("<html> Insert here the quantity to convert: </html>");
        add(label2);


        textInput = new JTextField( 30);
        add(textInput);


        JLabel label3 = new JLabel("<html> Result: </html>");
        add(label3);
        textResult = new JTextField(30);
        textResult.setEditable(false);
        add(textResult);
        textResult.setEditable(false);



        Calcbutton = new JButton("Conversion");
        add(Calcbutton);
        handler = new CheckBoxHandler();
        Calcbutton.addActionListener(handler);


        checkBox = new ButtonGroup();
        checkBox.add(CelsiusCheckBox);
        checkBox.add(FahrenheitCheckBox);


    }

    private class CheckBoxHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            double celsius = Double.parseDouble(textInput.getText());
            double fahrenheit = Double.parseDouble(textInput.getText());


            try {
                if (CelsiusCheckBox.isSelected()) {
                    celsius = (fahrenheit - 32) * FahrenheitToCelsius;
                    textResult.setText("Celsius: " + celsius);
                } else {
                    fahrenheit = (celsius * CelsiusToFahrenheit) + 32;
                    textResult.setText("Fahrenheit: " + fahrenheit);
                }

            } catch (InputMismatchException exception){
                JLabel label4 = new JLabel("Try again with a Number !!!");
                add(label4);

            }
        }
    }
}

