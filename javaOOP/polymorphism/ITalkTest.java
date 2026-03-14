package polymorphism;

public class ITalkTest {

    public static void main(String[] args) {
        ITalk[] things = new ITalk[3];
        things[0] = new Dog();
        things[1] = new Cat();
        things[2] = new Radio();

        for (int i = 0; i < things.length; i++) {
            System.out.println("Things[" + i + "]: " + things[i].italk());
        }
    }
}
