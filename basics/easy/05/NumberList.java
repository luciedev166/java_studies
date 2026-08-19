import java.util.Scanner;

public class NumberList {
    private int[] b;
    private int size;

    public NumberList(int capacity) {
        b = new int[capacity];
    }

    public void insert(int idx, int val) {
        if (idx < 0 || idx > size || size == b.length)
            return;

        for (int i = size; i > idx; i--) {
            b[i] = b[i - 1];
        }
        b[idx] = val;
        size++;
    }

    public void removeAt(int idx) {
        if (idx < 0 || idx >= size)
            return;

        for (int i = idx; i < size - 1; i++) {
            b[i] = b[i + 1];
        }
        size--;
    }

    public void removeElement(int val) {
        for (int i = 0; i < size; i++) {
            if (b[i] == val) {
                removeAt(i);
                return;
            }
        }
    }

    // remember, inserting idx starts at size and goes down. Removing idx, starts at idx and goes up

    public void addFirst(int val) {
        insert(0, val);
    }

    public void printElements() {
        for (int i = 0; i < size; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        return b[index];
    }

    public int getSize() {
        return size;
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (b[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (b[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacity;
        System.out.print("Enter capacity: ");
        capacity = sc.nextInt();
        sc.nextLine();

        NumberList list = new NumberList(capacity);

        // demo usage
        list.insert(0, 10);
        list.insert(1, 20);
        list.insert(2, 30);
        list.addFirst(5);

        System.out.print("List after inserts: ");
        list.printElements();

        System.out.println("Contains 20? " + list.contains(20));
        System.out.println("Index of 30: " + list.indexOf(30));

        list.removeElement(20);
        System.out.print("List after removing 20: ");
        list.printElements();

        list.removeAt(0);
        System.out.print("List after removeAt(0): ");
        list.printElements();

        System.out.println("Current size: " + list.getSize());

        sc.close();
    }
}