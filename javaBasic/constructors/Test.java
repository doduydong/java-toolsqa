package constructors;

public class Test {

    public static void main(String[] args) {
        Car toyota = new Car("Camry", "Toyota", true);

        toyota.iGear = 5;
        toyota.iHighestSpeed = 200;
        toyota.sColor = "Blue";
        toyota.sTransmission = "Manual";
        toyota.iTyres = 4;
        toyota.iDoor = 4;

        toyota.displayCharacteristics();
    }
}
