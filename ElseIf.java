import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number...");
        int num = sc.nextInt();
        if (num < 10) {
            System.out.println(num + " is less than 10");
        }
        else if(num==10)
        {
            System.out.println(num + " is equal to 10");
        }
        else
        {
            System.out.println(num + " is greater than 10");
        }
    }
}
