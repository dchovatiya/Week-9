import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.ArrayList;
import java.util.ListIterator;

//Write a Java program to iterate through all elements in an array list using
//Iterator
public class Question5
{
    public static void main(String[] args)
    {
        ArrayList<Integer> i=new ArrayList<>();
        i.add(10);
        i.add(20);
        i.add(30);
        i.add(40);
        i.add(50);
        i.add(60);
        ListIterator<Integer> numbers= i.listIterator();
        while(numbers.hasNext())
        {
            System.out.print(numbers.next() + ", ");
        }
    }
}
