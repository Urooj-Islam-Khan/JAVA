package Programs;

public class SwappingValuesOF2Variables {

    public static void main(String[] args) {
        
          //Swapping two variables values

        int a=10;
        int b=20;
        int bh;
        System.out.println("Before Swapping ");
        System.out.println("Value of a:"+a+"\nValue of b:"+b);
        bh=a;
        a=b;
        b=bh;
        System.out.println("\nAfter Swapping ");
        System.out.println("Value of a:"+a+"\nValue of b:"+b);

    }
    
}
