package polymorphism;

public class Dog extends Animal implements ITalk {

    String talk() {
        return "Woof!";
    }

    @Override
    public String italk() {
        return "Woof woof!";
    }
}
