import java.util.ArrayList;

public class ArrayList1
{
    public static void main(String A[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);

        System.out.println(list);

        list.remove(2);

        System.out.println(list);

        list.remove(Integer.valueOf(10));

                System.out.println(list);
    }
}