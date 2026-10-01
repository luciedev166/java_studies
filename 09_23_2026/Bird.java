public class Bird extends Animal implements EggLayer{

    public Bird(String name) {
        super(name);
    }
    public Bird(String name, int age) {
        super(name, age);

    }

    @Override
    String makeSound() {
        return "tweet tweet";
    }

    @Override
    protected int maxAge() {
        return 80;
    }

    void fly() {
        System.out.println(name + " is a bird flying to the skies");
    }
}
 