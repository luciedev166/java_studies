import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {

        // ================= NUMBERS SECTION =================

        // create an empty List<Integer> called numbers (ArrayList)
        List<Integer> numbers = new ArrayList<>();

        // add 5 numbers to it, in this order: 5, 4, 3, 2, 1
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);

        // print the list as-is, before any sorting
        for(Integer i: numbers)
        {
            System.out.println(i + " ");
        }
        System.out.println();

        // sort using: Collections.sort(numbers);
        Collections.sort(numbers);
        System.out.printf("\nSORTED NUMBERS NATURALLY\n");
        
        for(Integer i: numbers)
        {
            System.out.println(i + " ");
        }
        System.out.println();
        // -> natural/default order, no comparator involved

        // print the list again

        // print header text: "SORTING BASED ON HOW CLOSE TO 10"

        // sort using: numbers.sort((o1, o2) -> { ... });
        // -> inline lambda, custom rule: order by distance from 10 (smallest distance first)

        // print the list again

        // print header text: "SORTING BASED ON HOW CLOSE TO N BUT THROUGH THE USE OF A OWN CLASS"

        // sort using: numbers.sort(new CloseToNComparator(10));
        // -> your own standalone class, same "closeness" idea as the lambda above, but N is passed in through a constructor

        // print the list again


        // ================= ANIMALS SECTION =================

        // create an empty List<Animal> called animals (ArrayList)

        // add these 6 animals, in this exact order:
        // Cat("Kitkat", 3), Animal.Fish("Dory", 2), Bird("Berd", 1),
        // Cat("Catty", 6),  Animal.Fish("Fishy", 5), Bird("Bord", 4)

        // print all animals as-is, before any sorting

        // print header text: "AFTER SORTING BY AGE"

        // sort using: Collections.sort(animals);
        // -> natural/default order, no comparator argument
        // -> this line will NOT compile until Animal itself implements the right interface

        // print all animals again

        // print header text: "AFTER SORTING BY NAME"

        // sort using: animals.sort(new Animal.NameComparator());
        // -> a nested static class living inside Animal, implementing the "give it two, get an order" interface

        // print all animals again

        // print header text: "AFTER SORTING BY TYPE THEN AGE"

        // sort using: animals.sort(new Animal.TypeComparator());
        // -> another nested static class inside Animal, same interface as NameComparator,
        //    orders by runtime type name first, falls back to age if the type names match

        // print all animals again
    }
}