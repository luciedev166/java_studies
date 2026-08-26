// Main.java
//
// Same 12 tests as before, but now each one lives in its own private method
// and creates whatever objects IT needs from scratch. That means every test
// is fully independent -- you can comment out any of the calls in main()
// below and the remaining ones will still run correctly, in any order.
//
// >>> FEELING OVERWHELMED? Comment out every line in main() except ONE,
// >>> implement just the method(s) that test needs, get it printing the
// >>> right thing, then uncomment the next line. <<<
//
// Suggested order to implement things in (matches dependency, not test number):
//   1. Person.java       -- everything else needs this to even compile/run
//   2. Student.java       -- constructors, addGrade/setGrade, computeAverage,
//                            displayInfo, toString, getScore, printReport
//   3. HonorStudent.java  -- needs Student finished first
//   4. Leaderboard.java   -- needs Student finished, independent of HonorStudent
//   5. GradeSheet.java    -- fully independent, you can honestly do this FIRST
//                            if you want an easy confidence boost
//
// Compile & run:
//   javac *.java
//   java Main

public class Main {

    public static void main(String[] args) {
        test1_ConstructionGettersSettersOverriding();
        test2_ConstructorOverloading();
        test3_AddGradeEdgeCase();
        test4_SetGrade();
        test5_MethodOverloading();
        test6_Interfaces();
        test7_EqualsIgnoreCase();
        test8_HonorStudentInheritance();
        // test9_ObjectReferencePassing();
        // test10_ArraysOfObjects();
        // test11_Leaderboard();
        // test12_GradeSheet2D();
    }

    // ===================================================================
    // TEST 1: Construction, Getters/Setters, Overriding
    // ===================================================================
    private static void test1_ConstructionGettersSettersOverriding() {
        System.out.println("========== TEST 1: Construction, Getters/Setters, Overriding ==========");

        // Student(String name, int id, double g1, double g2, double g3)
        // expects: name, id, and exactly 3 grades
        // outputs: a Student with gradeCount = 3
        Student s1 = new Student("Ana Cruz", 101, 90, 85, 95);

        // getName() / getId() -- inherited getters
        System.out.println("s1 name: " + s1.getName());   // Expected: s1 name: Ana Cruz
        System.out.println("s1 id: " + s1.getId());        // Expected: s1 id: 101

        // setName(String name) -- inherited setter, uses "this" internally
        s1.setName("Ana M. Cruz");
        System.out.println("s1 name after setName: " + s1.getName());
        // Expected: s1 name after setName: Ana M. Cruz

        // displayInfo() -- OVERRIDDEN from Person's abstract method
        s1.displayInfo();
        // Expected:
        // Student: Ana M. Cruz (ID: 101)
        // Grades: 90.0 85.0 95.0
        // Average: 90.0

        // toString() -- OVERRIDDEN, must internally call super.toString()
        System.out.println(s1);
        // Expected: Name: Ana M. Cruz, ID: 101, Avg: 90.0

        System.out.println();
    }

    // ===================================================================
    // TEST 2: Constructor Overloading (1, 2, 3-grade versions)
    // ===================================================================
    private static void test2_ConstructorOverloading() {
        System.out.println("========== TEST 2: Constructor Overloading (1, 2, 3-grade versions) ==========");

        // Student(String name, int id) -- no grades yet
        Student s2 = new Student("Ben Dela Cruz", 102);
        s2.displayInfo();
        // Expected:
        // Student: Ben Dela Cruz (ID: 102)
        // Grades: (none)
        // Average: 0.0

        // Student(String name, int id, double grade1) -- ONE-grade version
        Student s2b = new Student("Cara Lim", 105, 100);
        s2b.displayInfo();
        // Expected:
        // Student: Cara Lim (ID: 105)
        // Grades: 100.0
        // Average: 100.0

        // Student(String name, int id, double grade1, double grade2) -- TWO-grade version
        Student s3 = new Student("Carlo Reyes", 103, 70, 80);
        s3.displayInfo();
        // Expected:
        // Student: Carlo Reyes (ID: 103)
        // Grades: 70.0 80.0
        // Average: 75.0

        System.out.println();
    }

    // ===================================================================
    // TEST 3: addGrade() -- called repeatedly, plus an edge case
    // ===================================================================
    private static void test3_AddGradeEdgeCase() {
        System.out.println("========== TEST 3: addGrade() -- called repeatedly, plus an edge case ==========");

        Student s2 = new Student("Ben Dela Cruz", 102);

        // addGrade(double grade) // expects: a grade value
        // outputs: appends it if there's room (max 3), else does nothing
        s2.addGrade(100);
        s2.addGrade(80);
        s2.displayInfo();
        // Expected:
        // Student: Ben Dela Cruz (ID: 102)
        // Grades: 100.0 80.0
        // Average: 90.0

        s2.addGrade(60); // array now FULL (3/3)
        s2.displayInfo();
        // Expected:
        // Student: Ben Dela Cruz (ID: 102)
        // Grades: 100.0 80.0 60.0
        // Average: 80.0

        // EDGE CASE: array is full -- this 4th addGrade() call must be silently ignored
        s2.addGrade(999);
        s2.displayInfo();
        // Expected (UNCHANGED from above):
        // Student: Ben Dela Cruz (ID: 102)
        // Grades: 100.0 80.0 60.0
        // Average: 80.0

        System.out.println();
    }

    // ===================================================================
    // TEST 4: setGrade() -- overwrite in place, size unchanged
    // ===================================================================
    private static void test4_SetGrade() {
        System.out.println("========== TEST 4: setGrade() -- overwrite in place, size unchanged ==========");

        Student s1 = new Student("Ana Cruz", 101, 90, 85, 95);

        // setGrade(int index, double grade) // expects: 0-based index + new value
        // outputs: overwrites grades[index]; ignores out-of-bounds index
        s1.setGrade(1, 100); // grades were 90, 85, 95 -> overwrite index 1
        s1.displayInfo();
        // Expected:
        // Student: Ana Cruz (ID: 101)
        // Grades: 90.0 100.0 95.0
        // Average: 95.0

        System.out.println();
    }

    // ===================================================================
    // TEST 5: Method Overloading -- computeAverage() vs computeAverage(bonus)
    // ===================================================================
    private static void test5_MethodOverloading() {
        System.out.println("========== TEST 5: Method Overloading -- computeAverage() vs computeAverage(bonus) ==========");

        Student s1 = new Student("Ana Cruz", 101, 90, 100, 95); // avg 95.0

        // computeAverage() // expects: nothing // outputs: average of current grades (0.0 if none)
        System.out.println("s1 average: " + s1.computeAverage()); // Expected: s1 average: 95.0

        // computeAverage(double bonus) -- OVERLOADED version, adds a flat bonus
        System.out.println("s1 average with +5 bonus: " + s1.computeAverage(5));
        // Expected: s1 average with +5 bonus: 100.0

        System.out.println();
    }

    // ===================================================================
    // TEST 6: Interfaces -- Rankable & Reportable ("multiple inheritance")
    // ===================================================================
    private static void test6_Interfaces() {
        System.out.println("========== TEST 6: Interfaces -- Rankable & Reportable ('multiple inheritance') ==========");
        // Student implements BOTH Rankable and Reportable. Java classes can't
        // extend more than one class, but they CAN implement more than one
        // interface -- this is how Java fakes "multiple inheritance."

        Student s1 = new Student("Ana Cruz", 101, 90, 100, 95); // avg 95.0

        // getScore() // expects: nothing // outputs: ranking score (Student's version = computeAverage())
        System.out.println("s1 score: " + s1.getScore()); // Expected: s1 score: 95.0

        // printReport() // expects: nothing // outputs: prints a formatted report block
        s1.printReport();
        // Expected:
        // --- Report ---
        // Name: Ana Cruz
        // ID: 101
        // Grades: 90.0 100.0 95.0
        // Average: 95.0

        System.out.println();
    }

    // ===================================================================
    // TEST 7: equalsIgnoreCase practice via matchesName()
    // ===================================================================
    private static void test7_EqualsIgnoreCase() {
        System.out.println("========== TEST 7: equalsIgnoreCase practice via matchesName() ==========");

        Student s1 = new Student("Ana Cruz", 101, 90, 90, 90);

        // matchesName(String other) // expects: a name string
        // outputs: true if it matches this student's name, IGNORING CASE
        System.out.println("s1.matchesName(\"ana cruz\"): " + s1.matchesName("ana cruz")); // Expected: true
        System.out.println("s1.matchesName(\"Ben\"): " + s1.matchesName("Ben"));            // Expected: false

        System.out.println();
    }

    // ===================================================================
    // TEST 8: HonorStudent -- multi-level inheritance + super chaining
    // ===================================================================
    private static void test8_HonorStudentInheritance() {
        System.out.println("========== TEST 8: HonorStudent -- multi-level inheritance + super chaining ==========");

        // HonorStudent(String name, int id, double g1, double g2, double g3, double bonusPoints)
        // expects: same as Student's 3-grade constructor, PLUS a bonus
        // outputs: getScore() = Student's average + bonus
        HonorStudent h1 = new HonorStudent("Dana Santos", 201, 90, 90, 90, 3);

        // getScore() -- OVERRIDDEN AGAIN, must call super.getScore() internally
        System.out.println("h1 score: " + h1.getScore()); // Expected: h1 score: 93.0

        // displayInfo() -- OVERRIDDEN AGAIN, must call super.displayInfo() internally
        h1.displayInfo();
        // Expected:
        // *** HONOR STUDENT ***
        // Student: Dana Santos (ID: 201)
        // Grades: 90.0 90.0 90.0
        // Average: 90.0

        // printReport() -- OVERRIDDEN AGAIN, must call super.printReport() internally
        h1.printReport();
        // Expected:
        // --- Report ---
        // Name: Dana Santos
        // ID: 201
        // Grades: 90.0 90.0 90.0
        // Average: 90.0
        // Honor Bonus: 3.0

        // POLYMORPHISM CHECK: upcast to Person, displayInfo() must still run
        // the HonorStudent version (not Person's, not Student's)
        Person p = h1;
        p.displayInfo();
        // Expected (SAME as h1.displayInfo() above):
        // *** HONOR STUDENT ***
        // Student: Dana Santos (ID: 201)
        // Grades: 90.0 90.0 90.0
        // Average: 90.0

        System.out.println();
    }

    // // ===================================================================
    // // TEST 9: Object References ("Pointers") -- passing objects into methods
    // // ===================================================================
    // private static void test9_ObjectReferencePassing() {
    //     System.out.println("========== TEST 9: Object References ('Pointers') -- passing objects into methods ==========");
    //     // Java has no explicit pointer syntax, but object variables ARE
    //     // references under the hood. When you pass an object into a method,
    //     // the method receives a COPY OF THE REFERENCE, not a copy of the
    //     // object -- so changes made INSIDE the method to the object's
    //     // fields are visible to the caller afterward. Closest thing Java
    //     // has to "pointers."

    //     Student s4 = new Student("Elena Cruz", 104, 60, 60, 60);
    //     System.out.println("s4 score BEFORE applyBonus: " + s4.getScore()); // Expected: 60.0

    //     // static applyBonus(Student s, double bonus) // expects: a Student
    //     // object reference and a bonus value
    //     // outputs: nothing returned, but MUTATES the passed-in object's grades directly
    //     Student.applyBonus(s4, 10);
    //     System.out.println("s4 score AFTER applyBonus:  " + s4.getScore()); // Expected: 70.0
    //     // Note: we never reassigned s4 -- the object it points to was changed IN PLACE.

    //     System.out.println();
    // }

    // // ===================================================================
    // // TEST 10: Arrays of Objects
    // // ===================================================================
    // private static void test10_ArraysOfObjects() {
    //     System.out.println("========== TEST 10: Arrays of Objects ==========");

    //     // static findTopScorer(Student[] students) // expects: an array of Student objects
    //     // outputs: the Student with the highest getScore() in the array
    //     Student a1 = new Student("Fred Lim", 301, 88, 88, 88);   // avg 88.0
    //     Student a2 = new Student("Grace Tan", 302, 95, 95, 95);  // avg 95.0
    //     Student a3 = new Student("Ivy Sy", 304, 70, 70, 70);     // avg 70.0
    //     Student[] roster = { a1, a2, a3 };

    //     Student top = Student.findTopScorer(roster);
    //     System.out.println("Top scorer: " + top.getName()); // Expected: Top scorer: Grace Tan

    //     System.out.println();
    // }

    // // ===================================================================
    // // TEST 11: Leaderboard -- array-of-objects class, sorting, searching
    // // ===================================================================
    // private static void test11_Leaderboard() {
    //     System.out.println("========== TEST 11: Leaderboard -- array-of-objects class, sorting, searching ==========");

    //     // Leaderboard(int capacity) // expects: max number of students it can hold
    //     Leaderboard board = new Leaderboard(5);

    //     // addStudent(Student s) // expects: a Student (or HonorStudent, since it IS-A Student)
    //     board.addStudent(new Student("Fred Lim", 301, 88, 88, 88));               // avg 88.0
    //     board.addStudent(new Student("Grace Tan", 302, 95, 95, 95));              // avg 95.0
    //     board.addStudent(new HonorStudent("Henry Ong", 303, 90, 90, 90, 3));      // avg 93.0
    //     board.addStudent(new Student("Ivy Sy", 304, 70, 70, 70));                 // avg 70.0

    //     System.out.println("-- Leaderboard BEFORE sorting --");
    //     board.displayAll();
    //     // Expected (in the order they were added -- separator style is up to you):
    //     // Student: Fred Lim (ID: 301)
    //     // Grades: 88.0 88.0 88.0
    //     // Average: 88.0
    //     // ------------------------
    //     // Student: Grace Tan (ID: 302)
    //     // Grades: 95.0 95.0 95.0
    //     // Average: 95.0
    //     // ------------------------
    //     // *** HONOR STUDENT ***
    //     // Student: Henry Ong (ID: 303)
    //     // Grades: 90.0 90.0 90.0
    //     // Average: 90.0
    //     // ------------------------
    //     // Student: Ivy Sy (ID: 304)
    //     // Grades: 70.0 70.0 70.0
    //     // Average: 70.0
    //     // ------------------------

    //     // sortByScoreDescending() // expects: nothing
    //     // outputs: reorders so getScore() goes highest -> lowest:
    //     // Grace(95), Henry(93), Fred(88), Ivy(70)
    //     board.sortByScoreDescending();

    //     System.out.println("-- Leaderboard AFTER sorting --");
    //     board.displayAll();
    //     // Expected order: Grace Tan (95.0), Henry Ong (93.0, still tagged
    //     // HONOR STUDENT -- polymorphism preserved through the array!),
    //     // Fred Lim (88.0), Ivy Sy (70.0)

    //     // getTopStudent() // expects: nothing (call AFTER sorting) // outputs: the #1 ranked Student
    //     System.out.println("Top of leaderboard: " + board.getTopStudent().getName());
    //     // Expected: Top of leaderboard: Grace Tan

    //     // findByName(String name) // expects: a name (case-insensitive) // outputs: matching Student, or null
    //     Student found = board.findByName("henry ong");
    //     System.out.println("Found: " + (found != null ? found.getName() : "null")); // Expected: Found: Henry Ong

    //     Student notFound = board.findByName("Zack");
    //     System.out.println("Not found result: " + notFound); // Expected: Not found result: null

    //     System.out.println();
    // }

    // // ===================================================================
    // // TEST 12 (2D ARRAYS -- only 3 problems, saved for last)
    // // ===================================================================
    // private static void test12_GradeSheet2D() {
    //     System.out.println("========== TEST 12 (2D ARRAYS -- only 3 problems, saved for last) ==========");

    //     // GradeSheet(int[][] scores) // expects: a 2D array, rows = students, columns = subjects
    //     int[][] scores = {
    //         { 90, 80, 75 },   // Student A: Math, Science, English
    //         { 60, 70, 90 },   // Student B
    //         { 90, 90, 90 }    // Student C
    //     };
    //     GradeSheet sheet = new GradeSheet(scores);

    //     // (1) computeRowTotals() // expects: nothing // outputs: int[] where each entry = sum of one row
    //     int[] totals = sheet.computeRowTotals();
    //     System.out.println("Row totals: " + totals[0] + " " + totals[1] + " " + totals[2]);
    //     // Expected: Row totals: 245 220 270

    //     // (2) computeColumnAverages() // expects: nothing // outputs: double[] where each entry = average of one column
    //     double[] colAverages = sheet.computeColumnAverages();
    //     System.out.println("Column averages: " + colAverages[0] + " " + colAverages[1] + " " + colAverages[2]);
    //     // Expected: Column averages: 80.0 80.0 85.0

    //     // (3) findStudentWithHighestTotal() // expects: nothing // outputs: row index of the highest-total student
    //     int topRow = sheet.findStudentWithHighestTotal();
    //     System.out.println("Highest-total row index: " + topRow); // Expected: Highest-total row index: 2

    //     System.out.println();
    // }
}