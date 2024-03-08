package Basic_Programs;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Scanner sc is used to make object of scanner named
        sc that reads from inputstram(System.in)*/

        System.out.println("Enter your age ");

        //reads an integer input from user an store it in age variable.
        int age = sc.nextInt();

        //This displayed your input
        System.out.println("Your age is: " + age);

    }
}
