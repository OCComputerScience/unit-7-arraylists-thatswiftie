package BinarySearch;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Integer> sortedNumbers = new ArrayList<>(Arrays.asList(
                1, 9, 16, 22, 24, 30, 34, 39, 41, 47,
                51, 58, 61, 65, 68, 71, 74, 75, 76, 77,
                78, 81, 85, 88, 89
        ));

        System.out.println(binarySearch(sortedNumbers, 51));
        System.out.println(binarySearch(sortedNumbers, 89));
        System.out.println(binarySearch(sortedNumbers, 22));
        System.out.println(binarySearch(sortedNumbers, 13));

    }

    public static int binarySearch(ArrayList<Integer> intList, int target)
    {
        int left = 0;
        int right = intList.size();
        while(left +1 != right)
        {
            int mid = left + (right-left) / 2;
            if(intList.get(mid) == target)
            {
                return mid;
            }
            else if (intList.get(mid) > target)
            {
                right = mid;
            }
            else
            {
                left = mid;
            }
        }
        return -1;
    }
}
