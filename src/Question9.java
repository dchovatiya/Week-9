//Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map.

import java.util.HashMap;
import java.util.Map;

public class Question9
{
    public static void main(String[] args)
    {
        Map<Integer,String> people= new HashMap<>();
        people.put(30,"Urmi");
        people.put(31,"Dimple");
        people.put(32,"Bhoomi");
        people.put(33,"Darshana");
        for(Map.Entry<Integer,String> elements : people.entrySet())
        {
            System.out.println(elements.getKey() + ", "+elements.getValue());
        }

    }
}
