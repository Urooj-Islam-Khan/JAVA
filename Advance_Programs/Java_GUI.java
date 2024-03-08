package Advance_Programs;

import javax.swing.JOptionPane;
/* enables a program to prompt the user with a Windows-based input dialog box, and return any user input as a String. */

public class Java_GUI {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name ");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age ")); //this turn it in string
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height, "));
        JOptionPane.showMessageDialog(null, "Your height is: " + height + " feets");

    }
}









