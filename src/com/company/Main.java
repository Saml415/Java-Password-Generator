package com.company;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("Password Generator");
        JLabel label = new JLabel("Password Generator");
        label.setBounds(125,50,200,30);






        window.add(label);



        window.setSize(400,400); // Creates the primary size of program window

        window.setLayout(null); // Sets boundaries of button for program window
        window.setVisible(true); // Makes program visible
    }
}
