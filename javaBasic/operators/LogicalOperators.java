package operators;

public class LogicalOperators {

    public static void main(String[] args) {
        boolean status1 = true;
        boolean status2 = false;

        System.out.println("And: " + (status1 && status2));
        System.out.println("Or: " + (status1 || status2));
        System.out.println("Not: " + (!status1));
        System.out.println("Not: " + (!status2));
    }
}
