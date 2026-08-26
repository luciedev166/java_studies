public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);   // calls Animal's constructor
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }

    @Override
    public void describe() {
        super.describe();   // reuse Animal's describe(), then add extra info
        System.out.println("  Breed: " + breed);
    }
}