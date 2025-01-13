package DataPurge;

import java.util.ArrayList;

public class DataPurge
{

    public static void removeDuplicates(ArrayList<String> people)
    {
        if (people.isEmpty()) return;

        for(int i = 0; i < people.size(); i++)
        {
            String currentPerson = people.get(i);
            for(int j = i+1; j < people.size(); j++)
            {
                if(currentPerson.equals(people.get(j)))
                {
                    System.out.println("Found Duplicate");
                    people.remove(j);
                    j--;
                }
            }
        }
    }

    public static void removeNames(ArrayList<String> people, String name)
    {
        if(people.isEmpty()) return;

        for(int i = 0; i < people.size(); i++)
        {
            String currentPerson = people.get(i);
            if(currentPerson.contains(name))
            {
                System.out.println("Found name: " + currentPerson);
                people.remove(i);
                i--;
            }
        }

    }

    public static boolean correctlyFormatted(ArrayList<String> people)
    {
        if(people.isEmpty()) return true;

        for(String person : people)
        {
            //space between first and last name
            if(!person.contains(" "))
            {
                return false;
            }
            //first name starts with uppercase
            String firstLetter = person.substring(0, 1);
            if(!firstLetter.equals(firstLetter.toUpperCase()))
            {
                return false;
            }
            //last name starts with uppercase
            int idx = person.indexOf(" ") + 1;
            String firstOfLast = person.substring(idx, idx +1);
            if(!firstOfLast.equals(firstOfLast.toUpperCase()))
            {
                return false;
            }
        }
        return true;
    }
}
