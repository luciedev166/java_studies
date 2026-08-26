// GradeSheet.java
//
// The ONLY class in this set that uses a 2D array. On purpose there are
// just 3 methods here -- 2D arrays are saved for last and kept short.
public class GradeSheet {

    private int[][] scores;   // rows = students, columns = subjects

    // GradeSheet(int[][] scores) // expects: a fully-filled 2D array
    public GradeSheet(int[][] scores) {
        // TODO: store the reference (this.scores = scores;)
    }

    // (1) computeRowTotals() // expects: nothing
    // outputs: an int[] the same length as the number of rows, where each
    // entry is the sum of that row (one student's total across all subjects)
    public int[] computeRowTotals() {
        // TODO: implement
        return null;
    }

    // (2) computeColumnAverages() // expects: nothing
    // outputs: a double[] the same length as the number of columns, where
    // each entry is the average of that column (one subject's average
    // across all students)
    public double[] computeColumnAverages() {
        // TODO: implement
        return null;
    }

    // (3) findStudentWithHighestTotal() // expects: nothing
    // outputs: the ROW INDEX (int) of the student with the highest total
    // score. If there's a tie, return the FIRST index that achieved that max.
    public int findStudentWithHighestTotal() {
        // TODO: implement
        return -1;
    }
}