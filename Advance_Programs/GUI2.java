package Advance_Programs;

import javax.swing.JOptionPane;

public class GUI2 {
    public static void main(String[] args){

  String name = JOptionPane.showInputDialog(" Enter your name ");
  int age = Integer.parseInt(JOptionPane.showInputDialog(" Enter your age "));
  double height = Double.parseDouble(JOptionPane.showInputDialog(" Enter your height "));
  JOptionPane.showMessageDialog(null, " Name: "+ name + "\n Age: " + age + "\nHeight: " + height);

    }
}
