package Basic_Programs;


class Cal {
    public Cal() {
    }

    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    public float mul(int n1, int n2) {
        return n1 * n2;
    }

    public float div(int n1, int n2) {

        if (n2 == 0) {
            System.out.println("Can't be divide");
            return 0;
        } else
            return n1 / n2;
    }

}
public class CalculatorUsingOop {
    public static void main(String[] args) {

        Cal c = new Cal();
        System.out.println(c.sum(4,8));
        System.out.println(c.sub(4,8));
        System.out.println(c.mul(4,8));
        System.out.println(c.div(4,8));

    }
}
