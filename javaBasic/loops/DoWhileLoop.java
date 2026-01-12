package loops;

public class DoWhileLoop {

    public static void main(String[] args) {
        int number = 25;
        do {
            System.out.println(number);
            number = number + 5;
        } while (number < 25);
    }
}
