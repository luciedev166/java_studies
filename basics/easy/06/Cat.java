public class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);   // calls Animal's constructor
        this.isIndoor = isIndoor;
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }

    @Override
    public void describe() {
        super.describe();   // reuse Animal's describe(), then add extra info
        System.out.println("  Lives: " + (isIndoor ? "Indoor" : "Outdoor"));
    }
}