package Basic_Programs;
import java.util.Scanner;
class Calc{
        float a, b;
        Calc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        }

        float add(){
        return  a + b;
        }
        float sub(){
        return a - b;
        }
        float mul(){
        return a * b;
        }
        float div(){
        return a / b;
        }
        }

public class CalculatorUsingOppandInput {
    public static void main(String[] args) {
        Calc c= new Calc();

        System.out.println(c.add());
    }
}
