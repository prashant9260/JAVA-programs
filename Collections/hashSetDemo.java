import java.util.*;

class hashSetDemo
{
    public static void main(String []args)
    {
        HashSet <String> h = new HashSet<>();

        h.add("A");  
        h.add("B");  
        h.add("Z");  
        h.add(null);  
        //.add(10);  

        System.out.println(h.add("Z"));     //false
        System.out.println(h);
    }
}