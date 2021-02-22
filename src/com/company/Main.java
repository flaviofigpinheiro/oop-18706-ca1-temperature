package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
       TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.setTitle("Temperature Converter");
        temperatureConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        temperatureConverter.setSize(380,250);
        temperatureConverter.setVisible(true);
        temperatureConverter.setBackground(Color.GRAY);


    }
}
