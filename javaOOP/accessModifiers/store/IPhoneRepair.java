package accessModifiers.store;

import accessModifiers.device.IPhone;

public class IPhoneRepair extends IPhone {

    public void checkDevice() {
        System.out.println("Model: " + model);
        System.out.println("IMEI: " + getImei());
        System.out.println("Battery: " + battery);
    }

    public static void main(String[] args) {
        IPhoneRepair repair = new IPhoneRepair();
        repair.checkDevice();
    }
}
