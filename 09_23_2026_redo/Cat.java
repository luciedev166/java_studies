public class Cat extends Mammal {
    int lives = 9;

    public Cat(String name) {
        super(name, 8);
    }
       public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    protected int maxAge() {
        return Integer.MAX_VALUE;
    }

    @Override
    protected String makeSound() {
        return "meow";
    }

    @Override
    public String toString() {
        return super.toString() + " has " + lives + " lives.";
    }
}
 