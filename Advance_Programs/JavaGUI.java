package Advance_Programs;
import javax.swing.ImageIcon;

import javax.swing.JFrame;

import java.awt.Color;

public class JavaGUI
{
    public static void main(String[] args)
    {

        // JFrame a GUI window to add components

        JFrame frame = new JFrame(); // creating a frame

        frame.setTitle("Urooj's JFrame");     // set title on frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of aplication when click on cross

       /*
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //hide application when click on cross
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // do nothing when click on cross
         */


        frame.setResizable(false); //user can not resize it

        frame.setSize(420,420);       //set x & y dimensions of frame

        frame.setVisible(true); //make the frame visible

/*        ImageIcon image = new ImageIcon("C:\\Users\\UROOJ_ISLAM_KHAN\\AppData\\Local\\Temp\\Temp1_jpg2png (1).zip\\U LOGO.png");  //creat an image icon

        frame.setIconImage(image.getImage());  //change image icon of frame */

        frame.getContentPane().setBackground(new Color(0xE04B4B));   // change background color


    }
}


















