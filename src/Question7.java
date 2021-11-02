import java.util.ArrayList;
import java.util.Arrays;

//Write a Java program to test an array list is empty or not. Define array list with
//underground tube names
public class Question7
{
    public static void main(String[] args)
    {
        ArrayList<String> tube=new ArrayList<>();
        tube.add("Metropolitan line");
        tube.add("Jubilee line");
        tube.add("District line");
        tube.add("Metropolitan line");
        System.out.println("Array elements: ");
        System.out.println(tube);
        System.out.println("If list is empty then it should return false, if not then it should return true.");
        System.out.println(tube.isEmpty());
    }
}
