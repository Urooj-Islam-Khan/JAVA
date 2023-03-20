import java.util.Scanner;

public class AllTypesOfInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.next();
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        System.out.println("Enter your number, don;t write 0 at begining");
        long number = sc.nextLong();
        System.out.println("Enter your Grade ");
        char grade = sc.next().charAt(0);
        System.out.println("Enter two numbers ");
        double num = sc.nextDouble();
        float no = sc.nextFloat();

        System.out.println("Name: "+ name + "Age: "+ age + "Contact Number :" + number + "Your Grade: " +grade );
        System.out.println(num +" + " + no +" = " + (num+no));
    
    }
}
