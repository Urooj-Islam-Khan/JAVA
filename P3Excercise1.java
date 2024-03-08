package JavaFullForPlacement;
/*Write a program to calculate percentage of a given student in board exam. His marks from 5 subjects must be
 taken as input from user
 */
import java.util.Scanner;

public class P3Excercise1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter marks of English subjects");
        int a = inp.nextInt();
         System.out.println("Enter marks of Urdu subjects");
        int b = inp.nextInt();
         System.out.println("Enter marks of Maths subjects");
        int c = inp.nextInt();
         System.out.println("Enter marks of Physics subjects");
        int d = inp.nextInt();
         System.out.println("Enter marks of Islamiat subjects");
        int e = inp.nextInt();

        int sum = a+b+c+d+e;

        double perc = (sum *100)/100;
        
        System.out.println("Percentage gained: "+ perc);

        }
    }


    

