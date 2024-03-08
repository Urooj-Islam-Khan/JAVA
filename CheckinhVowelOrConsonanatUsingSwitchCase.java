package Basic_Programs;

import java.util.Scanner;

public class CheckinhVowelOrConsonanatUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any alphabet");
        char alp = sc.nextLine().charAt(0);
        switch (alp)
        {
            case 'a':
                System.out.println(alp + " is a vowel");
                break;
            case 'e':
                System.out.println(alp + " is a vowel");
                break;
            case 'i':
                System.out.println(alp + " is a vowel");
                break;
            case 'o':
                System.out.println(alp + " is a vowel");
                break;
            case 'u':
                System.out.println(alp + " is a vowel");
                break;
            default:
                System.out.println(alp + " is a consonant");
        }
    }
}
