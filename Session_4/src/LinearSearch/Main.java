package LinearSearch;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Double> array = new ArrayList<>();
        array.add(4.5);
        array.add(6.7);
        array.add(5.0);
        array.add(2.9);
        array.add(7.0);

        System.out.println(search(array, 2.9));

    }

    public static int search(ArrayList<Double> nums, Double element)
    {
        if(nums.isEmpty()) return -1;
        for(int i = 0; i < nums.size(); i++)
        {
            if(nums.get(i).equals(element))
            {
                return i;
            }
        }
        return -1;
    }
}
