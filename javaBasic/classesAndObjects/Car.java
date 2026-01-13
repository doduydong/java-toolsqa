package classesAndObjects;

public class Car {
    String sModel;
    int iGear;
    int iHighestSpeed;
    String sColor;
    String sMake;
    boolean bLeftHandDrive;
    String sTransmission;
    int iTyres;
    int iDoor;

    public void displayCharacteristics() {
        System.out.println("Model of the car: " + sModel);
        System.out.println("Number of gears in the car: " + iGear);
        System.out.println("Max speed of the car: " + iHighestSpeed);
        System.out.println("Color of the car: " + sColor);
        System.out.println("Make of the car: " + sMake);
        System.out.println("Left hand drive: " + bLeftHandDrive);
        System.out.println("Transmission of the car: " + sTransmission);
        System.out.println("Number of tyres in the car: " + iTyres);
        System.out.println("Number of doors in the car: " + iDoor);
    }
}
