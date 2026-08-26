public class Main {
    public static void main(String[] args) {
        // An array of type Animal can hold any subclass — that's polymorphism
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Rex", 3, "Labrador");
        animals[1] = new Cat("Whiskers", 2, true);
        animals[2] = new Bird("Tweety", 1, true);

        for (Animal a : animals) {
            a.describe();   // calls the overridden version for each actual subclass
            System.out.println();
        }
    }
}