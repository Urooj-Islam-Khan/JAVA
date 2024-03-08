package Basic_Programs;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int t1 = 0, t2 = 1, n,  next_term = 0;
        System.out.println("Enter number of series: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {

            if(i==t1)
            {System.out.print(t1 + ",");}
            else {
                next_term = t1 + t2;
                t1 = t2;
                t2 = next_term;

                System.out.print(next_term + ",");
            }}
        System.out.print("\b.");

    }

}
