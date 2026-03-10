package inheritance;

public class Car extends Vehicle {
    protected int numberOfSeats;

    public Car(int numberOfSeats, String license) {
        this.numberOfSeats = numberOfSeats;
        setLicensePlate(license);
    }

    @Override
    public String toString() {
        return "The car has " + numberOfSeats + " seats. Its license is " + getLicensePlate();
    }
}
