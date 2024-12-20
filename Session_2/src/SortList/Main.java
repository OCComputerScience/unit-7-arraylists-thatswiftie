package SortList;

public class Main
{
    public static void main(String[] args)
    {
        int[] original = {64, 34, 25, 12, 22, 11, 90};
    }

    public static void selectionSort(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int lowestIdx = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[lowestIdx] > arr[j])
                {
                    lowestIdx = j;
                }

                //swap elements
                swapElements(arr, i, lowestIdx);
            }
        }
    }

    private static void swapElements(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
