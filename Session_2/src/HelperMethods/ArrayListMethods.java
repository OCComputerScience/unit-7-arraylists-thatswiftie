package HelperMethods;

import java.util.ArrayList;

public class ArrayListMethods
{
    public static void print(ArrayList<Double> arr)
    {
        for(int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
    }
    public static ArrayList<Double> condense(ArrayList<Double> arr)
    {
        Double previousNum = 1.0;
        Double newNum = 1.0;
        ArrayList<Double> newArr = new ArrayList<>();
        boolean firstTime = false;
        for(int i = 0; i < arr.size(); i++)
        {
            firstTime = !firstTime;
            if(firstTime)
            {
                previousNum = arr.get(i);
            }
            else
            {
                newNum = arr.get(i) * previousNum;
                newArr.add(newNum);
            }
        }
        return newArr;
    }
    public static ArrayList<Double> duplicate(ArrayList<Double> arr)
    {
        ArrayList<Double> newArr = new ArrayList<>();
        Double numberAdd = 1.0;
        for(int i = 0; i < arr.size(); i++)
        {
            for(int j = 0; j < 2; j++)
            {
                numberAdd = arr.get(i);
                newArr.add(numberAdd);
            }
        }
        return newArr;
    }
}
