package arrays;

public class PassArrayToMethod {

    public static void main(String[] args) {
        String[] carMakes = {"BMW", "AUDI", "TOYOTA", "SUZUKI", "HONDA", "VINFAST"};

        printArray(carMakes);
    }

    public static void printArray(String[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }
}
