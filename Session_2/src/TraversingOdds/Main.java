package TraversingOdds;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numArr = new ArrayList<>();
        for(int i = 1; i <= 50; i++)
        {
            numArr.add(i);
        }
        removeEvens(numArr);
        for(int i = 0; i < numArr.size(); i++)
        {
            System.out.print(numArr.get(i) + " ");
        }
    }
    public static void removeEvens(ArrayList<Integer> array)
    {
        for(int i = 0; i < array.size(); i++)
        {
            if(array.get(i) % 2 == 0)
            {
                array.remove(i);
            }
        }
    }
}
