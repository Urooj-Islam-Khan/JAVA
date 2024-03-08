package Basic_Programs;

import java.util.Scanner;

public class Temp_Measure {
    public static void main(String[] args) {
        float C, F ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit ");
        F = sc.nextFloat();

        C = (F-32)*5/9;

        System.out.println("Tempreture in Celsius " + C);

    }
}
