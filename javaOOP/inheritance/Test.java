package inheritance;

public class Test {

    public static void main(String[] args) {
        Car personalCar = new Car(4, "PERSONAL-BN123");
        System.out.println(personalCar);

        SportsCar sportsTeam = new SportsCar(2, "SPORTS-AB989", 200);
        System.out.println(sportsTeam);
    }
}
