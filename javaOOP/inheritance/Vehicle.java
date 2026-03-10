package inheritance;

public class Vehicle {
    private String licensePlate;

    protected void setLicensePlate(String license) {
        this.licensePlate = license;
    }

    protected String getLicensePlate() {
        return licensePlate;
    }
}
