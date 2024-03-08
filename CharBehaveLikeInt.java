package Basic_Programs;

import java.util.Scanner;

public class CharBehaveLikeInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet");
        char ch = sc.next().charAt(0);
        System.out.println("Your Alphabet is " + ch);
        ch++;
        System.out.println("After Increment Your Alphabet is " + ch);
    }
}
