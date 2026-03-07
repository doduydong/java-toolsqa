package accessModifiers.device;

public class TestDevice {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        System.out.println("Model: " + iPhone.model);
        System.out.println("IMEI: " + iPhone.getImei());
        System.out.println("Color: " + iPhone.color);
        System.out.println("Battery: " + iPhone.battery);
    }
}
