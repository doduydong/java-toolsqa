package operators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int a, b = 13, c = 10;

        a = b + c;
        System.out.println("Addition: " + a);

        a = b - c;
        System.out.println("Subtraction: " + a);

        a = b * c;
        System.out.println("Multiplication: " + a);

        a = b / c;
        System.out.println("Division: " + a);

        a = b % c;
        System.out.println("Modulo: " + a);

        b++;
        System.out.println("Increment: " + b);

        c--;
        System.out.println("Decrement: " + c);
    }
}
