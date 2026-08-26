// Rankable.java
//
// One of TWO interfaces Student implements (see Reportable.java for the other).
// Java does NOT let a class extend more than one class, but it DOES let a
// class implement more than one interface -- this is how you fake
// "multiple inheritance" in Java.
public interface Rankable {

    // getScore() // expects: nothing
    // outputs: a double used to rank/compare this object against others
    // (for Student, this should be based on the average of its grades)
    double getScore();
}