package accessModifiers.store;

import accessModifiers.device.IPhone;

public class AppleStore {

    public static void main(String[] args) {
        IPhone phone = new IPhone();

        System.out.println("Model: " + phone.model);
        System.out.println("IMEI: " + phone.getImei());
    }
}
