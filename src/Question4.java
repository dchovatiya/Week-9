//Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop

import java.util.ArrayList;

public class Question4
{
    public static void main(String[] args) 
    {
        ArrayList<String> colour=new ArrayList<String>();
        colour.add("Red");
        colour.add("Blue");
        colour.add("Green");
        colour.add("Yellow");
        colour.add("Pink");
        colour.add("White");
        colour.add("Black");
        for (String s:colour)
        {
            System.out.print(s+ ",");
        }
    }
}
