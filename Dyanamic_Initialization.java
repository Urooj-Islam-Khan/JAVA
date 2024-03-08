package Basic_Programs;

import java.util.Scanner;

public class Dyanamic_Initialization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        double a= sc.nextDouble(), b = sc.nextDouble();
        double c = Math.sqrt(a*a + b*b);
        System.out.println("Hypotenus of c is "+ c);
    }
}
