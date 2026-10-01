import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Kitkat", 3));
        animals.add(new Animal.Fish("Dory", 2));
        animals.add(new Bird("Berd", 1));
        animals.add(new Cat("Catty", 6));
        animals.add(new Animal.Fish("Fishy", 5));
        animals.add(new Bird("Bord", 4));

        System.out.println("BEFORE SORTING");
        for (Animal a : animals) {
            System.out.println(a);
        }

        // ===== TODO: create NameComparator.java (implements Comparator<Animal>) =====
        animals.sort(new NameComparator());
        System.out.println("\nSORTED BY NAME");
        for (Animal a : animals) {
            System.out.println(a);
        }

        // ===== TODO: create AgeComparator.java (implements Comparator<Animal>) =====
        animals.sort(new AgeComparator());
        System.out.println("\nSORTED BY AGE");
        for (Animal a : animals) {
            System.out.println(a);
        }

        // ===== TODO: create TypeComparator.java (implements Comparator<Animal>) =====
        animals.sort(new TypeComparator());
        System.out.println("\nSORTED BY TYPE");
        for (Animal a : animals) {
            System.out.println(a);
        }

        // ===== TODO: create TypeThenAgeComparator.java (implements Comparator<Animal>) =====
        animals.sort(new TypeThenAgeComparator());
        System.out.println("\nSORTED BY TYPE THEN AGE");
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}