package com.company;

import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Scanner;
public class Main {




    static void makePassword() {

        String[] upperCase = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] lowerCase = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] specialChars = new String[] {"!",
                "@",
                "#",
                "$",
                "%",
                "^",
                "&",
                "*",
                "(",
                ")",
                "+",
                ",",
                "-",
                ".",
                "/",
                ":",
                ";",
                "<",
                ">",
                "=",
                "?",
                "[",
                "]",
                "{",
                "}",
                "~",
                "`",
                "|",
                "_"};

        int upperLength = upperCase.length;
        int lowerLength = lowerCase.length;
        int numbersLength = numbers.length;
        int specialLength = specialChars.length;

       String myObj =  JOptionPane.showInputDialog("How many characters do you want?");
        int passLength = Integer.parseInt(myObj);



       System.out.println(passLength);


       if(passLength < 8){
           JOptionPane.showMessageDialog(null, "Password must be at least 8 characters");
           System.exit(0);
       }

       if(passLength > 128){
           JOptionPane.showMessageDialog(null, "Password must be less than 128 characters");
           System.exit(0);
       }



        int passUp = JOptionPane.showInternalConfirmDialog(null,"Do you want upper case letters?");
        int passDown  =  JOptionPane.showInternalConfirmDialog(null, "Do you want lower case letter?");

       // 0 = Yes  1 = No
       if (passUp == 0){

           String[] newPassword = new String[upperLength];
           System.arraycopy(upperCase, 0,newPassword, 0,upperLength);


           if(passDown == 0){
               newPassword = new String[lowerLength];
               System.arraycopy(lowerCase, 0 ,newPassword, 0, lowerLength);

           }
           System.out.println(Arrays.toString(newPassword));
       }

        ;


    }


    public static void main(String[] args) {
        JFrame f = new JFrame();
        JFrame window = new JFrame("Password Generator");
        JLabel label = new JLabel("Password Generator");
        JTextField passwordBox = new JTextField();

        JButton submitButton = new JButton("Generate Password");
        label.setBounds(125, 50, 200, 30);
        passwordBox.setBounds(85, 100, 200, 50);
        submitButton.setBounds(105, 180, 160, 30);
        submitButton.setBorderPainted(false);
        submitButton.setFocusPainted(false);
        submitButton.setForeground(Color.white);
        submitButton.setBackground(Color.red);



        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

               makePassword();




            }
        });


        window.add(label);
        window.add(passwordBox);
        window.add(submitButton);


        window.setSize(400, 400); // Creates the primary size of program window

        window.setLayout(null); // Sets boundaries of button for program window
        window.setVisible(true); // Makes program visible
    }

};
