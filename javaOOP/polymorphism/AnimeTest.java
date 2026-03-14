package polymorphism;

public class AnimeTest {

    public static void main(String[] args) {
        Animal[] pets = new Animal[2];
        pets[0] = new Cat();
        pets[1] = new Dog();

        for (int i = 0; i < pets.length; i++) {
            System.out.println("Pet[" + i + "]: " + pets[i].talk());
        }
    }
}
