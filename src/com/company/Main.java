package com.company;
import javax.swing.*;
import  java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
       JFrame f = new JFrame();
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

        String[] upperCase ={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[]    lowerCase ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int[] numbers ={1,2,3,4,5,6,7,8,9,0};
        String[] specialChars ={"!",
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


       String[] newPassword = {};


        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int input = JOptionPane.showConfirmDialog(null,
                        "Do you want to proceed?", "Select an Option...",JOptionPane.YES_NO_CANCEL_OPTION);
                if(input == 1){

                    JOptionPane.showMessageDialog(f,"Hello, Welcome to Javatpoint.");
                }else {
                    System.out.println("Live On");
                }

                // 0=yes, 1=no, 2=cancel

            }
        });



        window.add(label);
        window.add(passwordBox);
        window.add(submitButton);



        window.setSize(400,400); // Creates the primary size of program window

        window.setLayout(null); // Sets boundaries of button for program window
        window.setVisible(true); // Makes program visible
    }
}
