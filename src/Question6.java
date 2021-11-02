//. Write a Java program to retrieve an element (at a specified index) from a given
//array list

import java.util.ArrayList;

public class Question6
{
    public static void main(String[] args)
    {
        ArrayList<Integer> array=new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        System.out.println("Element at index 2 is: "+ array.get(2));
    }
}
