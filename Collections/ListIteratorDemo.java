import java.util.*;

class ListIteratorDemo
{
    public static void main(String[] A)
    {
        LinkedList<String> L = new LinkedList<>();

        L.add("prashant");
        L.add("vaibhav");
        L.add("harshal");
        L.add("om");

        System.out.println(L);
        
        ListIterator<String> ltr = L.listIterator();

        while(ltr.hasNext())
        {
            String s = ltr.next();

            if(s.equals("vaibhav"))   
            {
                ltr.remove();
            }
            else if(s.equals("om"))
            {
                ltr.add("chaitu");
            }
            else if(s.equals("harshal"))
            {
                ltr.add("gaurav");
            }        
        }

        System.out.println(L);
    }
}