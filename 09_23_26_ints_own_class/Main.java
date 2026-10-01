import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);

        System.out.println("BEFORE SORTING");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ===== TODO: create AscendingComparator.java (implements Comparator<Integer>) =====
        numbers.sort(new AscendingComparator());
        System.out.println("\nASCENDING");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ===== TODO: create DescendingComparator.java (implements Comparator<Integer>) =====
        numbers.sort(new DescendingComparator());
        System.out.println("\nDESCENDING");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ===== TODO: create CloseToNComparator.java (implements Comparator<Integer>, has constructor) =====
        numbers.sort(new CloseToNComparator(10));
        System.out.println("\nCLOSEST TO 10");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}