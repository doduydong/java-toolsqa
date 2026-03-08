package nonAccessModifiers;

public class IPhone {

    public static final String BRAND = "Apple";

    public static String os = "iOS 26";

    public String model;

    public final String imei;

    public IPhone(String model, String imei) {
        this.model = model;
        this.imei = imei;
    }
}
