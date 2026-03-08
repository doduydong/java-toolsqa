package nonAccessModifiers;

public class TestDevice {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone("iPhone 17", "123456789");

        System.out.println("Brand: " + IPhone.BRAND);
        System.out.println("OS: " + IPhone.os);
        System.out.println("Model: " + iPhone.model);
        System.out.println("IMEI: " + iPhone.imei);
    }
}
