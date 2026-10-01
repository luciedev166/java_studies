
import java.util.Comparator;

public abstract class Animal { // superclass, base class
    final String name; // must be set once, in all the constructors
    private int age;
    protected String gender;
    public String breed;
    static int numberOfAnimals; // class variable

    // public int compareTo(Animal a)
    // {

    // }
    public static class NameComparator implements Comparator<Animal>
    {   
        @Override
        public int compare(Animal o1, Animal o2)
        {
            return o1.name.compareTo(o2.name);
        }
    }

    public static class AgeComparator implements Comparator<Animal>
    {   
        @Override
        public int compare(Animal o1, Animal o2)
        {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
    public static class TypeComparator implements Comparator<Animal>
    {   
        @Override
        public int compare(Animal o1, Animal o2)
        {
            return o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
        }
    }
    public static class TypeThenAgeComparator implements Comparator<Animal>
    {   
        @Override
        public int compare(Animal o1, Animal o2)
        {
            int val = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
            if(val == 0)
                return Integer.compare(o1.getAge(), o2.getAge());
            else
                return val;
        }
    }

    public static void printNumberOfAnimals() {
        System.out.println("Your total number of animals is "
                + numberOfAnimals);
    }


    public Animal(String name) {
        this(name, 0);
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfAnimals++;
    }

    public final int getAge() {
        return age;
    }

    protected abstract int maxAge();

    public void setAge(int age) {
        if (age >= 0 && age <= maxAge()) {
            this.age = age;
        }
    }

    abstract String makeSound();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + name + " (" + age + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (obj instanceof Animal a) {
            return getClass().equals(obj.getClass()) && a.name.equalsIgnoreCase(this.name);
        }
        return false;
    }

    public static class Fish extends Animal implements EggLayer{
        static int numberoffishes;
        public static void printNumberOfAnimals() {
            System.out.println("Your total number of fishes is "
                    + numberoffishes);
        }

        @Override
        protected int maxAge() {
            return 392;
        }

        public Fish(String name) {
            this(name, 0);
        }

        @Override
        public void setAge(int age) {
            super.setAge(age);
        }

        @Override
        String makeSound() {
            return "bloop bloop";
        }

        public void swim() {
            System.out.println("Fish " + name + " is swimming far");
        }

        public Fish(String name, int age) {
            super(name, age);
            numberoffishes++;
        }

        @Override
        public int layEggs() {
            return 100;
        }

        //why animal o and not animal.age?
    }
}
 