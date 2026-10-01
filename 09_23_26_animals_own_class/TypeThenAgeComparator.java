import java.util.Comparator;

public class TypeThenAgeComparator implements Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2)
    {
        int val = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());

        if(val == 0)
            return Integer.compare(o1.getAge(), o2.getAge());
        else
            return val;
    }
    
}