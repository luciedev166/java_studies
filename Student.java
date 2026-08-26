// Student.java
//
// extends Person (single inheritance), implements Rankable + Reportable
// (Java's version of "multiple inheritance" -- see Rankable.java).
public class Student extends Person implements Rankable, Reportable {

    protected double[] grades;   // fixed capacity of 3
    protected int gradeCount;    // how many slots are actually filled (0-3)

    // ----------------- Constructor Overloading (5 versions) -----------------
    // Your teacher loves this pattern: same class, wildly different ways to
    // build it. Chain constructors with this(...) instead of repeating code.

    // Student() // expects: nothing
    // outputs: name="Unknown", id=0, no grades yet
    public Student() {
        super();
        grades = new double[3], gradeCount= 0;
        // TODO: grades = new double[3]; gradeCount = 0;
    }

    // Student(String name, int id) // expects: name + id, NO grades yet
    public Student(String name, int id) {
        super(name, id);
        grades = new double[3], gradeCount = 0;
        // TODO: grades = new double[3]; gradeCount = 0;
    }

    // Student(String name, int id, double grade1) // expects: name, id, ONE grade
    public Student(String name, int id, double grade1) {
        // TODO: chain to the (name, id) constructor with this(name, id);
        super(name, id);
        gradeCount = 0;
        addGrade(grade1);
        // then store grade1 (reuse addGrade() so you don't repeat logic)
    }

    // Student(String name, int id, double grade1, double grade2) // expects: name, id, TWO grades
    public Student(String name, int id, double grade1, double grade2) {
        // TODO: chain to the ONE-grade constructor with this(name, id, grade1);
        super(name, id);
        gradeCount = 0;
        addGrade(grade1);
        addGrade(grade2);
        // then store grade2
    }

    // Student(String name, int id, double grade1, double grade2, double grade3)
    // expects: name, id, and THREE grades (the "full" version)
    public Student(String name, int id, double grade1, double grade2, double grade3) {
        // TODO: chain to the TWO-grade constructor, then store grade3
        super(name, id);
        gradeCount = 0;
        addGrade(grade1);
        addGrade(grade2);
        addGrade(grade3);
    }

    // ----------------------- Getters / Setters -----------------------

    // getGrades() // expects: nothing
    // outputs: the internal grades array (only the first gradeCount entries are meaningful)
    public double[] getGrades() {
        // TODO: implement
        return grades;
    }

    // getGrade(int index) // expects: a valid index // outputs: the grade at that index
    public double getGrade(int index) {
        // TODO: implement
        return grade[index];
    }

    // getGradeCount() // expects: nothing // outputs: how many grades are currently stored
    public int getGradeCount() {
        // TODO: implement
        return gradeCount;
    }

    // setGrade(int index, double grade) // expects: a valid index (0 <= index < gradeCount)
    // and a new value
    // outputs: OVERWRITES grades[index] in place. No shifting. gradeCount does NOT change.
    // If index is out of bounds, do nothing (don't crash).
    public void setGrade(int index, double grade) {
        // TODO: implement
        grades[index] = grade;
    }

    // ----------------------- Array management -----------------------

    // addGrade(double grade) // expects: a grade value
    // outputs: appends it to the END of the grades array IF there's room
    // (gradeCount < 3). If the array is already full, do nothing (silently
    // ignore -- don't crash, don't grow the array).
    public void addGrade(double grade) {
        // TODO: implement
        if(gradeCount < 3)
        {
            grade[gradeCount++] = grade;
        }
    }

    // -------------- Overloaded methods (SAME name, DIFFERENT params) --------------

    // computeAverage() // expects: nothing
    // outputs: the average of all currently-stored grades. Return 0.0 if
    // gradeCount == 0 (guard against divide-by-zero!)
    public double computeAverage() {
        double sum;
        for(double grade: grades)
        {
            sum += grade;
        }
        return sum / gradeCount;
    }

    // computeAverage(double bonus) -- OVERLOADED version // expects: a flat bonus value
    // outputs: computeAverage() + bonus. Reuse the no-arg version, don't
    // rewrite the loop.
    public double computeAverage(double bonus) {
        // TODO: implement (should be a one-liner calling computeAverage())
        return computeAverage() + bonus;
    }

    // ----------------------- Overridden from Person (abstract) -----------------------

    // displayInfo() // expects: nothing
    // outputs (EXACT format, 3 lines via println):
    //   Student: <name> (ID: <id>)
    //   Grades: <grades separated by single spaces>   (print "(none)" if gradeCount == 0)
    //   Average: <computeAverage()>
    @Override
    public void displayInfo() {
        System.out.printf("Student: %s ID: %i\n", name, id);
        System.out.print("Grades: ");
        for(double grade : grades)
        {
            System.out.printf("%.2f ", grade);
        }
        System.out.println("");
        System.out.printf("Average: %.2f\n", computeAverage());
    }

    // ----------------------- Overridden toString() -----------------------

    // toString() // expects: nothing
    // outputs: EXACT format -> super.toString() + ", Avg: " + computeAverage()
    @Override
    public String toString() {
        // TODO: implement. MUST call super.toString() -- don't rebuild the
        // "Name: ..., ID: ..." part yourself.
        return super.toString() + ", Avg: " + computeAverage();
    }

    // ----------------------- Implemented from Rankable -----------------------

    // getScore() // expects: nothing // outputs: this student's ranking score
    // (just reuse computeAverage())
    @Override
    public double getScore() {
        // TODO: implement
        return computeAverage();
    }

    // ----------------------- Implemented from Reportable -----------------------

    // printReport() // expects: nothing
    // outputs (EXACT format, 5 lines via println):
    //   --- Report ---
    //   Name: <name>
    //   ID: <id>
    //   Grades: <grades separated by single spaces, or "(none)">
    //   Average: <computeAverage()>
    @Override
    public void printReport() {
        // TODO: implement
    }

    // --------- Static utility methods (practice: passing OBJECTS / "pointers") ---------

    // static applyBonus(Student s, double bonus) // expects: a Student object
    // reference, and a bonus amount
    // outputs: nothing returned -- but MUTATES the passed-in Student's grades
    // in place (adds "bonus" to every existing grade). Because objects are
    // passed by reference in Java, this change must be visible to the
    // CALLER after this method returns.
    public static void applyBonus(Student s, double bonus) {
    
        // TODO: implement
    }

    // static findTopScorer(Student[] students) // expects: an array of Student objects
    // outputs: returns a reference to the Student with the highest
    // getScore() in the array. Assume every slot is filled (no nulls).
    public static Student findTopScorer(Student[] students) {
        // TODO: implement
        return null;
    }
}