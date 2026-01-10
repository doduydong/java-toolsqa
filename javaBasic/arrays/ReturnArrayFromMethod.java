package arrays;

public class ReturnArrayFromMethod {

    public static void main(String[] args) {
        String[] carMakes = returnArray();
        for (int i = 0; i <= carMakes.length - 1; i++) {
            System.out.println(carMakes[i]);
        }
    }

    public static String[] returnArray() {
        String[] makes = {"BMW", "AUDI", "TOYOTA", "SUZUKI", "HONDA", "VINFAST"};
        return makes;
    }
}
