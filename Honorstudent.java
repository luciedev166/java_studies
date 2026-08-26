// HonorStudent.java
//
// extends Student -- this makes a THIRD level of inheritance:
// Object -> Person -> Student -> HonorStudent.
//
// Heavy on "super" usage: every overridden method here should call the
// Student version FIRST, then add its own extra behavior on top. Don't
// copy-paste Student's logic -- reuse it via super.
public class HonorStudent extends Student {

    protected double bonusPoints;

    // ----------------- Constructor Overloading (2 versions) -----------------

    // HonorStudent(String name, int id, double g1, double g2, double g3, double bonusPoints)
    // expects: same as Student's 3-grade constructor, PLUS a bonus amount
    public HonorStudent(String name, int id, double g1, double g2, double g3, double bonusPoints) {
        super(name, id, g1, g2, g3);
        // TODO: store bonusPoints
    }

    // HonorStudent(String name, int id, double g1, double g2, double g3)
    // expects: same as above but NO bonus given -- default bonusPoints to 5.0
    public HonorStudent(String name, int id, double g1, double g2, double g3) {
        // TODO: chain to the constructor above:
        // this(name, id, g1, g2, g3, 5.0);
    }

    // ----------------------- Getter / Setter -----------------------

    public double getBonusPoints() {
        // TODO: implement
        return 0;
    }

    public void setBonusPoints(double bonusPoints) {
        // TODO: implement
    }

    // --------------- Overridden AGAIN (2nd override in the chain) ---------------

    // getScore() // expects: nothing
    // outputs: super.getScore() + bonusPoints -- MUST call super, don't
    // recompute the average yourself.
    @Override
    public double getScore() {
        // TODO: implement
        return 0;
    }

    // displayInfo() // expects: nothing
    // outputs (EXACT format):
    //   *** HONOR STUDENT ***
    //   <then whatever Student.displayInfo() normally prints -- call
    //    super.displayInfo(), don't copy-paste it>
    @Override
    public void displayInfo() {
        // TODO: implement
    }

    // printReport() // expects: nothing
    // outputs: <call super.printReport() first>, then ONE extra line:
    //   Honor Bonus: <bonusPoints>
    @Override
    public void printReport() {
        // TODO: implement
    }

    // toString() // expects: nothing
    // outputs: super.toString() + " [HONOR]"
    @Override
    public String toString() {
        // TODO: implement
        return null;
    }
}