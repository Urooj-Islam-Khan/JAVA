import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int num = sc.nextInt();
        if (num < 10) {
            System.out.println(num + " is less than 10");
        }
        else
        {
            System.out.println(num + " is greater than 10");
        }
    }
}