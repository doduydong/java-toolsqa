package polymorphism;

public class Cat extends Animal implements ITalk {

    String talk() {
        return "Meow!";
    }

    @Override
    public String italk() {
        return "Meow meow!";
    }
}
