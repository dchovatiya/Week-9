//3. Write a Java program to reverse an array of integer values.

import java.util.Arrays;

public class Question3
{
    public static void main(String[] args)
    {
        int [] array={1,2,3,4,5,6};
        System.out.println("Array elements before reversing: "+ Arrays.toString(array));
        System.out.println("Array elements after reversing: ");
        for(int i=array.length-1;i>=0;i--)
        {
            System.out.print(array[i] + " ");
        }
    }
}
