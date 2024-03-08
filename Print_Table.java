package Basic_Programs;

import java.util.Scanner;

public class Print_Table {
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Table");
        n = sc.nextInt();

        for(i=1; i<=10; i++)
        {
            System.out.println(n + " * " + i +" = " + (n*i) );
        }

    }
}
