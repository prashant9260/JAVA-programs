import java.util.*;

public class TreeSetDemo2
{
    public static void main(String A[])
    {
        TreeSet<Integer> t = new TreeSet<>(new MyComparator());

        t.add(10);
        t.add(0);
        t.add(15);
        t.add(20);
        t.add(20);

        System.out.println(t);
    }
}

public class MyComparator implements Comparator<Integer>
{
    public int compare(Integer obj1, Integer obj2)
    {
        Integer l1 = (Integer)obj1;
        Integer l2 = (Integer)obj2;

        if(l1 < l2)
            return +1;
        else if(l1 > l2)
            return -1;
        else
            return 0;
    }
}