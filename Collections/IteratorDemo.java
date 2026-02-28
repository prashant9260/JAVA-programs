import java.util.*;

class IteratorDemo
{
    public static void main(String[] A)
    {
        ArrayList<Integer> aobj = new ArrayList<>();

        for(int i = 0; i <= 10; i++)
        {
            aobj.add(i);
        }

        System.out.println(aobj);

        Iterator<Integer> itr = aobj.iterator();

        while(itr.hasNext())
        {
            Integer I = itr.next();

            if(I % 2 == 0)
                System.out.println(I);
            else
                itr.remove();
        }

        System.out.println(aobj);
    }
}