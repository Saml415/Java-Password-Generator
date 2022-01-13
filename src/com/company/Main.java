package com.company;
import javax.swing.*;
import  java.awt.Color;
import java.awt.FlowLayout;

public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("Password Generator");
        JLabel label = new JLabel("Password Generator");
        JTextField  passwordBox = new  JTextField();
        JButton submitButton = new JButton("Generate Password");
        label.setBounds(125,50,200,30);
        passwordBox.setBounds(85,100,200,50);
        submitButton.setBounds(105,180,160,30);
        submitButton.setBorderPainted(false);
        submitButton.setFocusPainted(false);
        submitButton.setForeground(Color.white);
        submitButton.setBackground(Color.red);






        window.add(label);
        window.add(passwordBox);
        window.add(submitButton);



        window.setSize(400,400); // Creates the primary size of program window

        window.setLayout(null); // Sets boundaries of button for program window
        window.setVisible(true); // Makes program visible
    }
}
