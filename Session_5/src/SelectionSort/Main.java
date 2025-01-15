package SelectionSort;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] array1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array2 = {5, 6, 4, 8, 9, 7, 3, 1, 2};

        System.out.print("First array: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array: ");
        System.out.println(Arrays.toString(array2));
        System.out.println();

        // sort first array
        selectionSort(array1);
        selectionSort(array2);
        // sort second array

        System.out.print("First array sorted: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array sorted: ");
        System.out.println(Arrays.toString(array2));
    }

    public static int[] selectionSort(int[] arr)
    {
        int swapCount = 0;
        for(int i = 0; i < arr.length - 1; i++)
        {
            int currentMinIndex = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[currentMinIndex] > arr[j])
                {
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i)
            {
                int temp = arr[i];
                arr[i] = arr[currentMinIndex];
                arr[currentMinIndex] = temp;
                swapCount++;
            }

        }
        System.out.println("Times Swapped: " + swapCount);
        return arr;
    }

}
