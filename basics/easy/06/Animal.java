public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Meant to be overridden by subclasses
    public String makeSound() {
        return "...";
    }

    // Meant to be overridden by subclasses
    public void describe() {
        System.out.println(name + " is " + age + " years old and says: " + makeSound());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}