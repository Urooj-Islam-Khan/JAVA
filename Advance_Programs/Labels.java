package Advance_Programs;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
public class Labels {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:\\Users\\UROOJ_ISLAM_KHAN\\AppData\\Local\\Temp\\Temp1_jpg2png (4).zip\\girl code.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN,4);

        // JLables = a GUI display area for string of a text or image or both
        JLabel label = new JLabel();  //create label
        label.setText("UROOJ ISLAM");  // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);  //set text left,centre,right to image icon
        label.setVerticalTextPosition(JLabel.TOP);  // set text to top, bottom ,centre of image icon
        label.setForeground(Color.BLUE);  //set txt color
        label.setFont(new Font("Calibri",Font.BOLD,80
        ) );  //set font of txt
        label.setIconTextGap(-10);  //set txt gap to image
         label.setBackground(new Color(0x00FFDA));  //set background color
        label.setOpaque(true);  // visible background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);  //set label vertically
        label.setHorizontalAlignment(JLabel.CENTER);  // set label horizontally
        label.setBounds(100,100,250,250);  //set x,y position within frame

        
        //FRAME
        JFrame frame = new JFrame();  //create a frame
        frame.setSize(500, 500);  // set frame size
        frame.setVisible(true);  //make frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //close when click on cross
        frame.getContentPane().setBackground(Color.BLACK);  //change background color
        frame.add(label);  // add label in the frame
        //frame.setLayout(null);
       // frame.pack();

    }
}
