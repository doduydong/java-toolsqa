package inheritance;

public class SportsCar extends Car {
    private double maxSpeed;

    public SportsCar(int numberOfSeats, String license, double maxSpeed) {
        super(numberOfSeats, license);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ". Its max speed is " + maxSpeed;
    }
}
