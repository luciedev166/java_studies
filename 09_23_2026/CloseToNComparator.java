import java.util.Comparator;
public class CloseToNComparator implements Comparator<Integer>{
    int n;

    public CloseToNComparator(int n)
    {
        this.n = n;
    }
    @Override 
    public int compare(Integer o1, Integer o2)
    {
        int dist_o1 = Math.abs(n - o1);
        int dist_o2 = Math.abs(n - o2);
        return Integer.compare(dist_o1, dist_o2);
    }
}