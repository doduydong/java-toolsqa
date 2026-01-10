package arrays;

public class AccessArrayValues {

    public static void main(String[] args) {
        String[] carMakes = {"BMW", "AUDI", "TOYOTA", "SUZUKI", "HONDA", "VINFAST"};

        int aLength = carMakes.length;
        System.out.println("Length of the Array is: " + aLength);

        String firstValue = carMakes[0];
        System.out.println("First value of the Array is: " + firstValue);

        String lastValue = carMakes[aLength - 1];
        System.out.println("Last value of the Array is: " + lastValue);

        for (int i = 0; i <= aLength - 1; i++) {
            System.out.println("The value stored at position " + i + " in carMakes Array is: " + carMakes[i]);
        }
    }
}
