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

       Scanner myObj = new Scanner(System.in);
       int passLength;

       System.out.println("How long do you want your password?");
       passLength = myObj.nextInt();

       if(passLength < 8){
           System.out.println("Password must be at least 8 characters");
           System.exit(0);
       }

       if(passLength > 128){
           System.out.println("Password must be less than 128 characters");
           System.exit(0);
       }


        int input1 = JOptionPane.showInternalConfirmDialog(null,"Do you want upper case letters?");
       // 0 = Yes  1 = No
       if (input1 == 0){

           String[] newPassword = new String[upperLength];
           System.arraycopy(upperCase, 0,newPassword, 0,upperLength);
           System.out.println(Arrays.toString(newPassword));

       }else{

       }

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
//


//                if (input1 == 0) {
//
//                    int input2 = JOptionPane.showConfirmDialog(null,
//                            "Do you want lower case letters?", "Select an Option...", JOptionPane.YES_NO_CANCEL_OPTION);
//                } else {
//                    int input2 = JOptionPane.showConfirmDialog(null,
//                            "Do you want lower case letters?", "Select an Option...", JOptionPane.YES_NO_CANCEL_OPTION);
//                }

                // 0=yes, 1=no, 2=cancel

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
