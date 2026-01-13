package classesAndObjects;

public class Test {

    public static void main(String[] args) {
        Car toyota = new Car();

        toyota.sModel = "Camry";
        toyota.iGear = 5;
        toyota.iHighestSpeed = 200;
        toyota.sColor = "Blue";
        toyota.sMake = "Toyota";
        toyota.bLeftHandDrive = true;
        toyota.sTransmission = "Manual";
        toyota.iTyres = 4;
        toyota.iDoor = 4;

        toyota.displayCharacteristics();
    }
}
