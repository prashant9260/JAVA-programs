import java.util.*;

class TreeSetDemo3
{
    public static void main(String A[])
    {
        TreeSet t = new TreeSet();

        t.add("Roja");
        t.add("ShobhaRani");
        t.add("RajaKumari");
        t.add("GangaBhavani");
        t.add("Ramulamma");

        System.out.println(t);
    }    
}

class MyComparator implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        String s1 = obj1.toString();
        String s2 = obj2.toString();

        //return s2.compareTo(s1);
        return s1.compareTo(s2);
    }
}