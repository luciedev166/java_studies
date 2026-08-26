// Leaderboard.java
//
// Manages an ARRAY OF OBJECTS (Student[]). It's perfectly fine to store
// HonorStudent objects in here too, since HonorStudent IS-A Student
// (polymorphism) -- displayInfo()/getScore() will still call the correct
// overridden version automatically.
public class Leaderboard {

    private Student[] students;
    private int count;

    // Leaderboard(int capacity) // expects: the max number of students it can hold
    public Leaderboard(int capacity) {
        // TODO: students = new Student[capacity]; count = 0;
    }

    // addStudent(Student s) // expects: a Student (or HonorStudent) object
    // outputs: nothing returned -- appends it to the internal array if
    // there's room, otherwise do nothing (don't crash)
    public void addStudent(Student s) {
        // TODO: implement
    }

    // displayAll() // expects: nothing
    // outputs: loops through all added students (index 0 to count-1),
    // calling displayInfo() on each one, followed by a simple separator
    // line (any divider is fine, e.g. a row of dashes) printed after
    // EVERY student, including the last.
    public void displayAll() {
        // TODO: implement
    }

    // sortByScoreDescending() // expects: nothing
    // outputs: reorders the internal array so getScore() goes from HIGHEST
    // to LOWEST. Use a simple loop-based sort (selection sort or bubble
    // sort) -- NO recursion.
    public void sortByScoreDescending() {
        // TODO: implement
    }

    // getTopStudent() // expects: nothing -- call this AFTER sortByScoreDescending()
    // outputs: the student currently at index 0, or null if the leaderboard is empty
    public Student getTopStudent() {
        // TODO: implement
        return null;
    }

    // findByName(String name) // expects: a name (comparison must be CASE-INSENSITIVE)
    // outputs: the first matching Student found, or null if nobody matches
    // Hint: reuse matchesName() from Person instead of writing your own comparison
    public Student findByName(String name) {
        // TODO: implement
        return null;
    }
}