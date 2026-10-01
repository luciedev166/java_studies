import java.util.ArrayList;
import java.util.Collections;
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

        // ===== TODO: in Animal.java -> implements Comparable<Animal>, override compareTo() =====
        // compareTo() must compare by name first, falling back to age as a tie-break
        Collections.sort(animals);
        System.out.println("\nSORTED BY NAME THEN AGE (via compareTo)");
        for (Animal a : animals) {
            System.out.println(a);
        }

        // No other sorts here -- Comparable only allows ONE compareTo() per class,
        // so this is the only ordering possible under this variant.
    }
}