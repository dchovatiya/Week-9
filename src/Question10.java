import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Question10
{
    public static void main(String[] args)
    {
        System.out.println("This is zone 1 station list :\n");
        String[] station={"ALDGATE, EUSTON SQUARE, OXFORD CIRCUS, WATERLOO LU, TOWER HILL, OLD STREET, SOUTH KENSINGTON," +
                " VICTORIA LU, LANCASTER GATE,GREEN PARK, FARRINGDON,\n EDGWARE ROAD, QUEENSWAY, KINGS CROSS ST PANCRAS LU," +
                " VAUXHALL LU, EUSTON LU, BAYSWATER, ANGEL, PADDINGTON LU,BAKERSTREET, KNIGHTBRIDGE, CHARING CROSS LU,\n " +
                "GLOUCESTER ROAD, REGENTS PARK, HYDE PARK CORNER, LEICESTER SQUARE, LONDON BRIDGE LU,PICCADILLY CIRCUS, MOORGATE," +
                " ST PAUL'S, WESTMINSTER, HOLBORN,\n COVENT GARDEN, BOND STREET, MARBLE ARCH, TOTTENHAM COURT ROAD, RUSSELL SQUARE,"};
        for(int i=0;i< station.length;i++)
        {
            System.out.println(station[i] + " ");

        }
        HashMap<String,String> zone=new HashMap<String,String>();
        zone.put("ALDGATE", "Circle/Metropolitan");
        zone.put("ANGEL", "Northern");
        zone.put("BAKERSTREET", "Bakerloo/Circle/Hammersmith & City/Jubilee/Metropolitan");
        zone.put("BAYSWATER", "Circle/District");
        zone.put("BOND STREET", "Circle/Jubilee");
        zone.put("CHARING CROSS LU", "Northern/Bakerloo");
        zone.put("COVENT GARDEN", "Piccadilly");
        zone.put("EDGWARE ROAD", "Circle/District/Hammersmith & City");
        zone.put("EUSTON LU", "Victoria/Northern");
        zone.put("EUSTON SQUARE", "Metropolitan/Hammersmith & City/Circle");
        zone.put("FARRINGDON", "Circle/Hammersmith & City/Metropolitan");
        zone.put("GLOUCESTER ROAD", "District/Circle/Piccadilly");
        zone.put("GREEN PARK", "Jubilee/Piccadilly/Victoria");
        zone.put("HOLBORN", "Central/Piccadilly");
        zone.put("HYDE PARK CORNER", "Piccadilly");
        zone.put("KINGS CROSS", "Circle/Piccadilly/Hammersmith & City/Northern/Metropolitan/Victoria");
        zone.put("KNIGHTBRIDGE", "Piccadilly");
        zone.put("LANCASTER GATE", "Central");
        zone.put("LEICESTER SQUARE", "Northern/Piccadilly");
        zone.put("LONDON BRIDGE", "Northern/Jubilee");
        zone.put("MARBLE ARCH", "Central");
        zone.put("MOORGATE", "Circle/Hammersmith & City/Metropolitan/Northern");
        zone.put("OLD STREET", "Northern");
        zone.put("OXFORD CIRCUS", "Bakerloo/Central/Victoria");
        zone.put("PADDINGTON LU", "Hammersmith & City/Bakerloo/District/Circle");
        zone.put("PICCADILLY CIRCUS", "Piccadilly/Bakerloo");
        zone.put("QUEENSWAY", "Central");
        zone.put("REGENTS PARK", "Bakerloo");
        zone.put("RUSSELL SQUARE", "Piccadilly");
        zone.put("SOUTH KENSINGTON", "District/Circle/Piccadilly");
        zone.put("ST PAUL'S", "Central");
        zone.put("TOTTENHAM COURT ROAD", "Central/Northern");
        zone.put("TOWER HILL", "District/Circle");
        zone.put("VAUXHALL LU", "Victoria");
        zone.put("VICTORIA LU", "District/Circle");
        zone.put("WATERLOO LU", "Bakerloo/Jubilee/Northern");
        zone.put("WESTMINSTER", "Circle/District/Jubilee");

        Scanner s= new Scanner(System.in);
        System.out.println("Enter any station name: \t");
        String name=s.nextLine();
        name=name.toUpperCase();
        for(String str:zone.keySet())
        {
            if(name.equals(str))
            {
                System.out.println("Tube lines available :"+zone.get(str));
            }
        }
    }
}
