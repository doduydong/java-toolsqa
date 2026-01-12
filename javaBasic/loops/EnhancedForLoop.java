package loops;

public class EnhancedForLoop {

    public static void main(String[] args) {
        String[] carMakes = {"BMW", "AUDI", "TOYOTA", "SUZUKI", "HONDA", "VINFAST"};

        System.out.println("* Enhanced for loop:");
        for (String make : carMakes) {
            System.out.println(make);
        }

        System.out.println("* Normal for loop:");
        for (int i = 0; i < carMakes.length; i++) {
            System.out.println(carMakes[i]);
        }
    }
}
