import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2
{
    public static void main(String A[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        //add()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);
    
        System.err.println("Normal list : "+ list);
        System.err.println("Size of List : "+list.size());

        // add(index, element)
        list.add(2,25);
        System.err.println(list);

        System.out.println("Element at index 3 : "+list.get(3));
        System.err.println("Size of List : "+list.size());

        //set
        list.set(0,5);
        System.err.println("affer set " + list);
        System.err.println("Size of List : "+list.size());

        //contains()
        System.out.println("Contains 40?: "+ list.contains(40));

        //indexof()
        System.out.println("Index of 25: "+list.indexOf(25));

        //size()
        System.out.println("Size "+list.size());

        //remove by idex
        list.remove(1);
        System.err.println("After remove 1 : " +list);
        System.err.println("Size of List : "+list.size());

        //remove by value 
        list.remove(Integer.valueOf(40));
        System.err.println("After remove by value  : " +list);
        System.err.println("Size of List : "+list.size());

        //sort()
        Collections.sort(list);
        System.out.println("Affter sort : "+list);

        //reverse()
        Collections.reverse(list);
        System.err.println("Reverse order  : " +list);

        //forEach()
        list.forEach(n -> System.out.print(n + " "));

        //clear(
        list.clear();        
        System.err.println(list);

        //isEmpty()
        System.err.println("\nIs Empty? "+list.isEmpty());
    
    }
}