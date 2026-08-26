public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);   // calls Animal's constructor
        this.canFly = canFly;
    }

    @Override
    public String makeSound() {
        return "Tweet!";
    }

    @Override
    public void describe() {
        super.describe();   // reuse Animal's describe(), then add extra info
        System.out.println("  " + (canFly ? "Can fly" : "Cannot fly"));
    }
}