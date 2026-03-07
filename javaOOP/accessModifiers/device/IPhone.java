package accessModifiers.device;

public class IPhone {
    public String model = "iPhone 17";
    protected int battery = 100;
    String color = "Black";
    private String imei = "123456789";

    public String getImei() {
        return imei;
    }
}
