package operators;

public class ConditionalOperator {

    public static void main(String[] args) {
        int age = 28;

        String isValid = (age >= 18) ? "Valid!" : "Invalid!";

        System.out.println(isValid);
    }
}
