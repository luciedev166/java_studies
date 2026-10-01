import java.util.Comparator;
public abstract class Animal implements Comparable<Animal>{ // superclass, base class
    final String name; // must be set once, in all the constructors
    private int age;
    protected String gender;
    public String breed;
    static int numberOfAnimals; // class variable

        public static class NameComparator implements Comparator<Animal>
        {
            // instead of having only one obj it now accepts two objects:

            //dont get how this is different from comparable ...
            @Override
            public int compare(Animal o1, Animal o2)
            {
                // want to sort in alphabetical order
                //String class already sorts Strings
                return o1.name.compareTo(o2.name);
            }
        }

        // public static class TypeComparator implements Comparator<Animal>{
        //     @Override 
        //     public int compare(Animal o1, Animal o2)
        //     {
        //         //getClass().getSimpleName()
        //         return o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
        //     }
        // }

        //sorted by type then age
        
        public static class TypeComparator implements Comparator<Animal>{
            @Override 
            public int compare(Animal o1, Animal o2)
            {
                //getClass().getSimpleName()
                int var = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());

                if(var == 0)
                {
                    return Integer.compare(o1.age, o2.age);
                }
                return var;
            }
        }

        public int compareTo(Animal o)
        {
            return Integer.compare(this.age, o.age); 
            // reverse is return Integer.compare(o.age, this.age); 
            // or return -Integer.compare(this.age, o.age);

            //returns either -1 if less than other obj o, 1 if same, pos if greater
            //need better pract for this one
            // if(this.age < o.age){
            //     return -1;
            // }
            // if(this.age == o.age)
            //     {
            //     return 0;
            // }
            // return 1;
        }
        // inside Animal

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
 